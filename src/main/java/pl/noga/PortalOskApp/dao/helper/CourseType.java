package pl.noga.PortalOskApp.dao.helper;

public enum CourseType {
    A("A"),A1("A1"),B("B"),B1("B1"),C("C"),D("D"),T("T"),B_and_E("B+E"),C_and_E("C+E"),D_and_E("D+E");

    private final String type;
    private CourseType (String type){this.type = type;}

    @Override public String toString() { return this.type;}
    }

