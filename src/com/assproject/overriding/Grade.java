package com.assproject.overriding;

class Grade{
    String getGrade(){return "";}
}

//Creating child classes.
class CSC1 extends Grade{
    String getGrade(){return "A";}
}

class CSC2 extends Grade{
    String getGrade(){return "B";}
}

class CSC3 extends Grade{
    String getGrade(){return "F";}
}


