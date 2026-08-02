package com.neptunesoft.gestionbacdz.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.gestionbacdz.R;
import com.neptunesoft.gestionbacdz.SplashScreen;
import com.neptunesoft.gestionbacdz.adapter.TopicsAdapter;
import com.neptunesoft.gestionbacdz.classobjects.Separate;
import com.neptunesoft.gestionbacdz.classobjects.Topics;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public class TopicsFragment extends Fragment {
    public static List<Object> list;
    private final String[] files = {"bac2024-gestion-ge.pdf", "bac2024-economy-ge.pdf", "bac2024-math-ge.pdf", "bac2024-hisgeo-ge.pdf", "bac2024-arabic-sci.pdf", "bac2024-droit-ge.pdf", "bac2024-islamic.pdf", "bac2024-philo-gemt.pdf", "bac2024-english-sci.pdf", "bac2024-french-sci.pdf", "bac2023-gestion-ge.pdf", "bac2023-economy-ge.pdf", "bac2023-math-ge.pdf", "bac2023-hisgeo-ge.pdf", "bac2023-arabic-sci.pdf", "bac2023-droit-ge.pdf", "bac2023-islamic.pdf", "bac2023-philo-gemt.pdf", "bac2023-english-sci.pdf", "bac2023-french-sci.pdf", "bac2022-gestion-ge.pdf", "bac2022-economy-ge.pdf", "bac2022-math-ge.pdf", "bac2022-hisgeo-ge.pdf", "bac2022-arabic-sci.pdf", "bac2022-droit-ge.pdf", "bac2022-islamic.pdf", "bac2022-philo-gemt.pdf", "bac2022-english-sci.pdf", "bac2022-french-sci.pdf", "bac-comptabilite-sujet-2021.pdf", "bac-economie-sujet-2021.pdf", "bac-mathematiques-ges-2021.pdf", "bac-hisgeo-ges-2021.pdf", "bac-arabe-sci-2021.pdf", "bac-droit-sujet-2021.pdf", "bac-islamia-sujet-2021.pdf", "bac-philosophie-gemt-2021.pdf", "bac-anglais-sci-2021.pdf", "bac-francais-sci-2021.pdf", "bac-comptabilite-sujet-2020.pdf", "bac-economie-sujet-2020.pdf", "bac-mathematiques-ges-2020.pdf", "bac-hisgeo-ges-2020.pdf", "bac-arabe-sci-2020.pdf", "bac-droit-sujet-2020.pdf", "bac-islamia-sujet-2020.pdf", "bac-philosophie-gemt-2020.pdf", "bac-anglais-sci-2020.pdf", "bac-francais-sci-2020.pdf", "bac-comptabilite-sujet-2019.pdf", "bac-economie-sujet-2019.pdf", "bac-mathematiques-ges-2019.pdf", "bac-hisgeo-ges-2019.pdf", "bac-arabe-sci-2019.pdf", "bac-droit-sujet-2019.pdf", "bac-islamia-sujet-2019.pdf", "bac-philosophie-gemt-2019.pdf", "bac-anglais-sci-2019.pdf", "bac-francais-sci-2019.pdf", "bac-comptabilite-sujet-2018.pdf", "bac-economie-sujet-2018.pdf", "bac-mathematiques-ges-2018.pdf", "bac-hisgeo-ges-2018.pdf", "bac-arabe-sci-2018.pdf", "bac-droit-sujet-2018.pdf", "bac-islamia-sujet-2018.pdf", "bac-philosophie-gemt-2018.pdf", "bac-anglais-sci-2018.pdf", "bac-francais-sci-2018.pdf", "bac-comptabilite-sujet-2017-2.pdf", "bac-economie-sujet-2017-2.pdf", "bac-mathematiques-ges-2017-2.pdf", "bac-hisgeo-ges-2017-2.pdf", "bac-arabe-sci-2017-2.pdf", "bac-droit-sujet-2017-2.pdf", "bac-islamia-sujet-2017-2.pdf", "bac-philosophie-gemt-2017-2.pdf", "bac-anglais-sci-2017-2.pdf", "bac-francais-sci-2017-2.pdf", "bac-comptabilite-sujet-2017-1.pdf", "bac-economie-sujet-2017-1.pdf", "bac-mathematiques-ges-2017-1.pdf", "bac-hisgeo-ges-2017-1.pdf", "bac-arabe-sci-2017-1.pdf", "bac-droit-sujet-2017-1.pdf", "bac-islamia-sujet-2017-1.pdf", "bac-philosophie-gemt-2017-1.pdf", "bac-anglais-sci-2017-1.pdf", "bac-francais-sci-2017-1.pdf", "bac-comptabilite-sujet-2016.pdf", "bac-economie-sujet-2016.pdf", "bac-mathematiques-ges-2016.pdf", "bac-hisgeo-ges-2016.pdf", "bac-arabe-sci-2016.pdf", "bac-droit-sujet-2016.pdf", "bac-islamia-sujet-2016.pdf", "bac-philosophie-gemt-2016.pdf", "bac-anglais-sci-2016.pdf", "bac-francais-sci-2016.pdf", "bac-comptabilite-sujet-2015.pdf", "bac-economie-sujet-2015.pdf", "bac-mathematiques-ges-2015.pdf", "bac-hisgeo-ges-2015.pdf", "bac-arabe-sci-2015.pdf", "bac-droit-sujet-2015.pdf", "bac-islamia-sujet-2015.pdf", "bac-philosophie-gemt-2015.pdf", "bac-anglais-sci-2015.pdf", "bac-francais-sci-2015.pdf", "bac-comptabilite-sujet-2014.pdf", "bac-economie-sujet-2014.pdf", "bac-mathematiques-ges-2014.pdf", "bac-hisgeo-ges-2014.pdf", "bac-arabe-sci-2014.pdf", "bac-droit-sujet-2014.pdf", "bac-islamia-sujet-2014.pdf", "bac-philosophie-gemt-2014.pdf", "bac-anglais-sci-2014.pdf", "bac-francais-sci-2014.pdf", "bac-comptabilite-sujet-2013.pdf", "bac-economie-sujet-2013.pdf", "bac-mathematiques-ges-2013.pdf", "bac-hisgeo-ges-2013.pdf", "bac-arabe-sci-2013.pdf", "bac-droit-sujet-2013.pdf", "bac-islamia-sujet-2013.pdf", "bac-philosophie-gemt-2013.pdf", "bac-anglais-sci-2013.pdf", "bac-francais-sci-2013.pdf", "bac-comptabilite-sujet-2012.pdf", "bac-economie-sujet-2012.pdf", "bac-mathematiques-ges-2012.pdf", "bac-hisgeo-ges-2012.pdf", "bac-arabe-sci-2012.pdf", "bac-droit-sujet-2012.pdf", "bac-islamia-sujet-2012.pdf", "bac-philosophie-gemt-2012.pdf", "bac-anglais-sci-2012.pdf", "bac-francais-sci-2012.pdf"};
    View view;

    public boolean files_exist(String fileName) {
        return new File(requireActivity().getFilesDir(), fileName).exists();
    }

    private Topics prepareTopics(Topics topics, int position) {
        if (SplashScreen.darkmode) {
            if (files_exist(this.files[position])) {
                return new Topics(topics.getModule(), topics.getInformation(), R.drawable.ic_circleinsidecircle_dark);
            }
            return new Topics(topics.getModule(), topics.getInformation(), R.drawable.ic_download_dark);
        }
        if (files_exist(this.files[position])) {
            return new Topics(topics.getModule(), topics.getInformation(), R.drawable.ic_circleinsidecircle);
        }
        return new Topics(topics.getModule(), topics.getInformation(), R.drawable.ic_download);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList arrayList = new ArrayList();
        list = arrayList;
        arrayList.add(new Separate("بكالوريا 2024", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0), 0));
        list.add(prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0), 1));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 2));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 3));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 4));
        list.add(prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0), 5));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 6));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 7));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 8));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 9));
        list.add(new Separate("بكالوريا 2023", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0), 10));
        list.add(prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0), 11));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 12));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 13));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 14));
        list.add(prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0), 15));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 16));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 17));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 18));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 19));
        list.add(new Separate("بكالوريا 2022", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0), 20));
        list.add(prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0), 21));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 22));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 23));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 24));
        list.add(prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0), 25));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 26));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 27));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 28));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 29));
        list.add(new Separate("بكالوريا 2021", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0), 30));
        list.add(prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0), 31));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 32));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 33));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 34));
        list.add(prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0), 35));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 36));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 37));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 38));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 39));
        list.add(new Separate("بكالوريا 2020", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0), 40));
        list.add(prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0), 41));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 42));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 43));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 44));
        list.add(prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0), 45));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 46));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 47));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 48));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 49));
        list.add(new Separate("بكالوريا 2019", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0), 50));
        list.add(prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0), 51));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 52));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 53));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 54));
        list.add(prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0), 55));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 56));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 57));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 58));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 59));
        list.add(new Separate("بكالوريا 2018", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0), 60));
        list.add(prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0), 61));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 62));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 63));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 64));
        list.add(prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0), 65));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 66));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 67));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 68));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 69));
        list.add(new Separate("بكالوريا 2017", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2 | الدورة 2", 0), 70));
        list.add(prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2 | الدورة 2", 0), 71));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2 | الدورة 2", 0), 72));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2 | الدورة 2", 0), 73));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 2", 0), 74));
        list.add(prepareTopics(new Topics("القانون", "الموضوع 1 + 2 | الدورة 2", 0), 75));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 2", 0), 76));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 2", 0), 77));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2 | الدورة 2", 0), 78));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2 | الدورة 2", 0), 79));
        list.add(prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2 | الدورة 1", 0), 80));
        list.add(prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2 | الدورة 1", 0), 81));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2 | الدورة 1", 0), 82));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2 | الدورة 1", 0), 83));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 1", 0), 84));
        list.add(prepareTopics(new Topics("القانون", "الموضوع 1 + 2 | الدورة 1", 0), 85));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 1", 0), 86));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 1", 0), 87));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2 | الدورة 1", 0), 88));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2 | الدورة 1", 0), 89));
        list.add(new Separate("بكالوريا 2016", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0), 90));
        list.add(prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0), 91));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 92));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 93));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 94));
        list.add(prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0), 95));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 96));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 97));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 98));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 99));
        list.add(new Separate("بكالوريا 2015", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0), 100));
        list.add(prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0), 101));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 102));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 103));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 104));
        list.add(prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0), 105));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 106));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 107));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 108));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 109));
        list.add(new Separate("بكالوريا 2014", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0), 110));
        list.add(prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0), 111));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 112));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 113));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 114));
        list.add(prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0), 115));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 116));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 117));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 118));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), 119));
        list.add(new Separate("بكالوريا 2013", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0), 120));
        list.add(prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0), 121));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), 122));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), 123));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 124));
        list.add(prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0), 125));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), 126));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), 127));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), 128));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), Opcodes.LOR));
        list.add(new Separate("بكالوريا 2012", SplashScreen.darkmode));
        list.add(prepareTopics(new Topics("التسيير المحاسبي و المالي", "الموضوع 1 + 2", 0), 130));
        list.add(prepareTopics(new Topics("الإقتصاد و المناجمنت", "الموضوع 1 + 2", 0), Opcodes.LXOR));
        list.add(prepareTopics(new Topics("الرياضيات", "الموضوع 1 + 2", 0), Opcodes.IINC));
        list.add(prepareTopics(new Topics("الإجتماعيات", "الموضوع 1 + 2", 0), Opcodes.I2L));
        list.add(prepareTopics(new Topics("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), Opcodes.I2F));
        list.add(prepareTopics(new Topics("القانون", "الموضوع 1 + 2", 0), Opcodes.I2D));
        list.add(prepareTopics(new Topics("العلوم الإسلامية", "الموضوع 1 + 2", 0), Opcodes.L2I));
        list.add(prepareTopics(new Topics("الفلسفة", "الموضوع 1 + 2 + 3", 0), Opcodes.L2F));
        list.add(prepareTopics(new Topics("English", "الموضوع 1 + 2", 0), Opcodes.L2D));
        list.add(prepareTopics(new Topics("Français", "الموضوع 1 + 2", 0), Opcodes.F2I));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_topics, container, false);
        this.view = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.topicsRecyclerView);
        TopicsAdapter topicsAdapter = new TopicsAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(topicsAdapter);
        return this.view;
    }
}
