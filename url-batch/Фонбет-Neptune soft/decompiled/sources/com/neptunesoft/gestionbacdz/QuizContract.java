package com.neptunesoft.gestionbacdz;

import android.provider.BaseColumns;

/* loaded from: classes.dex */
public final class QuizContract {

    public static class QuestionTable implements BaseColumns {
        public static final String COLUMN_ANSWER_NR = "answer_nr";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_OPTION4 = "option4";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_TYPE = "type";
        public static final String COLUMN_Unit = "unit";
        public static final String TABLENAME = "quiz_questions";
    }

    private QuizContract() {
    }
}
