package io.flutter.plugin.platform;

import D.AbstractActivityC0005f;
import D.AbstractC0009j;
import D.C0018t;
import D.P;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import n.AbstractC0077d;
import n.InterfaceC0079f;

/* loaded from: classes.dex */
public final class c implements InterfaceC0079f, n0.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f641b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f642c;

    public /* synthetic */ c(int i2, Object obj) {
        this.f641b = i2;
        this.f642c = obj;
    }

    @Override // n.InterfaceC0079f
    public void a(int i2, Serializable serializable) {
        String str;
        switch (i2) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i2 == 6 || i2 == 7 || i2 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f642c).setResultCode(i2);
    }

    @Override // n0.d
    public Object b(Object obj, Y.b bVar) {
        ((C0018t) this.f642c).accept(obj);
        return U.g.f378a;
    }

    @Override // n.InterfaceC0079f
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void d(int i2) {
        k kVar = (k) this.f642c;
        if (kVar.h(i2)) {
            ((q) kVar.f673j.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Clearing focus on a null view with id: " + i2);
            return;
        }
        if (kVar.f675l.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Clearing focus on an unknown view with id: " + i2);
    }

    public void e(M.h hVar) {
        k kVar = (k) this.f642c;
        kVar.getClass();
        k.a(kVar, hVar);
        if (kVar.f668e.IsSurfaceControlEnabled()) {
            throw new IllegalStateException("Trying to create a Hybrid Composition view with HC++ enabled.");
        }
        HashMap hashMap = kVar.f665b.f195a;
        String str = hVar.f287b;
        if (hashMap.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
    }

    public long f(M.h hVar) {
        k kVar = (k) this.f642c;
        k.a(kVar, hVar);
        SparseArray sparseArray = kVar.f678o;
        int i2 = hVar.f286a;
        if (sparseArray.get(i2) != null) {
            throw new IllegalStateException("Trying to create an already created platform view, view id: " + i2);
        }
        if (kVar.f669f == null) {
            throw new IllegalStateException("Texture registry is null. This means that platform views controller was detached, view id: " + i2);
        }
        if (kVar.f667d == null) {
            throw new IllegalStateException("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: " + i2);
        }
        HashMap hashMap = kVar.f665b.f195a;
        String str = hVar.f287b;
        if (hashMap.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
    }

    public void g(int i2) {
        switch (this.f641b) {
            case 1:
                AbstractC0009j.f(((k) this.f642c).f675l.get(i2));
                Log.e("PlatformViewsController", "Disposing unknown platform view with id: " + i2);
                break;
            default:
                AbstractC0009j.f(((j) this.f642c).f658h.get(i2));
                Log.e("PlatformViewsController2", "Disposing unknown platform view with id: " + i2);
                break;
        }
    }

    public CharSequence h(M.e eVar) {
        AbstractActivityC0005f abstractActivityC0005f = ((f) this.f642c).f647a;
        ClipboardManager clipboardManager = (ClipboardManager) abstractActivityC0005f.getSystemService("clipboard");
        CharSequence charSequence = null;
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (eVar != null && eVar != M.e.f272c) {
                    return null;
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
                    } else {
                        String scheme = uri.getScheme();
                        if (scheme.equals("content")) {
                            AssetFileDescriptor openTypedAssetFileDescriptor = abstractActivityC0005f.getContentResolver().openTypedAssetFileDescriptor(uri, "text/*", null);
                            CharSequence coerceToText = itemAt.coerceToText(abstractActivityC0005f);
                            if (openTypedAssetFileDescriptor != null) {
                                try {
                                    openTypedAssetFileDescriptor.close();
                                } catch (IOException e2) {
                                    charSequence = coerceToText;
                                    e = e2;
                                    Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", e);
                                    return charSequence;
                                }
                            }
                            charSequence = coerceToText;
                        } else {
                            Log.w("PlatformPlugin", "Clipboard item contains a Uri with scheme '" + scheme + "'that is unhandled.");
                        }
                    }
                    return charSequence;
                } catch (IOException e3) {
                    e = e3;
                    charSequence = text;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (FileNotFoundException unused) {
            Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
            return null;
        } catch (SecurityException e5) {
            Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e5);
            return null;
        }
    }

    public void i(int i2, double d2, double d3) {
        k kVar = (k) this.f642c;
        if (kVar.h(i2)) {
            return;
        }
        Log.e("PlatformViewsController", "Setting offset for unknown platform view with id: " + i2);
    }

    public void j(M.i iVar) {
        PriorityQueue priorityQueue;
        LongSparseArray longSparseArray;
        long j2;
        k kVar = (k) this.f642c;
        float f2 = kVar.f666c.getResources().getDisplayMetrics().density;
        int i2 = iVar.f289a;
        if (!kVar.h(i2)) {
            if (kVar.f675l.get(i2) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Sending touch to an unknown view with id: " + i2);
            return;
        }
        q qVar = (q) kVar.f673j.get(Integer.valueOf(i2));
        P p2 = new P(iVar.f304p);
        while (true) {
            B.a aVar = kVar.u;
            priorityQueue = (PriorityQueue) aVar.f4d;
            boolean isEmpty = priorityQueue.isEmpty();
            longSparseArray = (LongSparseArray) aVar.f3c;
            j2 = p2.f50a;
            if (isEmpty || ((Long) priorityQueue.peek()).longValue() >= j2) {
                break;
            } else {
                longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
            }
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j2) {
            priorityQueue.poll();
        }
        longSparseArray.remove(j2);
        List<List> list = (List) iVar.f295g;
        ArrayList arrayList = new ArrayList();
        for (List list2 : list) {
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            pointerCoords.orientation = (float) ((Double) list2.get(0)).doubleValue();
            pointerCoords.pressure = (float) ((Double) list2.get(1)).doubleValue();
            pointerCoords.size = (float) ((Double) list2.get(2)).doubleValue();
            double d2 = f2;
            pointerCoords.toolMajor = (float) (((Double) list2.get(3)).doubleValue() * d2);
            pointerCoords.toolMinor = (float) (((Double) list2.get(4)).doubleValue() * d2);
            pointerCoords.touchMajor = (float) (((Double) list2.get(5)).doubleValue() * d2);
            pointerCoords.touchMinor = (float) (((Double) list2.get(6)).doubleValue() * d2);
            pointerCoords.x = (float) (((Double) list2.get(7)).doubleValue() * d2);
            pointerCoords.y = (float) (((Double) list2.get(8)).doubleValue() * d2);
            arrayList.add(pointerCoords);
        }
        int i3 = iVar.f293e;
        MotionEvent.PointerCoords[] pointerCoordsArr = (MotionEvent.PointerCoords[]) arrayList.toArray(new MotionEvent.PointerCoords[i3]);
        List<List> list3 = (List) iVar.f294f;
        ArrayList arrayList2 = new ArrayList();
        for (List list4 : list3) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            pointerProperties.id = ((Integer) list4.get(0)).intValue();
            pointerProperties.toolType = ((Integer) list4.get(1)).intValue();
            arrayList2.add(pointerProperties);
        }
        MotionEvent.obtain(iVar.f290b.longValue(), iVar.f291c.longValue(), iVar.f292d, iVar.f293e, (MotionEvent.PointerProperties[]) arrayList2.toArray(new MotionEvent.PointerProperties[i3]), pointerCoordsArr, iVar.f296h, iVar.f297i, iVar.f298j, iVar.f299k, iVar.f300l, iVar.f301m, iVar.f302n, iVar.f303o);
        qVar.getClass();
    }

    public void k(M.j jVar, E.j jVar2) {
        k kVar = (k) this.f642c;
        int i2 = kVar.i(jVar.f306b);
        int i3 = kVar.i(jVar.f307c);
        int i4 = jVar.f305a;
        if (!kVar.h(i4)) {
            if (kVar.f675l.get(i4) != null) {
                throw new ClassCastException();
            }
            Log.e("PlatformViewsController", "Resizing unknown platform view with id: " + i4);
            return;
        }
        float f2 = kVar.f666c.getResources().getDisplayMetrics().density;
        q qVar = (q) kVar.f673j.get(Integer.valueOf(i4));
        io.flutter.plugin.editing.l lVar = kVar.f670g;
        if (lVar != null) {
            if (lVar.f627e.f621a == 3) {
                lVar.f638p = true;
            }
            qVar.getClass();
        }
        qVar.getClass();
        if (i2 == 0 && i3 == 0) {
            throw null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw null;
        }
        throw null;
    }

    public void l(int i2, int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalStateException("Trying to set unknown direction value: " + i3 + "(view id: " + i2 + ")");
        }
        k kVar = (k) this.f642c;
        if (kVar.h(i2)) {
            ((q) kVar.f673j.get(Integer.valueOf(i2))).getClass();
            Log.e("PlatformViewsController", "Setting direction to a null view with id: " + i2);
            return;
        }
        if (kVar.f675l.get(i2) != null) {
            throw new ClassCastException();
        }
        Log.e("PlatformViewsController", "Setting direction to an unknown view with id: " + i2);
    }

    public void m(ArrayList arrayList) {
        f fVar = (f) this.f642c;
        fVar.getClass();
        int i2 = arrayList.isEmpty() ? 5894 : 1798;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            int ordinal = ((M.g) arrayList.get(i3)).ordinal();
            if (ordinal == 0) {
                i2 &= -5;
            } else if (ordinal == 1) {
                i2 &= -515;
            }
        }
        fVar.f651e = i2;
        fVar.b();
    }

    public void n(int i2) {
        View decorView = ((f) this.f642c).f647a.getWindow().getDecorView();
        switch (AbstractC0077d.a(i2)) {
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
            case 5:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(16);
                    break;
                }
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(3);
                    break;
                }
                break;
            case 7:
                if (Build.VERSION.SDK_INT >= 30) {
                    decorView.performHapticFeedback(17);
                    break;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f641b) {
            case 4:
                return "<" + ((String) this.f642c) + '>';
            default:
                return super.toString();
        }
    }
}
