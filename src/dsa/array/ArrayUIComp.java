package dsa.array;


// class will create a type of  button for my ui components
public class ArrayUIComp {
   private int categoryId;
   private String categoryName;
   private String categoryImgUrl;

    ArrayUIComp(int categoryId, String catname , String url){
        this.categoryId = categoryId;
        this.categoryName = catname;
        this.categoryImgUrl = url;
    }

    public int getCategoryId(){
        return categoryId;
    }
    public String getCategoryName(){
        return categoryName;
    }
    public String getCategoryImgUrl(){
        return categoryImgUrl;
    }

    @Override
    public String toString(){
        return  "Components have : " + getCategoryId() + getCategoryName() + getCategoryImgUrl();
    }
}



class TryUi {
    
    public static void main(String[] args) {
        ArrayUIComp[] billPayments = new ArrayUIComp[3];
        billPayments[0] = new ArrayUIComp(1, "Electricity", "url1");
        billPayments[1] = new ArrayUIComp(2, "Mobile postpaid", "url2");
        billPayments[2] = new ArrayUIComp(3, "Gas Cylinder", "Piped Gas");

        for (ArrayUIComp arrayUIComp : billPayments) {
            System.out.println(arrayUIComp.toString());
        }
    }
}
