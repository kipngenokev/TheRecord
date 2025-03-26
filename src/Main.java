public class Main{
    public static void main(String[] args) {
        for (int i=1; i < 6; i++){
            LPAStudent s = new LPAStudent("N1908"+i,
                    switch(i){
                case 1 -> "Ian";
                case 2 -> "George";
                case 3 -> "Carlie";
                case 4 -> "Charity";
                case 5 -> "Fidel";
                default -> "Anonymous";
                    },
                    "12/02/2008",
                    "Java MasterClass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("N1906","Kipngeno","20/09/2007",
                "Java MasterClass");
        LPAStudent lpaStudent = new LPAStudent("N1907","Atieno","12/09/1990",
                "Java MasterClass");

        System.out.println(pojoStudent);
        System.out.println(lpaStudent);
        pojoStudent.setClassList(pojoStudent.getClassList()+ ", Java OCP Exam 829");
//        lpaStudent.setClassList(lpaStudent.getClassList()+ ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking "+ pojoStudent.getClassList());
        System.out.println(lpaStudent.name()+ " is taking "+ lpaStudent.classList());

    }
}