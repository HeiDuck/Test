package test;

public class SQLExcptionErrorToZh {
//	// {
//	 public static final String DB_ORACLE_ORA_00001 = "00001"; //Υ��ΨһԼ������ (.)
//	 public static final String DB_ORACLE_ORA_00017 = "00017"; //����Ự�����ø����¼�
//	 public static final String DB_ORACLE_ORA_00018 = "00018"; //�������Ự��
//	 public static final String DB_ORACLE_ORA_00019 = "00019"; //�������Ự�����
//	 public static final String DB_ORACLE_ORA_00020 = "00020"; //������������ ()
//	 public static final String DB_ORACLE_ORA_00021 = "00021"; // �Ự����������ĳЩ���̣��޷�ת���Ự
//	 public static final String DB_ORACLE_ORA_00022 = "00022"; //��Ч�ĻỰ ID�����ʱ��ܾ�
//	 public static final String DB_ORACLE_ORA_00023 = "00023"; //�Ự���ý���˽���ڴ棻�޷�����Ự
//	 public static final String DB_ORACLE_ORA_00024 = "00024"; //��һ����ģʽ�²�����Ӷ������ע��
//	 public static final String DB_ORACLE_ORA_00025 = "00025"; //�޷�����
//	 public static final String DB_ORACLE_ORA_00026 = "00026"; //��ʧ����Ч�ĻỰ ID
//	 public static final String DB_ORACLE_ORA_00027 = "00027"; //�޷�ɾȥ��ǰ�Ự
//	 public static final String DB_ORACLE_ORA_00028 = "00028"; //���ĻỰ����ɾȥ
//	 public static final String DB_ORACLE_ORA_00029 = "00029"; //�Ự�����û��Ự
//	 public static final String DB_ORACLE_ORA_00030 = "00030"; //�û��Ự ID �����ڡ�
//	 public static final String DB_ORACLE_ORA_00031 = "00031"; //���Ҫɾȥ�ĻỰ
//	 public static final String DB_ORACLE_ORA_00032 = "00032"; //��Ч�ĻỰ��ֲ����
//	 public static final String DB_ORACLE_ORA_00033 = "00033"; //��ǰ�ĻỰ���пյ���ֲ����
//	 public static final String DB_ORACLE_ORA_00034 = "00034"; //�޷��ڵ�ǰ PL/SQL �Ự��
//	 public static final String DB_ORACLE_ORA_00035 = "00035"; //LICENSE_MAX_USERS ����С�ڵ�ǰ�û���
//	 public static final String DB_ORACLE_ORA_00036 = "00036"; //�����ݹ� SQL () �������ֵ
//	 public static final String DB_ORACLE_ORA_00037 = "00037"; //�޷�ת�������ڲ�ͬ��������ĻỰ
//	 public static final String DB_ORACLE_ORA_00038 = "00038"; //�޷������Ự: �����������������û�
//	 public static final String DB_ORACLE_ORA_00050: ��ȡ���ʱ����ϵͳ����
//	 public static final String DB_ORACLE_ORA_00051: �ȴ���Դ��ʱ
//	 public static final String DB_ORACLE_ORA_00052: ������������Դ�� ()
//	 public static final String DB_ORACLE_ORA_00053: ������������
//	 public static final String DB_ORACLE_ORA_00054: ��Դ��æ��Ҫ��ָ�� NOWAIT
//	 public static final String DB_ORACLE_ORA_00055: ���� DML ���������
//	 public static final String DB_ORACLE_ORA_00056: ���� '.' �ϵ� DDL ���Բ�����ģʽ����
//	 public static final String DB_ORACLE_ORA_00057: ������ʱ�����������
//	 public static final String DB_ORACLE_ORA_00058: DB_BLOCK_SIZE ����Ϊ�ſɰ�װ�����ݿ� (�� )
//	 public static final String DB_ORACLE_ORA_00059: ���� DB_FILES �����ֵ
//	 public static final String DB_ORACLE_ORA_00060: �ȴ���Դʱ��⵽����
//	 public static final String DB_ORACLE_ORA_00061: ��һ�����������˲�ͬ�� DML_LOCKS
//	 public static final String DB_ORACLE_ORA_00062: �޷���� DML ȫ��������DML_LOCKS Ϊ 0
//	 public static final String DB_ORACLE_ORA_00063: ���� LOG_FILES �������
//	 public static final String DB_ORACLE_ORA_00064: ������������޷������ڴ� O/S (��)
//	 public static final String DB_ORACLE_ORA_00065: FIXED_DATE �ĳ�ʼ��ʧ��
//	 public static final String DB_ORACLE_ORA_00066: LOG_FILES Ϊ ����Ҫ��Ϊ �ſɼ���
//	 public static final String DB_ORACLE_ORA_00067: ֵ �Բ��� ��Ч�����ٱ���Ϊ
//	 public static final String DB_ORACLE_ORA_00068: ֵ �Բ��� ��Ч�������� �� ֮��
//	 public static final String DB_ORACLE_ORA_00069: �޷�������� -- �����˱�����
//	 public static final String DB_ORACLE_ORA_00070: ������Ч
//	 public static final String DB_ORACLE_ORA_00071: ���̺ű������ 1 �� ֮��
//	 public static final String DB_ORACLE_ORA_00072: ����""���
//	 public static final String DB_ORACLE_ORA_00073: ���� ���� �� ������֮��ʱʹ��
//	 public static final String DB_ORACLE_ORA_00074: δָ������
//	 public static final String DB_ORACLE_ORA_00075: �ڴ�����δ�ҵ����� ""
//	 public static final String DB_ORACLE_ORA_00076: δ�ҵ�ת��
//	 public static final String DB_ORACLE_ORA_00077: ת�� ��Ч
//	 public static final String DB_ORACLE_ORA_00078: �޷�������ת������
//	 public static final String DB_ORACLE_ORA_00079: δ�ҵ�����
//	 public static final String DB_ORACLE_ORA_00080: ��� ָ����ȫ��������Ч
//	 public static final String DB_ORACLE_ORA_00081: ��ַ��Χ [��) ���ɶ�
//public static final String DB_ORACLE_ORA_00082: ���ڴ��С������Ч���� [1], [2], [4] ֮��
//public static final String DB_ORACLE_ORA_00083: ����: ������ӳ��� SGA
//public static final String DB_ORACLE_ORA_00084: ȫ���������Ϊ PGA, SGA �� UGA
//public static final String DB_ORACLE_ORA_00085: ��ǰ���ò�����
//public static final String DB_ORACLE_ORA_00086: �û����ò�����
//public static final String DB_ORACLE_ORA_00087: �����޷���Զ��������ִ��
//public static final String DB_ORACLE_ORA_00088: ����������޷�ִ������
//public static final String DB_ORACLE_ORA_00089: ORADEBUG ��������Ч�����̺�
//public static final String DB_ORACLE_ORA_00090: δ�ܽ��ڴ�����Ⱥ�����ݿ� ORADEBUG ����
//public static final String DB_ORACLE_ORA_00091: LARGE_POOL_SIZE ���ٱ���Ϊ
//public static final String DB_ORACLE_ORA_00092: LARGE_POOL_SIZE ������� LARGE_POOL_MIN_ALLOC
//public static final String DB_ORACLE_ORA_00093: ������� �� ֮��
//public static final String DB_ORACLE_ORA_00094: Ҫ������ֵ
//public static final String DB_ORACLE_ORA_00096: ֵ �Բ��� ��Ч������������ ֮��
//public static final String DB_ORACLE_ORA_00097: ʹ�� Oracle SQL ���Բ��� SQL92 ����
//public static final String DB_ORACLE_ORA_00099: �ȴ���Դʱ������ʱ�������� PDML ��������
//public static final String DB_ORACLE_ORA_000100: δ�ҵ�����
//public static final String DB_ORACLE_ORA_000101: ϵͳ���� DISPATCHERS ��˵����Ч
//public static final String DB_ORACLE_ORA_000102: ���ȳ����޷�ʹ������Э��
//public static final String DB_ORACLE_ORA_000103: ��Ч������Э�飻�����ȳ�����
//public static final String DB_ORACLE_ORA_000104: ��⵽������ȫ�����÷������������ȴ���Դ
//public static final String DB_ORACLE_ORA_000105: δ��������Э�� �ĵ��Ȼ���
//public static final String DB_ORACLE_ORA_000106: �޷������ӵ����ȳ���ʱ����/�ر����ݿ�
//public static final String DB_ORACLE_ORA_000107: �޷����ӵ� ORACLE ����������
//public static final String DB_ORACLE_ORA_000108: �޷����õ��ȳ�����ͬ����������
//public static final String DB_ORACLE_ORA_000111: ���ڷ�������Ŀ������ , ����û���������з�����
//public static final String DB_ORACLE_ORA_000112: ���ܴ������ (���ָ��) �����ȳ���
//public static final String DB_ORACLE_ORA_000113: Э���� ����
//public static final String DB_ORACLE_ORA_000114: ȱ��ϵͳ���� SERVICE_NAMES ��ֵ
//public static final String DB_ORACLE_ORA_000115: ���ӱ��ܾ������ȳ������ӱ�����
//public static final String DB_ORACLE_ORA_000116: SERVICE_NAMES ������
//public static final String DB_ORACLE_ORA_000117: ϵͳ���� SERVICE_NAMES ��ֵ������Χ
//public static final String DB_ORACLE_ORA_000118: ϵͳ���� DISPATCHERS ��ֵ������Χ
//public static final String DB_ORACLE_ORA_000119: ϵͳ���� ��˵����Ч
//public static final String DB_ORACLE_ORA_000120: δ���û�װ���Ȼ���
//public static final String DB_ORACLE_ORA_000121: ��ȱ�� DISPATCHERS �������ָ���� SHARED_SERVERS
//public static final String DB_ORACLE_ORA_000122: �޷���ʼ����������
//public static final String DB_ORACLE_ORA_000123: ���й��÷�������ֹ
//public static final String DB_ORACLE_ORA_000124: ��ȱ�� MAX_SHARED_SERVERS �������ָ���� DISPATCHERS
//public static final String DB_ORACLE_ORA_000125: ���ӱ��ܾ�����Ч����ʾ�ĸ�
//public static final String DB_ORACLE_ORA_000126: ���ӱ��ܾ�����Ч���ظ�
//public static final String DB_ORACLE_ORA_000127: ���Ƚ��� ������
//public static final String DB_ORACLE_ORA_000128: ��������Ҫ���Ƚ�����
//public static final String DB_ORACLE_ORA_000129: ���������ַ��֤ʧ�� ''
//public static final String DB_ORACLE_ORA_000130: ���������ַ '' ��Ч
//public static final String DB_ORACLE_ORA_000131: ����Э�鲻֧��ע�� ''
//public static final String DB_ORACLE_ORA_000132: �﷨������޷��������������� ''
//public static final String DB_ORACLE_ORA_000150: �ظ��������� ID
//public static final String DB_ORACLE_ORA_000151: ��Ч�������� ID
//public static final String DB_ORACLE_ORA_000152: ��ǰ�Ự������ĻỰ��ƥ��
//public static final String DB_ORACLE_ORA_000153: XA ���е��ڲ�����
//public static final String DB_ORACLE_ORA_000154: ������������е�Э�����
//public static final String DB_ORACLE_ORA_000155: �޷���ȫ��������֮��ִ�й���
//public static final String DB_ORACLE_ORA_000160: ȫ���������� ���������ֵ ()
//public static final String DB_ORACLE_ORA_000161: ������ķ�֧���� �Ƿ� (�������󳤶�Ϊ )
//public static final String DB_ORACLE_ORA_000162: �ⲿ dbid �ĳ��� ���������ֵ ()
//public static final String DB_ORACLE_ORA_000163: �ڲ����ݿ������� ���������ֵ ()
//public static final String DB_ORACLE_ORA_000164: �ڷֲ�ʽ�������в����������������
//public static final String DB_ORACLE_ORA_000165: �������Զ�̲������п���ֲ�ֲ�ʽ����ת��
//public static final String DB_ORACLE_ORA_000200: �޷����������ļ�
//public static final String DB_ORACLE_ORA_000201: �����ļ��汾 �� ORACLE �汾 ������
//public static final String DB_ORACLE_ORA_000202: �����ļ�: ''
//	public static final String DB_ORACLE_ORA_000203: ʹ�ô���Ŀ����ļ�
//	public static final String DB_ORACLE_ORA_000204: �������ļ�ʱ���� (�� ��# �� )
//	public static final String DB_ORACLE_ORA_000205: ��ʶ�����ļ������й����飬���龯����־
//	public static final String DB_ORACLE_ORA_000206: д�����ļ�ʱ���� (�� ��# �� )
//	public static final String DB_ORACLE_ORA_000207: �����ļ���������ͬһ���ݿ�
//	public static final String DB_ORACLE_ORA_000208: �����ļ�����������������
//	public static final String DB_ORACLE_ORA_000209: �����ļ����С��ƥ�䣬�й����飬���龯����־
//	public static final String DB_ORACLE_ORA_000210: �޷���ָ���Ŀ����ļ�
//	public static final String DB_ORACLE_ORA_000211: �����ļ�����ǰ�Ŀ����ļ���ƥ��
//	public static final String DB_ORACLE_ORA_000212: ���С ����Ҫ�����С��С ( �ֽ�)
//	public static final String DB_ORACLE_ORA_000213: ��������ʹ�ÿ����ļ���ԭ�ļ���СΪ ������
//	public static final String DB_ORACLE_ORA_000214: �����ļ� '' �汾 ���ļ� '' �汾 ��һ��
//	public static final String DB_ORACLE_ORA_000215: �������ٴ���һ�������ļ�
//	public static final String DB_ORACLE_ORA_000216: �޷����µ����� 8.0.2 ��ֲ�Ŀ����ļ���С
//	public static final String DB_ORACLE_ORA_000217: �� 9.0.1 ������ֲ�޷����µ��������ļ��Ĵ�С
//	public static final String DB_ORACLE_ORA_000218: �����ļ��Ŀ��С �� DB_BLOCK_SIZE () ��ƥ��
//	public static final String DB_ORACLE_ORA_000219: Ҫ��Ŀ����ļ���С ��������������ֵ
//	public static final String DB_ORACLE_ORA_000220: ��һ������δ��װ�����ļ����й����飬���龯����־
//	public static final String DB_ORACLE_ORA_000221: д������ļ�����
//	public static final String DB_ORACLE_ORA_000222: ����������ʹ�õ�ǰ�Ѱ�װ�����ļ�������
//	public static final String DB_ORACLE_ORA_000223: ת���ļ���Ч��汾����ȷ
//	public static final String DB_ORACLE_ORA_000224: �����ļ������С����ʹ�÷Ƿ���¼���� ()
//	public static final String DB_ORACLE_ORA_000225: �����ļ���Ԥ�ڴ�С ��ʵ�ʴ�С ��ͬ
//	public static final String DB_ORACLE_ORA_000226: ���ÿ����ļ���ʱ��������в���
//	public static final String DB_ORACLE_ORA_000227: �����ļ��м�⵽�𻵵Ŀ�: (�� ��# �� )
//	public static final String DB_ORACLE_ORA_000228: ���ÿ����ļ������ȳ�������󳤶�
//	public static final String DB_ORACLE_ORA_000229: ����������: �ѹ�����տ����ļ����
//	public static final String DB_ORACLE_ORA_000230: ����������: �޷�ʹ�ÿ��տ����ļ����
//	public static final String DB_ORACLE_ORA_000231: ���տ����ļ�δ����
//	public static final String DB_ORACLE_ORA_000232: ���տ����ļ�������, ���𻵻��޷���ȡ
//	public static final String DB_ORACLE_ORA_000233: �����ļ��������𻵻��޷���ȡ
//	public static final String DB_ORACLE_ORA_000234: ��ʶ��򿪿��ջ��ƿ����ļ�ʱ����
//	public static final String DB_ORACLE_ORA_000235: �����ļ��̶����򲢷����¶���һ��
//	public static final String DB_ORACLE_ORA_000236: ���ղ���������: ���ϵĿ����ļ�Ϊ�����ļ�
//	public static final String DB_ORACLE_ORA_000237: ���ղ���������: �����ļ��½�����
//	 ORA-00238: �����������������ݿ�һ���ֵ��ļ���
//	 ORA-00250: δ�����浵��
//	 ORA-00251: LOG_ARCHIVE_DUPLEX_DEST ���������ַ��� ��ͬ��Ŀ�ĵ�
//	 ORA-00252: ��־ ���߳� ��Ϊ�գ��޷��浵
//	 ORA-00253: �ַ������� ���ڣ��鵵Ŀ���ַ��� ����������
//	 ORA-00254: �浵�����ַ��� '' ʱ����
//	 ORA-00255: �浵��־ (�߳� , ���� # ) ʱ����
//	 ORA-00256: �޷�����鵵Ŀ���ַ���
//	 ORA-00257: �浵���������ͷ�֮ǰ�������ڲ�����
//	 ORA-00258: NOARCHIVELOG ģʽ�µ��˹��浵�����ʶ��־
//	 ORA-00259: ��־ (���߳� ) Ϊ��ǰ��־���޷��浵
//	 ORA-00260: �޷��ҵ�������־���� (�߳� )
//	 ORA-00261: ���ڴ浵���޸���־ (�߳� )
//	 ORA-00262: ��ǰ��־ (�ر��߳� ) �޷��л�
//	 ORA-00263: �߳� û����Ҫ�浵�ļ�¼
//	 ORA-00264: ��Ҫ��ָ�
//	 ORA-00265: Ҫ�����ָ̻����޷����� ARCHIVELOG ģʽ
//	 ORA-00266: ��Ҫ�浵��־�ļ���
//	 ORA-00267: ����浵��־�ļ���
//	 ORA-00268: ָ������־�ļ������� ''
//	 ORA-00269: ָ������־�ļ�Ϊ�߳� ��һ���� (�� )
//	 ORA-00270: �����浵��־ ʱ����
//	 ORA-00271: û����Ҫ�浵����־
//	 ORA-00272: д�浵��־ ʱ����
//	 ORA-00273: δ��¼��ֱ�Ӽ������ݵĽ��ʻָ�
//	 ORA-00274: �Ƿ��ָ�ѡ��
//	 ORA-00275: �Ѿ���ʼ���ʻָ�
//	 ORA-00276: CHANGE �ؼ�����ָ����δ�������ı��
//	 ORA-00277: UNTIL �ָ���־ �ķǷ�ѡ��
//	 ORA-00278: �˻ָ�������Ҫ��־�ļ� ''
//	 ORA-00279: ���� (�� ����) �����߳� �Ǳ����
//	 ORA-00280: ���� �����߳� �ǰ����� # ���е�
//	 ORA-00281: ����ʹ�õ��Ƚ���ִ�н��ʻָ�
//	 ORA-00282: UPI ���ò���֧�֣���ʹ�� ALTER DATABASE RECOVER
//	 ORA-00283: �ָ��Ự������ȡ��
//	 ORA-00284: �ָ��Ự���ڽ���
//	 ORA-00285: TIME δ��Ϊ�ַ�����������
//	 ORA-00286: �޿��ó�Ա�����Ա����Ч����
//	 ORA-00287: δ�ҵ�ָ���ĸ��ı�� (���߳� ��)
//	 ORA-00288: Ҫ�����ָ�������� ALTER DATABASE RECOVER CONTINUE
//	 ORA-00289: ����:
//	 ORA-00290: ����ϵͳ���ִ浵�������������Ĵ���
//	 ORA-00291: PARALLEL ѡ��Ҫ������ֵ
//	 ORA-00292: δ��װ���лָ�����
//	 ORA-00293: �����ļ���������־��ͬ��
//	 ORA-00294: ��Ч�Ĵ浵��־��ʽ��ʶ ''
//	 ORA-00295: �����ļ��� ��Ч��������� 1 �� ֮��
//	 ORA-00296: �ѳ��� RECOVER DATAFILE LIST ������ļ��� ()
//	 ORA-00297: ������ RECOVER DATAFILE START ֮ǰָ�� RECOVER DATAFILE LIST
//	 ORA-00298: ��ʧ����Ч�� TIMEOUT ���
//	 ORA-00299: �����������ļ� ��ʹ���ļ������ʻָ�
//	 ORA-00300: ָ����������־���С �Ƿ� - ��������
//	 ORA-00301: �����־�ļ� '' ʱ���� - �޷������ļ�
//	 ORA-00302: ��־��������
//	 ORA-00303: �޷��������жϵ�����
//	 ORA-00304: ����� INSTANCE_NUMBER ��ʹ����
//	 ORA-00305: ��־ (�߳� ) ��һ�£�������һ�����ݿ�
//	 ORA-00306: �����ݿ��е���������
//	 ORA-00307: ����� INSTANCE_NUMBER �������ƣ����Ϊ
//	 ORA-00308: �޷��򿪴浵��־ ''
//	 ORA-00309: ��־���ڴ�������ݿ�
//	 ORA-00310: �浵��־�������� ��Ҫ������
//	 ORA-00311: �޷��Ӵ浵��־��ȡ����
//	 ORA-00312: ������־ �߳� : ''
//	 ORA-00313: �޷�����־�� (�߳� ) �ĳ�Ա
//	 ORA-00314: ��־ (�߳� )��Ԥ����� �� ��ƥ��
//	 ORA-00315: ��־ (�߳� )�������е��߳� # ����
//	 ORA-00316: ��־ (�߳� )�������е����� ������־�ļ�
//	 ORA-00317: �����е��ļ����� ������־�ļ�
//	 ORA-00318: ��־ (�߳� )��Ԥ���ļ���С �� ��ƥ��
//	 ORA-00319: ��־ (�߳� ) ���д������־����״̬
//	 ORA-00320: �޷�����־ (�߳� ) ��ȡ�ļ�����
//	 ORA-00321: ��־ (�߳� )���޷�������־�ļ�����
//	 ORA-00322: ��־ (�߳� ) ���ǵ�ǰ����
//	 ORA-00323: �߳� �ĵ�ǰ��־�����ö�����������־����Ҫ�浵
//	 ORA-00324: ��־�ļ� '' �ķ����� '' ̫���� �ַ����� ����
//	 ORA-00325: �ѹ鵵�߳� ����־�������е��߳� # ����
//	 ORA-00326: ��־�ڸ��� ��ʼ����Ҫ����ĸ���
//	 ORA-00327: ��־ (�߳� )��ʵ�ʴ�С С����Ҫ��
//	 ORA-00328: �鵵��־�ڸ��� ��������Ҫ�Ժ�ĸ���
//	 ORA-00329: �鵵��־�ڸ��� ��ʼ����Ҫ����
//	 ORA-00330: �鵵��־�ڸ��� ��������Ҫ����
//	 ORA-00331: ��־�汾 �� ORACLE �汾 ������
//	 ORA-00332: �鵵��־��С - ����δ��ȫ�鵵
//	 ORA-00333: ������־��ȡ�� ���� ����
//	 ORA-00334: �鵵��־: ''
//	 ORA-00335: ������־ : û�д˱�ŵ���־����־������
//	 ORA-00336: ��СΪ ����־�ļ�����С����С ����
//	 ORA-00337: ��־�ļ� '' ��������δָ����С
//	 ORA-00338: ��־ (�߳� ) �ȿ����ļ�����
//	 ORA-00339: �鵵��־δ�����κ�����
//	 ORA-00340: ����������־ (�߳� ) ʱ���� I/O ����
//	 ORA-00341: ��־ (�߳� )�������е���־ # ����
//	 ORA-00342: �鵵��־����һ�� RESETLOGS ֮ǰ���������
//	 ORA-00343: ������࣬�ѹر���־��Ա
//	 ORA-00344: �޷����´���������־ ''
//	 ORA-00345: ������־д��� ���� ����
//	 ORA-00346: ��־��Ա���Ϊ STALE
//	 ORA-00347: ��־ (�߳� )��Ԥ�ƿ��С �� ��ƥ��
//	 ORA-00348: ��һ��������ʧ�ܣ�������ֹ����
//	 ORA-00349: �޷���� '' �Ŀ��С
//	 ORA-00350: ��־ (�߳� ) ����Ҫ�鵵
//	 ORA-00351: recover-to ʱ����Ч
//	 ORA-00352: �߳� ��������־����Ҫ�鵵 - �޷�����
//	 ORA-00353: ��־�𻵽ӽ��� ���� ʱ��
//	 ORA-00354: ��������־�����
//	 ORA-00355: ���ı���޴���
//	 ORA-00356: ����˵���еĳ��Ȳ�һ��
//	 ORA-00357: ��־�ļ�ָ���˹����Ա�����Ϊ
//	 ORA-00358: ָ���˹����ļ���Ա�����Ϊ
//	 ORA-00359: ��־�ļ��� ������
//	 ORA-00360: ����־�ļ���Ա:
//	 ORA-00361: �޷�ɾ�����һ����־��Ա (�� )
//	 ORA-00362: ����� �е���Ч��־�ļ�Ҫ�������Ա
//	 ORA-00363: ��־���ǹ鵵�汾
//	 ORA-00364: �޷�������д������־��Ա
//	 ORA-00365: ָ����־������ȷ����һ����־
//	 ORA-00366: ��־ (�߳� )���ļ������е�У��ʹ���
//	 ORA-00367: ��־�ļ������е�У��ʹ���
//	 ORA-00368: ������־���е�У��ʹ���
//	 ORA-00369: �߳� �ĵ�ǰ��־��������������־�ѱ����
//	 ORA-00370: Rcbchange ���������п��ܳ�������
//	 ORA-00371: ������ڴ治��
//	 ORA-00372: ��ʱ�޷��޸��ļ�
//	 ORA-00373: ������־�汾 �� ORACLE �汾 ������
//	 ORA-00374: ���� db_block_size = ��Ч; �������� �ı���, ��ΧΪ [..]
//	 ORA-00375: �޷����Ĭ�� db_block_size
//	 ORA-00376: ��ʱ�޷���ȡ�ļ�
//	 ORA-00377: �ļ� ��Ƶ�����ݵ���д�����ӳ�
//	 ORA-00378: �޷���ָ�����������
//	 ORA-00379: ����� ���޷��ṩ K ���С�Ŀ��л�����
//	 ORA-00380: �޷�ָ�� db_k_cache_size, ��Ϊ K �Ǳ�׼���С
//	 ORA-00381: �޷����²����;ɲ���ͬʱ���ڻ��������ٻ���Ĵ�С˵��
//	 ORA-00382: ������Ч�Ŀ��С, ��Ч��ΧΪ [..]
//	 ORA-00383: DEFAULT ���ٻ���Ŀ��С ���ܼ�������
//	 ORA-00384: û���㹻���ڴ������Ӹ��ٻ���Ĵ�С
//	 ORA-00385: cannot enable Very Large Memory with new buffer cache
//	 parameters
//	 ORA-00390: ��־ (�߳� ) ����������޷���Ϊ��ǰ��־
//	 ORA-00391: �����̱߳���ͬʱת��Ϊ�µ���־��ʽ
//	 ORA-00392: ��־ (�߳� ) ������������������
//	 ORA-00393: �ѻ������ļ��Ļָ���Ҫ��־ (�߳� )
//	 ORA-00394: �ڳ��Դ浵ʱ����ʹ��������־
//	 ORA-00395: '��¡' ���ݿ��������־����������
//	 ORA-00396: ���� ��Ҫ�˻ص����α����ָ�
//	 ORA-00397: �����ļ� (�� ), ��⵽д�붪ʧ���
//	 ORA-00398: �����������ö���ֹ���ָ̻߳�
//	 ORA-00399: ������־�еĸ���˵������
//	 ORA-00400: ��Ч�İ汾ֵ (���ڲ��� )
//	 ORA-00401: �˰汾��֧�ֲ��� ��ֵ
//	 ORA-00402: �汾 �����ݿ�����޷����ڰ汾
//	 ORA-00403: () ��ͬ���������� ()
//	 ORA-00404: δ�ҵ�ת���ļ�: ''
//	 ORA-00405: ��������""
//	 ORA-00406: COMPATIBLE ������ҪΪ �����
//	 ORA-00407: ������Ӱ汾 . �� . ��������
//	 ORA-00408: ���� ����Ϊ TRUE
//	 ORA-00409: COMPATIBLE ������ �����ֵ����ʹ�� AUTO SEGMENT SPACE MANAGEMENT
//	 ORA-00436: û�� ORACLE ���ʹ��Ȩ������ Oracle ��˾��ϵ��ð���
//	 ORA-00437: û�� ORACLE �������ʹ��Ȩ������ Oracle ��˾��ϵ��ð���
//	 ORA-00438: δ��װ ѡ��
//	 ORA-00439: δ��������:
//	 ORA-00443: �������� "" δ����
//	 ORA-00444: �������� "" ����ʱʧ��
//	 ORA-00445: �������� "" �� ��֮����û������
//	 ORA-00446: ����������������
//	 ORA-00447: �������̳�����������
//	 ORA-00448: ����������������
//	 ORA-00449: �������� '' ����� �쳣��ֹ
//	 ORA-00470: LGWR ������������ֹ
//	 ORA-00471: DBWR ������������ֹ
//	 ORA-00472: PMON ������������ֹ
//	 ORA-00473: ARCH ������������ֹ
//	 ORA-00474: SMON ������������ֹ
//	 ORA-00475: TRWR ������������ֹ
//	 ORA-00476: RECO ������������ֹ
//	 ORA-00477: SNP* ������������ֹ
//	 ORA-00478: SMON �������� ������ֹ
//	 ORA-00480: LCK* ������������ֹ
//	 ORA-00481: LMON ������������ֹ
//	 ORA-00482: LMD* ������������ֹ
//	 ORA-00483: �رս��̹������쳣��ֹ
//	 ORA-00484: LMS* ������������ֹ
//	 ORA-00485: DIAG �������� ������ֹ
//	 ORA-00486: ���ܲ�����
//	 ORA-00568: �����жϴ������������
//	 ORA-00574: osndnt: $CANCEL ʧ�� (�ж�)
//	 ORA-00575: osndnt: $QIO ʧ�� (���� out-of-band �ж�)
//	 ORA-00576: �����ж�Э�����
//	 ORA-00577: �����ж�Э�����
//	 ORA-00578: ����Э�����
//	 ORA-00579: osndnt: �������յ����������ʽ����ȷ
//	 ORA-00580: Э��汾��ƥ��
//	 ORA-00581: osndnt: �޷���������������
//	 ORA-00582: osndnt: �޷�������������������
//	 ORA-00583: osndnt: $TRNLOG ʧ��
//	 ORA-00584: �޷��ر�����
//	 ORA-00585: �������Ƹ�ʽ����
//	 ORA-00586: osndnt: LIB$ASN_WTH_MBX ʧ��
//	 ORA-00587: �޷����ӵ�Զ������
//	 ORA-00588: ������������Ϣ����
//	 ORA-00589: ������������Ϣ���ݳ��ȴ���
//	 ORA-00590: ������������Ϣ���ʹ���
//	 ORA-00591: д����ֽ�������
//	 ORA-00592: osndnt: $QIO ʧ�� (�������)
//	 ORA-00593: osndnt: $DASSGN ʧ�� (�����豸)
//	 ORA-00594: osndnt: $DASSGN ʧ�� (����)
//	 ORA-00595: osndnt: $QIO ʧ�� (����)
//	 ORA-00596: osndnt: $QIO ʧ�� (����)
//	 ORA-00597: osndnt: $QIO ʧ�� (�������)
//	 ORA-00598: osndnt: $QIO IO ʧ�� (�����ȡ)
//	 ORA-00600: �ڲ�������룬����: [], [], [], [], [], [], [], []
//	 ORA-00601: ���������ͻ
//	 ORA-00602: �ڲ�����쳣����
//	 ORA-00603: ORACLE �������Ự�������������ֹ
//	 ORA-00604: �ݹ� SQL �� ���ִ���
//	 ORA-00606: �ڲ��������
//	 ORA-00607: ���������ݿ�ʱ�����ڲ�����
//	 ORA-00701: �޷��ı����������ݿ�����Ķ���
//	 ORA-00702: ��������汾 '' ��汾 '' ��һ��
//	 ORA-00703: �����и��ٻ����������������
//	 ORA-00704: �����������ʧ��
//	 ORA-00705: ���������е�״̬��һ�£����ڹر����̺���������
//	 ORA-00706: �����ļ� '' �ĸ�ʽʱ����
//	 ORA-00816: ������Ϣ�޷�ת��
//	 ORA-00900: ��Ч SQL ���
//	 ORA-00901: ��Ч CREATE ����
//	 ORA-00902: ��Ч��������
//	 ORA-00903: ������Ч
//	 ORA-00904: : ��Ч�ı�ʶ��
//	 ORA-00905: ȱ�ٹؼ���
//	 ORA-00906: ȱ��������
//	 ORA-00907: ȱ��������
//	 ORA-00908: ȱ�� NULL �ؼ���
//	 ORA-00909: ����������Ч
//	 ORA-00910: ָ���ĳ��ȶ����������Ͷ��Թ���
//	 ORA-00911: ��Ч�ַ�
//	 ORA-00913: ֵ����
//	 ORA-00914: ȱ�� ADD �ؼ���
//	 ORA-00915: ��ǰ��������������ֵ��
//	 ORA-00917: ȱ�ٶ���
//	 ORA-00918: δ��ȷ������
//	 ORA-00919: ��Ч����
//	 ORA-00920: ��Ч�Ĺ�ϵ�����
//	 ORA-00921: δԤ�ڵ� SQL �����β
//	 ORA-00922: ȱ�ٻ���Чѡ��
//	 ORA-00923: δ�ҵ�Ԥ�� FROM �ؼ���
//	 ORA-00924: ȱ�� BY �ؼ���
//	 ORA-00925: ȱʧ INTO �ؼ���
//	 ORA-00926: ȱ�� VALUES �ؼ���
//	 ORA-00927: ȱ�ٵȺ�
//	 ORA-00928: ȱ�� SELECT �ؼ���
//	 ORA-00929: ȱ�پ��
//	 ORA-00930: ȱ���Ǻ�
//	 ORA-00931: ȱ�ٱ�ʶ
//	 ORA-00932: ��һ�µ���������: Ҫ�� �õ���ȴ��
//	 ORA-00933: SQL ����δ��ȷ����
//	 ORA-00934: �˴�������ʹ�÷��麯��
//	 ORA-00935: ���麯����Ƕ��̫��
//	 ORA-00936: ȱ�ٱ��ʽ
//	 ORA-00937: �ǵ�����麯��
//	 ORA-00938: ����û���㹻�Ĳ���
//	 ORA-00939: �����Ĳ�������
//	 ORA-00940: ��Ч�� ALTER ����
//	 ORA-00941: Ⱥ����ȱ��
//	 ORA-00942: �����ͼ������
//	 ORA-00943: Ⱥ��������
//	 ORA-00944: û���㹻�ľ۴�����
//	 ORA-00945: ָ���ľ۴��в�����
//	 ORA-00946: ȱ�� TO �ؼ���
//	 ORA-00947: û���㹻��ֵ
//	 ORA-00948: ����֧�� ALTER CLUSTER ���
//	 ORA-00949: �Ƿ�����Զ�����ݿ�
//	 ORA-00950: ��Ч DROP ѡ��
//	 ORA-00951: Ⱥ���ǿ�
//	 ORA-00952: ȱ�� GROUP �ؼ���
//	 ORA-00953: ȱ�ٻ���Ч������
//	 ORA-00954: ȱ�� IDENTIFIED �ؼ���
//	 ORA-00955: �����������ж���ʹ��
//	 ORA-00956: ȱ�ٻ���Ч���ѡ��
//	 ORA-00957: �����ظ�
//	 ORA-00958: ȱ�� CHECK �ؼ���
//	 ORA-00959: ��ռ�''������
//	 ORA-00960: ѡ���б��е���������
//	 ORA-00961: ���������/���ֵ
//	 ORA-00962: group-by / order-by ���ʽ����
//	 ORA-00963: ��֧�ֵļ������
//	 ORA-00964: �������� FROM �б���
//	 ORA-00965: �б����в�����'*'
//	 ORA-00966: ȱ�� TABLE �ؼ���
//	 ORA-00967: ȱ�� WHERE �ؼ���
//	 ORA-00968: ȱ�� INDEX �ؼ���
//	 ORA-00969: ȱ�� ON �ؼ���
//	 ORA-00970: ȱ�� WITH �ؼ���
//	 ORA-00971: ȱ�� SET �ؼ���
//	 ORA-00972: ��ʶ����
//	 ORA-00973: ��Ч����������
//	 ORA-00974: ��Ч PCTFREE ֵ (�ٷֱ�)
//	 ORA-00975: ���������� + ����
//	 ORA-00976: �˴�������Ϊ LEVEL, PRIOR �� ROWNUM
//	 ORA-00977: �ظ������ѡ��
//	 ORA-00978: Ƕ�׷��麯��û�� GROUT BY
//	 ORA-00979: ���� GROUP BY ���ʽ
//	 ORA-00980: ͬ���ת��������Ч
//	 ORA-00981: ���ܽ����ϵͳ���ѡ�����һ��
//	 ORA-00982: ȱ�ټӺ�
//	 ORA-00984: ���ڴ˴�������
//	 ORA-00985: ��Ч�ĳ�����
//	 ORA-00986: ȱ�ٻ���Ч����
//	 ORA-00987: ȱ�ٻ���Ч�û���
//	 ORA-00988: ȱ�ٻ���Ч����
//	 ORA-00989: �������û����������
//	 ORA-00990: ȱ�ٻ���ЧȨ��
//	 ORA-00991: ���̽��� MAC Ȩ��
//	 ORA-00992: REVOKE �����ʽ��Ч
//	 ORA-00993: ȱ�� GRANT �ؼ���
//	 ORA-00994: ȱ�� OPTION �ؼ���
//	 ORA-00995: ȱ�ٻ���Чͬ��ʱ�ʶ
//	 ORA-00996: ����������� || ������ |
//	 ORA-00997: �Ƿ�ʹ�� LONG ��������
//	 ORA-00998: ����ʹ���б��������˱��ʽ
//	 ORA-00999: ��Ч����ͼ��
//	 ORA-01000: �������α�������
//	 ORA-01001: ��Ч���α�
//	 ORA-01002: ��ȡΥ��˳��
//	 ORA-01003: ���δ�����﷨����
//	 ORA-01004: ��֧��Ĭ���û������ԣ���¼���ܾ�
//	 ORA-01005: δ���������¼���ܾ�
//	 ORA-01006: ��ֵ����������
//	 ORA-01007: ѡ���б���û�б���
//	 ORA-01008: �������б������ѹ���
//	 ORA-01009: ȱ�ٷ�������
//	 ORA-01010: ��Ч�� OCI ����
//	 ORA-01011: ����� 6 ��������Ựʱ����ʹ�õ� 7 �����ģʽ
//	 ORA-01012: û�е�¼
//	 ORA-01013: �û�����ȡ����ǰ�Ĳ���
//	 ORA-01014: ORACLE ���ڹرչ�����
//	 ORA-01015: ѭ����¼����
//	 ORA-01016: �˺����������ڶ�ȡ�����
//	 ORA-01017: ��Ч���û���/����ܾ���¼
//	 ORA-01018: �в����� LONG ��������
//	 ORA-01019: �޷����û��������ڴ�
//	 ORA-01020: δ֪��������״̬
//	 ORA-01021: ָ���������Ĵ�С��Ч
//	 ORA-01022: �������в�֧�����ݿ����
//	 ORA-01023: δ�ҵ��α������� (��Ч���α���)
//	 ORA-01024: OCI �����е�����������Ч
//	 ORA-01025: UPI ����������Χ
//	 ORA-01026: ��ֵ�б��д��ڶ����С > 4000 �Ļ�����
//	 ORA-01027: �����ݶ�������в�����Ա�����ֵ
//	 ORA-01028: �ڲ�˫������
//	 ORA-01029: �ڲ�˫������
//	 ORA-01030: SELECT ...INTO ����������
//	 ORA-01031: Ȩ�޲���
//	 ORA-01032: û���������û���ʶ
//	 ORA-01033: ORACLE ���ڳ�ʼ����رչ�����
//	 ORA-01034: ORACLE ������
//	 ORA-01035: ORACLE ֻ������� RESTRICTED SESSION Ȩ�޵��û�ʹ��
//	 ORA-01036: �Ƿ��ı�����/���
//	 ORA-01037: ��������α��ڴ�
//	 ORA-01038: �޷�д�����ݿ��ļ��汾 (ʹ�� ORACLE �汾 )
//	 ORA-01039: ��ͼ���������Ȩ�޲���
//	 ORA-01040: �����е��ַ���Ч����¼���ܾ�
//	 ORA-01041: �ڲ�����hostdef ��չ��������
//	 ORA-01042: ������ʹ�ô��α����Ự
//	 ORA-01043: �û����ڴ��� [], [], [], []
//	 ORA-01044: ��������С (���������) �������������
//	 ORA-01045: �û� û�� CREATE SESSION Ȩ�ޣ���¼���ܾ�
//	 ORA-01046: �޷������չ����������Ŀռ�
//	 ORA-01047: ���ϴ�������� schema=, package=, procedure= ��
//	 ORA-01048: ���������������޷��ҵ�ָ���Ĺ���
//	 ORA-01049: ���� RPC �в�֧�ְ����Ƹ�ֵ
//	 ORA-01050: �޷���ô�����������Ŀռ�
//	 ORA-01051: �ӳ� rpc ��������ʽ��Ч
//	 ORA-01052: δָ�������Ŀ�� LOG_ARCHIVE_DUPLEX_DEST
//	 ORA-01053: �޷���ȡ�û��洢��ַ
//	 ORA-01054: �޷�д���û��洢��ַ
//	 ORA-01057: �û����������õ� block.field ��Ч��������
//	 ORA-01058: �ڲ� New Upi �ӿڴ���
//	 ORA-01059: �ڸ�ֵ��ִ��֮ǰ�����﷨����
//	 ORA-01060: ���������鸳ֵ��ִ��
//	 ORA-01061: �޷�ʹ�õ� 7 ��ͻ�Ӧ�ó��������� 8 �������
//	 ORA-01062: �޷����䶨�建����������ڴ�
//	 ORA-01070: ������ʹ�� Oracle �ľɰ汾
//	 ORA-01071: �޷������� ORACLE ��ִ�в���
//	 ORA-01072: �޷�ֹͣ ORACLE����Ϊ ORACLE ��������
//	 ORA-01073: ���������Ӵ���: ����ʶ��ĵ�������
//	 ORA-01074: �޷��ر� ORACLE����������ע��Ự��ע��
//	 ORA-01075: �������ѵ�¼
//	 ORA-01076: �в�֧��ÿ�����̵Ķ�ε�¼
//	 ORA-01077: �������̳�ʼ��ʧ��
//	 ORA-01078: ����ϵͳ����ʧ��
//	 ORA-01079: ORALCE ���ݿ�δ��ȷ������������ֹ
//	 ORA-01080: �ر� ORACLE ʱ����
//	 ORA-01081: �޷������������е� ORACLE --- �����ȹر�
//	 ORA-01082: 'row_locking = always' Ҫ����������ѡ��
//	 ORA-01083: ���� "" ��ֵ���������������Ӧ����ֵ��һ�¡�
//	 ORA-01084: OCI �����еĲ�����Ч
//	 ORA-01085: �ӳ� rpc �� ".." ֮ǰ�Ĵ���
//	 ORA-01086: ��δ���������� ''
//	 ORA-01087: �������� ORALCE --- �����ѵ�¼
//	 ORA-01088: �����ڴ��ڻ����ʱ�ر� ORACLE
//	 ORA-01089: ���ڽ��н����ر� - ����������κβ���
//	 ORA-01090: ���ڽ��йر� --- ����������
//	 ORA-01091: ǿ����������
//	 ORA-01092: ORACLE ������ֹ��ǿ�жϿ�����
//	 ORA-01093: ALTER DATABASE CLOSE ��������û�����ӻỰʱʹ��
//	 ORA-01094: ALTER DATABASE CLOSE ���ڽ��С�����������
//	 ORA-01095: DML ��䴦���������
//	 ORA-01096: ����汾 () ������ () ������
//	 ORA-01097: �޷�������������йر� - �����ύ�򷵻�
//	 ORA-01098: �� Long Insert �����г��ֳ���ӿڴ���
//	 ORA-01099: ����ڵ�����ģʽ�����������޷��� SHARED ģʽ�°�װ���ݿ�
//	 ORA-01100: ���ݿ��Ѱ�װ
//	 ORA-01101: Ҫ���������ݿ⵱ǰ�����������̰�װ
//	 ORA-01102: �޷��� EXCLUSIVE ģʽ�°�װ���ݿ�
//	 ORA-01103: �����ļ��е����ݿ��� '' ���� ''
//	 ORA-01104: �����ļ��� () ������
//	 ORA-01105: ��װ���������̵İ�װ������
//	 ORA-01106: ������ж��֮ǰ�ر����ݿ�
//	 ORA-01107: ���밲װ���ݿ�ſ��Խ��н��ʻָ�
//	 ORA-01108: �ļ� �����ڱ��ݻ���ʻָ�������
//	 ORA-01109: ���ݿ�δ��
//	 ORA-01110: �����ļ� : ''
//	 ORA-01111: �����ļ� ����δ֪ - ���������Ը����ļ�
//	 ORA-01112: δ�������ʻָ�
//	 ORA-01113: �ļ� ��Ҫ���ʻָ�
//	 ORA-01114: ����д���ļ� ʱ���� IO ���� (�� # )
//	 ORA-01115: ���ļ� ��ȡ��ʱ���� IO ���� (�� # )
//	 ORA-01116: �����ݿ��ļ�ʱ����
//	 ORA-01117: ���ļ� '' ��ӷǷ����С: ������Ϊ
//	 ORA-01118: �޷�����κ��������ݿ��ļ�: ��������
//	 ORA-01119: �������ݿ��ļ� '' ʱ����
//	 ORA-01120: �޷�ɾ���������ݿ��ļ�
//	 ORA-01121: �޷����������ݿ��ļ� - �ļ���ʹ���л��ڻָ���
//	 ORA-01122: ���ݿ��ļ� ��֤ʧ��
//	 ORA-01123: �޷������������ݣ�δ���ý��ʻָ�
//	 ORA-01124: �޷��ָ������ļ� - �ļ���ʹ���л��ڻָ���
//	 ORA-01125: �޷����ý��ʻָ� - �ļ� ��������������
//	 ORA-01126: ���ڴ˲��������ݿ������ EXCLUSIVE ģʽ��װ��δ��
//	 ORA-01127: ���ݿ��� '' ���� ���ַ�������
//	 ORA-01128: �޷������������� - �ļ� �����ѻ�״̬
//	 ORA-01129: �û�Ĭ�ϻ���ʱ��ռ䲻����
//	 ORA-01130: ���ݿ��ļ��汾 �� ORACLE �汾 ������
//	 ORA-01131: DB_FILES ϵͳ����ֵ ��������
//	 ORA-01132: ���ݿ��ļ��� '' �ĳ��ȳ��� ���ַ�������
//	 ORA-01133: ��־�ļ��� '' �ĳ��ȳ��� ���ַ�������
//	 ORA-01134: ���ݿ������������̶�����װ
//	 ORA-01135: DML/query ���ʵ��ļ� �����ѻ�״̬
//	 ORA-01136: �ļ� ( ��) ��ָ����СС�� ���ԭ��С
//	 ORA-01137: �����ļ� �Դ����ѻ�������
//	 ORA-01138: ���ݿ�����ڴ������д򿪻����û�д�
//	 ORA-01139: RESETLOGS ѡ����ڲ���ȫ���ݿ�ָ�����Ч
//	 ORA-01140: �޷������������� - �����ļ��������ѻ�״̬
//	 ORA-01141: �����������ļ� ʱ���� - δ�ҵ����ļ� ''
//	 ORA-01142: �޷������������� - û���ļ��ڱ�����
//	 ORA-01143: ���ܽ��ý��ʻָ� - �ļ� ��Ҫ���ʻ�
//	// }
//	public static class MyError {
//		int errno;
//		String szErrorDesc;
//
//		public MyError(int errno, String errorDesc) {
//			this.errno = errno;
//			this.szErrorDesc = errorDesc;
//		}
//
//		public int getErrorNo() {
//			return errno;
//		}
//
//		public String getErrorDesc() {
//			return szErrorDesc;
//		}
//	}
//
//	public static final int DB_ER_CANT_create_TABLE = 1005; // ������ʧ��
//
//	public static final int DB_ER_CANT_create_DB = 1006; // �������ݿ�ʧ��
//
//	public static final int DB_ER_DB_create_EXISTS = 1007; // ���ݿ��Ѵ��ڣ��������ݿ�ʧ��
//
//	public static final int DB_ER_DB_drop_EXISTS = 1008; // ���ݿⲻ���ڣ�ɾ�����ݿ�ʧ��
//
//	public static final int DB_ER_DB_drop_delete = 1009; // ����ɾ�����ݿ��ļ�����ɾ�����ݿ�ʧ��
//
//	public static final int DB_ER_DB_drop_RMDIR = 1010; // ����ɾ������Ŀ¼����ɾ�����ݿ�ʧ��
//
//	public static final int DB_ER_CANT_delete_FILE = 1011; // ɾ�����ݿ��ļ�ʧ��
//
//	public static final int DB_ER_CANT_FIND_SYSTEM_REC = 1012; // ���ܶ�ȡϵͳ���еļ�¼
//
//	public static final int DB_ER_CHECKREAD = 1020; // ��¼�ѱ������û��޸�
//
//	public static final int DB_ER_DISK_FULL = 1021; // Ӳ��ʣ��ռ䲻�㣬��Ӵ�Ӳ�̿��ÿռ�
//
//	public static final int DB_ER_DUP_KEY = 1022; // �ؼ����ظ������ļ�¼ʧ��
//
//	public static final int DB_ER_ERROR_ON_CLOSE = 1023; // �ر�ʱ��������
//
//	public static final int DB_ER_ERROR_ON_READ = 1024; // ���ļ�����
//
//	public static final int DB_ER_ERROR_ON_rename = 1025; // ��������ʱ��������
//
//	public static final int DB_ER_ERROR_ON_WRITE = 1026; // д�ļ�����
//
//	public static final int DB_ER_KEY_NOT_FOUND = 1032; // ��¼������
//
//	public static final int DB_ER_OPEN_AS_READONLY = 1036; // ���ݱ���ֻ���ģ����ܶ��������޸�
//
//	public static final int DB_ER_OUTOFMEMORY = 1037; // ϵͳ�ڴ治�㣬���������ݿ������������
//
//	public static final int DB_ER_OUT_OF_SORTMEMORY = 1038; // ����������ڴ治�㣬���������򻺳���
//
//	public static final int DB_ER_CON_COUNT_ERROR = 1040; // �ѵ������ݿ���������������Ӵ����ݿ����������
//
//	public static final int DB_ER_OUT_OF_RESOURCES = 1041; // ϵͳ�ڴ治��
//
//	public static final int DB_ER_BAD_HOST_ERROR = 1042; // ��Ч��������
//
//	public static final int DB_ER_HANDSHAKE_ERROR = 1043; // ��Ч����
//
//	public static final int DB_ER_DBACCESS_DENIED_ERROR = 1044; // ��ǰ�û�û�з������ݿ��Ȩ��
//
//	public static final int DB_ER_ACCESS_DENIED_ERROR = 1045; // �����������ݿ⣬�û������������
//
//	public static final int DB_ER_BAD_NULL_ERROR = 1048; // �ֶβ���Ϊ��
//
//	public static final int DB_ER_BAD_DB_ERROR = 1049; // ���ݿⲻ����
//
//	public static final int DB_ER_TABLE_EXISTS_ERROR = 1050; // ���ݱ��Ѵ���
//
//	public static final int DB_ER_BAD_TABLE_ERROR = 1051; // ���ݱ�����
//
//	public static final int DB_ER_BAD_FIELD_ERROR = 1054; // �ֶβ�����
//
//	public static final int DB_ER_EMPTY_QUERY = 1065; // ��Ч��SQL��䣬SQL���Ϊ��
//
//	public static final int DB_ER_IPSOCK_ERROR = 1081; // ���ܽ���Socket����
//
//	public static final int DB_ER_RECORD_FILE_FULL = 1114; // ���ݱ����������������κμ�¼
//
//	public static final int DB_ER_TOO_MANY_TABLES = 1116; // �򿪵����ݱ�̫��
//
//	public static final int DB_ER_HOST_IS_BLOCKED = 1129; // ���ݿ�����쳣�����������ݿ�
//
//	public static final int DB_ER_HOST_NOT_PRIVILEGED = 1130; // �������ݿ�ʧ�ܣ�û���������ݿ��Ȩ��
//
//	public static final int DB_ER_PASSWORD_NO_MATCH = 1133; // ���ݿ��û�������
//
//	public static final int DB_ER_NONEXISTING_GRANT = 1141; // ��ǰ�û���Ȩ�������ݿ�
//
//	public static final int DB_ER_TABLEACCESS_DENIED_ERROR = 1142; // ��ǰ�û���Ȩ�������ݱ�
//
//	public static final int DB_ER_COLUMNACCESS_DENIED_ERROR = 1143; // ��ǰ�û���Ȩ�������ݱ��е��ֶ�
//
//	public static final int DB_ER_NO_SUCH_TABLE = 1146; // ���ݱ�����
//
//	public static final int DB_ER_NONEXISTING_TABLE_GRANT = 1147; // δ�����û������ݱ�ķ���Ȩ��
//
//	public static final int DB_ER_SYNTAX_ERROR = 1149; // SQL����﷨����
//
//	public static final int DB_ER_NET_READ_ERROR = 1158; // ������󣬳��ֶ�����������������״��
//
//	public static final int DB_ER_NET_READ_INTERRUPTED = 1159; // ������󣬶���ʱ��������������״��
//
//	public static final int DB_ER_NET_ERROR_ON_WRITE = 1160; // ������󣬳���д����������������״��
//
//	public static final int DB_ER_NET_WRITE_INTERRUPTED = 1161; // �������д��ʱ��������������״��
//
//	public static final int DB_ER_DUP_ENTRY = 1062; // �ֶ�ֵ�ظ������ʧ��
//
//	public static final int DB_ER_DUP_UNIQUE = 1169; // �ֶ�ֵ�ظ������¼�¼ʧ��
//
//	public static final int DB_ER_CHECK_NO_SUCH_TABLE = 1177; // �����ݱ�ʧ��
//
//	public static final int DB_ER_ERROR_DURING_COMMIT = 1180; // �ύ����ʧ��
//
//	public static final int DB_ER_ERROR_DURING_ROLLBACK = 1181; // �ع�����ʧ��
//
//	public static final int DB_ER_TOO_MANY_USER_CONNECTIONS = 1203; // ��ǰ�û������ݿ⽨���������ѵ������ݿ���������������������õ����ݿ����������������ݿ�
//
//	public static final int DB_ER_LOCK_WAIT_TIMEOUT = 1205; // ������ʱ
//
//	public static final int DB_ER_NO_PERMISSION_TO_create_USER = 1211; // ��ǰ�û�û�д����û���Ȩ��
//
//	public static final int DB_ER_NO_REFERENCED_ROW = 1216; // ���Լ�����ʧ�ܣ������ӱ��¼ʧ��
//
//	public static final int DB_ER_ROW_IS_REFERENCED = 1217; // ���Լ�����ʧ�ܣ�ɾ�����޸������¼ʧ��
//
//	public static final int DB_ER_USER_LIMIT_REACHED = 1226; // ��ǰ�û�ʹ�õ���Դ�ѳ������������Դ�����������ݿ������������
//
//	public static final int DB_ER_SPECIFIC_ACCESS_DENIED_ERROR = 1227; // Ȩ�޲��㣬����Ȩ���д˲���
//
//	public static final int DB_ER_NOT_SUPPORTED_YET = 1235; // MySQL�汾���ͣ������б�����
//
//	private static final MyError[] errormap = {
//
//			new MyError(DB_ER_CANT_create_TABLE, "������ʧ��"),
//
//			new MyError(DB_ER_CANT_create_DB, "�������ݿ�ʧ��"),
//
//			new MyError(DB_ER_DB_create_EXISTS, "���ݿ��Ѵ��ڣ��������ݿ�ʧ��"),
//
//			new MyError(DB_ER_DB_drop_EXISTS, "���ݿⲻ���ڣ�ɾ�����ݿ�ʧ��"),
//
//			new MyError(DB_ER_DB_drop_delete, "����ɾ�����ݿ��ļ�����ɾ�����ݿ�ʧ��"),
//
//			new MyError(DB_ER_DB_drop_RMDIR, "����ɾ������Ŀ¼����ɾ�����ݿ�ʧ��"),
//
//			new MyError(DB_ER_CANT_delete_FILE, "ɾ�����ݿ��ļ�ʧ��"),
//
//			new MyError(DB_ER_CANT_FIND_SYSTEM_REC, "���ܶ�ȡϵͳ���еļ�¼"),
//
//			new MyError(DB_ER_CHECKREAD, "��¼�ѱ������û��޸�"),
//
//			new MyError(DB_ER_DISK_FULL, "Ӳ��ʣ��ռ䲻�㣬��Ӵ�Ӳ�̿��ÿռ�"),
//
//			new MyError(DB_ER_DUP_KEY, "�ؼ����ظ������ļ�¼ʧ��"),
//
//			new MyError(DB_ER_ERROR_ON_CLOSE, "�ر�ʱ��������"),
//
//			new MyError(DB_ER_ERROR_ON_READ, "���ļ�����"),
//
//			new MyError(DB_ER_ERROR_ON_rename, "��������ʱ��������"),
//
//			new MyError(DB_ER_ERROR_ON_WRITE, "д�ļ�����"),
//
//			new MyError(DB_ER_KEY_NOT_FOUND, "��¼������"),
//
//			new MyError(DB_ER_OPEN_AS_READONLY, "���ݱ���ֻ���ģ����ܶ��������޸�"),
//
//			new MyError(DB_ER_OUTOFMEMORY, "ϵͳ�ڴ治�㣬���������ݿ������������"),
//
//			new MyError(DB_ER_OUT_OF_SORTMEMORY, "����������ڴ治�㣬���������򻺳���"),
//
//			new MyError(DB_ER_CON_COUNT_ERROR, "�ѵ������ݿ���������������Ӵ����ݿ����������"),
//
//			new MyError(DB_ER_OUT_OF_RESOURCES, "ϵͳ�ڴ治��"),
//
//			new MyError(DB_ER_BAD_HOST_ERROR, "��Ч��������"),
//
//			new MyError(DB_ER_HANDSHAKE_ERROR, "��Ч����"),
//
//			new MyError(DB_ER_DBACCESS_DENIED_ERROR, "��ǰ�û�û�з������ݿ��Ȩ��"),
//
//			new MyError(DB_ER_ACCESS_DENIED_ERROR, "�����������ݿ⣬�û������������"),
//
//			new MyError(DB_ER_BAD_NULL_ERROR, "�ֶβ���Ϊ��"),
//
//			new MyError(DB_ER_BAD_DB_ERROR, "���ݿⲻ����"),
//
//			new MyError(DB_ER_TABLE_EXISTS_ERROR, "���ݱ��Ѵ���"),
//
//			new MyError(DB_ER_BAD_TABLE_ERROR, "���ݱ�����"),
//
//			new MyError(DB_ER_BAD_FIELD_ERROR, "�ֶβ�����"),
//
//			new MyError(DB_ER_EMPTY_QUERY, "��Ч��SQL��䣬SQL���Ϊ��"),
//
//			new MyError(DB_ER_IPSOCK_ERROR, "���ܽ���Socket����"),
//
//			new MyError(DB_ER_RECORD_FILE_FULL, "���ݱ����������������κμ�¼"),
//
//			new MyError(DB_ER_TOO_MANY_TABLES, "�򿪵����ݱ�̫��"),
//
//			new MyError(DB_ER_HOST_IS_BLOCKED, "���ݿ�����쳣�����������ݿ�"),
//
//			new MyError(DB_ER_HOST_NOT_PRIVILEGED, "�������ݿ�ʧ�ܣ�û���������ݿ��Ȩ��"),
//
//			new MyError(DB_ER_PASSWORD_NO_MATCH, "���ݿ��û�������"),
//
//			new MyError(DB_ER_NONEXISTING_GRANT, "��ǰ�û���Ȩ�������ݿ�"),
//
//			new MyError(DB_ER_TABLEACCESS_DENIED_ERROR, "��ǰ�û���Ȩ�������ݱ�"),
//
//			new MyError(DB_ER_COLUMNACCESS_DENIED_ERROR, "��ǰ�û���Ȩ�������ݱ��е��ֶ�"),
//
//			new MyError(DB_ER_NO_SUCH_TABLE, "���ݱ�����"),
//
//			new MyError(DB_ER_NONEXISTING_TABLE_GRANT, "δ�����û������ݱ�ķ���Ȩ��"),
//
//			new MyError(DB_ER_SYNTAX_ERROR, "SQL����﷨����"),
//
//			new MyError(DB_ER_NET_READ_ERROR, "������󣬳��ֶ�����������������״��"),
//
//			new MyError(DB_ER_NET_READ_INTERRUPTED, "������󣬶���ʱ��������������״��"),
//
//			new MyError(DB_ER_NET_ERROR_ON_WRITE, "������󣬳���д����������������״��"),
//
//			new MyError(DB_ER_NET_WRITE_INTERRUPTED, "�������д��ʱ��������������״��"),
//
//			new MyError(DB_ER_DUP_ENTRY, "�ֶ�ֵ�ظ������ʧ��"),
//
//			new MyError(DB_ER_DUP_UNIQUE, "�ֶ�ֵ�ظ������¼�¼ʧ��"),
//
//			new MyError(DB_ER_CHECK_NO_SUCH_TABLE, "�����ݱ�ʧ��"),
//
//			new MyError(DB_ER_ERROR_DURING_COMMIT, "�ύ����ʧ��"),
//
//			new MyError(DB_ER_ERROR_DURING_ROLLBACK, "�ع�����ʧ��"),
//
//			new MyError(DB_ER_TOO_MANY_USER_CONNECTIONS, "��ǰ�û������ݿ⽨���������ѵ������ݿ���������������������õ����ݿ����������������ݿ�"),
//
//			new MyError(DB_ER_LOCK_WAIT_TIMEOUT, "������ʱ"),
//
//			new MyError(DB_ER_NO_PERMISSION_TO_create_USER, "��ǰ�û�û�д����û���Ȩ��"),
//
//			new MyError(DB_ER_NO_REFERENCED_ROW, "���Լ�����ʧ�ܣ������ӱ��¼ʧ��"),
//
//			new MyError(DB_ER_ROW_IS_REFERENCED, "���Լ�����ʧ�ܣ�ɾ�����޸������¼ʧ��"),
//
//			new MyError(DB_ER_USER_LIMIT_REACHED, "��ǰ�û�ʹ�õ���Դ�ѳ������������Դ�����������ݿ������������"),
//
//			new MyError(DB_ER_SPECIFIC_ACCESS_DENIED_ERROR, "Ȩ�޲��㣬����Ȩ���д˲���"),
//
//			new MyError(DB_ER_NOT_SUPPORTED_YET, "MySQL�汾���ͣ������б�����"),
//
//	};
//
//	public static String getErrorInfo(int errno) {
//		for (int i = 0; i < errormap.length; i++) {
//			if (errno == errormap[i].getErrorNo()) {
//				return errormap[i].getErrorDesc();
//			}
//		}
//		return "";
//	}
//
//	public String getErrorMessage(int errorcode) {
//		String error = null;
//		for (int i = 0; i < errormap.length; i++) {
//			if (errormap[i].getErrorNo() == errorcode) {
//				error = errormap[i].getErrorNo() + "��" + errormap[i].getErrorDesc();
//				break;
//			}
//		}
//		return error;
//	}
}
