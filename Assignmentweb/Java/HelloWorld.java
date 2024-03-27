class Laptop{
    String brandName = "Dell";
    String colour = "Grey";
    String os= "Windows 10";
    String processor = "Intel";
    double displaySize = 15.6;
    
    public void brand(){
        System.out.println(brandName);
    }
    
    public void laptopColour(){
        
    }
    
    public void operatingSystem(){
        
    }
    
    public void processorBrand(){
        
    }
    
    public void screenSize(){
        
    }
}

class HelloWorld{
    
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.brand();
    }
}
