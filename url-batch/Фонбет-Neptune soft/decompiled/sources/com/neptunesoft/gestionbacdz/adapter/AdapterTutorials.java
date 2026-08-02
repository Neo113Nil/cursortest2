package com.neptunesoft.gestionbacdz.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.gestionbacdz.AccountingActivity;
import com.neptunesoft.gestionbacdz.ArabicActivity;
import com.neptunesoft.gestionbacdz.EconomicsActivity;
import com.neptunesoft.gestionbacdz.EnglishActivity;
import com.neptunesoft.gestionbacdz.FrenchActivity;
import com.neptunesoft.gestionbacdz.HistoryGeographyActivity;
import com.neptunesoft.gestionbacdz.IslamicActivity;
import com.neptunesoft.gestionbacdz.LawActivity;
import com.neptunesoft.gestionbacdz.MathsActivity;
import com.neptunesoft.gestionbacdz.PhilosophyActivity;
import com.neptunesoft.gestionbacdz.R;
import com.neptunesoft.gestionbacdz.SplashScreen;
import com.neptunesoft.gestionbacdz.classobjects.Tutorials;
import java.util.List;

/* loaded from: classes.dex */
public class AdapterTutorials extends RecyclerView.Adapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static String fromActivity;
    public static List list;
    static TutorialsHolder tutorialsHolder;
    private ItemClickListener mClickListener;
    private final String[] cours_law = {"cour_ge_droit_1.pdf", "cour_ge_droit_2.pdf", "cour_ge_droit_3.pdf", "cour_ge_droit_4.pdf", "cour_ge_droit_5.pdf", "cour_ge_droit_6.pdf", "cour_ge_droit_7.pdf", "cour_ge_droit_8.pdf", "cour_ge_droit_9.pdf", "cour_ge_droit_10.pdf", "cour_ge_droit_11.pdf", "resume_ge_droit_1.pdf"};
    private final String[] cours_accounting = {"cour_ge_gestion_1.pdf", "cour_ge_gestion_2.pdf", "cour_ge_gestion_3.pdf", "cour_ge_gestion_4.pdf", "cour_ge_gestion_5.pdf", "cour_ge_gestion_6.pdf", "cour_ge_gestion_7.pdf", "cour_ge_gestion_8.pdf", "cour_ge_gestion_9.pdf", "cour_ge_gestion_10.pdf", "cour_ge_gestion_11.pdf", "cour_ge_gestion_12.pdf", "cour_ge_gestion_13.pdf", "cour_ge_gestion_14.pdf", "cour_ge_gestion_15.pdf", "cour_ge_gestion_16.pdf", "cour_ge_gestion_17.pdf", "resume_ge_gestion_1.pdf", "enplus_ge_gestion_1.pdf", "enplus_ge_gestion_2.pdf", "enplus_ge_gestion_3.pdf"};
    private final String[] cours_economics = {"cour_ge_mgmt_1.pdf", "cour_ge_mgmt_2.pdf", "cour_ge_mgmt_3.pdf", "cour_ge_mgmt_4.pdf", "cour_ge_mgmt_5.pdf", "cour_ge_mgmt_6.pdf", "cour_ge_mgmt_7.pdf", "cour_ge_mgmt_8.pdf", "cour_ge_mgmt_9.pdf", "cour_ge_mgmt_10.pdf", "cour_ge_mgmt_11.pdf", "cour_ge_mgmt_12.pdf", "cour_ge_mgmt_13.pdf", "resume_ge_mgmt_1.pdf", "resume_ge_mgmt_2.pdf"};
    private final String[] cours_math = {"cour_ge_math_1.pdf", "cour_ge_math_2.pdf", "cour_ge_math_3.pdf", "cour_ge_math_4.pdf", "cour_ge_math_5.pdf", "cour_ge_math_6.pdf", "cour_ge_math_7.pdf", "cour_ge_math_8.pdf", "cour_ge_math_9.pdf", "cour_ge_math_10.pdf", "resume_ge_math_1.pdf", "resume_ge_math_2.pdf", "resume_ge_math_3.pdf", "resume_ge_math_4.pdf", "resume_ge_math_5.pdf", "resume_ge_math_6.pdf", "resume_ge_math_7.pdf", "resume_ge_math_8.pdf", "resume_ge_math_9.pdf"};
    private final String[] cours_arabe = {"sciences_arabe_1.pdf", "sciences_arabe_2.pdf", "sciences_arabe_3.pdf", "sciences_arabe_4.pdf", "sciences_arabe_5.pdf", "sciences_arabe_6.pdf", "sciences_arabe_7.pdf", "sciences_arabe_8.pdf", "sciences_arabe_9.pdf", "sciences_arabe_10.pdf"};
    private final String[] cours_islamic = {"sciences_islamic_1.pdf", "sciences_islamic_2.pdf"};
    private final String[] cours_philosophy = {"philo_g_1.pdf", "philo_g_2.pdf"};
    private final String[] cours_english = {"sciences_english_1.pdf", "sciences_english_2.pdf", "sciences_english_3.pdf", "sciences_english_4.pdf"};
    private final String[] cours_francais = {"sciences_francais_1.pdf", "sciences_francais_2.pdf", "sciences_francais_3.pdf", "sciences_francais_4.pdf"};

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    public AdapterTutorials(List list2, String from) {
        list = list2;
        fromActivity = from;
    }

    private static Tutorials preparePlus(Tutorials tutorials) {
        if (SplashScreen.darkmode) {
            return new Tutorials(tutorials.getTutorials(), R.drawable.ic_plus_dark);
        }
        return new Tutorials(tutorials.getTutorials(), R.drawable.ic_plus);
    }

    private static Tutorials prepareBriefcase(Tutorials tutorials) {
        if (SplashScreen.darkmode) {
            return new Tutorials(tutorials.getTutorials(), R.drawable.ic_briefcase_dark);
        }
        return new Tutorials(tutorials.getTutorials(), R.drawable.ic_briefcase);
    }

    public static void changeIslamic() {
        Tutorials preparePlus;
        int bindingAdapterPosition = tutorialsHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == 0) {
            preparePlus = preparePlus(new Tutorials("ملخص شامل لكل الدروس", 0));
        } else {
            preparePlus = bindingAdapterPosition != 1 ? null : preparePlus(new Tutorials("نصائح و إرشادات", 0));
        }
        IslamicActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        tutorialsHolder.imgItemTutorial.setImageResource(preparePlus.getIcon());
    }

    public static void changeArabic() {
        Tutorials preparePlus;
        switch (tutorialsHolder.getBindingAdapterPosition()) {
            case 0:
                preparePlus = preparePlus(new Tutorials("ملخص الأدب العربي", 0));
                break;
            case 1:
                preparePlus = preparePlus(new Tutorials("ملخص العربية", 0));
                break;
            case 2:
                preparePlus = preparePlus(new Tutorials("قواعد النحو و الصرف, البلاغة, النصوص, العروض", 0));
                break;
            case 3:
                preparePlus = preparePlus(new Tutorials("1 موضوع مع الحل", 0));
                break;
            case 4:
                preparePlus = preparePlus(new Tutorials("2 موضوع مع الحل", 0));
                break;
            case 5:
                preparePlus = preparePlus(new Tutorials("3 موضوع مع الحل", 0));
                break;
            case 6:
                preparePlus = preparePlus(new Tutorials("4 موضوع مع الحل", 0));
                break;
            case 7:
                preparePlus = preparePlus(new Tutorials("5 موضوع مع الحل", 0));
                break;
            case 8:
                preparePlus = preparePlus(new Tutorials("6 موضوع مع الحل", 0));
                break;
            case 9:
                preparePlus = preparePlus(new Tutorials("7 موضوع مع الحل", 0));
                break;
            default:
                preparePlus = null;
                break;
        }
        ArabicActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        tutorialsHolder.imgItemTutorial.setImageResource(preparePlus.getIcon());
    }

    public static void changeLaw() {
        Tutorials prepareBriefcase;
        switch (tutorialsHolder.getBindingAdapterPosition()) {
            case 0:
                prepareBriefcase = prepareBriefcase(new Tutorials("عقد البيع", 0));
                break;
            case 1:
                prepareBriefcase = prepareBriefcase(new Tutorials("عقد الشركة", 0));
                break;
            case 2:
                prepareBriefcase = prepareBriefcase(new Tutorials("شركة التضامن", 0));
                break;
            case 3:
                prepareBriefcase = prepareBriefcase(new Tutorials("الشركات ذات المسؤولية المحدودة", 0));
                break;
            case 4:
                prepareBriefcase = prepareBriefcase(new Tutorials("شركة المساهمة", 0));
                break;
            case 5:
                prepareBriefcase = prepareBriefcase(new Tutorials("علاقات العمل الفردية", 0));
                break;
            case 6:
                prepareBriefcase = prepareBriefcase(new Tutorials("علاقات العمل الجماعية", 0));
                break;
            case 7:
                prepareBriefcase = prepareBriefcase(new Tutorials("الميزانية العامة للدولة و قانون المالية", 0));
                break;
            case 8:
                prepareBriefcase = prepareBriefcase(new Tutorials("الضرائب و الرسوم", 0));
                break;
            case 9:
                prepareBriefcase = prepareBriefcase(new Tutorials("الضريبة على الدخل الإجمالي", 0));
                break;
            case 10:
                prepareBriefcase = prepareBriefcase(new Tutorials("الرسم على القيمة المضافة", 0));
                break;
            case 11:
                prepareBriefcase = preparePlus(new Tutorials("ملخص دروس القانون", 0));
                break;
            default:
                prepareBriefcase = null;
                break;
        }
        LawActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        tutorialsHolder.imgItemTutorial.setImageResource(prepareBriefcase.getIcon());
    }

    public static void changeAccounting() {
        Tutorials prepareBriefcase;
        switch (tutorialsHolder.getBindingAdapterPosition()) {
            case 0:
                prepareBriefcase = prepareBriefcase(new Tutorials("الاهتلاكات", 0));
                break;
            case 1:
                prepareBriefcase = prepareBriefcase(new Tutorials("المؤونات", 0));
                break;
            case 2:
                prepareBriefcase = prepareBriefcase(new Tutorials("التسويات الأخرى", 0));
                break;
            case 3:
                prepareBriefcase = prepareBriefcase(new Tutorials("الوثائق الختامية", 0));
                break;
            case 4:
                prepareBriefcase = prepareBriefcase(new Tutorials("إعداد الميزانية الوظيفية", 0));
                break;
            case 5:
                prepareBriefcase = prepareBriefcase(new Tutorials("تحليل الميزانية الوظيفية", 0));
                break;
            case 6:
                prepareBriefcase = prepareBriefcase(new Tutorials("تحليل حسابات النتائج", 0));
                break;
            case 7:
                prepareBriefcase = prepareBriefcase(new Tutorials("التحليل الوظيفي", 0));
                break;
            case 8:
                prepareBriefcase = prepareBriefcase(new Tutorials("التحليل التفاضلي", 0));
                break;
            case 9:
                prepareBriefcase = prepareBriefcase(new Tutorials("معالجة الأعباء المحملة للتكاليف", 0));
                break;
            case 10:
                prepareBriefcase = prepareBriefcase(new Tutorials("حساب التكاليف و النتيجة التحليلية", 0));
                break;
            case 11:
                prepareBriefcase = prepareBriefcase(new Tutorials("تتمة حساب تكاليف الإنتاج", 0));
                break;
            case 12:
                prepareBriefcase = prepareBriefcase(new Tutorials("التكاليف المتغيرة", 0));
                break;
            case 13:
                prepareBriefcase = prepareBriefcase(new Tutorials("الفوائد المركبة", 0));
                break;
            case 14:
                prepareBriefcase = prepareBriefcase(new Tutorials("الدفعات الثابتة", 0));
                break;
            case 15:
                prepareBriefcase = prepareBriefcase(new Tutorials("استهلاك القروض", 0));
                break;
            case 16:
                prepareBriefcase = prepareBriefcase(new Tutorials("اختيار الاستثمارات", 0));
                break;
            case 17:
                prepareBriefcase = preparePlus(new Tutorials("ملخص في التسويات", 0));
                break;
            case 18:
                prepareBriefcase = preparePlus(new Tutorials("أسئلة و أجوبة في المحاسبة التحليلية", 0));
                break;
            case 19:
                prepareBriefcase = preparePlus(new Tutorials("أهم قوانين نسب تحليل مستويات النتائج", 0));
                break;
            case 20:
                prepareBriefcase = preparePlus(new Tutorials("دليل المراجعة في التسويات", 0));
                break;
            default:
                prepareBriefcase = null;
                break;
        }
        AccountingActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        tutorialsHolder.imgItemTutorial.setImageResource(prepareBriefcase.getIcon());
    }

    public static void changeEconomics() {
        Tutorials prepareBriefcase;
        switch (tutorialsHolder.getBindingAdapterPosition()) {
            case 0:
                prepareBriefcase = prepareBriefcase(new Tutorials("النقود", 0));
                break;
            case 1:
                prepareBriefcase = prepareBriefcase(new Tutorials("السوق و السعر", 0));
                break;
            case 2:
                prepareBriefcase = prepareBriefcase(new Tutorials("النظام المصرفي", 0));
                break;
            case 3:
                prepareBriefcase = prepareBriefcase(new Tutorials("التجارة الخارجية", 0));
                break;
            case 4:
                prepareBriefcase = prepareBriefcase(new Tutorials("الصرف", 0));
                break;
            case 5:
                prepareBriefcase = prepareBriefcase(new Tutorials("البطالة", 0));
                break;
            case 6:
                prepareBriefcase = prepareBriefcase(new Tutorials("التضخم", 0));
                break;
            case 7:
                prepareBriefcase = prepareBriefcase(new Tutorials("القيادة", 0));
                break;
            case 8:
                prepareBriefcase = prepareBriefcase(new Tutorials("الإتصال", 0));
                break;
            case 9:
                prepareBriefcase = prepareBriefcase(new Tutorials("الرقابة", 0));
                break;
            case 10:
                prepareBriefcase = prepareBriefcase(new Tutorials("التمويل", 0));
                break;
            case 11:
                prepareBriefcase = prepareBriefcase(new Tutorials("التقييس", 0));
                break;
            case 12:
                prepareBriefcase = prepareBriefcase(new Tutorials("الموارد البشرية", 0));
                break;
            case 13:
                prepareBriefcase = preparePlus(new Tutorials("ملخص الإقتصاد و المناجمنت 1", 0));
                break;
            case 14:
                prepareBriefcase = preparePlus(new Tutorials("ملخص الإقتصاد و المناجمنت 2", 0));
                break;
            default:
                prepareBriefcase = null;
                break;
        }
        EconomicsActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        tutorialsHolder.imgItemTutorial.setImageResource(prepareBriefcase.getIcon());
    }

    public static void changeEnglish() {
        Tutorials prepareBriefcase;
        int bindingAdapterPosition = tutorialsHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == 0) {
            prepareBriefcase = prepareBriefcase(new Tutorials("كراس اللغة الإنجليزية", 0));
        } else if (bindingAdapterPosition == 1) {
            prepareBriefcase = preparePlus(new Tutorials("كل ما تحتاجه في اللغة الإنجليزية", 0));
        } else if (bindingAdapterPosition == 2) {
            prepareBriefcase = preparePlus(new Tutorials("ملخص باللغة العربية", 0));
        } else {
            prepareBriefcase = bindingAdapterPosition != 3 ? null : preparePlus(new Tutorials("ملخص التعبير الكتابي", 0));
        }
        EnglishActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        tutorialsHolder.imgItemTutorial.setImageResource(prepareBriefcase.getIcon());
    }

    public static void changeFrench() {
        Tutorials prepareBriefcase;
        int bindingAdapterPosition = tutorialsHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == 0) {
            prepareBriefcase = prepareBriefcase(new Tutorials("كراس اللغة الفرنسية", 0));
        } else if (bindingAdapterPosition == 1) {
            prepareBriefcase = preparePlus(new Tutorials("ملخص اللغة الفرنسية", 0));
        } else if (bindingAdapterPosition == 2) {
            prepareBriefcase = preparePlus(new Tutorials("خطوات كتابة فقرة في اللغة الفرنسية", 0));
        } else {
            prepareBriefcase = bindingAdapterPosition != 3 ? null : preparePlus(new Tutorials("Compte rendu", 0));
        }
        FrenchActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        tutorialsHolder.imgItemTutorial.setImageResource(prepareBriefcase.getIcon());
    }

    public static void changeHisGeo() {
        Tutorials preparePlus;
        int bindingAdapterPosition = tutorialsHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == 0) {
            preparePlus = preparePlus(new Tutorials("ملخص مادة التاريخ", 0));
        } else if (bindingAdapterPosition == 1) {
            preparePlus = preparePlus(new Tutorials("مصطلحات, مفاهيم و شخصيات | تاريخ", 0));
        } else if (bindingAdapterPosition == 2) {
            preparePlus = preparePlus(new Tutorials("أهم التواريخ لمادة التاريخ", 0));
        } else if (bindingAdapterPosition == 3) {
            preparePlus = preparePlus(new Tutorials("ملخص مادة جغرافيا", 0));
        } else if (bindingAdapterPosition == 4) {
            preparePlus = preparePlus(new Tutorials("مصطلحات و مفاهيم | جغرافيا", 0));
        } else {
            preparePlus = bindingAdapterPosition != 5 ? null : preparePlus(new Tutorials("جميع الخرائط لمادة الإجتماعيات", 0));
        }
        HistoryGeographyActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        tutorialsHolder.imgItemTutorial.setImageResource(preparePlus.getIcon());
    }

    public static void changeMaths() {
        Tutorials prepareBriefcase;
        switch (tutorialsHolder.getBindingAdapterPosition()) {
            case 0:
                prepareBriefcase = prepareBriefcase(new Tutorials("المتتاليات العددية", 0));
                break;
            case 1:
                prepareBriefcase = prepareBriefcase(new Tutorials("السلاسل الإحصائية ذات متغيرين", 0));
                break;
            case 2:
                prepareBriefcase = prepareBriefcase(new Tutorials("الاستمرارية و النهايات", 0));
                break;
            case 3:
                prepareBriefcase = prepareBriefcase(new Tutorials("المشتقات و الدوال الأصلية", 0));
                break;
            case 4:
                prepareBriefcase = prepareBriefcase(new Tutorials("الحساب التكاملي", 0));
                break;
            case 5:
                prepareBriefcase = prepareBriefcase(new Tutorials("الدالة اللوغاريتمية", 0));
                break;
            case 6:
                prepareBriefcase = prepareBriefcase(new Tutorials("الدالة الأسية", 0));
                break;
            case 7:
                prepareBriefcase = prepareBriefcase(new Tutorials("الاحتمالات 1", 0));
                break;
            case 8:
                prepareBriefcase = prepareBriefcase(new Tutorials("الاحتمالات 2", 0));
                break;
            case 9:
                prepareBriefcase = prepareBriefcase(new Tutorials("التزايد المقارن للدوال اللوغاريتمية و الأسية و دوال القوى", 0));
                break;
            case 10:
                prepareBriefcase = preparePlus(new Tutorials("الدليل المختصر في الدوال", 0));
                break;
            case 11:
                prepareBriefcase = preparePlus(new Tutorials("دراسة الفروع اللانهائية", 0));
                break;
            case 12:
                prepareBriefcase = preparePlus(new Tutorials("الدالة الأسية - اللوغاريتمية", 0));
                break;
            case 13:
                prepareBriefcase = preparePlus(new Tutorials("الدوال المرجعية", 0));
                break;
            case 14:
                prepareBriefcase = preparePlus(new Tutorials("المتتاليات", 0));
                break;
            case 15:
                prepareBriefcase = preparePlus(new Tutorials("الدليل المختصر في المتتاليات", 0));
                break;
            case 16:
                prepareBriefcase = preparePlus(new Tutorials("الدوال الأصلية - المعادلات التفاضلية", 0));
                break;
            case 17:
                prepareBriefcase = preparePlus(new Tutorials("الدوال الأصلية المشهورة", 0));
                break;
            case 18:
                prepareBriefcase = preparePlus(new Tutorials("الحساب التكاملي", 0));
                break;
            default:
                prepareBriefcase = null;
                break;
        }
        MathsActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        tutorialsHolder.imgItemTutorial.setImageResource(prepareBriefcase.getIcon());
    }

    public static void changePhilosophy() {
        Tutorials preparePlus;
        int bindingAdapterPosition = tutorialsHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == 0) {
            preparePlus = preparePlus(new Tutorials("ملخصات دروس الفلسفة", R.drawable.ic_plus_dark));
        } else {
            preparePlus = bindingAdapterPosition != 1 ? null : preparePlus(new Tutorials("ملخص مادة الفلسفة", R.drawable.ic_plus_dark));
        }
        PhilosophyActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        list.set(tutorialsHolder.getBindingAdapterPosition(), preparePlus);
        tutorialsHolder.imgItemTutorial.setImageResource(preparePlus.getIcon());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final TutorialsHolder tutorialsHolder2 = new TutorialsHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tutorials, parent, false));
        tutorialsHolder = tutorialsHolder2;
        tutorialsHolder2.lytItemtutorial.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.adapter.AdapterTutorials$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdapterTutorials.this.m752x9412a6f3(tutorialsHolder2, view);
            }
        });
        return tutorialsHolder;
    }

    /* renamed from: lambda$onCreateViewHolder$0$com-neptunesoft-gestionbacdz-adapter-AdapterTutorials, reason: not valid java name */
    /* synthetic */ void m752x9412a6f3(TutorialsHolder tutorialsHolder2, View view) {
        tutorialsHolder = tutorialsHolder2;
        String str = fromActivity;
        str.hashCode();
        switch (str) {
            case "english":
                String str2 = this.cours_english[tutorialsHolder2.getBindingAdapterPosition()];
                EnglishActivity.file_Name = str2;
                EnglishActivity.getInstance().openContent(str2);
                break;
            case "arabic":
                String str3 = this.cours_arabe[tutorialsHolder2.getBindingAdapterPosition()];
                ArabicActivity.file_Name = str3;
                ArabicActivity.getInstance().openContent(str3);
                break;
            case "french":
                String str4 = this.cours_francais[tutorialsHolder2.getBindingAdapterPosition()];
                FrenchActivity.file_Name = str4;
                FrenchActivity.getInstance().openContent(str4);
                break;
            case "philosophy":
                String str5 = this.cours_philosophy[tutorialsHolder2.getBindingAdapterPosition()];
                PhilosophyActivity.file_Name = str5;
                PhilosophyActivity.getInstance().openContent(str5);
                break;
            case "accounting":
                String str6 = this.cours_accounting[tutorialsHolder2.getBindingAdapterPosition()];
                AccountingActivity.file_Name = str6;
                AccountingActivity.getInstance().openContent(str6);
                break;
            case "law":
                String str7 = this.cours_law[tutorialsHolder2.getBindingAdapterPosition()];
                LawActivity.file_Name = str7;
                LawActivity.getInstance().openContent(str7);
                break;
            case "maths":
                String str8 = this.cours_math[tutorialsHolder2.getBindingAdapterPosition()];
                MathsActivity.file_Name = str8;
                MathsActivity.getInstance().openContent(str8);
                break;
            case "economics":
                String str9 = this.cours_economics[tutorialsHolder2.getBindingAdapterPosition()];
                EconomicsActivity.file_Name = str9;
                EconomicsActivity.getInstance().openContent(str9);
                break;
            case "islamic":
                String str10 = this.cours_islamic[tutorialsHolder2.getBindingAdapterPosition()];
                IslamicActivity.file_Name = str10;
                IslamicActivity.getInstance().openContent(str10);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Tutorials tutorials = (Tutorials) list.get(position);
        TutorialsHolder tutorialsHolder2 = (TutorialsHolder) holder;
        tutorialsHolder2.txtTutorial.setText(tutorials.getTutorials());
        tutorialsHolder2.imgItemTutorial.setImageResource(tutorials.getIcon());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return list.size();
    }

    public class TutorialsHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgItemTutorial;
        LinearLayout lytItemtutorial;
        TextView txtTutorial;

        TutorialsHolder(View itemView) {
            super(itemView);
            this.txtTutorial = (TextView) itemView.findViewById(R.id.txtTutorial);
            this.imgItemTutorial = (ImageView) itemView.findViewById(R.id.imgItemTutorial);
            this.lytItemtutorial = (LinearLayout) itemView.findViewById(R.id.lytItemtutorial);
            itemView.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (AdapterTutorials.this.mClickListener != null) {
                AdapterTutorials.this.mClickListener.onItemClick(view, getAdapterPosition());
            }
        }
    }
}
