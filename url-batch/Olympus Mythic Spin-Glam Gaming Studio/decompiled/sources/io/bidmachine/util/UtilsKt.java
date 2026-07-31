package io.bidmachine.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.DownloadManager;
import android.app.UiModeManager;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.hardware.SensorManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.ColorRes;
import androidx.annotation.RequiresPermission;
import com.ironsource.T3;
import com.ironsource.V5;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.d;
import com.safedk.android.internal.partials.BidMachineFilesBridge;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.bidmachine.util.conversion.BooleanTypeConversion;
import io.bidmachine.util.conversion.DoubleTypeConversion;
import io.bidmachine.util.conversion.FloatTypeConversion;
import io.bidmachine.util.conversion.IntTypeConversion;
import io.bidmachine.util.conversion.LongTypeConversion;
import io.bidmachine.util.conversion.StringTypeConversion;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0094\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0010\u001f\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0004\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\r\u001a\u0004\u0018\u00010\u0003*\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001c*\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t0 *\u00020\u001f¢\u0006\u0004\b!\u0010\"\u001a\u0015\u0010#\u001a\u00020\u001b*\u0006\u0012\u0002\b\u00030\u001c¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010%\u001a\u00020\u001f*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030 ¢\u0006\u0004\b%\u0010&\u001a-\u0010,\u001a\u00020+\"\u0004\b\u0000\u0010'*\b\u0012\u0004\u0012\u00028\u00000(2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010)¢\u0006\u0004\b,\u0010-\u001a-\u0010.\u001a\u00020+\"\u0004\b\u0000\u0010'*\b\u0012\u0004\u0012\u00028\u00000(2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010)¢\u0006\u0004\b.\u0010-\u001a9\u00101\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010'*\b\u0012\u0004\u0012\u00028\u00000(2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030/H\u0086\bø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a?\u0010,\u001a\u00020+\"\u0004\b\u0000\u00103\"\u0004\b\u0001\u00104*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001052\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010 ¢\u0006\u0004\b,\u00106\u001a?\u00107\u001a\u00020+\"\u0004\b\u0000\u00103\"\u0004\b\u0001\u00104*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001052\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010 ¢\u0006\u0004\b7\u00106\u001a?\u00108\u001a\u00020+\"\u0004\b\u0000\u00103\"\u0004\b\u0001\u00104*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001052\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010 ¢\u0006\u0004\b8\u00106\u001a\u0011\u00109\u001a\u00020\u0001*\u00020\u0001¢\u0006\u0004\b9\u0010:\u001a\u0011\u0010;\u001a\u00020\u0001*\u00020\u0001¢\u0006\u0004\b;\u0010:\u001a\u0011\u0010<\u001a\u00020\u0003*\u00020\u0001¢\u0006\u0004\b<\u0010=\u001a/\u0010A\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010'*\u0004\u0018\u00010>*\b\u0012\u0004\u0012\u00028\u00000?2\b\u0010@\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bA\u0010B\u001a\u0013\u0010D\u001a\u0004\u0018\u00010\u0001*\u00020C¢\u0006\u0004\bD\u0010E\u001a\u0019\u0010H\u001a\u00020\u0012*\u00020C2\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010I\u001a\u0013\u0010K\u001a\u00020+*\u0004\u0018\u00010J¢\u0006\u0004\bK\u0010L\u001a\u0013\u0010N\u001a\u00020+*\u0004\u0018\u00010M¢\u0006\u0004\bN\u0010O\u001a\u0013\u0010Q\u001a\u00020+*\u0004\u0018\u00010P¢\u0006\u0004\bQ\u0010R\u001a\u0015\u0010T\u001a\u0004\u0018\u00010S*\u00020\u0000H\u0007¢\u0006\u0004\bT\u0010U\u001a\u0013\u0010W\u001a\u0004\u0018\u00010V*\u00020\u0000¢\u0006\u0004\bW\u0010X\u001a\u0013\u0010Z\u001a\u0004\u0018\u00010Y*\u00020\u0000¢\u0006\u0004\bZ\u0010[\u001a\u0013\u0010]\u001a\u0004\u0018\u00010\\*\u00020\u0000¢\u0006\u0004\b]\u0010^\u001a\u0013\u0010`\u001a\u0004\u0018\u00010_*\u00020\u0000¢\u0006\u0004\b`\u0010a\u001a\u0013\u0010c\u001a\u0004\u0018\u00010b*\u00020\u0000¢\u0006\u0004\bc\u0010d\u001a\u0013\u0010f\u001a\u0004\u0018\u00010e*\u00020\u0000¢\u0006\u0004\bf\u0010g\u001a\u0013\u0010i\u001a\u0004\u0018\u00010h*\u00020\u0000¢\u0006\u0004\bi\u0010j\u001a\u0013\u0010l\u001a\u0004\u0018\u00010k*\u00020\u0000¢\u0006\u0004\bl\u0010m\u001a\u0013\u0010o\u001a\u0004\u0018\u00010n*\u00020\u0000¢\u0006\u0004\bo\u0010p\u001a\u0013\u0010r\u001a\u0004\u0018\u00010q*\u00020\u0000¢\u0006\u0004\br\u0010s\u001a\u0013\u0010u\u001a\u0004\u0018\u00010t*\u00020\u0000¢\u0006\u0004\bu\u0010v\u001a\u0013\u0010x\u001a\u0004\u0018\u00010w*\u00020\u0000¢\u0006\u0004\bx\u0010y\u001a\u0013\u0010{\u001a\u0004\u0018\u00010z*\u00020\u0000¢\u0006\u0004\b{\u0010|\u001a&\u0010~\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010'\u0018\u0001*\u00020\u00002\u0006\u0010}\u001a\u00020\u0001H\u0082\b¢\u0006\u0004\b~\u0010\u007f\u001a&\u0010\u0082\u0001\u001a\u00020\u000f*\u00020\u00002\u0007\u0010\u0080\u0001\u001a\u00020\u000f2\u0007\u0010\u0081\u0001\u001a\u00020\u0015¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u001d\u0010\u0084\u0001\u001a\u00020\u000f*\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020\u0015¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u001d\u0010\u0086\u0001\u001a\u00020\u000f*\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020\u0015¢\u0006\u0006\b\u0086\u0001\u0010\u0085\u0001\u001a\u001d\u0010\u0087\u0001\u001a\u00020\u000f*\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020\u0015¢\u0006\u0006\b\u0087\u0001\u0010\u0085\u0001\u001a\u001d\u0010\u0087\u0001\u001a\u00020\u000f*\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u00020\u000f¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u001f\u0010\u008a\u0001\u001a\u00020\u000f*\u00020\u00002\t\b\u0001\u0010\u0089\u0001\u001a\u00020\u000f¢\u0006\u0006\b\u008a\u0001\u0010\u0088\u0001\u001a!\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008d\u0001*\u00020\u00002\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a-\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008d\u0001*\u00020\u00002\b\u0010\u0091\u0001\u001a\u00030\u0090\u00012\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0007¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a#\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u0001*\u00030\u0094\u00012\t\b\u0002\u0010\u0095\u0001\u001a\u00020\u000f¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0014\u0010\u0099\u0001\u001a\u00020\u0001*\u00020\t¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u0017\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u009b\u0001\u0010:\u001a\u001f\u0010\u009d\u0001\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0007\u0010\u009c\u0001\u001a\u00020\u0001¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a \u0010¡\u0001\u001a\u0004\u0018\u00010\u0001*\u00030\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\u0001¢\u0006\u0006\b¡\u0001\u0010¢\u0001\u001a!\u0010¤\u0001\u001a\u0004\u0018\u00010\u0006*\u00020\u00012\t\b\u0002\u0010£\u0001\u001a\u00020\u000f¢\u0006\u0006\b¤\u0001\u0010¥\u0001\u001a!\u0010¦\u0001\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\t\b\u0002\u0010£\u0001\u001a\u00020\u000f¢\u0006\u0006\b¦\u0001\u0010§\u0001\u001a!\u0010¤\u0001\u001a\u0004\u0018\u00010\u0006*\u00020\u00062\t\b\u0002\u0010£\u0001\u001a\u00020\u000f¢\u0006\u0006\b¤\u0001\u0010¨\u0001\u001a!\u0010©\u0001\u001a\u0004\u0018\u00010\u0001*\u00020\u00062\t\b\u0002\u0010£\u0001\u001a\u00020\u000f¢\u0006\u0006\b©\u0001\u0010§\u0001\u001a!\u0010©\u0001\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\t\b\u0002\u0010£\u0001\u001a\u00020\u000f¢\u0006\u0006\b©\u0001\u0010ª\u0001\u001a1\u0010®\u0001\u001a\u0004\u0018\u00018\u0000\"\u0005\b\u0000\u0010«\u00012\u0010\u0010\u00ad\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00018\u00000¬\u0001H\u0086\bø\u0001\u0000¢\u0006\u0006\b®\u0001\u0010¯\u0001\u001a@\u0010®\u0001\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010'\"\u0005\b\u0001\u0010«\u0001*\u00028\u00002\u0015\u0010\u00ad\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010/H\u0086\bø\u0001\u0000¢\u0006\u0006\b®\u0001\u0010°\u0001\u001a3\u0010´\u0001\u001a\u00020\u0018\"\t\b\u0000\u0010'*\u00030±\u0001*\u00028\u00002\u0007\u0010²\u0001\u001a\u00020\u00182\t\b\u0002\u0010³\u0001\u001a\u00020\u0018¢\u0006\u0006\b´\u0001\u0010µ\u0001\u001a3\u0010´\u0001\u001a\u00020\u0015\"\t\b\u0000\u0010'*\u00030±\u0001*\u00028\u00002\u0007\u0010²\u0001\u001a\u00020\u00152\t\b\u0002\u0010³\u0001\u001a\u00020\u0015¢\u0006\u0006\b´\u0001\u0010¶\u0001\u001a(\u0010·\u0001\u001a\u00020\u0018\"\t\b\u0000\u0010'*\u00030±\u0001*\u00028\u00002\u0007\u0010²\u0001\u001a\u00020\u0018¢\u0006\u0006\b·\u0001\u0010¸\u0001\u001a(\u0010·\u0001\u001a\u00020\u0015\"\t\b\u0000\u0010'*\u00030±\u0001*\u00028\u00002\u0007\u0010²\u0001\u001a\u00020\u0015¢\u0006\u0006\b·\u0001\u0010¹\u0001\u001a1\u0010»\u0001\u001a\u00020+*\u0004\u0018\u00010\u00012\u0013\u0010º\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020+0/H\u0086\bø\u0001\u0000¢\u0006\u0006\b»\u0001\u0010¼\u0001\u001a\"\u0010½\u0001\u001a\u0004\u0018\u00018\u0000\"\u0007\b\u0000\u0010«\u0001\u0018\u0001*\u00020\tH\u0086\b¢\u0006\u0006\b½\u0001\u0010¾\u0001\u001a(\u0010Â\u0001\u001a\u00020+*\u00030¿\u00012\b\u0010À\u0001\u001a\u00030¿\u00012\u0007\u0010Á\u0001\u001a\u00020\u0015¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001\"\u0018\u0010Å\u0001\u001a\u00030Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001\"\u0018\u0010È\u0001\u001a\u00030Ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001\"\u0018\u0010Ë\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001\"\u0018\u0010Î\u0001\u001a\u00030Í\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001\"\u0018\u0010Ñ\u0001\u001a\u00030Ð\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010Ò\u0001\"\u0018\u0010Ô\u0001\u001a\u00030Ó\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Õ\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006Ö\u0001"}, d2 = {"Landroid/content/Context;", "", "permission", "", "isPermissionGranted", "(Landroid/content/Context;Ljava/lang/String;)Z", "", "applyMD5", "([B)[B", "", "fallback", "toStringOrDefault", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "toBooleanOrDefault", "(Ljava/lang/Object;Ljava/lang/Boolean;)Ljava/lang/Boolean;", "", "toIntOrDefault", "(Ljava/lang/Object;Ljava/lang/Integer;)Ljava/lang/Integer;", "", "toLongOrDefault", "(Ljava/lang/Object;Ljava/lang/Long;)Ljava/lang/Long;", "", "toFloatOrDefault", "(Ljava/lang/Object;Ljava/lang/Float;)Ljava/lang/Float;", "", "toDoubleOrDefault", "(Ljava/lang/Object;Ljava/lang/Double;)Ljava/lang/Double;", "Lorg/json/JSONArray;", "", "toList", "(Lorg/json/JSONArray;)Ljava/util/List;", "Lorg/json/JSONObject;", "", "toMap", "(Lorg/json/JSONObject;)Ljava/util/Map;", "toJsonArray", "(Ljava/util/List;)Lorg/json/JSONArray;", "toJsonObject", "(Ljava/util/Map;)Lorg/json/JSONObject;", "T", "", "", "from", "", "setSafely", "(Ljava/util/Collection;Ljava/util/Collection;)V", "addAllSafely", "Lkotlin/Function1;", "predicate", "removeFirst", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "K", "V", "", "(Ljava/util/Map;Ljava/util/Map;)V", "putAllSafely", "putAllIfNotEmpty", "toUnderScore", "(Ljava/lang/String;)Ljava/lang/String;", "toCamelCase", "isHttpUrl", "(Ljava/lang/String;)Z", "Lio/bidmachine/util/KeyHolder;", "", "key", "find", "([Lio/bidmachine/util/KeyHolder;Ljava/lang/String;)Lio/bidmachine/util/KeyHolder;", "Ljava/io/InputStream;", "readSafely", "(Ljava/io/InputStream;)Ljava/lang/String;", "Ljava/io/File;", "file", "readIntoFile", "(Ljava/io/InputStream;Ljava/io/File;)J", "Ljava/io/Closeable;", "closeSafely", "(Ljava/io/Closeable;)V", "Ljava/io/Flushable;", "flushSafely", "(Ljava/io/Flushable;)V", "Ljava/io/OutputStream;", "finalize", "(Ljava/io/OutputStream;)V", "Landroid/location/Location;", "getLocation", "(Landroid/content/Context;)Landroid/location/Location;", "Landroid/net/ConnectivityManager;", "getConnectivityManager", "(Landroid/content/Context;)Landroid/net/ConnectivityManager;", "Landroid/view/WindowManager;", "getWindowManager", "(Landroid/content/Context;)Landroid/view/WindowManager;", "Landroid/view/inputmethod/InputMethodManager;", "getInputMethodManager", "(Landroid/content/Context;)Landroid/view/inputmethod/InputMethodManager;", "Landroid/media/AudioManager;", "getAudioManager", "(Landroid/content/Context;)Landroid/media/AudioManager;", "Landroid/os/PowerManager;", "getPowerManager", "(Landroid/content/Context;)Landroid/os/PowerManager;", "Landroid/telephony/TelephonyManager;", "getTelephonyManager", "(Landroid/content/Context;)Landroid/telephony/TelephonyManager;", "Landroid/location/LocationManager;", "getLocationManager", "(Landroid/content/Context;)Landroid/location/LocationManager;", "Landroid/bluetooth/BluetoothManager;", "getBluetoothManager", "(Landroid/content/Context;)Landroid/bluetooth/BluetoothManager;", "Landroid/app/DownloadManager;", "getDownloadManager", "(Landroid/content/Context;)Landroid/app/DownloadManager;", "Landroid/content/ClipboardManager;", "getClipboardManager", "(Landroid/content/Context;)Landroid/content/ClipboardManager;", "Landroid/hardware/SensorManager;", "getSensorManager", "(Landroid/content/Context;)Landroid/hardware/SensorManager;", "Landroid/app/ActivityManager;", "getActivityManager", "(Landroid/content/Context;)Landroid/app/ActivityManager;", "Landroid/app/UiModeManager;", "getUiModeManager", "(Landroid/content/Context;)Landroid/app/UiModeManager;", "name", "getTypedSystemService", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Object;", "unit", "value", "unitToPx", "(Landroid/content/Context;IF)I", "spToPx", "(Landroid/content/Context;F)I", "dpToPx", "pxToDp", "(Landroid/content/Context;I)I", "id", "getColorCompat", "Landroid/content/IntentFilter;", "intentFilter", "Landroid/content/Intent;", "registerSystemReceiver", "(Landroid/content/Context;Landroid/content/IntentFilter;)Landroid/content/Intent;", "Landroid/content/BroadcastReceiver;", "receiver", "registerBroadcastReceiver", "(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;", "Landroid/content/ContextWrapper;", "currentDepth", "Landroid/app/Activity;", "findActivity", "(Landroid/content/ContextWrapper;I)Landroid/app/Activity;", "createHexHashCode", "(Ljava/lang/Object;)Ljava/lang/String;", "notEmptyOrNull", "defaultValue", "notEmptyOrDefault", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/res/AssetManager;", V5.c.b, "readAssetFile", "(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/lang/String;", "flags", "decodeBase64", "(Ljava/lang/String;I)[B", "encodeToStringBase64", "([BI)Ljava/lang/String;", "([BI)[B", "decodeBase64ToString", "(Ljava/lang/String;I)Ljava/lang/String;", "R", "Lkotlin/Function0;", "block", "letSafely", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "max", POBConstants.KEY_ACCURACY, "toRatio", "(Ljava/lang/Number;DD)D", "(Ljava/lang/Number;FF)F", "fromRatio", "(Ljava/lang/Number;D)D", "(Ljava/lang/Number;F)F", "action", "takeIfNotBlank", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "takeIfIsInstance", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/graphics/Rect;", "rectPx", "density", "setDpFromPx", "(Landroid/graphics/Rect;Landroid/graphics/Rect;F)V", "Lio/bidmachine/util/conversion/StringTypeConversion;", "STRING_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/StringTypeConversion;", "Lio/bidmachine/util/conversion/BooleanTypeConversion;", "BOOLEAN_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/BooleanTypeConversion;", "Lio/bidmachine/util/conversion/IntTypeConversion;", "INT_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/IntTypeConversion;", "Lio/bidmachine/util/conversion/LongTypeConversion;", "LONG_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/LongTypeConversion;", "Lio/bidmachine/util/conversion/FloatTypeConversion;", "FLOAT_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/FloatTypeConversion;", "Lio/bidmachine/util/conversion/DoubleTypeConversion;", "DOUBLE_TYPE_CONVERSION", "Lio/bidmachine/util/conversion/DoubleTypeConversion;", "bidmachine-android-sdk_bd_3_7_1"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes11.dex */
public final class UtilsKt {

    @NotNull
    private static final StringTypeConversion STRING_TYPE_CONVERSION = new StringTypeConversion();

    @NotNull
    private static final BooleanTypeConversion BOOLEAN_TYPE_CONVERSION = new BooleanTypeConversion();

    @NotNull
    private static final IntTypeConversion INT_TYPE_CONVERSION = new IntTypeConversion();

    @NotNull
    private static final LongTypeConversion LONG_TYPE_CONVERSION = new LongTypeConversion();

    @NotNull
    private static final FloatTypeConversion FLOAT_TYPE_CONVERSION = new FloatTypeConversion();

    @NotNull
    private static final DoubleTypeConversion DOUBLE_TYPE_CONVERSION = new DoubleTypeConversion();

    public static final boolean isPermissionGranted(@NotNull Context context, @Nullable String str) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            bool = Boolean.valueOf(context.checkPermission(str, Process.myPid(), Process.myUid()) == 0);
        } catch (Throwable unused) {
            bool = null;
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    @Nullable
    public static final byte[] applyMD5(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final String toStringOrDefault(@Nullable Object obj, @Nullable String str) {
        return STRING_TYPE_CONVERSION.toOrDefault(obj, str);
    }

    public static /* synthetic */ String toStringOrDefault$default(Object obj, String str, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = null;
        }
        return toStringOrDefault(obj, str);
    }

    @Nullable
    public static final Boolean toBooleanOrDefault(@Nullable Object obj, @Nullable Boolean bool) {
        return BOOLEAN_TYPE_CONVERSION.toOrDefault(obj, bool);
    }

    public static /* synthetic */ Boolean toBooleanOrDefault$default(Object obj, Boolean bool, int i, Object obj2) {
        if ((i & 1) != 0) {
            bool = null;
        }
        return toBooleanOrDefault(obj, bool);
    }

    @Nullable
    public static final Integer toIntOrDefault(@Nullable Object obj, @Nullable Integer num) {
        return INT_TYPE_CONVERSION.toOrDefault(obj, num);
    }

    public static /* synthetic */ Integer toIntOrDefault$default(Object obj, Integer num, int i, Object obj2) {
        if ((i & 1) != 0) {
            num = null;
        }
        return toIntOrDefault(obj, num);
    }

    @Nullable
    public static final Long toLongOrDefault(@Nullable Object obj, @Nullable Long l) {
        return LONG_TYPE_CONVERSION.toOrDefault(obj, l);
    }

    public static /* synthetic */ Long toLongOrDefault$default(Object obj, Long l, int i, Object obj2) {
        if ((i & 1) != 0) {
            l = null;
        }
        return toLongOrDefault(obj, l);
    }

    @Nullable
    public static final Float toFloatOrDefault(@Nullable Object obj, @Nullable Float f) {
        return FLOAT_TYPE_CONVERSION.toOrDefault(obj, f);
    }

    public static /* synthetic */ Float toFloatOrDefault$default(Object obj, Float f, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = null;
        }
        return toFloatOrDefault(obj, f);
    }

    @Nullable
    public static final Double toDoubleOrDefault(@Nullable Object obj, @Nullable Double d) {
        return DOUBLE_TYPE_CONVERSION.toOrDefault(obj, d);
    }

    public static /* synthetic */ Double toDoubleOrDefault$default(Object obj, Double d, int i, Object obj2) {
        if ((i & 1) != 0) {
            d = null;
        }
        return toDoubleOrDefault(obj, d);
    }

    @NotNull
    public static final List<Object> toList(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object fromJsonElementToObjectOrNull = Utils.fromJsonElementToObjectOrNull(jSONArray.opt(i));
            if (fromJsonElementToObjectOrNull != null) {
                arrayList.add(fromJsonElementToObjectOrNull);
            }
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys()");
        for (String key : SequencesKt.asSequence(keys)) {
            Object fromJsonElementToObjectOrNull = Utils.fromJsonElementToObjectOrNull(jSONObject.opt(key));
            if (fromJsonElementToObjectOrNull != null) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                linkedHashMap.put(key, fromJsonElementToObjectOrNull);
            }
        }
        return linkedHashMap;
    }

    @NotNull
    public static final JSONArray toJsonArray(@NotNull List<?> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object fromObjectToJsonElementOrNull = Utils.fromObjectToJsonElementOrNull(it.next());
            if (fromObjectToJsonElementOrNull != null) {
                jSONArray.put(fromObjectToJsonElementOrNull);
            }
        }
        return jSONArray;
    }

    @NotNull
    public static final JSONObject toJsonObject(@NotNull Map<?, ?> map) {
        Object fromObjectToJsonElementOrNull;
        Intrinsics.checkNotNullParameter(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            String obj = key != null ? key.toString() : null;
            Object value = entry.getValue();
            if (obj != null && obj.length() > 0 && value != null && (fromObjectToJsonElementOrNull = Utils.fromObjectToJsonElementOrNull(value)) != null) {
                jSONObject.put(obj, fromObjectToJsonElementOrNull);
            }
        }
        return jSONObject;
    }

    public static final <T> void setSafely(@NotNull Collection<T> collection, @Nullable Collection<? extends T> collection2) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        collection.clear();
        addAllSafely(collection, collection2);
    }

    public static final <T> void addAllSafely(@NotNull Collection<T> collection, @Nullable Collection<? extends T> collection2) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        if (collection2 == null) {
            return;
        }
        collection.addAll(collection2);
    }

    @Nullable
    public static final <T> T removeFirst(@NotNull Collection<T> collection, @NotNull Function1 predicate) {
        T t;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Iterator<T> it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((Boolean) predicate.invoke(t)).booleanValue()) {
                break;
            }
        }
        if (t != null) {
            collection.remove(t);
        }
        return t;
    }

    public static final <K, V> void setSafely(@NotNull Map<K, V> map, @Nullable Map<K, ? extends V> map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        map.clear();
        putAllSafely(map, map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> void putAllSafely(@NotNull Map<K, V> map, @Nullable Map<K, ? extends V> map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map2 == 0) {
            return;
        }
        map.putAll(map2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> void putAllIfNotEmpty(@NotNull Map<K, V> map, @Nullable Map<K, ? extends V> map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map2 == 0 || map2.isEmpty()) {
            return;
        }
        map.putAll(map2);
    }

    @NotNull
    public static final String toUnderScore(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String replace = new Regex("(?<=.)[A-Z]").replace(str, "_$0");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = replace.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @NotNull
    public static final String toCamelCase(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        String replace = new Regex("_([a-z])").replace(str, new Function1() { // from class: io.bidmachine.util.UtilsKt$toCamelCase$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull MatchResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String upperCase = ((String) it.getGroupValues().get(1)).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                return upperCase;
            }
        });
        if (replace.length() <= 0) {
            return replace;
        }
        StringBuilder sb = new StringBuilder();
        char charAt = replace.charAt(0);
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        sb.append((Object) CharsKt.lowercase(charAt, locale));
        String substring = replace.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    public static final boolean isHttpUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.startsWith$default(str, d.v, false, 2, (Object) null) || StringsKt.startsWith$default(str, d.u, false, 2, (Object) null);
    }

    @Nullable
    public static final <T extends KeyHolder> T find(@NotNull T[] tArr, @Nullable String str) {
        String str2;
        String key;
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (str == null || str.length() == 0) {
            return null;
        }
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        for (T t : tArr) {
            if (t == null || (key = t.getKey()) == null) {
                str2 = null;
            } else {
                Locale locale2 = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
                str2 = key.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(str2, "this as java.lang.String).toLowerCase(locale)");
            }
            if (StringsKt.equals$default(str2, lowerCase, false, 2, null)) {
                return t;
            }
        }
        return null;
    }

    @Nullable
    public static final String readSafely(@NotNull InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192);
                try {
                    String readText = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    CloseableKt.closeFinally(inputStream, null);
                    return readText;
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final long readIntoFile(@NotNull InputStream inputStream, @NotNull File file) throws Throwable {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            FileOutputStream fileOutputStreamCtor = BidMachineFilesBridge.fileOutputStreamCtor(file);
            try {
                long copyTo$default = ByteStreamsKt.copyTo$default(inputStream, fileOutputStreamCtor, 0, 2, null);
                CloseableKt.closeFinally(fileOutputStreamCtor, null);
                CloseableKt.closeFinally(inputStream, null);
                return copyTo$default;
            } finally {
            }
        } finally {
        }
    }

    public static final void closeSafely(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable unused) {
            }
        }
    }

    public static final void flushSafely(@Nullable Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable unused) {
            }
        }
    }

    public static final void finalize(@Nullable OutputStream outputStream) {
        flushSafely(outputStream);
        closeSafely(outputStream);
    }

    @RequiresPermission
    @Nullable
    public static final Location getLocation(@NotNull Context context) {
        LocationManager locationManager;
        String bestProvider;
        Location lastKnownLocation;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (!isPermissionGranted(context, "android.permission.ACCESS_COARSE_LOCATION") || (locationManager = getLocationManager(context)) == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            bestProvider = GplLibraryWrapper.FUSED_PROVIDER;
        } else {
            bestProvider = locationManager.getBestProvider(new Criteria(), false);
        }
        if (bestProvider == null) {
            return null;
        }
        Location lastKnownLocation2 = locationManager.getLastKnownLocation(bestProvider);
        if (lastKnownLocation2 != null) {
            return lastKnownLocation2;
        }
        List<String> allProviders = locationManager.getAllProviders();
        Intrinsics.checkNotNullExpressionValue(allProviders, "locationManager.allProviders");
        if (allProviders.size() <= 1) {
            return null;
        }
        for (String str : allProviders) {
            if (str != null && !Intrinsics.areEqual(str, bestProvider) && (lastKnownLocation = locationManager.getLastKnownLocation(str)) != null) {
                return lastKnownLocation;
            }
        }
        return null;
    }

    @Nullable
    public static final ConnectivityManager getConnectivityManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (!(systemService instanceof ConnectivityManager)) {
                systemService = null;
            }
            return (ConnectivityManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final WindowManager getWindowManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("window");
            if (!(systemService instanceof WindowManager)) {
                systemService = null;
            }
            return (WindowManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final InputMethodManager getInputMethodManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("input_method");
            if (!(systemService instanceof InputMethodManager)) {
                systemService = null;
            }
            return (InputMethodManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final AudioManager getAudioManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("audio");
            if (!(systemService instanceof AudioManager)) {
                systemService = null;
            }
            return (AudioManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final PowerManager getPowerManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("power");
            if (!(systemService instanceof PowerManager)) {
                systemService = null;
            }
            return (PowerManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final TelephonyManager getTelephonyManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("phone");
            if (!(systemService instanceof TelephonyManager)) {
                systemService = null;
            }
            return (TelephonyManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final LocationManager getLocationManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("location");
            if (!(systemService instanceof LocationManager)) {
                systemService = null;
            }
            return (LocationManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final BluetoothManager getBluetoothManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService(T3.d);
            if (!(systemService instanceof BluetoothManager)) {
                systemService = null;
            }
            return (BluetoothManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final DownloadManager getDownloadManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("download");
            if (!(systemService instanceof DownloadManager)) {
                systemService = null;
            }
            return (DownloadManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final ClipboardManager getClipboardManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("clipboard");
            if (!(systemService instanceof ClipboardManager)) {
                systemService = null;
            }
            return (ClipboardManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final SensorManager getSensorManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("sensor");
            if (!(systemService instanceof SensorManager)) {
                systemService = null;
            }
            return (SensorManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final ActivityManager getActivityManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("activity");
            if (!(systemService instanceof ActivityManager)) {
                systemService = null;
            }
            return (ActivityManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final UiModeManager getUiModeManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Object systemService = context.getSystemService("uimode");
            if (!(systemService instanceof UiModeManager)) {
                systemService = null;
            }
            return (UiModeManager) systemService;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static final /* synthetic */ <T> T getTypedSystemService(Context context, String str) {
        try {
            T t = (T) context.getSystemService(str);
            Intrinsics.reifiedOperationMarker(2, "T");
            return t;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final int unitToPx(@NotNull Context context, int i, float f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (f == 0.0f) {
            return 0;
        }
        return (int) DeviceUtilsKt.applyDimension(DeviceUtilsKt.getDisplayMetrics(context), i, f);
    }

    public static final int spToPx(@NotNull Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return unitToPx(context, 2, f);
    }

    public static final int dpToPx(@NotNull Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return unitToPx(context, 1, f);
    }

    public static final int pxToDp(@NotNull Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return Utils.pxToDp(DeviceUtilsKt.getScreenDensity(context), f);
    }

    public static final int pxToDp(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return Utils.pxToDp(DeviceUtilsKt.getScreenDensity(context), i);
    }

    public static final int getColorCompat(@NotNull Context context, @ColorRes int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return context.getColor(i);
    }

    @Nullable
    public static final Intent registerSystemReceiver(@NotNull Context context, @NotNull IntentFilter intentFilter) {
        Intent registerReceiver;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intentFilter, "intentFilter");
        if (Build.VERSION.SDK_INT >= 34) {
            registerReceiver = context.registerReceiver(null, intentFilter, 4);
            return registerReceiver;
        }
        return context.registerReceiver(null, intentFilter);
    }

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    @Nullable
    public static final Intent registerBroadcastReceiver(@NotNull Context context, @NotNull BroadcastReceiver receiver, @NotNull IntentFilter intentFilter) {
        Intent registerReceiver;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Intrinsics.checkNotNullParameter(intentFilter, "intentFilter");
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver = context.registerReceiver(receiver, intentFilter, 2);
            return registerReceiver;
        }
        return context.registerReceiver(receiver, intentFilter);
    }

    public static /* synthetic */ Activity findActivity$default(ContextWrapper contextWrapper, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return findActivity(contextWrapper, i);
    }

    @Nullable
    public static final Activity findActivity(@NotNull ContextWrapper contextWrapper, int i) {
        Intrinsics.checkNotNullParameter(contextWrapper, "<this>");
        if (i >= 10) {
            return null;
        }
        Context baseContext = contextWrapper.getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        if (baseContext instanceof ContextWrapper) {
            return findActivity((ContextWrapper) baseContext, i + 1);
        }
        return null;
    }

    @NotNull
    public static final String createHexHashCode(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        String hexString = Integer.toHexString(obj.hashCode());
        Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(hashCode())");
        return hexString;
    }

    @Nullable
    public static final String notEmptyOrNull(@Nullable String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            str = null;
        }
        return str;
    }

    @NotNull
    public static final String notEmptyOrDefault(@Nullable String str, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return (str == null || str.length() == 0) ? defaultValue : str;
    }

    @Nullable
    public static final String readAssetFile(@NotNull AssetManager assetManager, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(assetManager, "<this>");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        try {
            InputStream open = assetManager.open(fileName);
            Intrinsics.checkNotNullExpressionValue(open, "open(fileName)");
            return readSafely(open);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ byte[] decodeBase64$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return decodeBase64(str, i);
    }

    @Nullable
    public static final byte[] decodeBase64(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return decodeBase64(bytes, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ String encodeToStringBase64$default(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return encodeToStringBase64(bArr, i);
    }

    @Nullable
    public static final String encodeToStringBase64(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        try {
            return Base64.encodeToString(bArr, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ byte[] decodeBase64$default(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return decodeBase64(bArr, i);
    }

    @Nullable
    public static final byte[] decodeBase64(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        try {
            return Base64.decode(bArr, i);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ String decodeBase64ToString$default(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return decodeBase64ToString(bArr, i);
    }

    @Nullable
    public static final String decodeBase64ToString(@NotNull byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] decodeBase64 = decodeBase64(bArr, i);
        if (decodeBase64 != null) {
            return new String(decodeBase64, Charsets.UTF_8);
        }
        return null;
    }

    @Nullable
    public static final String decodeBase64ToString(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return decodeBase64ToString(bytes, i);
    }

    public static /* synthetic */ String decodeBase64ToString$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 2;
        }
        return decodeBase64ToString(str, i);
    }

    @Nullable
    public static final <R> R letSafely(@NotNull Function0 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return (R) block.mo4828invoke();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final <T, R> R letSafely(T t, @NotNull Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return (R) block.invoke(t);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ double toRatio$default(Number number, double d, double d2, int i, Object obj) {
        if ((i & 2) != 0) {
            d2 = 100.0d;
        }
        return toRatio(number, d, d2);
    }

    public static final <T extends Number> double toRatio(@NotNull T t, double d, double d2) {
        double floatValue;
        Intrinsics.checkNotNullParameter(t, "<this>");
        if (d2 > 0.0d) {
            floatValue = MathKt.roundToInt((t.floatValue() / d) * d2) / d2;
        } else {
            floatValue = t.floatValue() / d;
        }
        return RangesKt.coerceIn(floatValue, 0.0d, 1.0d);
    }

    public static /* synthetic */ float toRatio$default(Number number, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 100.0f;
        }
        return toRatio(number, f, f2);
    }

    public static final <T extends Number> float toRatio(@NotNull T t, float f, float f2) {
        float floatValue;
        Intrinsics.checkNotNullParameter(t, "<this>");
        if (f2 > 0.0f) {
            floatValue = MathKt.roundToInt((t.floatValue() / f) * f2) / f2;
        } else {
            floatValue = t.floatValue() / f;
        }
        return RangesKt.coerceIn(floatValue, 0.0f, 1.0f);
    }

    public static final <T extends Number> double fromRatio(@NotNull T t, double d) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        return RangesKt.coerceIn((t.doubleValue() * d) / 1.0d, 0.0d, d);
    }

    public static final <T extends Number> float fromRatio(@NotNull T t, float f) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        return RangesKt.coerceIn((t.floatValue() * f) / 1.0f, 0.0f, f);
    }

    public static final void takeIfNotBlank(@Nullable String str, @NotNull Function1 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (str != null && !StringsKt.isBlank(str)) {
            action.invoke(str);
        }
        List emptyList = CollectionsKt.emptyList();
        ArrayList arrayList = new ArrayList();
        for (Object obj : emptyList) {
            if (obj instanceof StringTypeConversion) {
                arrayList.add(obj);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <R> R takeIfIsInstance(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.reifiedOperationMarker(3, "R");
        if ((obj != 0 ? obj : null) == null) {
            return null;
        }
        Intrinsics.reifiedOperationMarker(1, "R");
        return obj;
    }

    public static final void setDpFromPx(@NotNull Rect rect, @NotNull Rect rectPx, float f) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        Intrinsics.checkNotNullParameter(rectPx, "rectPx");
        rect.set(Utils.pxToDp(f, rectPx.left), Utils.pxToDp(f, rectPx.top), Utils.pxToDp(f, rectPx.right), Utils.pxToDp(f, rectPx.bottom));
    }
}
