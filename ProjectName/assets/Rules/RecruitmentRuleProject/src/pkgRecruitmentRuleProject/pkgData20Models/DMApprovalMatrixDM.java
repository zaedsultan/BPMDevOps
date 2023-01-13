package pkgRecruitmentRuleProject.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="RecruitmentRuleProject",DataModelName="ApprovalMatrixDM",EventTypeName="") public class DMApprovalMatrixDM extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private String slotDepartment;
  private String slotProcessType;
  private String slotStage;
  private String slotApprovalList;
  @IDataAnnotation(OriginalFieldName="Department",FieldName="slotDepartment",SlotKey="/Department;1;0",Position=0,CameFromFloat=false) public String getSlotDepartment(){
    return this.slotDepartment;
  }
  @IDataAnnotation(OriginalFieldName="Department",FieldName="slotDepartment",SlotKey="/Department;1;0",Position=0,CameFromFloat=false) public void setSlotDepartment(  String paramDepartment){
    this.slotDepartment=paramDepartment;
  }
  @IDataAnnotation(OriginalFieldName="ProcessType",FieldName="slotProcessType",SlotKey="/ProcessType;1;0",Position=1,CameFromFloat=false) public String getSlotProcessType(){
    return this.slotProcessType;
  }
  @IDataAnnotation(OriginalFieldName="ProcessType",FieldName="slotProcessType",SlotKey="/ProcessType;1;0",Position=1,CameFromFloat=false) public void setSlotProcessType(  String paramProcessType){
    this.slotProcessType=paramProcessType;
  }
  @IDataAnnotation(OriginalFieldName="Stage",FieldName="slotStage",SlotKey="/Stage;1;0",Position=2,CameFromFloat=false) public String getSlotStage(){
    return this.slotStage;
  }
  @IDataAnnotation(OriginalFieldName="Stage",FieldName="slotStage",SlotKey="/Stage;1;0",Position=2,CameFromFloat=false) public void setSlotStage(  String paramStage){
    this.slotStage=paramStage;
  }
  @IDataAnnotation(OriginalFieldName="ApprovalList",FieldName="slotApprovalList",SlotKey="/ApprovalList;1;0",Position=3,CameFromFloat=false) public String getSlotApprovalList(){
    return this.slotApprovalList;
  }
  @IDataAnnotation(OriginalFieldName="ApprovalList",FieldName="slotApprovalList",SlotKey="/ApprovalList;1;0",Position=3,CameFromFloat=false) public void setSlotApprovalList(  String paramApprovalList){
    this.slotApprovalList=paramApprovalList;
  }
}
