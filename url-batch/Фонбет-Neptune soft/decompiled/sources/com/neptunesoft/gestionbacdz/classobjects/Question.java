package com.neptunesoft.gestionbacdz.classobjects;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class Question implements Parcelable {
    public static final Parcelable.Creator<Question> CREATOR = new Parcelable.Creator<Question>() { // from class: com.neptunesoft.gestionbacdz.classobjects.Question.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Question createFromParcel(Parcel in) {
            return new Question(in);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Question[] newArray(int size) {
            return new Question[size];
        }
    };
    private int ansewer;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String question;
    private String type;
    private int unit;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Question(String question, String option1, String option2, String option3, String option4, int ansewer, int unit, String type) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.ansewer = ansewer;
        this.unit = unit;
        this.type = type;
    }

    public Question() {
    }

    protected Question(Parcel in) {
        this.question = in.readString();
        this.option1 = in.readString();
        this.option2 = in.readString();
        this.option3 = in.readString();
        this.option4 = in.readString();
        this.ansewer = in.readInt();
        this.unit = in.readInt();
        this.type = in.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.question);
        dest.writeString(this.option1);
        dest.writeString(this.option2);
        dest.writeString(this.option3);
        dest.writeString(this.option4);
        dest.writeInt(this.ansewer);
        dest.writeInt(this.unit);
        dest.writeString(this.type);
    }

    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOption1() {
        return this.option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return this.option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getOption3() {
        return this.option3;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public String getOption4() {
        return this.option4;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public int getAnsewer() {
        return this.ansewer;
    }

    public void setAnsewer(int ansewer) {
        this.ansewer = ansewer;
    }

    public int getUnit() {
        return this.unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
