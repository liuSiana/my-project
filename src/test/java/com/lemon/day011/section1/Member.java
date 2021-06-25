package com.lemon.day011.section1;

public abstract class Member implements User{
	private int id;
	
	private String regName;
	
	private String mobilePhone;
	
	private String password;
	
	private double leaveAmount;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRegName() {
		return regName;
	}

	public void setRegName(String regName) {
		this.regName = regName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getLeaveAmount() {
		return leaveAmount;
	}

	public void setLeaveAmount(double leaveAmount) {
		this.leaveAmount = leaveAmount;
	}
	
	public Member() {
		super();
	}
	
	public Member(int id, String regName, String mobilePhone, String password, double leaveAmount) {
		super();
		this.id = id;
		this.regName = regName;
		this.mobilePhone = mobilePhone;
		this.password = password;
		this.leaveAmount = leaveAmount;
	}
	

	//˽�е�����ֻ�����ڲ�����ʹ�ã��ⲿ����ʹ�ã��ⲿ��Ҫ�����ڲ�
	//�������ԣ�һ���Ƕ����Խ�����ֵ��ȡֵ
	//��ֵ
	public void setMobilePhone(String mobilePhone){
		this.mobilePhone=mobilePhone;
	}
	
	//ȡֵ
	public String getMobilePhone(){
		return this.mobilePhone;
	}
	
	// ע��
	public static void register(String mobilePhoe,String pwd){

		if (mobilePhoe.length()!=11||(pwd.length()<6||pwd.length()>16)){
			System.out.println("�ֻ��Ż��������");
		}else {
			System.out.println("ע��ɹ�");
		}
		
	}
	/**
	 * ��ֵ���û���ɳ�ֵ�����Ҫ��Ӧ������
	 * 1��������ͳ�ֵ��100
	 * 		�����ֵ���С��100Ԫ����ֵʧ��
	 * 		���򣬳�ֵ�ɹ�
	 * @param args
	 */
	//��Ʒ���ʱ������Ҫ����������ڲ�����
	public boolean recharge(double amount){
		if (amount<100) {
			System.out.println("��ֵʧ��");
			
			return false;
		}
		else {
			//��ֵ�ɹ�����֮ǰ���Ļ��������ӽ��
			this.leaveAmount+=amount;
			System.out.println("��ֵ�ɹ�");
		}
		return true;
	}
	/**
	 * ���֣�
	 * 1��������ֽ��100Ԫ�������������50��
	 * 2�����ֽ��ܴ������
	 * 3�����ֽ��Ӧ����100��������
	 * 4������С�ڵ���0
	 * @param args
	 */
	public void withDraw(double money){
		if (money<100||money>500000) {
			System.out.println("����ʧ�ܣ�������ֽ��100Ԫ�������������50��");
		}
		else if (this.leaveAmount<=0||money>this.leaveAmount) {
			System.out.println("����ʧ�ܣ�����С��0�����ֽ��ܴ������");
		}else{
			this.leaveAmount-=money;
			System.out.println("���ֳɹ�");
		}
	}

	@Override//��д������֪�����ϸ�ڣ����е���
	public String toString() {
		return "Member [id=" + id + ", regName=" + regName + ", mobilePhone=" + mobilePhone + ", password=" + password
				+ ", leaveAmount=" + leaveAmount + "]";
	}
	
}
