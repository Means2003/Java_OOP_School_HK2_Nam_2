
interface IStudentMark {
    void display();
    double getAverageMark();
}

class StudentMark implements IStudentMark {
    private static int idCounter = 1;

    private int id;
    private String fullName;
    private String className;
    private int semester;
    private double[] subjectMarkList;
   
    public StudentMark(String fullName, String className, int semester, double[] subjectMarkList) {
        
    	this.id = idCounter++;
        this.fullName = fullName;
        this.className = className;
        this.semester = semester;
        this.subjectMarkList = subjectMarkList;
    }

   

	@Override
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Full name: " + fullName);
        System.out.println("Class name: " + className);
        System.out.println("Semester: " + semester);
        System.out.println("Average mark: " + getAverageMark());
    }

    @Override
    public double getAverageMark() {
        return calculateAverageMark();
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getClassName() {
        return className;
    }

    public int getSemester() {
        return semester;
    }

    public double[] getSubjectMarkList() {
        return subjectMarkList;
    }

    private double calculateAverageMark() {
        double sum = 0;
        for (double mark : subjectMarkList) {
            sum += mark;
        }
        return sum / subjectMarkList.length;
    }
}


        
