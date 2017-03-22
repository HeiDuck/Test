package test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ObjectQueue implements Serializable
	{
	  private int jdField_a_of_type_Int;
	  private ArrayList jdField_a_of_type_JavaUtilArrayList;
	  private long jdField_a_of_type_Long;
	  private boolean jdField_a_of_type_Boolean;
	  private boolean b;
	  private String jdField_a_of_type_JavaLangString;
	  
	  public ObjectQueue(int paramInt)
	  {
	    this(paramInt, 0L, "queue");
	  }
	  
	  public ObjectQueue(int paramInt, long paramLong, String paramString)
	  {
	    this.jdField_a_of_type_Int = paramInt;
	    this.jdField_a_of_type_JavaUtilArrayList = new ArrayList();
	    this.jdField_a_of_type_Boolean = false;
	    this.b = false;
	    this.jdField_a_of_type_Long = paramLong;
	    this.jdField_a_of_type_JavaLangString = paramString;
	  }
	  
	  public String getName()
	  {
	    return this.jdField_a_of_type_JavaLangString;
	  }
	  
	  public int getMaxLength()
	  {
	    return this.jdField_a_of_type_Int;
	  }
	  
	  public void setMaxLength(int paramInt)
	  {
	    this.jdField_a_of_type_Int = paramInt;
	  }
	  
	  public void setWaitTime(long paramLong)
	  {
	    this.jdField_a_of_type_Long = paramLong;
	  }
	  
	  public int size()
	  {
	    return this.jdField_a_of_type_JavaUtilArrayList.size();
	  }
	  
	  public synchronized void addElement(Object paramObject)
	  {
	    while ((!this.b) && (isFull())) {
	      try
	      {
	        wait(this.jdField_a_of_type_Long);
	      }
	      catch (InterruptedException localInterruptedException) {}
	    }
	    this.jdField_a_of_type_JavaUtilArrayList.add(paramObject);
	    notifyAll();
	  }
	  
	  public synchronized boolean hasMoreElements()
	  {
	    if ((!this.b) && (this.jdField_a_of_type_JavaUtilArrayList.size() > 0)) {
	      return true;
	    }
	    while ((!this.b) && (this.jdField_a_of_type_JavaUtilArrayList.size() == 0) && (this.jdField_a_of_type_Boolean)) {
	      try
	      {
	        wait(this.jdField_a_of_type_Long);
	        
	        new StringBuilder().append("check hasMoreElements: quesize=").append(this.jdField_a_of_type_JavaUtilArrayList.size()).append(", inpreparing=").append(this.jdField_a_of_type_Boolean).toString();
	      }
	      catch (InterruptedException localInterruptedException) {}
	    }
	    notifyAll();
	    return this.jdField_a_of_type_JavaUtilArrayList.size() > 0;
	  }
	  
	  public void setInDataPreparing(boolean paramBoolean)
	  {
	    this.jdField_a_of_type_Boolean = paramBoolean;
	  }
	  
	  public synchronized Object nextElement()
	    throws NoSuchElementException
	  {
	    if ((!this.b) && (this.jdField_a_of_type_JavaUtilArrayList.size() == 0) && (this.jdField_a_of_type_Boolean)) {
	      try
	      {
	        long l = System.currentTimeMillis();
	        
	        wait(this.jdField_a_of_type_Long);
	        new StringBuilder().append("out wait getNextele:").append(this.jdField_a_of_type_JavaUtilArrayList.size()).append(", inprepare: ").append(this.jdField_a_of_type_Boolean).append(" wait ").append((System.currentTimeMillis() - l) / 1000L).append(" sec, limit time=").append(this.jdField_a_of_type_Long / 1000L).toString();
	      }
	      catch (InterruptedException localInterruptedException) {}
	    }
	    if (this.jdField_a_of_type_JavaUtilArrayList.size() > 0) {
	      try
	      {
	        Object localObject = this.jdField_a_of_type_JavaUtilArrayList.remove(this.jdField_a_of_type_JavaUtilArrayList.size() - 1);
	        notifyAll();
	        return localObject;
	      }
	      catch (Exception localException)
	      {
	        throw new NoSuchElementException("Error:" + localException);
	      }
	    }
	    throw new NoSuchElementException("No element found or time out");
	  }
	  
	  public boolean isFull()
	  {
	    if (this.jdField_a_of_type_Int < 1) {
	      return false;
	    }
	    return this.jdField_a_of_type_JavaUtilArrayList.size() >= this.jdField_a_of_type_Int;
	  }
	  
	  public boolean isEmpty()
	  {
	    return this.jdField_a_of_type_JavaUtilArrayList.size() == 0;
	  }
	  
	  public synchronized void waitOnSizeBigger(int paramInt)
	  {
	    if (paramInt < 0) {
	      return;
	    }
	    while (this.jdField_a_of_type_JavaUtilArrayList.size() > paramInt) {
	      try
	      {
	        wait(this.jdField_a_of_type_Long);
	      }
	      catch (InterruptedException localInterruptedException) {}
	    }
	    notifyAll();
	  }
	  
	  public synchronized void destroy()
	  {
	    this.b = true;
	    


	    notifyAll();
	  }
	  
	  public String toString()
	  {
	    return getName() + ", maxlength=" + getMaxLength() + ",current=" + size();
	  }
	}


