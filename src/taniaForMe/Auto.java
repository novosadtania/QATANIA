package taniaForMe;
/*1)Создать класс Auto. В данном классе создать поле String name, int price, boolean isNew
    создать геттеры и сеттеры для данных полей, а также конструктор класса,
    принимающий в параметры все поля данного класса.*/
public class Auto {
    public String name;
    public int prise;
    public boolean isNew;

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*  моє!!!!
      public String getName() {
            return name;
        }
        public int getPrise() {
            return prise;
        }
        public boolean getisNew() {return getisNew();
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setPrise(int prise) {
            this.prise = prise;
        }
        public void setisNew(boolean isNew ) {
            this.isNew = isNew;
        }*/
     public Auto (String name, int prise, boolean isNew){
         this.name=name;
         this.prise=prise;
         this.isNew=isNew;
     }
     public void getInfo() {
        System.out.println("Name " + name+ " is: " + prise + " is New " + isNew);
}

    public static void main(String[] args) {
        Auto mers = new Auto("mers",2000,true);
        mers.getInfo();
        System.out.println(mers);
    }
    public String toString(){
         String result;
         if(isNew){
             result="Auto is new. ";
         } else {
                 result = "Auto not new.";
         }
        return "Name: " + name+ "\n" +
                "Prise : "+ prise + "\n" +
                "is New : " + isNew +"\n" +
                result
                ;

    }


}
