package io.bidmachine.util;

import android.app.DownloadManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.hardware.SensorManager;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.ColorRes;
import androidx.annotation.RequiresPermission;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.V5;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000Ì\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010%\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u0002H\b\u0018\u00010\fH\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001H\u0007J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007J\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007J\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007J\u0018\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\"H\u0007J\u001c\u0010#\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007J\u0012\u0010$\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J3\u0010'\u001a\u0004\u0018\u0001H\b\"\n\b\u0000\u0010\b*\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0*H\u0007¢\u0006\u0002\u0010+J\u0012\u0010,\u001a\u00020\u00072\b\u0010-\u001a\u0004\u0018\u00010.H\u0007J\u0014\u0010/\u001a\u0004\u0018\u00010\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0007J\u0014\u00100\u001a\u0004\u0018\u00010\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0007J\u0012\u00101\u001a\u0004\u0018\u0001022\u0006\u0010 \u001a\u00020!H\u0007J\u0012\u00103\u001a\u0004\u0018\u0001042\u0006\u0010 \u001a\u00020!H\u0007J\u0012\u00105\u001a\u0004\u0018\u0001062\u0006\u0010 \u001a\u00020!H\u0007J\u001a\u00107\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\b\b\u0001\u00108\u001a\u00020\u001bH\u0007J\u0012\u00109\u001a\u0004\u0018\u00010:2\u0006\u0010 \u001a\u00020!H\u0007J\u0012\u0010;\u001a\u0004\u0018\u00010<2\u0006\u0010 \u001a\u00020!H\u0007J\u0012\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010 \u001a\u00020!H\u0007J\u0012\u0010?\u001a\u0004\u0018\u00010@2\u0006\u0010 \u001a\u00020!H\u0007J\u0012\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010 \u001a\u00020!H\u0007J\u0018\u0010C\u001a\u00020\"2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020EH\u0007J\u0012\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010 \u001a\u00020!H\u0007J\u0012\u0010I\u001a\u0004\u0018\u00010J2\u0006\u0010 \u001a\u00020!H\u0007J\u0012\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010 \u001a\u00020!H\u0007J\u0014\u0010M\u001a\u0004\u0018\u00010N2\b\u0010O\u001a\u0004\u0018\u00010\u0011H\u0007J\u0014\u0010P\u001a\u0004\u0018\u00010\u00112\b\u0010O\u001a\u0004\u0018\u00010\u0011H\u0007J\u0012\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010 \u001a\u00020!H\u0007J+\u0010S\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\b\u0010T\u001a\u0004\u0018\u0001H\b2\f\u0010U\u001a\b\u0012\u0004\u0012\u0002H\b0VH\u0007¢\u0006\u0002\u0010WJ\b\u0010X\u001a\u00020YH\u0007J\u0010\u0010Z\u001a\u00020Y2\u0006\u0010[\u001a\u00020\u0011H\u0007J\u001a\u0010\\\u001a\u00020Y2\u0006\u0010 \u001a\u00020!2\b\u0010]\u001a\u0004\u0018\u00010\u0011H\u0007J\u0012\u0010^\u001a\u00020Y2\b\u0010[\u001a\u0004\u0018\u00010\u0011H\u0007J\u001a\u0010_\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010`\u001a\u00020\u0011H\u0007J>\u0010a\u001a\u00020\u0007\"\u0004\b\u0000\u0010b\"\u0004\b\u0001\u0010c2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002Hb\u0012\u0004\u0012\u0002Hc0d2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002Hb\u0012\u0004\u0012\u0002Hc\u0018\u00010eH\u0007J>\u0010f\u001a\u00020\u0007\"\u0004\b\u0000\u0010b\"\u0004\b\u0001\u0010c2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002Hb\u0012\u0004\u0012\u0002Hc0d2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002Hb\u0012\u0004\u0012\u0002Hc\u0018\u00010eH\u0007J\u0018\u0010g\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\"H\u0007J\u0018\u0010g\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u001bH\u0007J\u0018\u0010g\u001a\u00020\u001b2\u0006\u0010h\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\"H\u0007J\u0018\u0010g\u001a\u00020\u001b2\u0006\u0010h\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u001bH\u0007J\u001a\u0010i\u001a\u0004\u0018\u00010\u00112\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020\u0011H\u0007J\u0018\u0010m\u001a\u00020n2\u0006\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020rH\u0007J\u0012\u0010s\u001a\u0004\u0018\u00010\u00112\u0006\u0010o\u001a\u00020pH\u0007J\"\u0010t\u001a\u0004\u0018\u00010u2\u0006\u0010v\u001a\u00020w2\u0006\u0010 \u001a\u00020!2\u0006\u0010x\u001a\u00020yH\u0007J\u001a\u0010z\u001a\u0004\u0018\u00010u2\u0006\u0010 \u001a\u00020!2\u0006\u0010x\u001a\u00020yH\u0007J,\u0010{\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u0002H\b\u0018\u00010\fH\u0007J>\u0010{\u001a\u00020\u0007\"\u0004\b\u0000\u0010b\"\u0004\b\u0001\u0010c2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002Hb\u0012\u0004\u0012\u0002Hc0d2\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002Hb\u0012\u0004\u0012\u0002Hc\u0018\u00010eH\u0007J=\u0010|\u001a\u00020\u0007\"\u0006\b\u0000\u0010\b\u0018\u00012\f\u0010}\u001a\b\u0012\u0004\u0012\u0002H\b0~2\u001c\u0010\u007f\u001a\u0018\u0012\u0004\u0012\u0002H\b\u0018\u00010\u0080\u0001j\u000b\u0012\u0004\u0012\u0002H\b\u0018\u0001`\u0081\u0001H\u0087\bJ\u0019\u0010\u0082\u0001\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\"H\u0007J(\u0010\u0083\u0001\u001a\u0004\u0018\u00010Y2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010YH\u0007¢\u0006\u0003\u0010\u0085\u0001J\u001b\u0010\u0086\u0001\u001a\u0004\u0018\u00010Y2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0003\u0010\u0087\u0001J\u0011\u0010\u0088\u0001\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J*\u0010\u0089\u0001\u001a\u0005\u0018\u00010\u008a\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\f\b\u0002\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u008a\u0001H\u0007¢\u0006\u0003\u0010\u008b\u0001J\u001c\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008a\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0003\u0010\u008d\u0001J(\u0010\u008e\u0001\u001a\u0004\u0018\u00010\"2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0003\u0010\u008f\u0001J\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010\"2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0003\u0010\u0091\u0001J\u0015\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007J(\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0003\u0010\u0094\u0001J\u001b\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0003\u0010\u0096\u0001J\u0017\u0010\u0097\u0001\u001a\u00030\u0098\u00012\u000b\u0010}\u001a\u0007\u0012\u0002\b\u00030\u0099\u0001H\u0007J\u001b\u0010\u009a\u0001\u001a\u00030\u009b\u00012\u000f\u0010\u009c\u0001\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030eH\u0007J\u001a\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010\u0099\u00012\b\u0010\u009e\u0001\u001a\u00030\u0098\u0001H\u0007J(\u0010\u009f\u0001\u001a\u0004\u0018\u00010n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010nH\u0007¢\u0006\u0003\u0010 \u0001J\u001b\u0010¡\u0001\u001a\u0004\u0018\u00010n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0003\u0010¢\u0001J\u001f\u0010£\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010e2\b\u0010¤\u0001\u001a\u00030\u009b\u0001H\u0007J\u0015\u0010¥\u0001\u001a\u0004\u0018\u00010\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007J\"\u0010¦\u0001\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u000b\b\u0002\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0011H\u0007J\u0015\u0010§\u0001\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0007J\u0011\u0010¨\u0001\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\"\u0010©\u0001\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0007\u0010ª\u0001\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\"H\u0007J$\u0010«\u0001\u001a\u00020n2\u0006\u0010o\u001a\u00020p2\u0006\u0010%\u001a\u00020&2\t\b\u0002\u0010¬\u0001\u001a\u00020\u001bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u00ad\u0001"}, d2 = {"Lio/bidmachine/util/Utils;", "", "()V", "HEX_ARRAY", "", "UPPER_HEX_ARRAY", "addAll", "", "T", "to", "", "from", "", "applyMD5", "", "bytes", "capitalize", "", "value", "closeSafely", "closeable", "Ljava/io/Closeable;", "createHandlerWithMyOrMainLooper", "Landroid/os/Handler;", "createHexHashCode", "decodeBase64", "flags", "", "base64", "decodeBase64ToString", "data", "dpToPx", "context", "Landroid/content/Context;", "", "encodeToStringBase64", "finalize", "outputStream", "Ljava/io/OutputStream;", "find", "Lio/bidmachine/util/KeyHolder;", "key", "", "(Ljava/lang/String;[Lio/bidmachine/util/KeyHolder;)Lio/bidmachine/util/KeyHolder;", "flushSafely", "flushable", "Ljava/io/Flushable;", "fromJsonElementToObjectOrNull", "fromObjectToJsonElementOrNull", "getAudioManager", "Landroid/media/AudioManager;", "getBluetoothManager", "Landroid/bluetooth/BluetoothManager;", "getClipboardManager", "Landroid/content/ClipboardManager;", "getColorCompat", "id", "getConnectivityManager", "Landroid/net/ConnectivityManager;", "getDownloadManager", "Landroid/app/DownloadManager;", "getInputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "getLocation", "Landroid/location/Location;", "getLocationManager", "Landroid/location/LocationManager;", "getNotOverlappedAreaPercent", "mainRect", "Landroid/graphics/Rect;", "coverRect", "getPowerManager", "Landroid/os/PowerManager;", "getSensorManager", "Landroid/hardware/SensorManager;", "getTelephonyManager", "Landroid/telephony/TelephonyManager;", "getValidUri", "Landroid/net/Uri;", "urlString", "getValidUrl", "getWindowManager", "Landroid/view/WindowManager;", "ifNotNull", "obj", "action", "Lio/bidmachine/util/Executable;", "(Ljava/lang/Object;Lio/bidmachine/util/Executable;)V", "isExternalMemoryAvailable", "", "isHttpUrl", "url", "isPermissionGranted", "permission", "isUrlValid", "notEmptyOrDefault", "defaultValue", "putAll", "K", "V", "", "", "putAllIfNotEmpty", "pxToDp", "density", "readAssetFile", "assetManager", "Landroid/content/res/AssetManager;", V5.c.b, "readIntoFile", "", "inputStream", "Ljava/io/InputStream;", "file", "Ljava/io/File;", "readSafely", "registerBroadcastReceiver", "Landroid/content/Intent;", "receiver", "Landroid/content/BroadcastReceiver;", "intentFilter", "Landroid/content/IntentFilter;", "registerSystemReceiver", "set", "sort", "list", "Ljava/util/concurrent/CopyOnWriteArrayList;", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "spToPx", "toBooleanOrDefault", "fallback", "(Ljava/lang/Object;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "toBooleanOrNull", "(Ljava/lang/Object;)Ljava/lang/Boolean;", "toCamelCase", "toDoubleOrDefault", "", "(Ljava/lang/Object;Ljava/lang/Double;)Ljava/lang/Double;", "toDoubleOrNull", "(Ljava/lang/Object;)Ljava/lang/Double;", "toFloatOrDefault", "(Ljava/lang/Object;Ljava/lang/Float;)Ljava/lang/Float;", "toFloatOrNull", "(Ljava/lang/Object;)Ljava/lang/Float;", "toHexString", "toIntOrDefault", "(Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/Integer;", "toIntOrNull", "(Ljava/lang/Object;)Ljava/lang/Integer;", "toJsonArray", "Lorg/json/JSONArray;", "", "toJsonObject", "Lorg/json/JSONObject;", "map", "toList", "jsonArray", "toLongOrDefault", "(Ljava/lang/Object;Ljava/lang/Long;)Ljava/lang/Long;", "toLongOrNull", "(Ljava/lang/Object;)Ljava/lang/Long;", "toMap", "jsonObject", "toSignatureHexString", "toStringOrDefault", "toStringOrNull", "toUnderScore", "unitToPx", "unit", "write", "bufferSize", "bidmachine-android-sdk_bd_3_7_1"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class Utils {

    @NotNull
    private static final char[] HEX_ARRAY;

    @NotNull
    public static final Utils INSTANCE = new Utils();

    @NotNull
    private static final char[] UPPER_HEX_ARRAY;

    @Nullable
    public static final byte[] decodeBase64(@NotNull String base64) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        return decodeBase64$default(base64, 0, 2, (Object) null);
    }

    @Nullable
    public static final byte[] decodeBase64(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return decodeBase64$default(bytes, 0, 2, (Object) null);
    }

    @Nullable
    public static final String decodeBase64ToString(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return decodeBase64ToString$default(data, 0, 2, (Object) null);
    }

    @Nullable
    public static final String decodeBase64ToString(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return decodeBase64ToString$default(bytes, 0, 2, (Object) null);
    }

    @Nullable
    public static final String encodeToStringBase64(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return encodeToStringBase64$default(bytes, 0, 2, null);
    }

    public static final int pxToDp(float density, int value) {
        return (int) ((value / density) + 0.5f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> void sort(CopyOnWriteArrayList<T> list, Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.reifiedOperationMarker(0, "T?");
        Object[] array = list.toArray(new Object[0]);
        Arrays.sort(array, comparator);
        int length = array.length;
        for (int i = 0; i < length; i++) {
            list.set(i, array[i]);
        }
    }

    private Utils() {
    }

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        HEX_ARRAY = charArray;
        char[] charArray2 = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray2, "this as java.lang.String).toCharArray()");
        UPPER_HEX_ARRAY = charArray2;
    }

    public static final boolean isPermissionGranted(@NotNull Context context, @Nullable String permission) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.isPermissionGranted(context, permission);
    }

    public static final boolean isExternalMemoryAvailable() {
        return Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted");
    }

    @Nullable
    public static final byte[] applyMD5(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return UtilsKt.applyMD5(bytes);
    }

    @Nullable
    public static final String toStringOrNull(@Nullable Object value) {
        return toStringOrDefault(value, null);
    }

    @Nullable
    public static final String toStringOrDefault(@Nullable Object value, @Nullable String fallback) {
        return UtilsKt.toStringOrDefault(value, fallback);
    }

    public static /* synthetic */ String toStringOrDefault$default(Object obj, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        return toStringOrDefault(obj, str);
    }

    @Nullable
    public static final Boolean toBooleanOrNull(@Nullable Object value) {
        return toBooleanOrDefault(value, null);
    }

    @Nullable
    public static final Boolean toBooleanOrDefault(@Nullable Object value, @Nullable Boolean fallback) {
        return UtilsKt.toBooleanOrDefault(value, fallback);
    }

    public static /* synthetic */ Boolean toBooleanOrDefault$default(Object obj, Boolean bool, int i, Object obj2) {
        if ((i & 2) != 0) {
            bool = null;
        }
        return toBooleanOrDefault(obj, bool);
    }

    @Nullable
    public static final Integer toIntOrNull(@Nullable Object value) {
        return toIntOrDefault(value, null);
    }

    @Nullable
    public static final Integer toIntOrDefault(@Nullable Object value, @Nullable Integer fallback) {
        return UtilsKt.toIntOrDefault(value, fallback);
    }

    public static /* synthetic */ Integer toIntOrDefault$default(Object obj, Integer num, int i, Object obj2) {
        if ((i & 2) != 0) {
            num = null;
        }
        return toIntOrDefault(obj, num);
    }

    @Nullable
    public static final Long toLongOrNull(@Nullable Object value) {
        return toLongOrDefault(value, null);
    }

    @Nullable
    public static final Long toLongOrDefault(@Nullable Object value, @Nullable Long fallback) {
        return UtilsKt.toLongOrDefault(value, fallback);
    }

    public static /* synthetic */ Long toLongOrDefault$default(Object obj, Long l, int i, Object obj2) {
        if ((i & 2) != 0) {
            l = null;
        }
        return toLongOrDefault(obj, l);
    }

    @Nullable
    public static final Float toFloatOrNull(@Nullable Object value) {
        return toFloatOrDefault(value, null);
    }

    @Nullable
    public static final Float toFloatOrDefault(@Nullable Object value, @Nullable Float fallback) {
        return UtilsKt.toFloatOrDefault(value, fallback);
    }

    public static /* synthetic */ Float toFloatOrDefault$default(Object obj, Float f, int i, Object obj2) {
        if ((i & 2) != 0) {
            f = null;
        }
        return toFloatOrDefault(obj, f);
    }

    @Nullable
    public static final Double toDoubleOrNull(@Nullable Object value) {
        return toDoubleOrDefault(value, null);
    }

    @Nullable
    public static final Double toDoubleOrDefault(@Nullable Object value, @Nullable Double fallback) {
        return UtilsKt.toDoubleOrDefault(value, fallback);
    }

    public static /* synthetic */ Double toDoubleOrDefault$default(Object obj, Double d, int i, Object obj2) {
        if ((i & 2) != 0) {
            d = null;
        }
        return toDoubleOrDefault(obj, d);
    }

    @NotNull
    public static final List<Object> toList(@NotNull JSONArray jsonArray) {
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        return UtilsKt.toList(jsonArray);
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        return UtilsKt.toMap(jsonObject);
    }

    @Nullable
    public static final Object fromJsonElementToObjectOrNull(@Nullable Object value) {
        if (value != null && !Intrinsics.areEqual(value, JSONObject.NULL)) {
            if (value instanceof JSONObject) {
                return UtilsKt.toMap((JSONObject) value);
            }
            return value instanceof JSONArray ? UtilsKt.toList((JSONArray) value) : value;
        }
        return null;
    }

    @NotNull
    public static final JSONArray toJsonArray(@NotNull List<?> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return UtilsKt.toJsonArray(list);
    }

    @NotNull
    public static final JSONObject toJsonObject(@NotNull Map<?, ?> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return UtilsKt.toJsonObject(map);
    }

    @Nullable
    public static final Object fromObjectToJsonElementOrNull(@Nullable Object value) {
        if (value == null) {
            return null;
        }
        if (value instanceof List) {
            return UtilsKt.toJsonArray((List) value);
        }
        return value instanceof Map ? UtilsKt.toJsonObject((Map) value) : value;
    }

    public static final <T> void set(@NotNull Collection<T> to, @Nullable Collection<? extends T> from) {
        Intrinsics.checkNotNullParameter(to, "to");
        UtilsKt.setSafely(to, from);
    }

    public static final <T> void addAll(@NotNull Collection<T> to, @Nullable Collection<? extends T> from) {
        Intrinsics.checkNotNullParameter(to, "to");
        UtilsKt.addAllSafely(to, from);
    }

    public static final <K, V> void set(@NotNull Map<K, V> to, @Nullable Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(to, "to");
        UtilsKt.setSafely(to, from);
    }

    public static final <K, V> void putAll(@NotNull Map<K, V> to, @Nullable Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(to, "to");
        UtilsKt.putAllSafely(to, from);
    }

    public static final <K, V> void putAllIfNotEmpty(@NotNull Map<K, V> to, @Nullable Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(to, "to");
        UtilsKt.putAllIfNotEmpty(to, from);
    }

    @NotNull
    public static final String capitalize(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb = new StringBuilder();
        String substring = value.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String upperCase = substring.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        sb.append(upperCase);
        String substring2 = value.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
        String lowerCase = substring2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        return sb.toString();
    }

    @NotNull
    public static final String toUnderScore(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return UtilsKt.toUnderScore(value);
    }

    @NotNull
    public static final String toCamelCase(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return UtilsKt.toCamelCase(value);
    }

    @Nullable
    public static final <T extends KeyHolder> T find(@Nullable String key, @NotNull T[] from) {
        Intrinsics.checkNotNullParameter(from, "from");
        return (T) UtilsKt.find(from, key);
    }

    @Nullable
    public static final String readSafely(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        return UtilsKt.readSafely(inputStream);
    }

    public static /* synthetic */ long write$default(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) throws IOException {
        if ((i2 & 4) != 0) {
            i = 1024;
        }
        return write(inputStream, outputStream, i);
    }

    public static final long write(@NotNull InputStream inputStream, @NotNull OutputStream outputStream, int bufferSize) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        byte[] bArr = new byte[bufferSize];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    public static final long readIntoFile(@NotNull InputStream inputStream, @NotNull File file) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(file, "file");
        return UtilsKt.readIntoFile(inputStream, file);
    }

    public static final void closeSafely(@Nullable Closeable closeable) {
        UtilsKt.closeSafely(closeable);
    }

    public static final void flushSafely(@Nullable Flushable flushable) {
        UtilsKt.flushSafely(flushable);
    }

    public static final void finalize(@Nullable OutputStream outputStream) {
        UtilsKt.finalize(outputStream);
    }

    @NotNull
    public static final Handler createHandlerWithMyOrMainLooper() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return new Handler(myLooper);
    }

    public static final boolean isHttpUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return UtilsKt.isHttpUrl(url);
    }

    public static final boolean isUrlValid(@Nullable String url) {
        Boolean bool;
        if (url == null || url.length() == 0) {
            return false;
        }
        try {
            new URL(url);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    @Nullable
    public static final String getValidUrl(@Nullable String urlString) {
        if (urlString == null || urlString.length() == 0) {
            return null;
        }
        if (isUrlValid(urlString)) {
            return urlString;
        }
        try {
            return URLDecoder.decode(urlString, "UTF-8");
        } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            return urlString;
        }
    }

    @Nullable
    public static final Uri getValidUri(@Nullable String urlString) {
        try {
            return Uri.parse(getValidUrl(urlString));
        } catch (Throwable unused) {
            return null;
        }
    }

    @RequiresPermission
    @Nullable
    public static final Location getLocation(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.getLocation(context);
    }

    @Nullable
    public static final ConnectivityManager getConnectivityManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.getConnectivityManager(context);
    }

    @Nullable
    public static final WindowManager getWindowManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.getWindowManager(context);
    }

    @Nullable
    public static final InputMethodManager getInputMethodManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.getInputMethodManager(context);
    }

    @Nullable
    public static final AudioManager getAudioManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.getAudioManager(context);
    }

    @Nullable
    public static final PowerManager getPowerManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.getPowerManager(context);
    }

    @Nullable
    public static final TelephonyManager getTelephonyManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.getTelephonyManager(context);
    }

    @Nullable
    public static final LocationManager getLocationManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.getLocationManager(context);
    }

    @Nullable
    public static final BluetoothManager getBluetoothManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.getBluetoothManager(context);
    }

    @Nullable
    public static final DownloadManager getDownloadManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.getDownloadManager(context);
    }

    @Nullable
    public static final ClipboardManager getClipboardManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.getClipboardManager(context);
    }

    @Nullable
    public static final SensorManager getSensorManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.getSensorManager(context);
    }

    public static final float getNotOverlappedAreaPercent(@NotNull Rect mainRect, @NotNull Rect coverRect) {
        Intrinsics.checkNotNullParameter(mainRect, "mainRect");
        Intrinsics.checkNotNullParameter(coverRect, "coverRect");
        int width = mainRect.width() * mainRect.height();
        if (width == 0) {
            return 0.0f;
        }
        return (width - (Math.max(0, Math.min(mainRect.right, coverRect.right) - Math.max(mainRect.left, coverRect.left)) * Math.max(0, Math.min(mainRect.bottom, coverRect.bottom) - Math.max(mainRect.top, coverRect.top)))) / width;
    }

    public static final int unitToPx(@NotNull Context context, int unit, float value) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.unitToPx(context, unit, value);
    }

    public static final int spToPx(@NotNull Context context, float value) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.spToPx(context, value);
    }

    public static final int dpToPx(@NotNull Context context, float value) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.dpToPx(context, value);
    }

    public static final int pxToDp(@NotNull Context context, float value) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.pxToDp(context, value);
    }

    public static final int pxToDp(@NotNull Context context, int value) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.pxToDp(context, value);
    }

    public static final int pxToDp(float density, float value) {
        return pxToDp(density, (int) value);
    }

    public static final int getColorCompat(@NotNull Context context, @ColorRes int id) {
        Intrinsics.checkNotNullParameter(context, "context");
        return UtilsKt.getColorCompat(context, id);
    }

    @Nullable
    public static final Intent registerSystemReceiver(@NotNull Context context, @NotNull IntentFilter intentFilter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intentFilter, "intentFilter");
        return UtilsKt.registerSystemReceiver(context, intentFilter);
    }

    @Nullable
    public static final Intent registerBroadcastReceiver(@NotNull BroadcastReceiver receiver, @NotNull Context context, @NotNull IntentFilter intentFilter) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intentFilter, "intentFilter");
        return UtilsKt.registerBroadcastReceiver(context, receiver, intentFilter);
    }

    @NotNull
    public static final String createHexHashCode(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return UtilsKt.createHexHashCode(value);
    }

    @Nullable
    public static final String toHexString(@Nullable byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        if (bytes.length == 0) {
            return "";
        }
        char[] cArr = new char[bytes.length * 2];
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            byte b = bytes[i];
            int i2 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i3 = i * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    @Nullable
    public static final String toSignatureHexString(@Nullable byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        if (bytes.length == 0) {
            return "";
        }
        char[] cArr = new char[(bytes.length * 3) - 1];
        int length = bytes.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            byte b = bytes[i2];
            int i3 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            char[] cArr2 = UPPER_HEX_ARRAY;
            cArr[i] = cArr2[i3 >>> 4];
            int i4 = i + 2;
            cArr[i + 1] = cArr2[b & 15];
            if (i2 < bytes.length - 1) {
                i += 3;
                cArr[i4] = ':';
            } else {
                i = i4;
            }
        }
        return new String(cArr);
    }

    public static final <T> void ifNotNull(@Nullable T obj, @NotNull Executable<T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (obj != null) {
            action.execute(obj);
        }
    }

    @NotNull
    public static final String notEmptyOrDefault(@Nullable String value, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return UtilsKt.notEmptyOrDefault(value, defaultValue);
    }

    @Nullable
    public static final String readAssetFile(@NotNull AssetManager assetManager, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(assetManager, "assetManager");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return UtilsKt.readAssetFile(assetManager, fileName);
    }

    @Nullable
    public static final byte[] decodeBase64(@NotNull String base64, int flags) {
        Intrinsics.checkNotNullParameter(base64, "base64");
        return UtilsKt.decodeBase64(base64, flags);
    }

    public static /* synthetic */ byte[] decodeBase64$default(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return decodeBase64(str, i);
    }

    @Nullable
    public static final String encodeToStringBase64(@NotNull byte[] bytes, int flags) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return UtilsKt.encodeToStringBase64(bytes, flags);
    }

    public static /* synthetic */ String encodeToStringBase64$default(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return encodeToStringBase64(bArr, i);
    }

    @Nullable
    public static final byte[] decodeBase64(@NotNull byte[] bytes, int flags) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return UtilsKt.decodeBase64(bytes, flags);
    }

    public static /* synthetic */ byte[] decodeBase64$default(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return decodeBase64(bArr, i);
    }

    @Nullable
    public static final String decodeBase64ToString(@NotNull byte[] bytes, int flags) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return UtilsKt.decodeBase64ToString(bytes, flags);
    }

    public static /* synthetic */ String decodeBase64ToString$default(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return decodeBase64ToString(bArr, i);
    }

    @Nullable
    public static final String decodeBase64ToString(@NotNull String data, int flags) {
        Intrinsics.checkNotNullParameter(data, "data");
        return UtilsKt.decodeBase64ToString(data, flags);
    }

    public static /* synthetic */ String decodeBase64ToString$default(String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return decodeBase64ToString(str, i);
    }
}
