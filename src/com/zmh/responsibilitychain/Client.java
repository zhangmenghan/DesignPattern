package com.zmh.responsibilitychain;

public class Client {

	public static void main(String[] args) {
		//创建请求
		PurchaseRequest purchaseRequest1 = new PurchaseRequest(1, 4500, 1);
		PurchaseRequest purchaseRequest2 = new PurchaseRequest(1, 6700, 1);
		PurchaseRequest purchaseRequest3 = new PurchaseRequest(1, 10001, 1);
		PurchaseRequest purchaseRequest4 = new PurchaseRequest(1, 30001, 1);
		
		//创建相关的审批人
		DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
		CollegeApprover collegeApprover = new CollegeApprover("李院长");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("佟校长");
	
		//需要将各个审批级别的下一个设置好 (处理人构成环形: )
		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);
		
		
		
		departmentApprover.processRequest(purchaseRequest1);
		viceSchoolMasterApprover.processRequest(purchaseRequest2);
		schoolMasterApprover.processRequest(purchaseRequest3);
		collegeApprover.processRequest(purchaseRequest4);
	}

}
