public class ModuleName {
    public String getName(String moduleCode, int moduleName){
        return moduleCode+ " "+ moduleName;
    }
    public static void main(String[] args){
        ModuleName mn = new ModuleName();
        String a = mn.getName("cs",11);
        System.out.println(a);
    }
}
