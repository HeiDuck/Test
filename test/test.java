package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.json.JSONArray;
import org.json.JSONObject;
import org.owasp.esapi.Logger;

import com.agilecontrol.nea.core.velocity.VelocityUtils;
import com.agilecontrol.nea.util.BshScriptUtils;
import bsh.EvalError;
import bsh.Interpreter;

public class test{
	public static void main(String[] args) throws Exception{
		
		
		
		File file = new File("C:/123示例.xlsx");
		FileOutputStream fos = new FileOutputStream(file);
//		Workbook wb = (XSSFWorkbook)WorkbookFactory.create(new FileInputStream(file));
//		
		
		
		String mmp = "妈卖批啊";   
		
		
		
//		Sheet sheet = wb.createSheet("我有一只小毛驴");
//		
//		Row row;
//		Cell cell;
//		long begin = System.currentTimeMillis();
//		System.out.println();
//		for(int i = 0;i < 3000;i++){
//			row = sheet.createRow(i);
//			for(int ii = 0;ii < 40;ii++){
//				cell = row.createCell(ii);
//				cell.setCellType(Cell.CELL_TYPE_STRING);
//				cell.setCellValue("我有一只小毛驴"+ii);
//				sheet.autoSizeColumn(ii, true);
//				System.out.println("i = " + i + ";ii = " + ii);
//			}
//		}
//		wb.write(fos);
//		fos.close();
//		long end = System.currentTimeMillis();
//		System.out.println("耗时"+ new Date(end - begin).getTime()/1000/60 + "min");
//		System.out.println("完成了");
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
//		Date end = df.parse(df.format(new Date(System.currentTimeMillis())));
//		System.out.println(end.getTime()/1000);
//		Thread.currentThread().sleep(60000);
//		Date begin = df.parse(df.format(new Date(System.currentTimeMillis())));
//		System.out.println(begin.getTime()/1000);
//		long time = (begin.getTime() - end.getTime())/1000;
//		System.out.println(time);
//		Map map = new HashMap();
//		System.out.println("12313");
//		{
//		}
//		JSONObject jo = new JSONObject();
//		jo.put("key1", "key1");
//		jo.put("key2", "{key2:key2}");
//		Object o1 = jo.opt("key1");
//		if(o1 instanceof String) System.out.println("string---"+o1.toString());
//		Object o2 = jo.opt("key2");
//		if(o2 instanceof JSONObject) System.out.println("JSONObject----"+o2.toString());
//		Object[] sqlParams = new Object[5];
//		//System.out.println(sqlParams.length);
//		sqlParams[sqlParams.length -1 ] =" 123";
//		sqlParams[sqlParams.length -1 ] = "456";
//		System.out.println(sqlParams.length );
//		System.out.println(System.getProperty("os.name"));
//		File directory = new File("E:/p.lsh/act.nea/home/lifecycle.cn/893");
//		for(File file:directory.listRoots()){
//			System.out.println(file.getName());
//			
//		}
//		String str = "a,b,c,,,"; 
//		String[] ary = str.split(",",0); 
//		System.out.println(ary.length);		
//		Test3 test3 = Test2.test;
//		String str = "123_-1";
//		System.out.println(str.split("_")[0]+"-0-----------0"+str.split("_")[1]);
//		File file = new File("E:/p.lsh/jboss/copyright.txt");
//		System.out.println(convertFileSize(file.length()));
//		String str = "( txt1 like '%'||?||'%' )";
//		System.out.println(str);
//		char c = '\'';
//		System.out.println(c);
//		String str = "123'asd";
//		System.out.println(str);
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0;i < str.length();i++){
//			char a = str.charAt(i);
//			if(a == c){
//				sb.append("''");
//			}else{
//				sb.append(a);
//			}
//		}
//		System.out.println(sb);
//		ArrayList array = new ArrayList();
//		init(array);
//		System.out.println(array.size());
//		Interpreter bsh=BshScriptUtils.createInterpreter();
//		System.out.println("嘿嘿".getBytes().length);
//		System.out.println("hh".getBytes().length);
//		HashMap map=new HashMap();
//		map.put("B_FOITEM.M_PRODUCT_ID;PRICELIST", 10.1);
//		map.put("B_FOITEM.QTY", 10.1);
//		System.out.println(BshScriptUtils.evalScript(bsh, "=B_FOITEM.QTY*B_FOITEM.M_PRODUCT_ID;PRICELIST", map));
//		String str = "1";
//		System.out.println(Double.parseDouble(str));
//		String path = "E:/p.lsh2.0/jboss/server/default/deploy/ROOT.war/pdt";
//		File file =new File(path);
//		System.out.println(file.isDirectory()+"");
//		System.out.println(file.getAbsolutePath());
//		String source = "E:/p.lsh/jboss/server/default/deploy/ROOT.war/pdt";
//		String destination = "E:/p.lsh2.0/jboss/server/default/deploy/ROOT.war/pdt";
//		String cmd = "xcopy /s /f "+new File(source).getAbsolutePath()+" "+ new File(destination).getAbsolutePath();
//		System.out.println(cmd);
//		Runtime.getRuntime().exec(cmd);
//		VelocityContext vc = new VelocityContext();
//		String strs = "B_FOITEM.QTY*B_FOITEM.M_PRODUCT_ID;PRICELIST";
//		System.out.println(strs.replaceAll(";", "\\$"));
//		
//		vc.put("$qty", 123);
//		vc.put("qty", 123);
////		vc.put("price", 100);
////		vc.put("adc", 10);
//		//String str = "#set($price = $qty)";
//		String str = "hello";
//		StringWriter outPut = new StringWriter();
//		Velocity.evaluate(vc,outPut,VelocityUtils.class.getName(), "abc");
//		System.out.println(outPut.toString());
		//System.out.println(vc.get("price"));
//		String str = "50M";
//		System.out.println(Double.valueOf(str)/1024f/1024f);
//		ArrayList<String> warning = new ArrayList();
//		for(int i = 0 ;i < 100;i++){
//			warning.add(""+i);
//		}
//		JSONArray pdtIds = new JSONArray();
//		pdtIds.put("1922");
//		StringBuilder sb=new StringBuilder("select id from m_product p where ");
//		int length=pdtIds.length();
//		
//		for(int i=0;i<length/1000+1;i++){
//			if(i>0) sb.append(" or ");
//			sb.append("p.id in(");
//			for(int j=i*1000;j< i*1000+1000 && j< length;j++){
//				sb.append(pdtIds.getInt(j)).append(",");
//			}
//			sb.deleteCharAt(sb.length()-1);
//			sb.append(")");
//		}
//		System.out.println(sb.toString());
//		Object flag = true;
//		if(flag instanceof Boolean){
//			
//			System.out.println(((Boolean) flag).booleanValue()+"");
//		}
//		double d = 33.0;
//		System.out.println(new DecimalFormat("0.##").format(d));
//		String string = new String("(test*qty)ert(123-12+33/33(").replaceAll("[\\+\\-\\*\\/]", ",");
//		String[] str = string.split(",");
//		for(int i = 0;i < str.length;i++){
//			System.out.println(str[i]);
//		}
//		File file = new File("E:"+File.separator+"p.lsh"+File.separator+"act.nea"+File.separator+"home"+File.separator+"erpjia.com"+File.separator+"893"+File.separator+"imp"+File.separator+"16554"+File.separator+"impxls.xlsx");
//		Workbook wb = WorkbookFactory.create(file);
//		System.out.println("hha ");
//		FileInputStream fileInput = new FileInputStream(file);
//		InputStreamReader input = new InputStreamReader(fileInput);
//		BufferedReader reader = new BufferedReader(input);
//		String str;
//		String longStr = "";
//		while ((str = reader.readLine()) != null) {
//			longStr += str;
//		}
//		if (longStr.startsWith("{")) {
//			JSONObject task = new JSONObject(longStr);
//			System.out.println(task.getString("state"));
//		}
//		Workbook wb = WorkbookFactory.create(input);
//		Sheet sheet = wb.getSheetAt(0);
//		System.out.println(sheet.getLastRowNum());
//		System.out.println(warning.toString());
//		//warning.removeAll(warning);
//		warning.add("123");
//		System.out.println(warning.size());
//		System.out.println(warning.contains("123"));
//		ArrayList array = new ArrayList();
//		array.add("1");
//		array.add("2");
//		array.add("3");
//		array.add("4");
//		array.add("5");
//		array.add("6");
//		array.add("1");
//		for(int i = 0;i < array.size();i++){
//			if(array.get(i).equals("1"))
//				array.remove(i);
//		}
//		System.out.println(array.get(0));
//		String css = new String("aasdasasddsasdadsasdd;");
//		System.out.println(css.replaceAll(";", "8"));
//		if(css.contains("aas")) css.concat("aaaa");
//		System.out.println(css);
//		System.out.println(Pattern.matches("^\\d*[02468]$", " 12345"));
//		JSONObject j1 = new JSONObject();
//		JSONObject j2 = new JSONObject();
//		JSONObject j3 = new JSONObject();
//		j1.put("isshow", true);
//		j2.put("isshow", false);
//		j3.put("isshow", true);
//		j1.put("context", "a");
//		j2.put("context", "b");
//		j3.put("context", "c");
//		JSONArray ja = new JSONArray();
//		ja.put(j1);
//		ja.put(j2);
//		ja.put(j3);
//		for(int i = 0;i < ja.length();i++){
//			JSONObject jo = ja.optJSONObject(i);
//			if(!jo.optBoolean("isshow"))
//				ja.remove(i);
//		}
//		System.out.println(ja.toString());
//		String str = "10";
//		String s = "{'background-color':'red'}";
//		JSONObject jo = new JSONObject();
//		jo.put("css", s);
//		JSONObject j1 = (JSONObject)jo.opt("css");
//		if(jo.optString("css").startsWith("{")){
//			System.out.println(j1);
//		}
//		JSONArray ja = new JSONArray();
//		ja.put("a");
//		ja.put("b");
//		ja.put("c");
//		StringBuilder s1 = new StringBuilder();
//		JSONArray sizeDesc = sizeColumns;// 拿到尺码定义，然后插入进去
//		for (int k = 0; k < sizeColumns.length(); k++) {
//			jo = new JSONObject();
//
//			StringBuilder stb = new StringBuilder();
//			for(int l = 0;l < sizeDesc.getJSONArray(k).length();l++){
//				stb.append(sizeDesc.getJSONArray(k).get(l)+",");
//			}
//			jo.put("editable", true);
//			jo.put("desc", stb.deleteCharAt(stb.length()-1));
//			jo.put("options", sizeDefine.options);
//			jo.put("minWidth", sizeDefine.width<150?150:sizeDefine.width);
//			jo.put("type", sizeDefine.type);
//			jo.put("field", String.valueOf(k + sizeIndex));
//			if(presizeDefine.length()==0)
//				jo.put("isenter", false);
//			else
//				jo.put("isenter", true);
//			JSONArray data_css = new JSONArray();
//			for (int l = 0; l < sizeDefine.subColumns.size(); l++) {
//				ColumnItem viewDefine = sizeDefine.subColumns.get(l);
//				data_css.put(viewDefine.css);
//			}
//			jo.put("isSize", true);
//			j++;
//			ja.put(jo);
//		}
//		if (cd.isPreSize) {
//		JSONArray pre_css = new JSONArray();
//		JSONArray pre_desc = new JSONArray();
//		for (int l = 0; l < cd.subColumns.size(); l++) {
//			ColumnItem ci = cd.subColumns.get(l);
//			pre_css.put(ci.css);
//			pre_desc.put(ci.desc);
//		}
//		if(pre_css.length() > linewrap) linewrap = pre_css.length();
//		presizeDefine.put("pre_css", pre_css);
//		presizeDefine.put("pre_desc", pre_desc);
//		continue;
//	}
//	if (cd.isSize) {
//		sizeDefine = cd;
//	}
//		try{
//			long qty = Long.parseLong(str);
//			if(qty > Integer.MAX_VALUE||qty < 0){
//				System.out.println("请输入正确的数量1");
//			}
//		}catch(Exception e){
//			System.out.println("请输入正确的数量2");
//		}
//		String str = "1111111111";
//		System.out.println(Integer.MIN_VALUE);
//		System.out.println(new DecimalFormat("###.##").format("0"));
//		JSONObject jo = new JSONObject();
//		JSONArray ja = new JSONArray();
//		JSONArray string = new JSONArray();
//		string.put("1");
//		string.put("2");
//		string.put("3");
//		ja.put("哈哈哈");
//		ja.put(string);
//		jo.put("col", ja);
//		System.out.println(jo.toString());
//		String a = jo.getString("col");
//		System.out.println(a.toString());
//		System.out.println(a.startsWith("["));
//		System.out.println(jo.getJSONArray("col"));\
//		List list = new ArrayList();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		list.add("d");
//		System.out.println(new JSONArray(list));
//		JSONArray ja = new JSONArray();
//		JSONObject jo = new JSONObject();
//		jo.put("pdts", ja);
//		System.out.println(jo.optJSONArray("pdts")==null);
//		if(jo.optBoolean("aaa",false)){
//			System.out.println("aaa");
//		}else{
//			System.out.println("bbb");
//		}
//		String a = null;
//		String b = "a"+"_"+a;
//		System.out.println(b);
		//System.out.println(new );
	}
//	public static void add(JSONObject jo) throws Exception{
//		jo.put("1", "jjja");
//	}

	private static void init(ArrayList<Integer> array) {
		{
			Map map = new HashMap();
		}
		
	}
	public static String convertFileSize(long size) {
        long kb = 1024;
        long mb = kb * 1024;
        long gb = mb * 1024;
        if (size >= gb) {
            return String.format("%.1f GB", (float) size / gb);
        } else if (size >= mb) {
            float f = (float) size / mb;
            return String.format(f > 100 ? "%.0f MB" : "%.1f MB", f);
        } else if (size >= kb) {
            float f = (float) size / kb;
            return String.format(f > 100 ? "%.0f KB" : "%.1f KB", f);
        } else
            return String.format("%d B", size);
    }
}
