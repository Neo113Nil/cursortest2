package com.neptunesoft.gestionbacdz;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.neptunesoft.gestionbacdz.adapter.ResourcesAdapter;
import com.neptunesoft.gestionbacdz.classobjects.Resources;
import com.neptunesoft.gestionbacdz.listeners.ResourcesListener;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ResourcesActivity extends AppCompatActivity implements ResourcesListener {
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resources);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Resources("الموقع الرسمي لوزارة التربية", null, "http://www.education.gov.dz/", "web", SplashScreen.darkmode));
        arrayList.add(new Resources("الديوان الوطني للإمتحانات و المسابقات", null, "http://www.onec.dz/", "web", SplashScreen.darkmode));
        arrayList.add(new Resources("موقع الدراسة الجزائري", null, "https://eddirasa.com/", "web", SplashScreen.darkmode));
        arrayList.add(new Resources("قناة موقع الدراسة الجزائري", null, "https://www.youtube.com/c/EddirasaSite", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("الموقع الأول لدراسة في الجزائر", null, "https://www.ency-education.com/secondaire.html", "web", SplashScreen.darkmode));
        arrayList.add(new Resources("موقع التعليم الجزائري", null, "https://www.dzetude.com/category/secondaire/3as/", "web", SplashScreen.darkmode));
        arrayList.add(new Resources("موقع بكالوريا الجزائر", null, "https://www.bacalgeria.com/", "web", SplashScreen.darkmode));
        arrayList.add(new Resources("قناة كليك باك Clicbac", null, "https://www.youtube.com/c/clicbac", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("صفحة كليك باك Clicbac", null, "https://www.facebook.com/clicbac", "facebook", SplashScreen.darkmode));
        arrayList.add(new Resources("قناة cours dz", null, "https://www.youtube.com/c/coursdz19", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("صفحة cours dz", null, "https://www.facebook.com/coursdz2019", "facebook", SplashScreen.darkmode));
        arrayList.add(new Resources("قناة el amine school", null, "https://www.youtube.com/channel/UCTI_WGfl0B50DWH8sNAS2XA?app=desktop", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة التسيير المحاسبي والمالي", "الأستاذ عبد الكريم", "https://www.youtube.com/channel/UCumht38AsuMAas18qLSDxiA", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة الإقتصاد و المناجمنت", "الأستاذ توفيق شاموني", "https://www.instagram.com/toufik.comptabilite", "instagram", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة الرياضيات", "الأستاذ سفيان ط", "https://www.youtube.com/channel/UC7Nkfu9JN_NVZ6EK2aO3wpQ", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة القانون", "عبد الفتاح", "https://www.youtube.com/channel/UCKXDmU2pApvNhIqMl36PE-Q", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة الفلسفة", "الأستاذ خليل سعيداني", "https://www.youtube.com/channel/UCwy5nzYHV06XfP9iixv_BZA", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة الإجتماعيات", "الأستاذ بورنان", "https://www.youtube.com/channel/UCeyN7ipOQs6Ld4jEIMFAaKw", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة اللغة العربية", "الأستاذ حيقون أسامة", "https://www.youtube.com/channel/UCTiFoJXhyBE1QYL4ClQVprQ", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة اللغة الإنجليزية", "بلال", "https://www.youtube.com/channel/UCIkWp4PLYRfSKOYzOzPy4Fg", "youtube", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة اللغة الإنجليزية", "بلال", "https://www.facebook.com/Anglais.b/", "facebook", SplashScreen.darkmode));
        arrayList.add(new Resources("مادة اللغة الإنجليزية", "بلال", "https://www.instagram.com/belalmalii/", "instagram", SplashScreen.darkmode));
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.resourcesRecyclerView);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        ResourcesAdapter resourcesAdapter = new ResourcesAdapter(arrayList, this, this);
        recyclerView.setAdapter(resourcesAdapter);
        resourcesAdapter.notifyDataSetChanged();
    }

    @Override // com.neptunesoft.gestionbacdz.listeners.ResourcesListener
    public void onResourcesClick(Resources resources, int position) {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
        if (resources.getType().equals("web")) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(resources.getLink())));
                return;
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(getApplicationContext(), "قم بتثبيت أي متصفح لكي تتمكن من فتح رابط الموقع", 0).show();
                return;
            }
        }
        if (resources.getType().equals("facebook")) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(resources.getLink())));
                return;
            } catch (ActivityNotFoundException unused2) {
                Toast.makeText(getApplicationContext(), "قم بتثبيت تطبيق الفايس بوك أو أي متصفح لكي تتمكن من فتح رابط الصفحة", 0).show();
                return;
            }
        }
        if (resources.getType().equals("instagram")) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(resources.getLink()));
            intent.setPackage("com.instagram.android");
            try {
                try {
                    startActivity(intent);
                    return;
                } catch (ActivityNotFoundException unused3) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(resources.getLink())));
                    return;
                }
            } catch (ActivityNotFoundException unused4) {
                Toast.makeText(getApplicationContext(), "قم بتثبيت تطبيق الانستقرام أو أي متصفح لكي تتمكن من فتح رابط الصفحة", 0).show();
                return;
            }
        }
        if (launchIntentForPackage != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse(resources.getLink()));
            intent2.setPackage("com.google.android.youtube");
            startActivity(intent2);
            return;
        }
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(resources.getLink())));
        } catch (ActivityNotFoundException unused5) {
            Toast.makeText(getApplicationContext(), "قم بتثبيت تطبيق اليوتيوب أو أي متصفح لكي تتمكن من فتح رابط القناة", 0).show();
        }
    }
}
