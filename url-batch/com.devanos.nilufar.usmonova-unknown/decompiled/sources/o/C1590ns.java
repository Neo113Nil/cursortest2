package o;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Size;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import com.google.firebase.messaging.Constants;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.ns, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1590ns implements InterfaceC0592Ws, InterfaceC0920df, InterfaceC2042uj, IS, OC, AI, InterfaceC1972tf {
    public final /* synthetic */ int h;
    public Object i;

    public /* synthetic */ C1590ns(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017c A[Catch: JSONException -> 0x0030, TryCatch #12 {JSONException -> 0x0030, blocks: (B:5:0x0017, B:6:0x0020, B:11:0x00d3, B:14:0x00d8, B:16:0x0106, B:19:0x012c, B:21:0x011f, B:24:0x0126, B:25:0x013b, B:27:0x0161, B:37:0x0165, B:30:0x0172, B:32:0x017c, B:34:0x0189, B:39:0x016a, B:40:0x018e, B:42:0x019e, B:43:0x01ab, B:45:0x01a8, B:46:0x01b0, B:48:0x01c4, B:49:0x01c9, B:51:0x01f0, B:53:0x0200, B:66:0x02e6, B:56:0x0300, B:58:0x0310, B:59:0x031f, B:91:0x01e7, B:124:0x0255, B:105:0x0273, B:84:0x02b9, B:98:0x02de, B:70:0x02f8, B:63:0x0324, B:126:0x0025, B:129:0x0033, B:132:0x003e, B:135:0x004a, B:138:0x0056, B:141:0x0061, B:144:0x006d, B:147:0x0077, B:150:0x0081, B:153:0x008b, B:156:0x0095, B:159:0x009f, B:162:0x00aa, B:165:0x00b5, B:168:0x00c0, B:73:0x027c, B:75:0x0286, B:76:0x0289, B:78:0x02a1, B:79:0x02b3, B:82:0x02aa), top: B:4:0x0017, inners: #0, #4, #6, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0189 A[Catch: JSONException -> 0x0030, TryCatch #12 {JSONException -> 0x0030, blocks: (B:5:0x0017, B:6:0x0020, B:11:0x00d3, B:14:0x00d8, B:16:0x0106, B:19:0x012c, B:21:0x011f, B:24:0x0126, B:25:0x013b, B:27:0x0161, B:37:0x0165, B:30:0x0172, B:32:0x017c, B:34:0x0189, B:39:0x016a, B:40:0x018e, B:42:0x019e, B:43:0x01ab, B:45:0x01a8, B:46:0x01b0, B:48:0x01c4, B:49:0x01c9, B:51:0x01f0, B:53:0x0200, B:66:0x02e6, B:56:0x0300, B:58:0x0310, B:59:0x031f, B:91:0x01e7, B:124:0x0255, B:105:0x0273, B:84:0x02b9, B:98:0x02de, B:70:0x02f8, B:63:0x0324, B:126:0x0025, B:129:0x0033, B:132:0x003e, B:135:0x004a, B:138:0x0056, B:141:0x0061, B:144:0x006d, B:147:0x0077, B:150:0x0081, B:153:0x008b, B:156:0x0095, B:159:0x009f, B:162:0x00aa, B:165:0x00b5, B:168:0x00c0, B:73:0x027c, B:75:0x0286, B:76:0x0289, B:78:0x02a1, B:79:0x02b3, B:82:0x02aa), top: B:4:0x0017, inners: #0, #4, #6, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void n(C0208Hx c0208Hx, NC nc) {
        char c;
        int i;
        EnumC0962eI a;
        CharSequence k;
        ClipDescription primaryClipDescription;
        C0208Hx c0208Hx2 = (C0208Hx) this.i;
        if (((C1590ns) c0208Hx2.j) == null) {
            return;
        }
        String str = (String) c0208Hx.i;
        Object obj = c0208Hx.j;
        try {
            boolean z = false;
            switch (str.hashCode()) {
                case -1501580720:
                    if (str.equals("SystemNavigator.setFrameworkHandlesBack")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -931781241:
                    if (str.equals("Share.invoke")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -766342101:
                    if (str.equals("SystemNavigator.pop")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -720677196:
                    if (str.equals("Clipboard.setData")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -577225884:
                    if (str.equals("SystemChrome.setSystemUIChangeListener")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -548468504:
                    if (str.equals("SystemChrome.setApplicationSwitcherDescription")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -247230243:
                    if (str.equals("HapticFeedback.vibrate")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -215273374:
                    if (str.equals("SystemSound.play")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 241845679:
                    if (str.equals("SystemChrome.restoreSystemUIOverlays")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 875995648:
                    if (str.equals("Clipboard.hasStrings")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1128339786:
                    if (str.equals("SystemChrome.setEnabledSystemUIMode")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1390477857:
                    if (str.equals("SystemChrome.setSystemUIOverlayStyle")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1514180520:
                    if (str.equals("Clipboard.getData")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1674312266:
                    if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 2119655719:
                    if (str.equals("SystemChrome.setPreferredOrientations")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    try {
                        int d = AbstractC2188wx.d((String) obj);
                        C1333jz c1333jz = (C1333jz) ((C1590ns) c0208Hx2.j).i;
                        if (d == 1) {
                            ((Activity) c1333jz.i).getWindow().getDecorView().playSoundEffect(0);
                        }
                        nc.d(null);
                        return;
                    } catch (NoSuchFieldException e) {
                        nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e.getMessage(), null);
                        return;
                    }
                case 1:
                    try {
                        ((C1590ns) c0208Hx2.j).x(AbstractC2188wx.c((String) obj));
                        nc.d(null);
                        return;
                    } catch (NoSuchFieldException e2) {
                        nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e2.getMessage(), null);
                        return;
                    }
                case 2:
                    try {
                        ((Activity) ((C1333jz) ((C1590ns) c0208Hx2.j).i).i).setRequestedOrientation(C0208Hx.D0(c0208Hx2, (JSONArray) obj));
                        nc.d(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e3) {
                        nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e3.getMessage(), null);
                        return;
                    }
                case 3:
                    try {
                        JSONObject jSONObject = (JSONObject) obj;
                        int i2 = jSONObject.getInt("primaryColor");
                        if (i2 != 0) {
                            i2 |= -16777216;
                        }
                        String string = jSONObject.getString(Constants.ScionAnalytics.PARAM_LABEL);
                        Activity activity = (Activity) ((C1333jz) ((C1590ns) c0208Hx2.j).i).i;
                        if (Build.VERSION.SDK_INT < 28) {
                            activity.setTaskDescription(new ActivityManager.TaskDescription(string, (Bitmap) null, i2));
                        } else {
                            activity.setTaskDescription(AbstractC1731q0.c(i2, string));
                        }
                        nc.d(null);
                        return;
                    } catch (JSONException e4) {
                        nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e4.getMessage(), null);
                        return;
                    }
                case 4:
                    try {
                        ((C1590ns) c0208Hx2.j).s(C0208Hx.E0(c0208Hx2, (JSONArray) obj));
                        nc.d(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e5) {
                        nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e5.getMessage(), null);
                        return;
                    }
                case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                    try {
                        int F0 = C0208Hx.F0(c0208Hx2, (String) obj);
                        C1333jz c1333jz2 = (C1333jz) ((C1590ns) c0208Hx2.j).i;
                        if (F0 == 1) {
                            i = 1798;
                        } else if (F0 == 2) {
                            i = 3846;
                        } else {
                            if (F0 != 3) {
                                if (F0 == 4 && Build.VERSION.SDK_INT >= 29) {
                                    i = 1792;
                                }
                                nc.d(null);
                                return;
                            }
                            i = 5894;
                        }
                        c1333jz2.h = i;
                        c1333jz2.b();
                        nc.d(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e6) {
                        nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e6.getMessage(), null);
                        return;
                    }
                case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                    C1333jz c1333jz3 = (C1333jz) ((C1590ns) c0208Hx2.j).i;
                    View decorView = ((Activity) c1333jz3.i).getWindow().getDecorView();
                    decorView.setOnSystemUiVisibilityChangeListener(new ViewOnSystemUiVisibilityChangeListenerC1620oI(c1333jz3, decorView));
                    nc.d(null);
                    return;
                case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                    ((C1333jz) ((C1590ns) c0208Hx2.j).i).b();
                    nc.d(null);
                    return;
                case '\b':
                    try {
                        ((C1333jz) ((C1590ns) c0208Hx2.j).i).a(C0208Hx.G0(c0208Hx2, (JSONObject) obj));
                        nc.d(null);
                        return;
                    } catch (NoSuchFieldException | JSONException e7) {
                        nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e7.getMessage(), null);
                        return;
                    }
                case '\t':
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    InterfaceC0638Ym interfaceC0638Ym = (InterfaceC0638Ym) ((C1333jz) ((C1590ns) c0208Hx2.j).i).k;
                    if (interfaceC0638Ym != null) {
                        ((AbstractActivityC0560Vm) interfaceC0638Ym).g(booleanValue);
                    }
                    nc.d(null);
                    return;
                case '\n':
                    Activity activity2 = (Activity) ((C1333jz) ((C1590ns) c0208Hx2.j).i).i;
                    if (activity2 instanceof ZF) {
                        ((ZF) activity2).getOnBackPressedDispatcher().b();
                    } else {
                        activity2.finish();
                    }
                    nc.d(null);
                    return;
                case 11:
                    String str2 = (String) obj;
                    if (str2 != null) {
                        try {
                            a = EnumC0962eI.a(str2);
                        } catch (NoSuchFieldException unused) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "No such clipboard content format: ".concat(str2), null);
                        }
                        k = ((C1590ns) c0208Hx2.j).k(a);
                        if (k != null) {
                            nc.d(null);
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("text", k);
                        nc.d(jSONObject2);
                        return;
                    }
                    a = null;
                    k = ((C1590ns) c0208Hx2.j).k(a);
                    if (k != null) {
                    }
                case '\f':
                    ((ClipboardManager) ((Activity) ((C1333jz) ((C1590ns) c0208Hx2.j).i).i).getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", ((JSONObject) obj).getString("text")));
                    nc.d(null);
                    return;
                case '\r':
                    ClipboardManager clipboardManager = (ClipboardManager) ((Activity) ((C1333jz) ((C1590ns) c0208Hx2.j).i).i).getSystemService("clipboard");
                    if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
                        z = primaryClipDescription.hasMimeType("text/*");
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("value", z);
                    nc.d(jSONObject3);
                    return;
                case 14:
                    C1333jz c1333jz4 = (C1333jz) ((C1590ns) c0208Hx2.j).i;
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", (String) obj);
                    ((Activity) c1333jz4.i).startActivity(Intent.createChooser(intent, null));
                    nc.d(null);
                    return;
                default:
                    nc.b();
                    return;
            }
        } catch (JSONException e8) {
            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "JSON error: " + e8.getMessage(), null);
        }
        nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "JSON error: " + e8.getMessage(), null);
    }

    @Override // o.AI
    public void W(int i) {
        DI di = (DI) this.i;
        if (di.x(i)) {
            ((AbstractC1600o00) di.p.get(Integer.valueOf(i))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i);
            return;
        }
        if (di.r.get(i) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i);
    }

    @Override // o.InterfaceC1972tf
    public Object b(InterfaceC2312yp interfaceC2312yp, AbstractC2367ze abstractC2367ze) {
        return ((InterfaceC1972tf) this.i).b(new VI(interfaceC2312yp, null), abstractC2367ze);
    }

    @Override // o.InterfaceC1972tf
    public InterfaceC2243xm c() {
        return ((InterfaceC1972tf) this.i).c();
    }

    @Override // o.AI
    public long c0(C0998es c0998es) {
        DI di = (DI) this.i;
        DI.a(di, c0998es);
        int i = c0998es.a;
        if (di.u.get(i) != null) {
            throw new IllegalStateException(AbstractC2188wx.g(i, "Trying to create an already created platform view, view id: "));
        }
        if (di.l == null) {
            throw new IllegalStateException(AbstractC2188wx.g(i, "Texture registry is null. This means that platform views controller was detached, view id: "));
        }
        if (di.j == null) {
            throw new IllegalStateException(AbstractC2188wx.g(i, "Flutter view is null. This means the platform views controller doesn't have an attached view, view id: "));
        }
        C1125gn c1125gn = di.h;
        String str = (String) c0998es.c;
        if (c1125gn.a.get(str) == null) {
            throw new IllegalStateException(AbstractC1888sN.s("Trying to create a platform view of unregistered type: ", str));
        }
        throw new ClassCastException();
    }

    @Override // o.AI
    public void d(boolean z) {
        ((DI) this.i).x = z;
    }

    @Override // o.InterfaceC0920df
    public Iterable e(Object obj) {
        C0672Zu c0672Zu = (C0672Zu) this.i;
        Collection d = ((InterfaceC1245ib) obj).z().d();
        AbstractC0048Bt.m(d, "it.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList();
        Iterator it = d.iterator();
        while (it.hasNext()) {
            InterfaceC2364zb c = ((AbstractC1004ey) it.next()).B0().c();
            InterfaceC2364zb a = c != null ? c.a() : null;
            InterfaceC1245ib interfaceC1245ib = a instanceof InterfaceC1245ib ? (InterfaceC1245ib) a : null;
            C0390Oy b = interfaceC1245ib != null ? c0672Zu.b(interfaceC1245ib) : null;
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }

    public void g(String str) {
        InterfaceC1417lD interfaceC1417lD = (InterfaceC1417lD) ((C0208Hx) this.i).i;
        if (C0208Hx.l == null) {
            C0363Nx c0363Nx = new C0363Nx();
            c0363Nx.put("alias", 1010);
            c0363Nx.put("allScroll", 1013);
            c0363Nx.put("basic", 1000);
            c0363Nx.put("cell", 1006);
            c0363Nx.put("click", 1002);
            c0363Nx.put("contextMenu", 1001);
            c0363Nx.put("copy", 1011);
            c0363Nx.put("forbidden", 1012);
            c0363Nx.put("grab", 1020);
            c0363Nx.put("grabbing", 1021);
            c0363Nx.put("help", 1003);
            c0363Nx.put("move", 1013);
            c0363Nx.put("none", 0);
            c0363Nx.put("noDrop", 1012);
            c0363Nx.put("precise", 1007);
            c0363Nx.put("text", 1008);
            c0363Nx.put("resizeColumn", 1014);
            c0363Nx.put("resizeDown", 1015);
            c0363Nx.put("resizeUpLeft", 1016);
            c0363Nx.put("resizeDownRight", 1017);
            c0363Nx.put("resizeLeft", 1014);
            c0363Nx.put("resizeLeftRight", 1014);
            c0363Nx.put("resizeRight", 1014);
            c0363Nx.put("resizeRow", 1015);
            c0363Nx.put("resizeUp", 1015);
            c0363Nx.put("resizeUpDown", 1015);
            c0363Nx.put("resizeUpLeft", 1017);
            c0363Nx.put("resizeUpRight", 1016);
            c0363Nx.put("resizeUpLeftDownRight", 1017);
            c0363Nx.put("resizeUpRightDownLeft", 1016);
            c0363Nx.put("verticalText", 1009);
            c0363Nx.put("wait", 1004);
            c0363Nx.put("zoomIn", 1018);
            c0363Nx.put("zoomOut", 1019);
            C0208Hx.l = c0363Nx;
        }
        interfaceC1417lD.setPointerIcon(PointerIcon.getSystemIcon(((C0068Cn) interfaceC1417lD).getContext(), ((Integer) C0208Hx.l.getOrDefault(str, 1000)).intValue()));
    }

    public boolean h(C1219iB c1219iB, InterfaceC1991ty interfaceC1991ty, C2002u5 c2002u5, boolean z) {
        YD yd = (YD) this.i;
        int i = yd.j;
        if (i <= 0) {
            return false;
        }
        Object[] objArr = yd.h;
        int i2 = 0;
        boolean z2 = false;
        do {
            z2 = ((EE) objArr[i2]).h(c1219iB, interfaceC1991ty, c2002u5, z) || z2;
            i2++;
        } while (i2 < i);
        return z2;
    }

    public void i(C2002u5 c2002u5) {
        YD yd = (YD) this.i;
        int i = yd.j;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((EE) yd.h[i]).k.h == 0) {
                yd.n(i);
            }
        }
    }

    @Override // o.AI
    public void i0(C2147wI c2147wI) {
        int i = c2147wI.a;
        DI di = (DI) this.i;
        float f = di.i.getResources().getDisplayMetrics().density;
        if (!di.x(i)) {
            if (di.r.get(i) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i);
            return;
        }
        AbstractC1600o00 abstractC1600o00 = (AbstractC1600o00) di.p.get(Integer.valueOf(i));
        long j = c2147wI.p;
        int i2 = c2147wI.e;
        C0208Hx c0208Hx = di.A;
        c0208Hx.getClass();
        LongSparseArray longSparseArray = (LongSparseArray) c0208Hx.i;
        PriorityQueue priorityQueue = (PriorityQueue) c0208Hx.j;
        while (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() < j) {
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j) {
            priorityQueue.poll();
        }
        longSparseArray.remove(j);
        List<List> list = (List) c2147wI.g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d = f;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d);
            arrayList.add(pointerCoords);
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i2]);
        List<List> list3 = (List) c2147wI.f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.obtain(c2147wI.b.longValue(), c2147wI.c.longValue(), c2147wI.d, c2147wI.e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i2]), pointerCoordsArr, c2147wI.h, c2147wI.i, c2147wI.j, c2147wI.k, c2147wI.l, c2147wI.m, c2147wI.n, c2147wI.f239o);
        abstractC1600o00.getClass();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [o.ms] */
    public Bitmap j(ByteBuffer byteBuffer, IC ic) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        createSource = ImageDecoder.createSource(byteBuffer);
        try {
            decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: o.ms
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    ColorSpace colorSpace;
                    Size size;
                    ColorSpace.Named unused;
                    C1590ns c1590ns = C1590ns.this;
                    unused = ColorSpace.Named.SRGB;
                    colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    imageDecoder.setTargetColorSpace(colorSpace);
                    imageDecoder.setAllocator(1);
                    C1387kn c1387kn = (C1387kn) c1590ns.i;
                    if (c1387kn != null) {
                        size = imageInfo.getSize();
                        FlutterJNI.nativeImageHeaderCallback(c1387kn.a, size.getWidth(), size.getHeight());
                    }
                }
            });
            return decodeBitmap;
        } catch (IOException e) {
            Log.e("FlutterImageDecoderImplDefault", "Failed to decode image", e);
            return null;
        }
    }

    public CharSequence k(EnumC0962eI enumC0962eI) {
        Activity activity = (Activity) ((C1333jz) this.i).i;
        ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (clipboardManager.hasPrimaryClip()) {
            try {
                try {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip != null) {
                        if (enumC0962eI != null) {
                            if (enumC0962eI == EnumC0962eI.h) {
                            }
                        }
                        ClipData.Item itemAt = primaryClip.getItemAt(0);
                        CharSequence text = itemAt.getText();
                        if (text != null) {
                            return text;
                        }
                        try {
                            Uri uri = itemAt.getUri();
                            if (uri == null) {
                                Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
                                return null;
                            }
                            String scheme = uri.getScheme();
                            if (!scheme.equals("content")) {
                                Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                                return null;
                            }
                            AssetFileDescriptor openTypedAssetFileDescriptor = activity.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(activity);
                            if (openTypedAssetFileDescriptor == null) {
                                return coerceToText;
                            }
                            try {
                                openTypedAssetFileDescriptor.close();
                                return coerceToText;
                            } catch (IOException e) {
                                charSequence = coerceToText;
                                e = e;
                                Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                return charSequence;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            charSequence = text;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (FileNotFoundException unused) {
                Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
                return charSequence;
            } catch (SecurityException e4) {
                Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e4);
                return charSequence;
            }
        }
        return null;
    }

    public String l(String str, String str2) {
        LA la = (LA) this.i;
        Context context = la.b;
        if (str2 != null) {
            Locale a = LA.a(str2);
            Configuration configuration = new Configuration(la.b.getResources().getConfiguration());
            configuration.setLocale(a);
            context = la.b.createConfigurationContext(configuration);
        }
        int identifier = context.getResources().getIdentifier(str, "string", la.b.getPackageName());
        if (identifier != 0) {
            return context.getResources().getString(identifier);
        }
        return null;
    }

    @Override // o.AI
    public void m(C0998es c0998es) {
        DI di = (DI) this.i;
        DI.a(di, c0998es);
        if (di.k.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        C1125gn c1125gn = di.h;
        String str = (String) c0998es.c;
        if (c1125gn.a.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException(AbstractC1888sN.s("Trying to create a platform view of unregistered type: ", str));
    }

    public C2002u5 o(C0208Hx c0208Hx, S2 s2) {
        Object obj;
        int i;
        long D;
        long j;
        boolean z;
        C1219iB c1219iB = (C1219iB) this.i;
        List list = (List) c0208Hx.i;
        C1219iB c1219iB2 = new C1219iB(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            JI ji = (JI) list.get(i2);
            long j2 = ji.a;
            int i3 = AbstractC1473m3.i(c1219iB.i, c1219iB.k, j2);
            if (i3 < 0 || (obj = c1219iB.j[i3]) == AbstractC0946e20.e) {
                obj = null;
            }
            II ii = (II) obj;
            if (ii == null) {
                i = i2;
                j = ji.b;
                D = ji.d;
                z = false;
            } else {
                long j3 = ii.a;
                boolean z2 = ii.c;
                i = i2;
                D = s2.D(ii.b);
                j = j3;
                z = z2;
            }
            long j4 = ji.a;
            List list2 = list;
            int i4 = size;
            c1219iB2.c(j4, new HI(j4, ji.b, ji.d, ji.e, ji.f, j, D, z, ji.g, ji.i, ji.j, ji.k));
            boolean z3 = ji.e;
            if (z3) {
                c1219iB.c(j2, new II(ji.b, ji.c, z3));
            } else {
                c1219iB.d(j2);
            }
            i2 = i + 1;
            list = list2;
            size = i4;
        }
        return new C2002u5(27, c1219iB2, c0208Hx, false);
    }

    public void p() {
        YD yd = (YD) this.i;
        int i = 0;
        while (i < yd.j) {
            EE ee = (EE) yd.h[i];
            if (ee.j.m) {
                i++;
                ee.p();
            } else {
                ee.y();
                yd.n(i);
            }
        }
    }

    public InterfaceC1245ib q(C2217xM c2217xM) {
        AbstractC0048Bt.n(c2217xM, "javaClass");
        C2245xo c = c2217xM.c();
        Class cls = c2217xM.a;
        Class<?> declaringClass = cls.getDeclaringClass();
        C2217xM c2217xM2 = declaringClass != null ? new C2217xM(declaringClass) : null;
        if (c2217xM2 != null) {
            InterfaceC1245ib q = q(c2217xM2);
            WB g0 = q != null ? q.g0() : null;
            InterfaceC2364zb g = g0 != null ? g0.g(C0827cE.e(cls.getSimpleName()), DE.f27o) : null;
            if (g instanceof InterfaceC1245ib) {
                return (InterfaceC1245ib) g;
            }
        } else {
            C0546Uy c0546Uy = (C0546Uy) AbstractC0720ac.p0(AbstractC0868ct.J(((C0572Vy) this.i).c(c.e())));
            if (c0546Uy != null) {
                C0743az c0743az = c0546Uy.q.d;
                c0743az.getClass();
                return c0743az.v(C0827cE.e(cls.getSimpleName()), c2217xM);
            }
        }
        return null;
    }

    @Override // o.AI
    public void r(C2345zI c2345zI, C1574nc c1574nc) {
        DI di = (DI) this.i;
        int e = di.e(c2345zI.b);
        int e2 = di.e(c2345zI.c);
        int i = c2345zI.a;
        if (!di.x(i)) {
            if (di.r.get(i) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i);
            return;
        }
        float f = di.i.getResources().getDisplayMetrics().density;
        AbstractC1600o00 abstractC1600o00 = (AbstractC1600o00) di.p.get(Integer.valueOf(i));
        io.flutter.plugin.editing.b bVar = di.m;
        if (bVar != null) {
            if (bVar.e.a == 3) {
                bVar.p = true;
            }
            abstractC1600o00.getClass();
        }
        abstractC1600o00.getClass();
        if (e == 0 && e2 == 0) {
            throw null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw null;
        }
        throw null;
    }

    @Override // o.AI
    public void r0(int i) {
        switch (this.h) {
            case 26:
                if (((DI) this.i).r.get(i) != null) {
                    throw new ClassCastException();
                }
                Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i);
                return;
            default:
                if (((CI) this.i).n.get(i) != null) {
                    throw new ClassCastException();
                }
                Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i);
                return;
        }
    }

    public void s(ArrayList arrayList) {
        C1333jz c1333jz = (C1333jz) this.i;
        int i = arrayList.isEmpty() ? 5894 : 1798;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            int ordinal = ((EnumC1094gI) arrayList.get(i2)).ordinal();
            if (ordinal == 0) {
                i &= -5;
            } else if (ordinal == 1) {
                i &= -515;
            }
        }
        c1333jz.h = i;
        c1333jz.b();
    }

    @Override // o.AI
    public void t(int i, double d, double d2) {
        DI di = (DI) this.i;
        if (di.x(i)) {
            return;
        }
        Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i);
    }

    public String toString() {
        switch (this.h) {
            case 9:
                StringBuilder sb = new StringBuilder();
                C0546Uy c0546Uy = (C0546Uy) this.i;
                sb.append(c0546Uy);
                sb.append(": ");
                sb.append(((Map) AbstractC0772bO.o(c0546Uy.p, C0546Uy.t[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // o.AI
    public void u(int i, int i2) {
        DI di = (DI) this.i;
        if (i2 != 0 && i2 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i2 + "(view id: " + i + ")");
        }
        if (di.x(i)) {
            ((AbstractC1600o00) di.p.get(Integer.valueOf(i))).getClass();
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i);
            return;
        }
        if (di.r.get(i) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.OC
    public void v(C0208Hx c0208Hx, NC nc) {
        char c;
        char c2;
        switch (this.h) {
            case 10:
                C0208Hx c0208Hx2 = (C0208Hx) this.i;
                if (((C1590ns) c0208Hx2.j) == null) {
                    return;
                }
                String str = (String) c0208Hx.i;
                str.getClass();
                if (!str.equals("Localization.getStringResource")) {
                    nc.b();
                    return;
                }
                JSONObject jSONObject = (JSONObject) c0208Hx.j;
                try {
                    nc.d(((C1590ns) c0208Hx2.j).l(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
                    return;
                } catch (JSONException e) {
                    nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, e.getMessage(), null);
                    return;
                }
            case 13:
                C1590ns c1590ns = (C1590ns) this.i;
                if (((C1590ns) c1590ns.i) == null) {
                    return;
                }
                String str2 = (String) c0208Hx.i;
                try {
                    if (str2.hashCode() == -1307105544 && str2.equals("activateSystemCursor")) {
                        try {
                            ((C1590ns) c1590ns.i).g((String) ((HashMap) c0208Hx.j).get("kind"));
                            nc.d(Boolean.TRUE);
                        } catch (Exception e2) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Error when setting cursors: " + e2.getMessage(), null);
                        }
                    }
                    return;
                } catch (Exception e3) {
                    nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, "Unhandled error: " + e3.getMessage(), null);
                    return;
                }
            case 18:
                n(c0208Hx, nc);
                return;
            case 22:
                C1590ns c1590ns2 = (C1590ns) this.i;
                if (((AI) c1590ns2.i) == null) {
                    return;
                }
                String str3 = (String) c0208Hx.i;
                Object obj = c0208Hx.j;
                str3.getClass();
                switch (str3.hashCode()) {
                    case -1352294148:
                        if (str3.equals("create")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1019779949:
                        if (str3.equals("offset")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -934437708:
                        if (str3.equals("resize")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -756050293:
                        if (str3.equals("clearFocus")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -308988850:
                        if (str3.equals("synchronizeToNativeViewHierarchy")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 110550847:
                        if (str3.equals("touch")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 576796989:
                        if (str3.equals("setDirection")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1671767583:
                        if (str3.equals("dispose")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        Map map = (Map) obj;
                        boolean z = map.containsKey("hybrid") && ((Boolean) map.get("hybrid")).booleanValue();
                        ByteBuffer wrap = map.containsKey("params") ? ByteBuffer.wrap((byte[]) map.get("params")) : null;
                        try {
                            if (z) {
                                ((AI) c1590ns2.i).m(new C0998es(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), 0.0d, 0.0d, 0.0d, 0.0d, ((Integer) map.get("direction")).intValue(), 3, wrap));
                                throw null;
                            }
                            ((AI) c1590ns2.i).c0(new C0998es(((Integer) map.get("id")).intValue(), (String) map.get("viewType"), map.containsKey("top") ? ((Double) map.get("top")).doubleValue() : 0.0d, map.containsKey("left") ? ((Double) map.get("left")).doubleValue() : 0.0d, ((Double) map.get("width")).doubleValue(), ((Double) map.get("height")).doubleValue(), ((Integer) map.get("direction")).intValue(), map.containsKey("hybridFallback") && ((Boolean) map.get("hybridFallback")).booleanValue() ? 2 : 1, wrap));
                            throw null;
                        } catch (IllegalStateException e4) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Log.getStackTraceString(e4), null);
                            return;
                        }
                    case 1:
                        Map map2 = (Map) obj;
                        try {
                            ((AI) c1590ns2.i).t(((Integer) map2.get("id")).intValue(), ((Double) map2.get("top")).doubleValue(), ((Double) map2.get("left")).doubleValue());
                            nc.d(null);
                            return;
                        } catch (IllegalStateException e5) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Log.getStackTraceString(e5), null);
                            return;
                        }
                    case 2:
                        Map map3 = (Map) obj;
                        try {
                            ((AI) c1590ns2.i).r(new C2345zI(((Integer) map3.get("id")).intValue(), ((Double) map3.get("width")).doubleValue(), ((Double) map3.get("height")).doubleValue()), new C1574nc(nc));
                            return;
                        } catch (IllegalStateException e6) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Log.getStackTraceString(e6), null);
                            return;
                        }
                    case 3:
                        try {
                            ((AI) c1590ns2.i).W(((Integer) obj).intValue());
                            nc.d(null);
                            return;
                        } catch (IllegalStateException e7) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Log.getStackTraceString(e7), null);
                            return;
                        }
                    case 4:
                        try {
                            ((AI) c1590ns2.i).d(((Boolean) obj).booleanValue());
                            nc.d(null);
                            return;
                        } catch (IllegalStateException e8) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Log.getStackTraceString(e8), null);
                            return;
                        }
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                        List list = (List) obj;
                        try {
                            ((AI) c1590ns2.i).i0(new C2147wI(((Integer) list.get(0)).intValue(), (Number) list.get(1), (Number) list.get(2), ((Integer) list.get(3)).intValue(), ((Integer) list.get(4)).intValue(), list.get(5), list.get(6), ((Integer) list.get(7)).intValue(), ((Integer) list.get(8)).intValue(), (float) ((Double) list.get(9)).doubleValue(), (float) ((Double) list.get(10)).doubleValue(), ((Integer) list.get(11)).intValue(), ((Integer) list.get(12)).intValue(), ((Integer) list.get(13)).intValue(), ((Integer) list.get(14)).intValue(), ((Number) list.get(15)).longValue()));
                            nc.d(null);
                            return;
                        } catch (IllegalStateException e9) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Log.getStackTraceString(e9), null);
                            return;
                        }
                    case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                        Map map4 = (Map) obj;
                        try {
                            ((AI) c1590ns2.i).u(((Integer) map4.get("id")).intValue(), ((Integer) map4.get("direction")).intValue());
                            nc.d(null);
                            return;
                        } catch (IllegalStateException e10) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Log.getStackTraceString(e10), null);
                            return;
                        }
                    case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                        try {
                            ((AI) c1590ns2.i).r0(((Integer) ((Map) obj).get("id")).intValue());
                            nc.d(null);
                            return;
                        } catch (IllegalStateException e11) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Log.getStackTraceString(e11), null);
                            return;
                        }
                    default:
                        nc.b();
                        return;
                }
            default:
                C1590ns c1590ns3 = (C1590ns) this.i;
                if (((C1590ns) c1590ns3.i) == null) {
                    return;
                }
                String str4 = (String) c0208Hx.i;
                Object obj2 = c0208Hx.j;
                str4.getClass();
                switch (str4.hashCode()) {
                    case -1352294148:
                        if (str4.equals("create")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -756050293:
                        if (str4.equals("clearFocus")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 110550847:
                        if (str4.equals("touch")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 576796989:
                        if (str4.equals("setDirection")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 751366695:
                        if (str4.equals("isSurfaceControlEnabled")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1671767583:
                        if (str4.equals("dispose")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        Map map5 = (Map) obj2;
                        if (map5.containsKey("params")) {
                            ByteBuffer.wrap((byte[]) map5.get("params"));
                        }
                        try {
                            ((Integer) map5.get("id")).getClass();
                            String str5 = (String) map5.get("viewType");
                            ((Integer) map5.get("direction")).getClass();
                            if (((CI) ((C1590ns) c1590ns3.i).i).h.a.get(str5) != null) {
                                throw new ClassCastException();
                            }
                            throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str5);
                        } catch (IllegalStateException e12) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Log.getStackTraceString(e12), null);
                            return;
                        }
                    case 1:
                        int intValue = ((Integer) obj2).intValue();
                        try {
                            if (((CI) ((C1590ns) c1590ns3.i).i).n.get(intValue) != null) {
                                throw new ClassCastException();
                            }
                            Log.e("PlatformViewsController2", "Clearing focus on an unknown view with id: " + intValue);
                            nc.d(null);
                            return;
                        } catch (IllegalStateException e13) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Log.getStackTraceString(e13), null);
                            return;
                        }
                    case 2:
                        List list2 = (List) obj2;
                        int intValue2 = ((Integer) list2.get(0)).intValue();
                        ((Integer) list2.get(3)).getClass();
                        ((Integer) list2.get(4)).getClass();
                        list2.get(5);
                        list2.get(6);
                        ((Integer) list2.get(7)).getClass();
                        ((Integer) list2.get(8)).getClass();
                        ((Double) list2.get(9)).getClass();
                        ((Double) list2.get(10)).getClass();
                        ((Integer) list2.get(11)).getClass();
                        ((Integer) list2.get(12)).getClass();
                        ((Integer) list2.get(13)).getClass();
                        ((Integer) list2.get(14)).getClass();
                        ((Number) list2.get(15)).longValue();
                        try {
                            C1590ns c1590ns4 = (C1590ns) c1590ns3.i;
                            c1590ns4.getClass();
                            CI ci = (CI) c1590ns4.i;
                            float f = ci.i.getResources().getDisplayMetrics().density;
                            if (ci.n.get(intValue2) != null) {
                                throw new ClassCastException();
                            }
                            Log.e("PlatformViewsController2", "Sending touch to an unknown view with id: " + intValue2);
                            nc.d(null);
                            return;
                        } catch (IllegalStateException e14) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Log.getStackTraceString(e14), null);
                            return;
                        }
                    case 3:
                        Map map6 = (Map) obj2;
                        int intValue3 = ((Integer) map6.get("id")).intValue();
                        ((Integer) map6.get("direction")).getClass();
                        try {
                            if (((CI) ((C1590ns) c1590ns3.i).i).n.get(intValue3) != null) {
                                throw new ClassCastException();
                            }
                            Log.e("PlatformViewsController2", "Setting direction to an unknown view with id: " + intValue3);
                            nc.d(null);
                            return;
                        } catch (IllegalStateException e15) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Log.getStackTraceString(e15), null);
                            return;
                        }
                    case 4:
                        FlutterJNI flutterJNI = ((CI) ((C1590ns) c1590ns3.i).i).k;
                        nc.d(Boolean.valueOf(flutterJNI != null ? flutterJNI.IsSurfaceControlEnabled() : false));
                        return;
                    case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                        try {
                            ((C1590ns) c1590ns3.i).r0(((Integer) ((Map) obj2).get("id")).intValue());
                            nc.d(null);
                            return;
                        } catch (IllegalStateException e16) {
                            nc.a(Constants.IPC_BUNDLE_KEY_SEND_ERROR, Log.getStackTraceString(e16), null);
                            return;
                        }
                    default:
                        nc.b();
                        return;
                }
        }
    }

    /* JADX WARN: Type inference failed for: r6v7, types: [o.ny, o.vp] */
    @Override // o.InterfaceC2042uj, o.U3
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public C0848cZ a(C0208Hx c0208Hx) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i;
        C1143h2 c1143h2 = (C1143h2) this.i;
        C2340zD c2340zD = (C2340zD) c1143h2.i;
        C2274yD c2274yD = new C2274yD(c2340zD.e + 2);
        C2340zD c2340zD2 = new C2340zD(c2340zD.e);
        int[] iArr3 = c2340zD.b;
        Object[] objArr3 = c2340zD.c;
        long[] jArr = c2340zD.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            i = i3;
                            C0441Qx c0441Qx = (C0441Qx) objArr3[i6];
                            c2274yD.a(i7);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c2340zD2.h(i7, new C0783bZ((V3) ((AbstractC1596ny) c0208Hx.i).invoke(c0441Qx.a), c0441Qx.b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        iArr3 = iArr2;
                        i3 = i;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!c2340zD.b(0)) {
            int i8 = c2274yD.b;
            if (i8 < 0) {
                throw new IndexOutOfBoundsException("Index 0 must be in 0.." + c2274yD.b);
            }
            c2274yD.b(i8 + 1);
            int[] iArr4 = c2274yD.a;
            int i9 = c2274yD.b;
            if (i9 != 0) {
                P6.a0(1, 0, i9, iArr4, iArr4);
            }
            iArr4[0] = 0;
            c2274yD.b++;
        }
        if (!c2340zD.b(c1143h2.h)) {
            c2274yD.a(c1143h2.h);
        }
        int i10 = c2274yD.b;
        if (i10 != 0) {
            int[] iArr5 = c2274yD.a;
            AbstractC0048Bt.n(iArr5, "<this>");
            Arrays.sort(iArr5, 0, i10);
        }
        return new C0848cZ(c2274yD, c2340zD2, c1143h2.h, AbstractC0012Aj.a);
    }

    public void x(int i) {
        View decorView = ((Activity) ((C1333jz) this.i).i).getWindow().getDecorView();
        switch (AbstractC1888sN.v(i)) {
            case 0:
                decorView.performHapticFeedback(0);
                break;
            case 1:
                decorView.performHapticFeedback(1);
                break;
            case 2:
                decorView.performHapticFeedback(3);
                break;
            case 3:
                decorView.performHapticFeedback(6);
                break;
            case 4:
                decorView.performHapticFeedback(4);
                break;
            case C1161hJ.STRING_FIELD_NUMBER /* 5 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                    break;
                }
                break;
            case C1161hJ.STRING_SET_FIELD_NUMBER /* 6 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                    break;
                }
                break;
            case C1161hJ.DOUBLE_FIELD_NUMBER /* 7 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
                }
                break;
        }
    }

    public C1590ns(C1183hf c1183hf, int i) {
        this.h = i;
        switch (i) {
            case 24:
                new C0950e6(c1183hf, "flutter/platform_views_2", C1367kT.h, 16).Q(new C1590ns(23, this));
                break;
            case 25:
                new C0950e6(c1183hf, "flutter/platform_views", C1367kT.h, 16).Q(new C1590ns(22, this));
                break;
            default:
                new C0950e6(c1183hf, "flutter/mousecursor", C1367kT.h, 16).Q(new C1590ns(13, this));
                break;
        }
    }

    public C1590ns(int i, byte b) {
        Object c0140Fh;
        Handler handler;
        this.h = i;
        switch (i) {
            case 17:
                this.i = new YD(new EE[16]);
                break;
            case 19:
                if (Build.VERSION.SDK_INT >= 28) {
                    c0140Fh = new C0218Ih(15);
                } else {
                    c0140Fh = new C0140Fh(16);
                }
                this.i = c0140Fh;
                break;
            case 21:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = Handler.createAsync(mainLooper);
                } else {
                    handler = new Handler(mainLooper);
                }
                this.i = handler;
                break;
            case 28:
                this.i = new C1219iB((Object) null);
                break;
            default:
                this.i = new SparseArray(10);
                break;
        }
    }

    public C1590ns(InterfaceC1412l8 interfaceC1412l8) {
        this.h = 6;
        new C0950e6(interfaceC1412l8, "flutter/keyboard", C1367kT.h, 16).Q(new C0208Hx(this));
    }

    public C1590ns(int i) {
        this.h = 2;
        this.i = AbstractC2219xO.r(new C0566Vs(i));
    }

    public C1590ns(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.h = 1;
        if (Build.VERSION.SDK_INT >= 25) {
            this.i = new C0488Ss(uri, clipDescription, uri2);
        } else {
            this.i = new C0950e6(uri, clipDescription, uri2, 12);
        }
    }
}
