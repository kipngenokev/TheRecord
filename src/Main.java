public class Main {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            LPAStudent s = new LPAStudent("S922300"+i,switch (i){
                case 1->"Mary";
                case 2->"John";
                case 3->"Peter";
                case 4->"Penina";
                case 5->"Judy";
                default->"Anonymous";
            },"12/02/2000","Java MasterClass");

            System.out.println(s);

            Student pojoStudent =new Student("s923006","Anne","12/09/2001","Java MasterClass");
            LPAStudent recordStudent =new LPAStudent("s923007","Jay","12/09/1991","Java MasterClass");
            System.out.println(pojoStudent);
            System.out.println(recordStudent);

            System.out.println(pojoStudent.getName()+ " is taking "+pojoStudent.getClassList());
            System.out.println(recordStudent.name() + " is taking "+recordStudent.classList());
        }

    }
}