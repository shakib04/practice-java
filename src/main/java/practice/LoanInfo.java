package practice;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LoanInfo {
    @JsonProperty("orgno")
    private int orgno;

    @JsonProperty("branchcode")
    private int branchcode;

    @JsonProperty("projectcode")
    private int projectcode;

    @JsonProperty("loan_product")
    private int loanProduct;

    @JsonProperty("loan_duration")
    private int loanDuration;

    @JsonProperty("invest_sector")
    private int investSector;

    @JsonProperty("scheme")
    private int scheme;

    @JsonProperty("propos_amt")
    private int proposAmt;

    @JsonProperty("instal_amt")
    private int instalAmt;

    @JsonProperty("status")
    private int status;

    @JsonProperty("loan_id")
    private String loanId;

    @JsonProperty("erp_mem_id")
    private int erpMemId;

    @JsonProperty("memberTypeId")
    private int memberTypeId;

    @JsonProperty("frequencyId")
    private int frequencyId;

    @JsonProperty("subSectorId")
    private int subSectorId;

    @JsonProperty("ErpStatus")
    private int erpStatus;

    @JsonProperty("approval_amount")
    private int approvalAmount;

    @JsonProperty("erpstatus")
    private int erpstatus;

    // Getters and setters (you can generate them using your IDE or write them manually)


    public int getOrgno() {
        return orgno;
    }

    public void setOrgno(int orgno) {
        this.orgno = orgno;
    }

    public int getBranchcode() {
        return branchcode;
    }

    public void setBranchcode(int branchcode) {
        this.branchcode = branchcode;
    }

    public int getProjectcode() {
        return projectcode;
    }

    public void setProjectcode(int projectcode) {
        this.projectcode = projectcode;
    }

    public int getLoanProduct() {
        return loanProduct;
    }

    public void setLoanProduct(int loanProduct) {
        this.loanProduct = loanProduct;
    }

    public int getLoanDuration() {
        return loanDuration;
    }

    public void setLoanDuration(int loanDuration) {
        this.loanDuration = loanDuration;
    }

    public int getInvestSector() {
        return investSector;
    }

    public void setInvestSector(int investSector) {
        this.investSector = investSector;
    }

    public int getScheme() {
        return scheme;
    }

    public void setScheme(int scheme) {
        this.scheme = scheme;
    }

    public int getProposAmt() {
        return proposAmt;
    }

    public void setProposAmt(int proposAmt) {
        this.proposAmt = proposAmt;
    }

    public int getInstalAmt() {
        return instalAmt;
    }

    public void setInstalAmt(int instalAmt) {
        this.instalAmt = instalAmt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public int getErpMemId() {
        return erpMemId;
    }

    public void setErpMemId(int erpMemId) {
        this.erpMemId = erpMemId;
    }

    public int getMemberTypeId() {
        return memberTypeId;
    }

    public void setMemberTypeId(int memberTypeId) {
        this.memberTypeId = memberTypeId;
    }

    public int getFrequencyId() {
        return frequencyId;
    }

    public void setFrequencyId(int frequencyId) {
        this.frequencyId = frequencyId;
    }

    public int getSubSectorId() {
        return subSectorId;
    }

    public void setSubSectorId(int subSectorId) {
        this.subSectorId = subSectorId;
    }

    public int getErpStatus() {
        return erpStatus;
    }

    public void setErpStatus(int erpStatus) {
        this.erpStatus = erpStatus;
    }

    public int getApprovalAmount() {
        return approvalAmount;
    }

    public void setApprovalAmount(int approvalAmount) {
        this.approvalAmount = approvalAmount;
    }

    public int getErpstatus() {
        return erpstatus;
    }

    public void setErpstatus(int erpstatus) {
        this.erpstatus = erpstatus;
    }
}

