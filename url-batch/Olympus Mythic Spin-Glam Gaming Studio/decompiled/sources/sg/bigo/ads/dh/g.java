package sg.bigo.ads.dh;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sg.bigo.ads.common.utils.r;

/* loaded from: classes3.dex */
public class g {
    final List<sg.bigo.ads.di.b> a = new ArrayList();

    @NonNull
    protected final Node b;

    public g(@NonNull Node node) {
        this.b = node;
    }

    @NonNull
    private static List<sg.bigo.ads.cv.a> a(@NonNull Node node) {
        Node namedItem;
        NodeList childNodes;
        NodeList childNodes2;
        String nodeValue;
        String nodeValue2;
        ArrayList arrayList = new ArrayList();
        List<Node> c = sg.bigo.ads.dg.a.c(node, VastTagName.VERIFICATION);
        if (c != null && !c.isEmpty()) {
            for (Node node2 : c) {
                NamedNodeMap attributes = node2.getAttributes();
                if (attributes != null && (namedItem = attributes.getNamedItem(VastAttributes.VENDOR)) != null) {
                    String str = "";
                    String nodeValue3 = namedItem.getNodeValue() != null ? namedItem.getNodeValue() : "";
                    if (!nodeValue3.isEmpty()) {
                        sg.bigo.ads.cv.a aVar = new sg.bigo.ads.cv.a();
                        aVar.b = nodeValue3;
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(CampaignEx.KEY_OMID);
                        Node a = sg.bigo.ads.dg.a.a(node2, VastTagName.JAVA_SCRIPT_RESOURCE, VastAttributes.API_FRAMEWORK, arrayList2);
                        if (a != null && (childNodes = a.getChildNodes()) != null) {
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= childNodes.getLength()) {
                                    break;
                                }
                                Node item = childNodes.item(i2);
                                if (item != null && (nodeValue2 = item.getNodeValue()) != null && nodeValue2.trim().startsWith("http")) {
                                    str = nodeValue2.trim();
                                    break;
                                }
                                i2++;
                            }
                            if (!str.isEmpty()) {
                                aVar.a = str;
                                Node a2 = sg.bigo.ads.dg.a.a(node2, VastTagName.VERIFICATION_PARAMETERS);
                                if (a2 != null && (childNodes2 = a2.getChildNodes()) != null) {
                                    while (true) {
                                        if (i >= childNodes2.getLength()) {
                                            break;
                                        }
                                        Node item2 = childNodes2.item(i);
                                        if (item2 != null && (nodeValue = item2.getNodeValue()) != null && nodeValue.trim().length() > 0) {
                                            aVar.c = nodeValue.trim();
                                            break;
                                        }
                                        i++;
                                    }
                                }
                                arrayList.add(aVar);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<n> a() {
        ArrayList arrayList = new ArrayList();
        List<Node> c = sg.bigo.ads.dg.a.c(this.b, "Error");
        if (c == null) {
            return arrayList;
        }
        Iterator<Node> it = c.iterator();
        while (it.hasNext()) {
            String a = sg.bigo.ads.dg.a.a(it.next());
            if (!TextUtils.isEmpty(a)) {
                arrayList.add(new n(a));
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<h> a(String... strArr) {
        List<Node> c;
        ArrayList arrayList = new ArrayList();
        Node a = sg.bigo.ads.dg.a.a(this.b, "Creatives");
        if (a == null || (c = sg.bigo.ads.dg.a.c(a, "Creative")) == null) {
            return arrayList;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("Linear");
        if (!sg.bigo.ads.common.utils.l.a(strArr)) {
            linkedHashSet.addAll(Arrays.asList(strArr));
        }
        for (Node node : c) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Node a2 = sg.bigo.ads.dg.a.a(node, str);
                if (a2 != null) {
                    str.hashCode();
                    if (str.equals("Linear")) {
                        arrayList.add(new h(a2));
                    } else if (str.equals("CompanionAds")) {
                        this.a.add(new sg.bigo.ads.dj.b(a2));
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<n> b() {
        List<Node> b = sg.bigo.ads.dg.a.b(this.b, "Impression", null, null);
        ArrayList arrayList = new ArrayList();
        if (b == null) {
            return arrayList;
        }
        Iterator<Node> it = b.iterator();
        while (it.hasNext()) {
            String a = sg.bigo.ads.dg.a.a(it.next());
            if (!TextUtils.isEmpty(a)) {
                arrayList.add(new n(a));
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<n> c() {
        List<Node> c;
        Node a = sg.bigo.ads.dg.a.a(this.b, "ViewableImpression", null, null);
        ArrayList arrayList = new ArrayList();
        if (a == null || (c = sg.bigo.ads.dg.a.c(a, "Viewable")) == null) {
            return arrayList;
        }
        Iterator<Node> it = c.iterator();
        while (it.hasNext()) {
            String a2 = sg.bigo.ads.dg.a.a(it.next());
            if (!TextUtils.isEmpty(a2)) {
                arrayList.add(new n(a2));
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<n> d() {
        List<Node> c;
        Node a = sg.bigo.ads.dg.a.a(this.b, "ViewableImpression", null, null);
        ArrayList arrayList = new ArrayList();
        if (a == null || (c = sg.bigo.ads.dg.a.c(a, "NotViewable")) == null) {
            return arrayList;
        }
        Iterator<Node> it = c.iterator();
        while (it.hasNext()) {
            String a2 = sg.bigo.ads.dg.a.a(it.next());
            if (!TextUtils.isEmpty(a2)) {
                arrayList.add(new n(a2));
            }
        }
        return arrayList;
    }

    public final int e() {
        String b = sg.bigo.ads.dg.a.b(this.b, "Expires");
        if (r.a((CharSequence) b)) {
            return 0;
        }
        try {
            return Integer.parseInt(b);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @NonNull
    public final String f() {
        String b = sg.bigo.ads.dg.a.b(this.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.i);
        return b == null ? "" : b;
    }

    @NonNull
    public final String g() {
        String b = sg.bigo.ads.dg.a.b(this.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.j);
        return b == null ? "" : b;
    }

    @NonNull
    public final String h() {
        String b = sg.bigo.ads.dg.a.b(this.b, "AdSystem");
        return b == null ? "" : b;
    }

    public final int i() {
        List<Node> b;
        Node a = sg.bigo.ads.dg.a.a(this.b, VastTagName.EXTENSIONS, null, null);
        if (a != null && (b = sg.bigo.ads.dg.a.b(a, VastTagName.EXTENSION, null, null)) != null && !b.isEmpty()) {
            Iterator<Node> it = b.iterator();
            while (it.hasNext()) {
                String b2 = sg.bigo.ads.dg.a.b(it.next(), VastTagName.MUTE);
                if (r.b((CharSequence) b2)) {
                    return r.a(b2, -1);
                }
            }
        }
        return -1;
    }

    @Nullable
    final List<sg.bigo.ads.cv.a> j() {
        List<Node> c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Node a = sg.bigo.ads.dg.a.a(this.b, "AdVerifications");
        if (a != null) {
            for (sg.bigo.ads.cv.a aVar : a(a)) {
                linkedHashMap.put(aVar.b, aVar);
            }
        }
        Node a2 = sg.bigo.ads.dg.a.a(this.b, VastTagName.EXTENSIONS);
        if (a2 != null && (c = sg.bigo.ads.dg.a.c(a2, VastTagName.EXTENSION)) != null) {
            Iterator<Node> it = c.iterator();
            while (it.hasNext()) {
                Node a3 = sg.bigo.ads.dg.a.a(it.next(), "AdVerifications");
                if (a3 != null) {
                    for (sg.bigo.ads.cv.a aVar2 : a(a3)) {
                        if (linkedHashMap.containsKey(aVar2.b)) {
                            sg.bigo.ads.bn.a.a(VastTagName.VAST, "Duplicate OM vendorKey skipped (legacy path): " + aVar2.b);
                        } else {
                            linkedHashMap.put(aVar2.b, aVar2);
                        }
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return new ArrayList(linkedHashMap.values());
    }
}
