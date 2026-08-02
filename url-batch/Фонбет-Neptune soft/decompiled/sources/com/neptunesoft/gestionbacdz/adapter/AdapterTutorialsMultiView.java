package com.neptunesoft.gestionbacdz.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.gestionbacdz.HistoryGeographyActivity;
import com.neptunesoft.gestionbacdz.R;
import com.neptunesoft.gestionbacdz.SplashScreen;
import com.neptunesoft.gestionbacdz.classobjects.Separate;
import com.neptunesoft.gestionbacdz.classobjects.Tutorials;
import java.util.List;

/* loaded from: classes.dex */
public class AdapterTutorialsMultiView extends RecyclerView.Adapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static List list;
    static TutorialsHolder tutorialsHolder;
    private final String[] cours_his_geo = {"", "cour_ge_his_1.pdf", "cour_ge_his_2.pdf", "cour_ge_his_3.pdf", "cour_ge_his_4.pdf", "cour_ge_his_5.pdf", "cour_ge_his_6.pdf", "cour_ge_his_7.pdf", "cour_ge_his_8.pdf", "cour_ge_his_9.pdf", "cour_ge_his_10.pdf", "enplus_l_his_1.pdf", "enplus_l_his_2.pdf", "enplus_l_his_3.pdf", "enplus_l_his_4.pdf", "enplus_l_his_5.pdf", "", "cour_ge_geo_1.pdf", "cour_ge_geo_2.pdf", "cour_ge_geo_3.pdf", "cour_ge_geo_4.pdf", "cour_ge_geo_5.pdf", "cour_ge_geo_6.pdf", "cour_ge_geo_7.pdf", "cour_ge_geo_8.pdf", "cour_ge_geo_9.pdf", "enplus_l_geo_1.pdf", "enplus_l_geo_2.pdf", "enplus_l_geo_3.pdf", "enplus_l_geo_4.pdf"};
    private ItemClickListener mClickListener;

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    public AdapterTutorialsMultiView(List list2) {
        list = list2;
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

    public static void changeHisGeo() {
        Tutorials prepareBriefcase;
        switch (tutorialsHolder.getBindingAdapterPosition()) {
            case 1:
                prepareBriefcase = prepareBriefcase(new Tutorials("بروز الصراع و تشكل العالم", 0));
                break;
            case 2:
                prepareBriefcase = prepareBriefcase(new Tutorials("الأزمات الدولية في ظل الصراع بين الشرق و الغرب", 0));
                break;
            case 3:
                prepareBriefcase = prepareBriefcase(new Tutorials("مساعي الانفراج الدولي", 0));
                break;
            case 4:
                prepareBriefcase = prepareBriefcase(new Tutorials("من الثنائية إلى الأحادية القطبية", 0));
                break;
            case 5:
                prepareBriefcase = prepareBriefcase(new Tutorials("من تبلور الوعي إلى الثورة التحريرية", 0));
                break;
            case 6:
                prepareBriefcase = prepareBriefcase(new Tutorials("العمل المسلح و رد فعل الاستعمار", 0));
                break;
            case 7:
                prepareBriefcase = prepareBriefcase(new Tutorials("استعادة السيادة الوطنية و بناء الدولة", 0));
                break;
            case 8:
                prepareBriefcase = prepareBriefcase(new Tutorials("تأثير الجزائر و إسهامها في حركة التحرر", 0));
                break;
            case 9:
                prepareBriefcase = prepareBriefcase(new Tutorials("العالم الثالث بين تراجع الاستعمار التقليدي و استمرارية حركات التحرر", 0));
                break;
            case 10:
                prepareBriefcase = prepareBriefcase(new Tutorials("القضية الفلسطينية", 0));
                break;
            case 11:
                prepareBriefcase = preparePlus(new Tutorials("طريقة معالجة موضوع التاريخ و الجغرافيا", 0));
                break;
            case 12:
                prepareBriefcase = preparePlus(new Tutorials("المقالات الشاملة في التاريخ و الجغرافيا", 0));
                break;
            case 13:
                prepareBriefcase = preparePlus(new Tutorials("المصطلحات الشاملة في مادة التاريخ", 0));
                break;
            case 14:
                prepareBriefcase = preparePlus(new Tutorials("الشخصيات الشاملة في مادة التاريخ", 0));
                break;
            case 15:
                prepareBriefcase = preparePlus(new Tutorials("التواريخ الشاملة في مادة التاريخ", 0));
                break;
            case 16:
            default:
                prepareBriefcase = null;
                break;
            case 17:
                prepareBriefcase = prepareBriefcase(new Tutorials("إشكالية التقدم و التخلف", 0));
                break;
            case 18:
                prepareBriefcase = prepareBriefcase(new Tutorials("المبادلات و التنقلات في العالم", 0));
                break;
            case 19:
                prepareBriefcase = prepareBriefcase(new Tutorials("مصادر القوة الاقتصادية للو.م.أ", 0));
                break;
            case 20:
                prepareBriefcase = prepareBriefcase(new Tutorials("ظاهرة التكتل و أثرها في قوة الاتحاد الأوروبي", 0));
                break;
            case 21:
                prepareBriefcase = prepareBriefcase(new Tutorials("العلاقة بين السكان و التنمية في شرق و جنوب شرق آسيا", 0));
                break;
            case 22:
                prepareBriefcase = prepareBriefcase(new Tutorials("الاقتصاد الجزائري في العالم", 0));
                break;
            case 23:
                prepareBriefcase = prepareBriefcase(new Tutorials("الجزائر في حوض البحر الأبيض المتوسط", 0));
                break;
            case 24:
                prepareBriefcase = prepareBriefcase(new Tutorials("السكان و التنمية في الهند", 0));
                break;
            case 25:
                prepareBriefcase = prepareBriefcase(new Tutorials("التنمية في البرازيل", 0));
                break;
            case 26:
                prepareBriefcase = preparePlus(new Tutorials("الخرائط الشاملة في التاريخ و الجغرافيا", 0));
                break;
            case 27:
                prepareBriefcase = preparePlus(new Tutorials("المصطلحات الشاملة في الجغرافيا", 0));
                break;
            case 28:
                prepareBriefcase = preparePlus(new Tutorials("الرسومات البيانية", 0));
                break;
            case 29:
                prepareBriefcase = preparePlus(new Tutorials("اختصارات للحفظ", 0));
                break;
        }
        HistoryGeographyActivity.list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        list.set(tutorialsHolder.getBindingAdapterPosition(), prepareBriefcase);
        tutorialsHolder.imgItemTutorial.setImageResource(prepareBriefcase.getIcon());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (getItemViewType(viewType) == 0) {
            return new SeparatesHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_separate_years, parent, false));
        }
        final TutorialsHolder tutorialsHolder2 = new TutorialsHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tutorials, parent, false));
        tutorialsHolder = tutorialsHolder2;
        tutorialsHolder2.lytItemtutorial.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.gestionbacdz.adapter.AdapterTutorialsMultiView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdapterTutorialsMultiView.this.m753x90c0d9cb(tutorialsHolder2, view);
            }
        });
        return tutorialsHolder;
    }

    /* renamed from: lambda$onCreateViewHolder$0$com-neptunesoft-gestionbacdz-adapter-AdapterTutorialsMultiView, reason: not valid java name */
    /* synthetic */ void m753x90c0d9cb(TutorialsHolder tutorialsHolder2, View view) {
        tutorialsHolder = tutorialsHolder2;
        String str = this.cours_his_geo[tutorialsHolder2.getBindingAdapterPosition()];
        HistoryGeographyActivity.file_Name = str;
        HistoryGeographyActivity.getInstance().openContent(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return list.get(position) instanceof Separate ? 0 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (getItemViewType(position) == 0) {
            Separate separate = (Separate) list.get(position);
            SeparatesHolder separatesHolder = (SeparatesHolder) holder;
            separatesHolder.txtTitle.setText(separate.getTitle());
            if (separate.isDarkmode()) {
                separatesHolder.lytItemSeparate.setBackgroundColor(Color.parseColor("#424445"));
                return;
            } else {
                separatesHolder.lytItemSeparate.setBackgroundColor(Color.parseColor("#E6ECEF"));
                return;
            }
        }
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
            if (AdapterTutorialsMultiView.this.mClickListener != null) {
                AdapterTutorialsMultiView.this.mClickListener.onItemClick(view, getAdapterPosition());
            }
        }
    }

    public class SeparatesHolder extends RecyclerView.ViewHolder {
        private final LinearLayout lytItemSeparate;
        private final TextView txtTitle;

        SeparatesHolder(View itemView) {
            super(itemView);
            this.txtTitle = (TextView) itemView.findViewById(R.id.txtTitle);
            this.lytItemSeparate = (LinearLayout) itemView.findViewById(R.id.lytItemSeparate);
        }
    }
}
