package com.katza.mechinot;

import com.google.firebase.auth.FirebaseAuth;

public class FBRef {
    // התחברות לחשבון משתמשים
    public static FirebaseAuth refAuth = FirebaseAuth.getInstance();
    public static FirebaseFirestore FBFS = FirebaseFirestore.getInstance();
    public static CollectionReference refImages = FBFS.collection("Images");

    // חיבור למסד נתונים
    public static FirebaseDatabase FBDB = FirebaseDatabase.getInstance();

    // מצביע לשורש "Students" במסד הנתונים
    public static DatabaseReference refStudents = FBDB.getReference("Students");
    public static DataSnapshot refUsers;
}
