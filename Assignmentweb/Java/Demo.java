class LifeStages{
    public boolean isEligibleToVote(float age){
        if(age>=18){
            return true;
        }   
        
        return false;
    }
    
    public boolean isSeniorCitizen(float age){
        if(age>=60){
            return true;
        }
        return false;
    }
    public String medicalGuidance(float age){
        if(age>=40){
            return "You need to take medical test";
        }
        
        return "You don't need to take medical test";
    }
    
    public String lifeCycle(float age){
        String stage;
        
        if(age<0){
            stage = "Invalid Age";
        }
        else if(age==0){
            stage = "Foetus";
        }
        else if(age<=1){
            stage = "Baby";
        }
        else if(age<=3){
            stage = "Toddler";
        }
        else if(age<=5){
            stage = "Preschooler";
        }
        else if(age<=12){
            stage = "SchoolBoy";
        }
        else if(age<=19){
            stage = "Teenager";
        }
        else if(age<=55){
            stage = "Adult";
        }
        else{
            stage = "Old Person";
        }
        return stage;
    }
}

class Demo{
    
    public static void main(String[] args) {
        LifeStages obj = new LifeStages();
        System.out.println(obj.isEligibleToVote(18));
        System.out.println(obj.isSeniorCitizen(10));
        System.out.println(obj.medicalGuidance(40));
        System.out.println(obj.lifeCycle(18));
    }
}
