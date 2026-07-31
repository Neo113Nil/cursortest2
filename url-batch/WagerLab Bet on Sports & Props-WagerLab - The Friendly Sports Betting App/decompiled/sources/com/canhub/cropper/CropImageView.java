package com.canhub.cropper;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.canhub.cropper.BitmapCroppingWorkerJob;
import com.canhub.cropper.BitmapLoadingWorkerJob;
import com.canhub.cropper.BitmapUtils;
import com.canhub.cropper.CropOverlayView;
import com.canhub.cropper.utils.GetFilePathFromUriKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CropImageView.kt */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b*\u0018\u0000 \u0097\u00022\u00020\u00012\u00020\u0002:\u0018\u008c\u0002\u008d\u0002\u008e\u0002\u008f\u0002\u0090\u0002\u0091\u0002\u0092\u0002\u0093\u0002\u0094\u0002\u0095\u0002\u0096\u0002\u0097\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u001dJ\u000e\u0010g\u001a\u00020e2\u0006\u0010h\u001a\u00020\u001dJ\u0016\u0010n\u001a\u00020e2\u0006\u0010o\u001a\u00020\u001a2\u0006\u0010p\u001a\u00020\u001aJ\u0016\u0010q\u001a\u00020e2\u0006\u0010r\u001a\u00020\u001a2\u0006\u0010s\u001a\u00020\u001aJ\u000e\u0010y\u001a\u00020e2\u0006\u0010z\u001a\u00020\u001dJ\u0019\u0010\u008f\u0001\u001a\u00020e2\u0007\u0010\u0090\u0001\u001a\u00020\u001a2\u0007\u0010\u0091\u0001\u001a\u00020\u001aJ\u0011\u0010\u0092\u0001\u001a\u00020e2\b\u0010\u0093\u0001\u001a\u00030\u0094\u0001J\u0007\u0010\u0095\u0001\u001a\u00020eJ\u0010\u0010\u0096\u0001\u001a\u00020e2\u0007\u0010\u0097\u0001\u001a\u00020/J\n\u0010¼\u0001\u001a\u0005\u0018\u00010½\u0001J\u0007\u0010Ä\u0001\u001a\u00020eJ-\u0010É\u0001\u001a\u0004\u0018\u00010\u00182\t\b\u0002\u0010Ê\u0001\u001a\u00020\u001a2\t\b\u0002\u0010Ë\u0001\u001a\u00020\u001a2\n\b\u0002\u0010\u0093\u0001\u001a\u00030Ì\u0001H\u0007JL\u0010Í\u0001\u001a\u00020e2\n\b\u0002\u0010Î\u0001\u001a\u00030Ï\u00012\t\b\u0002\u0010Ð\u0001\u001a\u00020\u001a2\t\b\u0002\u0010Ê\u0001\u001a\u00020\u001a2\t\b\u0002\u0010Ë\u0001\u001a\u00020\u001a2\n\b\u0002\u0010\u0093\u0001\u001a\u00030Ì\u00012\n\b\u0002\u0010~\u001a\u0004\u0018\u00010?J\u0012\u0010Ñ\u0001\u001a\u00020e2\t\u0010Ò\u0001\u001a\u0004\u0018\u000105J\u0012\u0010Ó\u0001\u001a\u00020e2\t\u0010Ò\u0001\u001a\u0004\u0018\u000107J\u0012\u0010Ô\u0001\u001a\u00020e2\t\u0010Ò\u0001\u001a\u0004\u0018\u000109J\u0012\u0010Õ\u0001\u001a\u00020e2\t\u0010Ò\u0001\u001a\u0004\u0018\u00010;J\u0012\u0010Ö\u0001\u001a\u00020e2\t\u0010Ò\u0001\u001a\u0004\u0018\u00010=J\u0012\u0010×\u0001\u001a\u00020e2\t\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0018J\u001e\u0010×\u0001\u001a\u00020e2\t\u0010Ø\u0001\u001a\u0004\u0018\u00010\u00182\n\u0010Ù\u0001\u001a\u0005\u0018\u00010Ú\u0001J\u0012\u0010Û\u0001\u001a\u00020e2\t\u0010Ü\u0001\u001a\u0004\u0018\u00010?J\u0007\u0010Ý\u0001\u001a\u00020eJ\u000f\u0010Þ\u0001\u001a\u00020e2\u0006\u0010t\u001a\u00020\u001aJ\u0007\u0010ß\u0001\u001a\u00020eJ\u0007\u0010à\u0001\u001a\u00020eJ\u0019\u0010á\u0001\u001a\u00020e2\b\u0010â\u0001\u001a\u00030ã\u0001H\u0000¢\u0006\u0003\bä\u0001J\u0019\u0010å\u0001\u001a\u00020e2\b\u0010â\u0001\u001a\u00030æ\u0001H\u0000¢\u0006\u0003\bç\u0001J9\u0010è\u0001\u001a\u00020e2\t\u0010Ø\u0001\u001a\u0004\u0018\u00010\u00182\u0007\u0010°\u0001\u001a\u00020\u001a2\b\u0010@\u001a\u0004\u0018\u00010?2\u0007\u0010é\u0001\u001a\u00020\u001a2\u0007\u0010ê\u0001\u001a\u00020\u001aH\u0002J\t\u0010ë\u0001\u001a\u00020eH\u0002J@\u0010ì\u0001\u001a\u00020e2\u0007\u0010Ê\u0001\u001a\u00020\u001a2\u0007\u0010Ë\u0001\u001a\u00020\u001a2\b\u0010\u0093\u0001\u001a\u00030Ì\u00012\b\u0010Î\u0001\u001a\u00030Ï\u00012\u0007\u0010Ð\u0001\u001a\u00020\u001a2\b\u0010~\u001a\u0004\u0018\u00010?J\f\u0010í\u0001\u001a\u0005\u0018\u00010î\u0001H\u0016J\u0013\u0010ï\u0001\u001a\u00020e2\b\u0010ð\u0001\u001a\u00030î\u0001H\u0016J\u001b\u0010ñ\u0001\u001a\u00020e2\u0007\u0010ò\u0001\u001a\u00020\u001a2\u0007\u0010ó\u0001\u001a\u00020\u001aH\u0014J6\u0010ô\u0001\u001a\u00020e2\u0007\u0010õ\u0001\u001a\u00020\u001d2\u0007\u0010ö\u0001\u001a\u00020\u001a2\u0007\u0010÷\u0001\u001a\u00020\u001a2\u0007\u0010ø\u0001\u001a\u00020\u001a2\u0007\u0010ù\u0001\u001a\u00020\u001aH\u0014J-\u0010ú\u0001\u001a\u00020e2\u0007\u0010û\u0001\u001a\u00020\u001a2\u0007\u0010ü\u0001\u001a\u00020\u001a2\u0007\u0010ý\u0001\u001a\u00020\u001a2\u0007\u0010þ\u0001\u001a\u00020\u001aH\u0014J\u001b\u0010ÿ\u0001\u001a\u00020e2\u0007\u0010\u0080\u0002\u001a\u00020\u001d2\u0007\u0010\u0081\u0002\u001a\u00020\u001dH\u0002J-\u0010\u0082\u0002\u001a\u00020e2\u0007\u0010\u0083\u0002\u001a\u00020/2\u0007\u0010\u0084\u0002\u001a\u00020/2\u0007\u0010\u0085\u0002\u001a\u00020\u001d2\u0007\u0010\u0081\u0002\u001a\u00020\u001dH\u0002J\t\u0010\u0086\u0002\u001a\u00020eH\u0002J\t\u0010\u0087\u0002\u001a\u00020eH\u0002J\t\u0010\u0088\u0002\u001a\u00020eH\u0002J\u0012\u0010\u0089\u0002\u001a\u00020e2\u0007\u0010\u008a\u0002\u001a\u00020\u001dH\u0002J\u0012\u0010\u008b\u0002\u001a\u00020e2\u0007\u0010\u0080\u0002\u001a\u00020\u001dH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00104\u001a\u0004\u0018\u000105X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010:\u001a\u0004\u0018\u00010;X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010@\u001a\u0004\u0018\u00010?2\b\u0010>\u001a\u0004\u0018\u00010?@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u0004\u0018\u00010HX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010K\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010LX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010N\u001a\n\u0012\u0004\u0012\u00020O\u0018\u00010LX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010P\u001a\u00020#2\u0006\u0010P\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR(\u0010U\u001a\u0004\u0018\u00010V2\b\u0010U\u001a\u0004\u0018\u00010V8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR(\u0010[\u001a\u0004\u0018\u00010\\2\b\u0010[\u001a\u0004\u0018\u00010\\8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010b\u001a\u00020\u001d2\u0006\u0010a\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010'\"\u0004\bc\u0010)R$\u0010i\u001a\u00020\u001a2\u0006\u0010i\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR$\u0010u\u001a\u00020\u001a2\u0006\u0010t\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bv\u0010k\"\u0004\bw\u0010mR\u0011\u0010x\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bx\u0010'R$\u0010|\u001a\u00020\u001d2\u0006\u0010{\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b|\u0010'\"\u0004\b}\u0010)R\u001e\u0010~\u001a\u0004\u0018\u00010?X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0004\b\u007f\u0010B\"\u0006\b\u0080\u0001\u0010\u0081\u0001R(\u0010\u0083\u0001\u001a\u00020\u001d2\u0007\u0010\u0082\u0001\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010'\"\u0005\b\u0084\u0001\u0010)R0\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00012\n\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R!\u0010\u008b\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u008c\u00018F¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R(\u0010\u0099\u0001\u001a\u00020\u001d2\u0007\u0010\u0098\u0001\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0099\u0001\u0010'\"\u0005\b\u009a\u0001\u0010)R(\u0010\u009c\u0001\u001a\u00020\u001d2\u0007\u0010\u009b\u0001\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009c\u0001\u0010'\"\u0005\b\u009d\u0001\u0010)R(\u0010\u009f\u0001\u001a\u00020\u001d2\u0007\u0010\u009e\u0001\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009f\u0001\u0010'\"\u0005\b \u0001\u0010)R*\u0010¡\u0001\u001a\u00020-2\u0007\u0010¡\u0001\u001a\u00020-8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R*\u0010§\u0001\u001a\u00020/2\u0007\u0010¦\u0001\u001a\u00020/8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R(\u0010¬\u0001\u001a\u00020\u001a2\u0007\u0010¬\u0001\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u00ad\u0001\u0010k\"\u0005\b®\u0001\u0010mR(\u0010°\u0001\u001a\u00020\u001a2\u0007\u0010¯\u0001\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b±\u0001\u0010k\"\u0005\b²\u0001\u0010mR\u0017\u0010³\u0001\u001a\u0005\u0018\u00010´\u00018F¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R0\u0010¸\u0001\u001a\u0005\u0018\u00010´\u00012\n\u0010·\u0001\u001a\u0005\u0018\u00010´\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b¹\u0001\u0010¶\u0001\"\u0006\bº\u0001\u0010»\u0001R\u0016\u0010¾\u0001\u001a\u0004\u0018\u00010H8F¢\u0006\b\u001a\u0006\b¿\u0001\u0010À\u0001R\u0014\u0010Á\u0001\u001a\u00020\u00138F¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001R \u0010Å\u0001\u001a\u0004\u0018\u00010\u00188GX\u0087\u0004¢\u0006\u000f\u0012\u0005\bÆ\u0001\u0010&\u001a\u0006\bÇ\u0001\u0010È\u0001¨\u0006\u0098\u0002"}, d2 = {"Lcom/canhub/cropper/CropImageView;", "Landroid/widget/FrameLayout;", "Lcom/canhub/cropper/CropOverlayView$CropWindowChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "imageView", "Landroid/widget/ImageView;", "mCropOverlayView", "Lcom/canhub/cropper/CropOverlayView;", "mImageMatrix", "Landroid/graphics/Matrix;", "mImageInverseMatrix", "mProgressBar", "Landroid/widget/ProgressBar;", "mImagePoints", "", "mScaleImagePoints", "mAnimation", "Lcom/canhub/cropper/CropImageAnimation;", "originalBitmap", "Landroid/graphics/Bitmap;", "mInitialDegreesRotated", "", "mDegreesRotated", "mFlipHorizontally", "", "mFlipVertically", "mLayoutWidth", "mLayoutHeight", "mImageResource", "mScaleType", "Lcom/canhub/cropper/CropImageView$ScaleType;", "isSaveBitmapToInstanceState", "isSaveBitmapToInstanceState$annotations", "()V", "()Z", "setSaveBitmapToInstanceState", "(Z)V", "mShowCropOverlay", "mShowCropLabel", "mCropTextLabel", "", "mCropLabelTextSize", "", "mCropLabelTextColor", "mShowProgressBar", "mAutoZoomEnabled", "mMaxZoom", "mOnCropOverlayReleasedListener", "Lcom/canhub/cropper/CropImageView$OnSetCropOverlayReleasedListener;", "mOnSetCropOverlayMovedListener", "Lcom/canhub/cropper/CropImageView$OnSetCropOverlayMovedListener;", "mOnSetCropWindowChangeListener", "Lcom/canhub/cropper/CropImageView$OnSetCropWindowChangeListener;", "mOnSetImageUriCompleteListener", "Lcom/canhub/cropper/CropImageView$OnSetImageUriCompleteListener;", "mOnCropImageCompleteListener", "Lcom/canhub/cropper/CropImageView$OnCropImageCompleteListener;", "value", "Landroid/net/Uri;", "imageUri", "getImageUri", "()Landroid/net/Uri;", "loadedSampleSize", "mZoom", "mZoomOffsetX", "mZoomOffsetY", "mRestoreCropWindowRect", "Landroid/graphics/RectF;", "mRestoreDegreesRotated", "mSizeChanged", "bitmapLoadingWorkerJob", "Ljava/lang/ref/WeakReference;", "Lcom/canhub/cropper/BitmapLoadingWorkerJob;", "bitmapCroppingWorkerJob", "Lcom/canhub/cropper/BitmapCroppingWorkerJob;", "scaleType", "getScaleType", "()Lcom/canhub/cropper/CropImageView$ScaleType;", "setScaleType", "(Lcom/canhub/cropper/CropImageView$ScaleType;)V", "cropShape", "Lcom/canhub/cropper/CropImageView$CropShape;", "getCropShape", "()Lcom/canhub/cropper/CropImageView$CropShape;", "setCropShape", "(Lcom/canhub/cropper/CropImageView$CropShape;)V", "cornerShape", "Lcom/canhub/cropper/CropImageView$CropCornerShape;", "getCornerShape", "()Lcom/canhub/cropper/CropImageView$CropCornerShape;", "setCornerShape", "(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V", "autoZoomEnabled", "isAutoZoomEnabled", "setAutoZoomEnabled", "setMultiTouchEnabled", "", "multiTouchEnabled", "setCenterMoveEnabled", "centerMoveEnabled", "maxZoom", "getMaxZoom", "()I", "setMaxZoom", "(I)V", "setMinCropResultSize", "minCropResultWidth", "minCropResultHeight", "setMaxCropResultSize", "maxCropResultWidth", "maxCropResultHeight", "degrees", "rotatedDegrees", "getRotatedDegrees", "setRotatedDegrees", "isFixAspectRatio", "setFixedAspectRatio", "fixAspectRatio", "flipHorizontally", "isFlippedHorizontally", "setFlippedHorizontally", "customOutputUri", "getCustomOutputUri", "setCustomOutputUri", "(Landroid/net/Uri;)V", "flipVertically", "isFlippedVertically", "setFlippedVertically", "guidelines", "Lcom/canhub/cropper/CropImageView$Guidelines;", "getGuidelines", "()Lcom/canhub/cropper/CropImageView$Guidelines;", "setGuidelines", "(Lcom/canhub/cropper/CropImageView$Guidelines;)V", ViewProps.ASPECT_RATIO, "Landroid/util/Pair;", "getAspectRatio", "()Landroid/util/Pair;", "setAspectRatio", "aspectRatioX", "aspectRatioY", "setImageCropOptions", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/canhub/cropper/CropImageOptions;", "clearAspectRatio", "setSnapRadius", "snapRadius", "showProgressBar", "isShowProgressBar", "setShowProgressBar", "showCropOverlay", "isShowCropOverlay", "setShowCropOverlay", "showCropLabel", "isShowCropLabel", "setShowCropLabel", "cropLabelText", "getCropLabelText", "()Ljava/lang/String;", "setCropLabelText", "(Ljava/lang/String;)V", "textSize", "cropLabelTextSize", "getCropLabelTextSize", "()F", "setCropLabelTextSize", "(F)V", "cropLabelTextColor", "getCropLabelTextColor", "setCropLabelTextColor", "resId", "imageResource", "getImageResource", "setImageResource", "wholeImageRect", "Landroid/graphics/Rect;", "getWholeImageRect", "()Landroid/graphics/Rect;", "rect", "cropRect", "getCropRect", "setCropRect", "(Landroid/graphics/Rect;)V", "expectedImageSize", "Landroid/util/Size;", "cropWindowRect", "getCropWindowRect", "()Landroid/graphics/RectF;", "cropPoints", "getCropPoints", "()[F", "resetCropRect", "croppedImage", "-croppedImage$annotations", "-croppedImage", "()Landroid/graphics/Bitmap;", "getCroppedImage", "reqWidth", "reqHeight", "Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", "croppedImageAsync", "saveCompressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "saveCompressQuality", "setOnSetCropOverlayReleasedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnSetCropOverlayMovedListener", "setOnCropWindowChangedListener", "setOnSetImageUriCompleteListener", "setOnCropImageCompleteListener", "setImageBitmap", "bitmap", "exif", "Landroidx/exifinterface/media/ExifInterface;", "setImageUriAsync", "uri", "clearImage", "rotateImage", "flipImageHorizontally", "flipImageVertically", "onSetImageUriAsyncComplete", "result", "Lcom/canhub/cropper/BitmapLoadingWorkerJob$Result;", "onSetImageUriAsyncComplete$cropper_release", "onImageCroppingAsyncComplete", "Lcom/canhub/cropper/BitmapCroppingWorkerJob$Result;", "onImageCroppingAsyncComplete$cropper_release", "setBitmap", "loadSampleSize", "degreesRotated", "clearImageInt", "startCropWorkerTask", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onLayout", "changed", CmcdData.STREAM_TYPE_LIVE, "t", "r", "b", "onSizeChanged", "w", CmcdData.STREAMING_FORMAT_HLS, "oldw", "oldh", "handleCropWindowChanged", "inProgress", "animate", "applyImageMatrix", "width", "height", "center", "mapImagePointsByImageMatrix", "setCropOverlayVisibility", "setProgressBarVisibility", "updateImageBounds", "clear", "onCropWindowChanged", "CropShape", "CropCornerShape", "ScaleType", "Guidelines", "RequestSizeOptions", "OnSetCropOverlayReleasedListener", "OnSetCropOverlayMovedListener", "OnSetCropWindowChangeListener", "OnSetImageUriCompleteListener", "OnCropImageCompleteListener", "CropResult", "Companion", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CropImageView extends FrameLayout implements CropOverlayView.CropWindowChangeListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private WeakReference<BitmapCroppingWorkerJob> bitmapCroppingWorkerJob;
    private WeakReference<BitmapLoadingWorkerJob> bitmapLoadingWorkerJob;
    private Uri customOutputUri;
    private Uri imageUri;
    private final ImageView imageView;
    private boolean isSaveBitmapToInstanceState;
    private int loadedSampleSize;
    private CropImageAnimation mAnimation;
    private boolean mAutoZoomEnabled;
    private int mCropLabelTextColor;
    private float mCropLabelTextSize;
    private final CropOverlayView mCropOverlayView;
    private String mCropTextLabel;
    private int mDegreesRotated;
    private boolean mFlipHorizontally;
    private boolean mFlipVertically;
    private final Matrix mImageInverseMatrix;
    private final Matrix mImageMatrix;
    private final float[] mImagePoints;
    private int mImageResource;
    private int mInitialDegreesRotated;
    private int mLayoutHeight;
    private int mLayoutWidth;
    private int mMaxZoom;
    private OnCropImageCompleteListener mOnCropImageCompleteListener;
    private OnSetCropOverlayReleasedListener mOnCropOverlayReleasedListener;
    private OnSetCropOverlayMovedListener mOnSetCropOverlayMovedListener;
    private OnSetCropWindowChangeListener mOnSetCropWindowChangeListener;
    private OnSetImageUriCompleteListener mOnSetImageUriCompleteListener;
    private final ProgressBar mProgressBar;
    private RectF mRestoreCropWindowRect;
    private int mRestoreDegreesRotated;
    private final float[] mScaleImagePoints;
    private ScaleType mScaleType;
    private boolean mShowCropLabel;
    private boolean mShowCropOverlay;
    private boolean mShowProgressBar;
    private boolean mSizeChanged;
    private float mZoom;
    private float mZoomOffsetX;
    private float mZoomOffsetY;
    private Bitmap originalBitmap;

    /* compiled from: CropImageView.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/canhub/cropper/CropImageView$OnCropImageCompleteListener;", "", "onCropImageComplete", "", ViewHierarchyConstants.VIEW_KEY, "Lcom/canhub/cropper/CropImageView;", "result", "Lcom/canhub/cropper/CropImageView$CropResult;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnCropImageCompleteListener {
        void onCropImageComplete(CropImageView view, CropResult result);
    }

    /* compiled from: CropImageView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/canhub/cropper/CropImageView$OnSetCropOverlayMovedListener;", "", "onCropOverlayMoved", "", "rect", "Landroid/graphics/Rect;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnSetCropOverlayMovedListener {
        void onCropOverlayMoved(Rect rect);
    }

    /* compiled from: CropImageView.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/canhub/cropper/CropImageView$OnSetCropOverlayReleasedListener;", "", "onCropOverlayReleased", "", "rect", "Landroid/graphics/Rect;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnSetCropOverlayReleasedListener {
        void onCropOverlayReleased(Rect rect);
    }

    /* compiled from: CropImageView.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/canhub/cropper/CropImageView$OnSetCropWindowChangeListener;", "", "onCropWindowChanged", "", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnSetCropWindowChangeListener {
        void onCropWindowChanged();
    }

    /* compiled from: CropImageView.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\tH&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/canhub/cropper/CropImageView$OnSetImageUriCompleteListener;", "", "onSetImageUriComplete", "", ViewHierarchyConstants.VIEW_KEY, "Lcom/canhub/cropper/CropImageView;", "uri", "Landroid/net/Uri;", "error", "Lkotlin/Exception;", "Ljava/lang/Exception;", "(Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;Ljava/lang/Exception;)V", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnSetImageUriCompleteListener {
        void onSetImageUriComplete(CropImageView view, Uri uri, Exception error);
    }

    @Deprecated(message = "Please use getCroppedImage", replaceWith = @ReplaceWith(expression = "getCroppedImage()", imports = {}))
    /* renamed from: -croppedImage$annotations, reason: not valid java name */
    public static /* synthetic */ void m9350croppedImage$annotations() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CropImageView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Deprecated(message = "This functionality is deprecated, please remove it altogether or create an issue and explain WHY you need this.")
    public static /* synthetic */ void isSaveBitmapToInstanceState$annotations() {
    }

    public final Bitmap getCroppedImage() {
        return getCroppedImage$default(this, 0, 0, null, 7, null);
    }

    public final Bitmap getCroppedImage(int i) {
        return getCroppedImage$default(this, i, 0, null, 6, null);
    }

    public final Bitmap getCroppedImage(int i, int i2) {
        return getCroppedImage$default(this, i, i2, null, 4, null);
    }

    public /* synthetic */ CropImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        if (r5 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CropImageOptions cropImageOptions;
        boolean z;
        Intent intent;
        Bundle bundleExtra;
        Intrinsics.checkNotNullParameter(context, "context");
        this.mImageMatrix = new Matrix();
        this.mImageInverseMatrix = new Matrix();
        this.mImagePoints = new float[8];
        this.mScaleImagePoints = new float[8];
        this.mShowCropOverlay = true;
        this.mCropTextLabel = "";
        this.mCropLabelTextSize = 20.0f;
        this.mCropLabelTextColor = -1;
        this.mShowProgressBar = true;
        this.mAutoZoomEnabled = true;
        this.loadedSampleSize = 1;
        this.mZoom = 1.0f;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (intent = activity.getIntent()) != null && (bundleExtra = intent.getBundleExtra(CropImage.CROP_IMAGE_EXTRA_BUNDLE)) != null) {
            Parcelable parcelable = bundleExtra.getParcelable(CropImage.CROP_IMAGE_EXTRA_OPTIONS);
            cropImageOptions = (CropImageOptions) (parcelable instanceof CropImageOptions ? parcelable : null);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CropImageView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            CropImageOptions cropImageOptions2 = new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 63, null);
            try {
                this.isSaveBitmapToInstanceState = obtainStyledAttributes.getBoolean(R.styleable.CropImageView_cropSaveBitmapToInstanceState, this.isSaveBitmapToInstanceState);
                ScaleType scaleType = ScaleType.values()[obtainStyledAttributes.getInt(R.styleable.CropImageView_cropScaleType, cropImageOptions2.scaleType.ordinal())];
                CropShape cropShape = CropShape.values()[obtainStyledAttributes.getInt(R.styleable.CropImageView_cropShape, cropImageOptions2.cropShape.ordinal())];
                CropCornerShape cropCornerShape = CropCornerShape.values()[obtainStyledAttributes.getInt(R.styleable.CropImageView_cornerShape, cropImageOptions2.cornerShape.ordinal())];
                Guidelines guidelines = Guidelines.values()[obtainStyledAttributes.getInt(R.styleable.CropImageView_cropGuidelines, cropImageOptions2.guidelines.ordinal())];
                int integer = obtainStyledAttributes.getInteger(R.styleable.CropImageView_cropAspectRatioX, cropImageOptions2.aspectRatioX);
                int integer2 = obtainStyledAttributes.getInteger(R.styleable.CropImageView_cropAspectRatioY, cropImageOptions2.aspectRatioY);
                boolean z2 = obtainStyledAttributes.getBoolean(R.styleable.CropImageView_cropAutoZoomEnabled, cropImageOptions2.autoZoomEnabled);
                boolean z3 = obtainStyledAttributes.getBoolean(R.styleable.CropImageView_cropMultiTouchEnabled, cropImageOptions2.multiTouchEnabled);
                boolean z4 = obtainStyledAttributes.getBoolean(R.styleable.CropImageView_cropCenterMoveEnabled, cropImageOptions2.centerMoveEnabled);
                float dimension = obtainStyledAttributes.getDimension(R.styleable.CropImageView_cropCornerRadius, cropImageOptions2.cropCornerRadius);
                float dimension2 = obtainStyledAttributes.getDimension(R.styleable.CropImageView_cropSnapRadius, cropImageOptions2.snapRadius);
                float dimension3 = obtainStyledAttributes.getDimension(R.styleable.CropImageView_cropTouchRadius, cropImageOptions2.touchRadius);
                float f = obtainStyledAttributes.getFloat(R.styleable.CropImageView_cropInitialCropWindowPaddingRatio, cropImageOptions2.initialCropWindowPaddingRatio);
                int integer3 = obtainStyledAttributes.getInteger(R.styleable.CropImageView_cropCornerCircleFillColor, cropImageOptions2.circleCornerFillColorHexValue);
                float dimension4 = obtainStyledAttributes.getDimension(R.styleable.CropImageView_cropBorderLineThickness, cropImageOptions2.borderLineThickness);
                int integer4 = obtainStyledAttributes.getInteger(R.styleable.CropImageView_cropBorderLineColor, cropImageOptions2.borderLineColor);
                float dimension5 = obtainStyledAttributes.getDimension(R.styleable.CropImageView_cropBorderCornerThickness, cropImageOptions2.borderCornerThickness);
                float dimension6 = obtainStyledAttributes.getDimension(R.styleable.CropImageView_cropBorderCornerOffset, cropImageOptions2.borderCornerOffset);
                float dimension7 = obtainStyledAttributes.getDimension(R.styleable.CropImageView_cropBorderCornerLength, cropImageOptions2.borderCornerLength);
                int integer5 = obtainStyledAttributes.getInteger(R.styleable.CropImageView_cropBorderCornerColor, cropImageOptions2.borderCornerColor);
                float dimension8 = obtainStyledAttributes.getDimension(R.styleable.CropImageView_cropGuidelinesThickness, cropImageOptions2.guidelinesThickness);
                int integer6 = obtainStyledAttributes.getInteger(R.styleable.CropImageView_cropGuidelinesColor, cropImageOptions2.guidelinesColor);
                int integer7 = obtainStyledAttributes.getInteger(R.styleable.CropImageView_cropBackgroundColor, cropImageOptions2.backgroundColor);
                int dimension9 = (int) obtainStyledAttributes.getDimension(R.styleable.CropImageView_cropMinCropWindowWidth, cropImageOptions2.minCropWindowWidth);
                int dimension10 = (int) obtainStyledAttributes.getDimension(R.styleable.CropImageView_cropMinCropWindowHeight, cropImageOptions2.minCropWindowHeight);
                int i = (int) obtainStyledAttributes.getFloat(R.styleable.CropImageView_cropMinCropResultWidthPX, cropImageOptions2.minCropResultWidth);
                int i2 = (int) obtainStyledAttributes.getFloat(R.styleable.CropImageView_cropMinCropResultHeightPX, cropImageOptions2.minCropResultHeight);
                int i3 = (int) obtainStyledAttributes.getFloat(R.styleable.CropImageView_cropMaxCropResultWidthPX, cropImageOptions2.maxCropResultWidth);
                int i4 = (int) obtainStyledAttributes.getFloat(R.styleable.CropImageView_cropMaxCropResultHeightPX, cropImageOptions2.maxCropResultHeight);
                boolean z5 = obtainStyledAttributes.getBoolean(R.styleable.CropImageView_cropFlipHorizontally, cropImageOptions2.flipHorizontally);
                boolean z6 = obtainStyledAttributes.getBoolean(R.styleable.CropImageView_cropFlipHorizontally, cropImageOptions2.flipVertically);
                float dimension11 = obtainStyledAttributes.getDimension(R.styleable.CropImageView_cropperLabelTextSize, cropImageOptions2.cropperLabelTextSize);
                int integer8 = obtainStyledAttributes.getInteger(R.styleable.CropImageView_cropperLabelTextColor, cropImageOptions2.cropperLabelTextColor);
                boolean z7 = obtainStyledAttributes.getBoolean(R.styleable.CropImageView_cropShowLabel, cropImageOptions2.showCropLabel);
                int integer9 = obtainStyledAttributes.getInteger(R.styleable.CropImageView_cropMaxZoom, cropImageOptions2.maxZoom);
                boolean z8 = obtainStyledAttributes.getBoolean(R.styleable.CropImageView_cropShowCropOverlay, cropImageOptions2.showCropOverlay);
                boolean z9 = obtainStyledAttributes.getBoolean(R.styleable.CropImageView_cropShowProgressBar, cropImageOptions2.showProgressBar);
                String string = obtainStyledAttributes.getString(R.styleable.CropImageView_cropperLabelText);
                if (!obtainStyledAttributes.getBoolean(R.styleable.CropImageView_cropFixAspectRatio, cropImageOptions2.fixAspectRatio) && (!obtainStyledAttributes.hasValue(R.styleable.CropImageView_cropAspectRatioX) || !obtainStyledAttributes.hasValue(R.styleable.CropImageView_cropAspectRatioX))) {
                    z = false;
                    CropImageOptions cropImageOptions3 = new CropImageOptions(false, false, cropShape, cropCornerShape, dimension, dimension2, dimension3, guidelines, scaleType, z8, z7, z9, 0, z2, z3, z4, false, integer9, f, z, integer, integer2, dimension4, integer4, dimension5, dimension6, dimension7, integer5, integer3, dimension8, integer6, integer7, dimension9, dimension10, i, i2, i3, i4, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, z5, z6, null, 0, false, false, null, null, dimension11, integer8, string, 0, null, null, null, null, 69635, 1061158848, 62, null);
                    obtainStyledAttributes.recycle();
                    cropImageOptions = cropImageOptions3;
                }
                z = true;
                CropImageOptions cropImageOptions32 = new CropImageOptions(false, false, cropShape, cropCornerShape, dimension, dimension2, dimension3, guidelines, scaleType, z8, z7, z9, 0, z2, z3, z4, false, integer9, f, z, integer, integer2, dimension4, integer4, dimension5, dimension6, dimension7, integer5, integer3, dimension8, integer6, integer7, dimension9, dimension10, i, i2, i3, i4, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, z5, z6, null, 0, false, false, null, null, dimension11, integer8, string, 0, null, null, null, null, 69635, 1061158848, 62, null);
                obtainStyledAttributes.recycle();
                cropImageOptions = cropImageOptions32;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            cropImageOptions = new CropImageOptions(false, false, null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, 0, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, null, null, null, 0, 0, 0, null, false, null, 0, false, false, false, 0, false, false, null, 0, false, false, null, null, 0.0f, 0, null, 0, null, null, null, null, -1, -1, 63, null);
        }
        this.mScaleType = cropImageOptions.scaleType;
        this.mAutoZoomEnabled = cropImageOptions.autoZoomEnabled;
        this.mMaxZoom = cropImageOptions.maxZoom;
        this.mCropLabelTextSize = cropImageOptions.cropperLabelTextSize;
        this.mShowCropLabel = cropImageOptions.showCropLabel;
        this.mShowCropOverlay = cropImageOptions.showCropOverlay;
        this.mShowProgressBar = cropImageOptions.showProgressBar;
        this.mFlipHorizontally = cropImageOptions.flipHorizontally;
        this.mFlipVertically = cropImageOptions.flipVertically;
        View inflate = LayoutInflater.from(context).inflate(R.layout.crop_image_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.ImageView_image);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView = (CropOverlayView) inflate.findViewById(R.id.CropOverlayView);
        this.mCropOverlayView = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(this);
        cropOverlayView.setInitialAttributeValues(cropImageOptions);
        ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.CropProgressBar);
        this.mProgressBar = progressBar;
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(cropImageOptions.progressBarColor));
        setProgressBarVisibility();
    }

    /* renamed from: isSaveBitmapToInstanceState, reason: from getter */
    public final boolean getIsSaveBitmapToInstanceState() {
        return this.isSaveBitmapToInstanceState;
    }

    public final void setSaveBitmapToInstanceState(boolean z) {
        this.isSaveBitmapToInstanceState = z;
    }

    public final Uri getImageUri() {
        return this.imageUri;
    }

    /* renamed from: getScaleType, reason: from getter */
    public final ScaleType getMScaleType() {
        return this.mScaleType;
    }

    public final void setScaleType(ScaleType scaleType) {
        Intrinsics.checkNotNullParameter(scaleType, "scaleType");
        if (scaleType != this.mScaleType) {
            this.mScaleType = scaleType;
            this.mZoom = 1.0f;
            this.mZoomOffsetY = 0.0f;
            this.mZoomOffsetX = 0.0f;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.resetCropOverlayView();
            }
            requestLayout();
        }
    }

    public final CropShape getCropShape() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        return cropOverlayView.getCropShape();
    }

    public final void setCropShape(CropShape cropShape) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        Intrinsics.checkNotNull(cropShape);
        cropOverlayView.setCropShape(cropShape);
    }

    public final CropCornerShape getCornerShape() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        return cropOverlayView.getCornerShape();
    }

    public final void setCornerShape(CropCornerShape cropCornerShape) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        Intrinsics.checkNotNull(cropCornerShape);
        cropOverlayView.setCropCornerShape(cropCornerShape);
    }

    /* renamed from: isAutoZoomEnabled, reason: from getter */
    public final boolean getMAutoZoomEnabled() {
        return this.mAutoZoomEnabled;
    }

    public final void setAutoZoomEnabled(boolean z) {
        if (this.mAutoZoomEnabled != z) {
            this.mAutoZoomEnabled = z;
            handleCropWindowChanged(false, false);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.invalidate();
        }
    }

    public final void setMultiTouchEnabled(boolean multiTouchEnabled) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        if (cropOverlayView.setMultiTouchEnabled(multiTouchEnabled)) {
            handleCropWindowChanged(false, false);
            this.mCropOverlayView.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean centerMoveEnabled) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        if (cropOverlayView.setCenterMoveEnabled(centerMoveEnabled)) {
            handleCropWindowChanged(false, false);
            this.mCropOverlayView.invalidate();
        }
    }

    /* renamed from: getMaxZoom, reason: from getter */
    public final int getMMaxZoom() {
        return this.mMaxZoom;
    }

    public final void setMaxZoom(int i) {
        if (this.mMaxZoom == i || i <= 0) {
            return;
        }
        this.mMaxZoom = i;
        handleCropWindowChanged(false, false);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.invalidate();
    }

    public final void setMinCropResultSize(int minCropResultWidth, int minCropResultHeight) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setMinCropResultSize(minCropResultWidth, minCropResultHeight);
    }

    public final void setMaxCropResultSize(int maxCropResultWidth, int maxCropResultHeight) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setMaxCropResultSize(maxCropResultWidth, maxCropResultHeight);
    }

    /* renamed from: getRotatedDegrees, reason: from getter */
    public final int getMDegreesRotated() {
        return this.mDegreesRotated;
    }

    public final void setRotatedDegrees(int i) {
        int i2 = this.mDegreesRotated;
        if (i2 != i) {
            rotateImage(i - i2);
        }
    }

    public final boolean isFixAspectRatio() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        return cropOverlayView.getIsFixAspectRatio();
    }

    public final void setFixedAspectRatio(boolean fixAspectRatio) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setFixedAspectRatio(fixAspectRatio);
    }

    /* renamed from: isFlippedHorizontally, reason: from getter */
    public final boolean getMFlipHorizontally() {
        return this.mFlipHorizontally;
    }

    public final void setFlippedHorizontally(boolean z) {
        if (this.mFlipHorizontally != z) {
            this.mFlipHorizontally = z;
            applyImageMatrix(getWidth(), getHeight(), true, false);
        }
    }

    public final Uri getCustomOutputUri() {
        return this.customOutputUri;
    }

    public final void setCustomOutputUri(Uri uri) {
        this.customOutputUri = uri;
    }

    /* renamed from: isFlippedVertically, reason: from getter */
    public final boolean getMFlipVertically() {
        return this.mFlipVertically;
    }

    public final void setFlippedVertically(boolean z) {
        if (this.mFlipVertically != z) {
            this.mFlipVertically = z;
            applyImageMatrix(getWidth(), getHeight(), true, false);
        }
    }

    public final Guidelines getGuidelines() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        return cropOverlayView.getGuidelines();
    }

    public final void setGuidelines(Guidelines guidelines) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        Intrinsics.checkNotNull(guidelines);
        cropOverlayView.setGuidelines(guidelines);
    }

    public final Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        return new Pair<>(Integer.valueOf(cropOverlayView.getMAspectRatioX()), Integer.valueOf(this.mCropOverlayView.getMAspectRatioY()));
    }

    public final void setAspectRatio(int aspectRatioX, int aspectRatioY) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setAspectRatioX(aspectRatioX);
        this.mCropOverlayView.setAspectRatioY(aspectRatioY);
        this.mCropOverlayView.setFixedAspectRatio(true);
    }

    public final void setImageCropOptions(CropImageOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        setScaleType(options.scaleType);
        this.customOutputUri = options.customOutputUri;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setInitialAttributeValues(options);
        }
        setMultiTouchEnabled(options.multiTouchEnabled);
        setCenterMoveEnabled(options.centerMoveEnabled);
        setShowCropOverlay(options.showCropOverlay);
        setShowProgressBar(options.showProgressBar);
        setAutoZoomEnabled(options.autoZoomEnabled);
        setMaxZoom(options.maxZoom);
        setFlippedHorizontally(options.flipHorizontally);
        setFlippedVertically(options.flipVertically);
        this.mAutoZoomEnabled = options.autoZoomEnabled;
        this.mShowCropOverlay = options.showCropOverlay;
        this.mShowProgressBar = options.showProgressBar;
        this.mProgressBar.setIndeterminateTintList(ColorStateList.valueOf(options.progressBarColor));
    }

    public final void clearAspectRatio() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setAspectRatioX(1);
        this.mCropOverlayView.setAspectRatioY(1);
        setFixedAspectRatio(false);
    }

    public final void setSnapRadius(float snapRadius) {
        if (snapRadius >= 0.0f) {
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setSnapRadius(snapRadius);
        }
    }

    /* renamed from: isShowProgressBar, reason: from getter */
    public final boolean getMShowProgressBar() {
        return this.mShowProgressBar;
    }

    public final void setShowProgressBar(boolean z) {
        if (this.mShowProgressBar != z) {
            this.mShowProgressBar = z;
            setProgressBarVisibility();
        }
    }

    /* renamed from: isShowCropOverlay, reason: from getter */
    public final boolean getMShowCropOverlay() {
        return this.mShowCropOverlay;
    }

    public final void setShowCropOverlay(boolean z) {
        if (this.mShowCropOverlay != z) {
            this.mShowCropOverlay = z;
            setCropOverlayVisibility();
        }
    }

    /* renamed from: isShowCropLabel, reason: from getter */
    public final boolean getMShowCropLabel() {
        return this.mShowCropLabel;
    }

    public final void setShowCropLabel(boolean z) {
        if (this.mShowCropLabel != z) {
            this.mShowCropLabel = z;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.setCropperTextLabelVisibility(z);
            }
        }
    }

    /* renamed from: getCropLabelText, reason: from getter */
    public final String getMCropTextLabel() {
        return this.mCropTextLabel;
    }

    public final void setCropLabelText(String cropLabelText) {
        Intrinsics.checkNotNullParameter(cropLabelText, "cropLabelText");
        this.mCropTextLabel = cropLabelText;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelText(cropLabelText);
        }
    }

    /* renamed from: getCropLabelTextSize, reason: from getter */
    public final float getMCropLabelTextSize() {
        return this.mCropLabelTextSize;
    }

    public final void setCropLabelTextSize(float f) {
        this.mCropLabelTextSize = getMCropLabelTextSize();
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextSize(f);
        }
    }

    /* renamed from: getCropLabelTextColor, reason: from getter */
    public final int getMCropLabelTextColor() {
        return this.mCropLabelTextColor;
    }

    public final void setCropLabelTextColor(int i) {
        this.mCropLabelTextColor = i;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextColor(i);
        }
    }

    /* renamed from: getImageResource, reason: from getter */
    public final int getMImageResource() {
        return this.mImageResource;
    }

    public final void setImageResource(int i) {
        if (i != 0) {
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            setBitmap(BitmapFactory.decodeResource(getResources(), i), i, null, 1, 0);
        }
    }

    public final Rect getWholeImageRect() {
        int i = this.loadedSampleSize;
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i, bitmap.getHeight() * i);
    }

    public final Rect getCropRect() {
        int i = this.loadedSampleSize;
        Bitmap bitmap = this.originalBitmap;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i;
        int height = bitmap.getHeight() * i;
        BitmapUtils bitmapUtils = BitmapUtils.INSTANCE;
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        return bitmapUtils.getRectFromPoints(cropPoints, width, height, cropOverlayView.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY());
    }

    public final void setCropRect(Rect rect) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(rect);
    }

    public final Size expectedImageSize() {
        Rect cropRect = getCropRect();
        if (cropRect == null) {
            return null;
        }
        if (getMDegreesRotated() == 0 || getMDegreesRotated() == 180) {
            return new Size(cropRect.width(), cropRect.height());
        }
        return new Size(cropRect.height(), cropRect.width());
    }

    public final RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            return cropOverlayView.getCropWindowRect();
        }
        return null;
    }

    public final float[] getCropPoints() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        float[] fArr = {cropWindowRect.left, cropWindowRect.top, cropWindowRect.right, cropWindowRect.top, cropWindowRect.right, cropWindowRect.bottom, cropWindowRect.left, cropWindowRect.bottom};
        this.mImageMatrix.invert(this.mImageInverseMatrix);
        this.mImageInverseMatrix.mapPoints(fArr);
        float[] fArr2 = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr2[i] = fArr[i] * this.loadedSampleSize;
        }
        return fArr2;
    }

    public final void resetCropRect() {
        this.mZoom = 1.0f;
        this.mZoomOffsetX = 0.0f;
        this.mZoomOffsetY = 0.0f;
        this.mDegreesRotated = this.mInitialDegreesRotated;
        this.mFlipHorizontally = false;
        this.mFlipVertically = false;
        applyImageMatrix(getWidth(), getHeight(), false, false);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.resetCropWindowRect();
    }

    /* renamed from: -croppedImage, reason: not valid java name */
    public final Bitmap m9351croppedImage() {
        return getCroppedImage(0, 0, RequestSizeOptions.NONE);
    }

    public static /* synthetic */ Bitmap getCroppedImage$default(CropImageView cropImageView, int i, int i2, RequestSizeOptions requestSizeOptions, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            requestSizeOptions = RequestSizeOptions.RESIZE_INSIDE;
        }
        return cropImageView.getCroppedImage(i, i2, requestSizeOptions);
    }

    public final Bitmap getCroppedImage(int reqWidth, int reqHeight, RequestSizeOptions options) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.originalBitmap == null) {
            return null;
        }
        int i = options != RequestSizeOptions.NONE ? reqWidth : 0;
        int i2 = options != RequestSizeOptions.NONE ? reqHeight : 0;
        if (this.imageUri != null && (this.loadedSampleSize > 1 || options == RequestSizeOptions.SAMPLING)) {
            BitmapUtils bitmapUtils = BitmapUtils.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Uri uri = this.imageUri;
            float[] cropPoints = getCropPoints();
            int i3 = this.mDegreesRotated;
            Bitmap bitmap2 = this.originalBitmap;
            Intrinsics.checkNotNull(bitmap2);
            int width = bitmap2.getWidth() * this.loadedSampleSize;
            Bitmap bitmap3 = this.originalBitmap;
            Intrinsics.checkNotNull(bitmap3);
            int height = bitmap3.getHeight() * this.loadedSampleSize;
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            bitmap = bitmapUtils.cropBitmap(context, uri, cropPoints, i3, width, height, cropOverlayView.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY(), i, i2, this.mFlipHorizontally, this.mFlipVertically).getBitmap();
        } else {
            BitmapUtils bitmapUtils2 = BitmapUtils.INSTANCE;
            Bitmap bitmap4 = this.originalBitmap;
            float[] cropPoints2 = getCropPoints();
            int i4 = this.mDegreesRotated;
            CropOverlayView cropOverlayView2 = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView2);
            bitmap = bitmapUtils2.cropBitmapObjectHandleOOM(bitmap4, cropPoints2, i4, cropOverlayView2.getIsFixAspectRatio(), this.mCropOverlayView.getMAspectRatioX(), this.mCropOverlayView.getMAspectRatioY(), this.mFlipHorizontally, this.mFlipVertically).getBitmap();
        }
        return BitmapUtils.INSTANCE.resizeBitmap(bitmap, i, i2, options);
    }

    public static /* synthetic */ void croppedImageAsync$default(CropImageView cropImageView, Bitmap.CompressFormat compressFormat, int i, int i2, int i3, RequestSizeOptions requestSizeOptions, Uri uri, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        if ((i4 & 2) != 0) {
            i = 90;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        if ((i4 & 16) != 0) {
            requestSizeOptions = RequestSizeOptions.RESIZE_INSIDE;
        }
        if ((i4 & 32) != 0) {
            uri = null;
        }
        cropImageView.croppedImageAsync(compressFormat, i, i2, i3, requestSizeOptions, uri);
    }

    public final void croppedImageAsync(Bitmap.CompressFormat saveCompressFormat, int saveCompressQuality, int reqWidth, int reqHeight, RequestSizeOptions options, Uri customOutputUri) {
        Intrinsics.checkNotNullParameter(saveCompressFormat, "saveCompressFormat");
        Intrinsics.checkNotNullParameter(options, "options");
        if (this.mOnCropImageCompleteListener == null) {
            throw new IllegalArgumentException("mOnCropImageCompleteListener is not set".toString());
        }
        startCropWorkerTask(reqWidth, reqHeight, options, saveCompressFormat, saveCompressQuality, customOutputUri);
    }

    public final void setOnSetCropOverlayReleasedListener(OnSetCropOverlayReleasedListener listener) {
        this.mOnCropOverlayReleasedListener = listener;
    }

    public final void setOnSetCropOverlayMovedListener(OnSetCropOverlayMovedListener listener) {
        this.mOnSetCropOverlayMovedListener = listener;
    }

    public final void setOnCropWindowChangedListener(OnSetCropWindowChangeListener listener) {
        this.mOnSetCropWindowChangeListener = listener;
    }

    public final void setOnSetImageUriCompleteListener(OnSetImageUriCompleteListener listener) {
        this.mOnSetImageUriCompleteListener = listener;
    }

    public final void setOnCropImageCompleteListener(OnCropImageCompleteListener listener) {
        this.mOnCropImageCompleteListener = listener;
    }

    public final void setImageBitmap(Bitmap bitmap) {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(null);
        setBitmap(bitmap, 0, null, 1, 0);
    }

    public final void setImageBitmap(Bitmap bitmap, ExifInterface exif) {
        int i;
        Bitmap bitmap2;
        if (bitmap == null || exif == null) {
            i = 0;
            bitmap2 = bitmap;
        } else {
            BitmapUtils.RotateBitmapResult orientateBitmapByExif = BitmapUtils.INSTANCE.orientateBitmapByExif(bitmap, exif);
            Bitmap bitmap3 = orientateBitmapByExif.getBitmap();
            i = orientateBitmapByExif.getDegrees();
            this.mFlipHorizontally = orientateBitmapByExif.getFlipHorizontally();
            this.mFlipVertically = orientateBitmapByExif.getFlipVertically();
            this.mInitialDegreesRotated = orientateBitmapByExif.getDegrees();
            bitmap2 = bitmap3;
        }
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(null);
        setBitmap(bitmap2, 0, null, 1, i);
    }

    public final void setImageUriAsync(Uri uri) {
        BitmapLoadingWorkerJob bitmapLoadingWorkerJob;
        if (uri != null) {
            WeakReference<BitmapLoadingWorkerJob> weakReference = this.bitmapLoadingWorkerJob;
            if (weakReference != null && (bitmapLoadingWorkerJob = weakReference.get()) != null) {
                bitmapLoadingWorkerJob.cancel();
            }
            clearImageInt();
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect(null);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            WeakReference<BitmapLoadingWorkerJob> weakReference2 = new WeakReference<>(new BitmapLoadingWorkerJob(context, this, uri));
            this.bitmapLoadingWorkerJob = weakReference2;
            BitmapLoadingWorkerJob bitmapLoadingWorkerJob2 = weakReference2.get();
            if (bitmapLoadingWorkerJob2 != null) {
                bitmapLoadingWorkerJob2.start();
            }
            setProgressBarVisibility();
        }
    }

    public final void clearImage() {
        clearImageInt();
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setInitialCropWindowRect(null);
        }
    }

    public final void rotateImage(int degrees) {
        int i;
        if (this.originalBitmap != null) {
            if (degrees < 0) {
                i = (degrees % CropImageOptionsKt.DEGREES_360) + CropImageOptionsKt.DEGREES_360;
            } else {
                i = degrees % CropImageOptionsKt.DEGREES_360;
            }
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            boolean z = !cropOverlayView.getIsFixAspectRatio() && ((46 <= i && i < 135) || (216 <= i && i < 305));
            BitmapUtils.INSTANCE.getRECT().set(this.mCropOverlayView.getCropWindowRect());
            RectF rect = BitmapUtils.INSTANCE.getRECT();
            float height = (z ? rect.height() : rect.width()) / 2.0f;
            RectF rect2 = BitmapUtils.INSTANCE.getRECT();
            float width = (z ? rect2.width() : rect2.height()) / 2.0f;
            if (z) {
                boolean z2 = this.mFlipHorizontally;
                this.mFlipHorizontally = this.mFlipVertically;
                this.mFlipVertically = z2;
            }
            this.mImageMatrix.invert(this.mImageInverseMatrix);
            BitmapUtils.INSTANCE.getPOINTS()[0] = BitmapUtils.INSTANCE.getRECT().centerX();
            BitmapUtils.INSTANCE.getPOINTS()[1] = BitmapUtils.INSTANCE.getRECT().centerY();
            BitmapUtils.INSTANCE.getPOINTS()[2] = 0.0f;
            BitmapUtils.INSTANCE.getPOINTS()[3] = 0.0f;
            BitmapUtils.INSTANCE.getPOINTS()[4] = 1.0f;
            BitmapUtils.INSTANCE.getPOINTS()[5] = 0.0f;
            this.mImageInverseMatrix.mapPoints(BitmapUtils.INSTANCE.getPOINTS());
            this.mDegreesRotated = (this.mDegreesRotated + i) % CropImageOptionsKt.DEGREES_360;
            applyImageMatrix(getWidth(), getHeight(), true, false);
            this.mImageMatrix.mapPoints(BitmapUtils.INSTANCE.getPOINTS2(), BitmapUtils.INSTANCE.getPOINTS());
            float sqrt = this.mZoom / ((float) Math.sqrt(Math.pow(BitmapUtils.INSTANCE.getPOINTS2()[4] - BitmapUtils.INSTANCE.getPOINTS2()[2], 2.0d) + Math.pow(BitmapUtils.INSTANCE.getPOINTS2()[5] - BitmapUtils.INSTANCE.getPOINTS2()[3], 2.0d)));
            this.mZoom = sqrt;
            this.mZoom = Math.max(sqrt, 1.0f);
            applyImageMatrix(getWidth(), getHeight(), true, false);
            this.mImageMatrix.mapPoints(BitmapUtils.INSTANCE.getPOINTS2(), BitmapUtils.INSTANCE.getPOINTS());
            float sqrt2 = (float) Math.sqrt(Math.pow(BitmapUtils.INSTANCE.getPOINTS2()[4] - BitmapUtils.INSTANCE.getPOINTS2()[2], 2.0d) + Math.pow(BitmapUtils.INSTANCE.getPOINTS2()[5] - BitmapUtils.INSTANCE.getPOINTS2()[3], 2.0d));
            float f = height * sqrt2;
            float f2 = width * sqrt2;
            BitmapUtils.INSTANCE.getRECT().set(BitmapUtils.INSTANCE.getPOINTS2()[0] - f, BitmapUtils.INSTANCE.getPOINTS2()[1] - f2, BitmapUtils.INSTANCE.getPOINTS2()[0] + f, BitmapUtils.INSTANCE.getPOINTS2()[1] + f2);
            this.mCropOverlayView.resetCropOverlayView();
            this.mCropOverlayView.setCropWindowRect(BitmapUtils.INSTANCE.getRECT());
            applyImageMatrix(getWidth(), getHeight(), true, false);
            handleCropWindowChanged(false, false);
            this.mCropOverlayView.fixCurrentCropWindowRect();
        }
    }

    public final void flipImageHorizontally() {
        this.mFlipHorizontally = !this.mFlipHorizontally;
        applyImageMatrix(getWidth(), getHeight(), true, false);
    }

    public final void flipImageVertically() {
        this.mFlipVertically = !this.mFlipVertically;
        applyImageMatrix(getWidth(), getHeight(), true, false);
    }

    public final void onSetImageUriAsyncComplete$cropper_release(BitmapLoadingWorkerJob.Result result) {
        CropImageView cropImageView;
        Intrinsics.checkNotNullParameter(result, "result");
        this.bitmapLoadingWorkerJob = null;
        setProgressBarVisibility();
        if (result.getError() == null) {
            this.mInitialDegreesRotated = result.getDegreesRotated();
            this.mFlipHorizontally = result.getFlipHorizontally();
            this.mFlipVertically = result.getFlipVertically();
            cropImageView = this;
            cropImageView.setBitmap(result.getBitmap(), 0, result.getUri(), result.getLoadSampleSize(), result.getDegreesRotated());
        } else {
            cropImageView = this;
        }
        OnSetImageUriCompleteListener onSetImageUriCompleteListener = cropImageView.mOnSetImageUriCompleteListener;
        if (onSetImageUriCompleteListener != null) {
            onSetImageUriCompleteListener.onSetImageUriComplete(this, result.getUri(), result.getError());
        }
    }

    public final void onImageCroppingAsyncComplete$cropper_release(BitmapCroppingWorkerJob.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.bitmapCroppingWorkerJob = null;
        setProgressBarVisibility();
        OnCropImageCompleteListener onCropImageCompleteListener = this.mOnCropImageCompleteListener;
        if (onCropImageCompleteListener != null) {
            onCropImageCompleteListener.onCropImageComplete(this, new CropResult(this.originalBitmap, this.imageUri, result.getBitmap(), result.getUri(), result.getError(), getCropPoints(), getCropRect(), getWholeImageRect(), getMDegreesRotated(), result.getSampleSize()));
        }
    }

    private final void setBitmap(Bitmap bitmap, int imageResource, Uri imageUri, int loadSampleSize, int degreesRotated) {
        Bitmap bitmap2 = this.originalBitmap;
        if (bitmap2 == null || !Intrinsics.areEqual(bitmap2, bitmap)) {
            clearImageInt();
            this.originalBitmap = bitmap;
            this.imageView.setImageBitmap(bitmap);
            this.imageUri = imageUri;
            this.mImageResource = imageResource;
            this.loadedSampleSize = loadSampleSize;
            this.mDegreesRotated = degreesRotated;
            applyImageMatrix(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            if (cropOverlayView != null) {
                cropOverlayView.resetCropOverlayView();
                setCropOverlayVisibility();
            }
        }
    }

    private final void clearImageInt() {
        Bitmap bitmap = this.originalBitmap;
        if (bitmap != null && (this.mImageResource > 0 || this.imageUri != null)) {
            Intrinsics.checkNotNull(bitmap);
            bitmap.recycle();
        }
        this.originalBitmap = null;
        this.mImageResource = 0;
        this.imageUri = null;
        this.loadedSampleSize = 1;
        this.mDegreesRotated = 0;
        this.mZoom = 1.0f;
        this.mZoomOffsetX = 0.0f;
        this.mZoomOffsetY = 0.0f;
        this.mImageMatrix.reset();
        this.mRestoreCropWindowRect = null;
        this.mRestoreDegreesRotated = 0;
        this.imageView.setImageBitmap(null);
        setCropOverlayVisibility();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final void startCropWorkerTask(int r22, int r23, com.canhub.cropper.CropImageView.RequestSizeOptions r24, android.graphics.Bitmap.CompressFormat r25, int r26, android.net.Uri r27) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.startCropWorkerTask(int, int, com.canhub.cropper.CropImageView$RequestSizeOptions, android.graphics.Bitmap$CompressFormat, int, android.net.Uri):void");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Uri uri;
        if (this.imageUri == null && this.originalBitmap == null && this.mImageResource < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        if (this.isSaveBitmapToInstanceState && this.imageUri == null && this.mImageResource < 1) {
            BitmapUtils bitmapUtils = BitmapUtils.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            uri = bitmapUtils.writeTempStateStoreBitmap(context, this.originalBitmap, this.customOutputUri);
        } else {
            uri = this.imageUri;
        }
        if (uri != null && this.originalBitmap != null) {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            BitmapUtils.INSTANCE.setMStateBitmap(new Pair<>(uuid, new WeakReference(this.originalBitmap)));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference<BitmapLoadingWorkerJob> weakReference = this.bitmapLoadingWorkerJob;
        BitmapLoadingWorkerJob bitmapLoadingWorkerJob = weakReference != null ? weakReference.get() : null;
        if (bitmapLoadingWorkerJob != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", bitmapLoadingWorkerJob.getUri());
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.mImageResource);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.loadedSampleSize);
        bundle.putInt("DEGREES_ROTATED", this.mDegreesRotated);
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getMInitialCropWindowRect());
        BitmapUtils.INSTANCE.getRECT().set(this.mCropOverlayView.getCropWindowRect());
        this.mImageMatrix.invert(this.mImageInverseMatrix);
        this.mImageInverseMatrix.mapRect(BitmapUtils.INSTANCE.getRECT());
        bundle.putParcelable("CROP_WINDOW_RECT", BitmapUtils.INSTANCE.getRECT());
        CropShape cropShape = this.mCropOverlayView.getCropShape();
        Intrinsics.checkNotNull(cropShape);
        bundle.putString("CROP_SHAPE", cropShape.name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.mAutoZoomEnabled);
        bundle.putInt("CROP_MAX_ZOOM", this.mMaxZoom);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.mFlipHorizontally);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.mFlipVertically);
        bundle.putBoolean("SHOW_CROP_LABEL", this.mShowCropLabel);
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onRestoreInstanceState(Parcelable state) {
        CropImageView cropImageView;
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof Bundle) {
            if (this.bitmapLoadingWorkerJob == null && this.imageUri == null && this.originalBitmap == null && this.mImageResource == 0) {
                Bundle bundle = (Bundle) state;
                Parcelable parcelable = bundle.getParcelable("LOADED_IMAGE_URI");
                if (!(parcelable instanceof Uri)) {
                    parcelable = null;
                }
                Uri uri = (Uri) parcelable;
                if (uri != null) {
                    String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if (string != null) {
                        Pair<String, WeakReference<Bitmap>> mStateBitmap = BitmapUtils.INSTANCE.getMStateBitmap();
                        if (mStateBitmap != null) {
                            bitmap = Intrinsics.areEqual(mStateBitmap.first, string) ? (Bitmap) ((WeakReference) mStateBitmap.second).get() : null;
                        } else {
                            bitmap = null;
                        }
                        BitmapUtils.INSTANCE.setMStateBitmap(null);
                        if (bitmap != null && !bitmap.isRecycled()) {
                            cropImageView = this;
                            cropImageView.setBitmap(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                            if (cropImageView.imageUri == null) {
                                setImageUriAsync(uri);
                                Unit unit = Unit.INSTANCE;
                            }
                        }
                    }
                    cropImageView = this;
                    if (cropImageView.imageUri == null) {
                    }
                } else {
                    cropImageView = this;
                    int i = bundle.getInt("LOADED_IMAGE_RESOURCE");
                    if (i > 0) {
                        setImageResource(i);
                        Unit unit2 = Unit.INSTANCE;
                    } else {
                        Parcelable parcelable2 = bundle.getParcelable("LOADING_IMAGE_URI");
                        if (!(parcelable2 instanceof Uri)) {
                            parcelable2 = null;
                        }
                        Uri uri2 = (Uri) parcelable2;
                        if (uri2 != null) {
                            setImageUriAsync(uri2);
                            Unit unit3 = Unit.INSTANCE;
                        }
                    }
                }
                int i2 = bundle.getInt("DEGREES_ROTATED");
                cropImageView.mRestoreDegreesRotated = i2;
                cropImageView.mDegreesRotated = i2;
                Parcelable parcelable3 = bundle.getParcelable("INITIAL_CROP_RECT");
                if (!(parcelable3 instanceof Rect)) {
                    parcelable3 = null;
                }
                Rect rect = (Rect) parcelable3;
                if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                    CropOverlayView cropOverlayView = cropImageView.mCropOverlayView;
                    Intrinsics.checkNotNull(cropOverlayView);
                    cropOverlayView.setInitialCropWindowRect(rect);
                }
                Parcelable parcelable4 = bundle.getParcelable("CROP_WINDOW_RECT");
                if (!(parcelable4 instanceof RectF)) {
                    parcelable4 = null;
                }
                RectF rectF = (RectF) parcelable4;
                if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                    cropImageView.mRestoreCropWindowRect = rectF;
                }
                CropOverlayView cropOverlayView2 = cropImageView.mCropOverlayView;
                Intrinsics.checkNotNull(cropOverlayView2);
                String string2 = bundle.getString("CROP_SHAPE");
                Intrinsics.checkNotNull(string2);
                cropOverlayView2.setCropShape(CropShape.valueOf(string2));
                cropImageView.mAutoZoomEnabled = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
                cropImageView.mMaxZoom = bundle.getInt("CROP_MAX_ZOOM");
                cropImageView.mFlipHorizontally = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
                cropImageView.mFlipVertically = bundle.getBoolean("CROP_FLIP_VERTICALLY");
                boolean z = bundle.getBoolean("SHOW_CROP_LABEL");
                cropImageView.mShowCropLabel = z;
                cropImageView.mCropOverlayView.setCropperTextLabelVisibility(z);
            }
            Parcelable parcelable5 = ((Bundle) state).getParcelable("instanceState");
            super.onRestoreInstanceState(parcelable5 instanceof Parcelable ? parcelable5 : null);
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width;
        int i;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        Bitmap bitmap = this.originalBitmap;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            double width2 = size < bitmap.getWidth() ? size / bitmap.getWidth() : Double.POSITIVE_INFINITY;
            double height = size2 < bitmap.getHeight() ? size2 / bitmap.getHeight() : Double.POSITIVE_INFINITY;
            if (width2 == Double.POSITIVE_INFINITY && height == Double.POSITIVE_INFINITY) {
                width = bitmap.getWidth();
                i = bitmap.getHeight();
            } else if (width2 <= height) {
                i = (int) (bitmap.getHeight() * width2);
                width = size;
            } else {
                width = (int) (bitmap.getWidth() * height);
                i = size2;
            }
            Companion companion = INSTANCE;
            int onMeasureSpec$cropper_release = companion.getOnMeasureSpec$cropper_release(mode, size, width);
            int onMeasureSpec$cropper_release2 = companion.getOnMeasureSpec$cropper_release(mode2, size2, i);
            this.mLayoutWidth = onMeasureSpec$cropper_release;
            this.mLayoutHeight = onMeasureSpec$cropper_release2;
            setMeasuredDimension(onMeasureSpec$cropper_release, onMeasureSpec$cropper_release2);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
        if (this.mLayoutWidth > 0 && this.mLayoutHeight > 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = this.mLayoutWidth;
            layoutParams.height = this.mLayoutHeight;
            setLayoutParams(layoutParams);
            if (this.originalBitmap != null) {
                float f = r - l;
                float f2 = b - t;
                applyImageMatrix(f, f2, true, false);
                RectF rectF = this.mRestoreCropWindowRect;
                if (rectF != null) {
                    int i = this.mRestoreDegreesRotated;
                    if (i != this.mInitialDegreesRotated) {
                        this.mDegreesRotated = i;
                        applyImageMatrix(f, f2, true, false);
                        this.mRestoreDegreesRotated = 0;
                    }
                    this.mImageMatrix.mapRect(this.mRestoreCropWindowRect);
                    CropOverlayView cropOverlayView = this.mCropOverlayView;
                    if (cropOverlayView != null) {
                        cropOverlayView.setCropWindowRect(rectF);
                    }
                    handleCropWindowChanged(false, false);
                    CropOverlayView cropOverlayView2 = this.mCropOverlayView;
                    if (cropOverlayView2 != null) {
                        cropOverlayView2.fixCurrentCropWindowRect();
                    }
                    this.mRestoreCropWindowRect = null;
                    return;
                }
                if (this.mSizeChanged) {
                    this.mSizeChanged = false;
                    handleCropWindowChanged(false, false);
                    return;
                }
                return;
            }
            updateImageBounds(true);
            return;
        }
        updateImageBounds(true);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mSizeChanged = oldw > 0 && oldh > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void handleCropWindowChanged(boolean inProgress, boolean animate) {
        float f;
        float f2;
        int width = getWidth();
        int height = getHeight();
        if (this.originalBitmap == null || width <= 0 || height <= 0) {
            return;
        }
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        if (!inProgress) {
            if (this.mAutoZoomEnabled || this.mZoom > 1.0f) {
                if (this.mZoom < this.mMaxZoom) {
                    float f3 = width;
                    if (cropWindowRect.width() < f3 * 0.5f) {
                        float f4 = height;
                        if (cropWindowRect.height() < 0.5f * f4) {
                            f = Math.min(this.mMaxZoom, Math.min(f3 / ((cropWindowRect.width() / this.mZoom) / 0.64f), f4 / ((cropWindowRect.height() / this.mZoom) / 0.64f)));
                            if (this.mZoom > 1.0f) {
                                float f5 = width;
                                if (cropWindowRect.width() > f5 * 0.65f || cropWindowRect.height() > height * 0.65f) {
                                    f = Math.max(1.0f, Math.min(f5 / ((cropWindowRect.width() / this.mZoom) / 0.51f), height / ((cropWindowRect.height() / this.mZoom) / 0.51f)));
                                }
                            }
                            f2 = this.mAutoZoomEnabled ? f : 1.0f;
                            if (f2 > 0.0f && f2 != this.mZoom) {
                                if (animate) {
                                    if (this.mAnimation == null) {
                                        this.mAnimation = new CropImageAnimation(this.imageView, this.mCropOverlayView);
                                    }
                                    CropImageAnimation cropImageAnimation = this.mAnimation;
                                    Intrinsics.checkNotNull(cropImageAnimation);
                                    cropImageAnimation.setStartState(this.mImagePoints, this.mImageMatrix);
                                }
                                this.mZoom = f2;
                                applyImageMatrix(width, height, true, animate);
                            }
                        }
                    }
                }
                f = 0.0f;
                if (this.mZoom > 1.0f) {
                }
                if (this.mAutoZoomEnabled) {
                }
                if (f2 > 0.0f) {
                    if (animate) {
                    }
                    this.mZoom = f2;
                    applyImageMatrix(width, height, true, animate);
                }
            }
        } else if (cropWindowRect.left < 0.0f || cropWindowRect.top < 0.0f || cropWindowRect.right > width || cropWindowRect.bottom > height) {
            applyImageMatrix(width, height, false, false);
        }
        OnSetCropWindowChangeListener onSetCropWindowChangeListener = this.mOnSetCropWindowChangeListener;
        if (onSetCropWindowChangeListener == null || inProgress) {
            return;
        }
        Intrinsics.checkNotNull(onSetCropWindowChangeListener);
        onSetCropWindowChangeListener.onCropWindowChanged();
    }

    private final void applyImageMatrix(float width, float height, boolean center, boolean animate) {
        if (this.originalBitmap != null) {
            if (width <= 0.0f || height <= 0.0f) {
                return;
            }
            this.mImageMatrix.invert(this.mImageInverseMatrix);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            this.mImageInverseMatrix.mapRect(cropWindowRect);
            this.mImageMatrix.reset();
            float f = 2;
            this.mImageMatrix.postTranslate((width - r0.getWidth()) / f, (height - r0.getHeight()) / f);
            mapImagePointsByImageMatrix();
            int i = this.mDegreesRotated;
            if (i > 0) {
                this.mImageMatrix.postRotate(i, BitmapUtils.INSTANCE.getRectCenterX(this.mImagePoints), BitmapUtils.INSTANCE.getRectCenterY(this.mImagePoints));
                mapImagePointsByImageMatrix();
            }
            float min = Math.min(width / BitmapUtils.INSTANCE.getRectWidth(this.mImagePoints), height / BitmapUtils.INSTANCE.getRectHeight(this.mImagePoints));
            if (this.mScaleType == ScaleType.FIT_CENTER || ((this.mScaleType == ScaleType.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.mAutoZoomEnabled))) {
                this.mImageMatrix.postScale(min, min, BitmapUtils.INSTANCE.getRectCenterX(this.mImagePoints), BitmapUtils.INSTANCE.getRectCenterY(this.mImagePoints));
                mapImagePointsByImageMatrix();
            } else if (this.mScaleType == ScaleType.CENTER_CROP) {
                this.mZoom = Math.max(getWidth() / BitmapUtils.INSTANCE.getRectWidth(this.mImagePoints), getHeight() / BitmapUtils.INSTANCE.getRectHeight(this.mImagePoints));
            }
            float f2 = this.mFlipHorizontally ? -this.mZoom : this.mZoom;
            float f3 = this.mFlipVertically ? -this.mZoom : this.mZoom;
            this.mImageMatrix.postScale(f2, f3, BitmapUtils.INSTANCE.getRectCenterX(this.mImagePoints), BitmapUtils.INSTANCE.getRectCenterY(this.mImagePoints));
            mapImagePointsByImageMatrix();
            this.mImageMatrix.mapRect(cropWindowRect);
            if (this.mScaleType == ScaleType.CENTER_CROP && center && !animate) {
                this.mZoomOffsetX = 0.0f;
                this.mZoomOffsetY = 0.0f;
            } else if (center) {
                this.mZoomOffsetX = width > BitmapUtils.INSTANCE.getRectWidth(this.mImagePoints) ? 0.0f : Math.max(Math.min((width / f) - cropWindowRect.centerX(), -BitmapUtils.INSTANCE.getRectLeft(this.mImagePoints)), getWidth() - BitmapUtils.INSTANCE.getRectRight(this.mImagePoints)) / f2;
                this.mZoomOffsetY = height <= BitmapUtils.INSTANCE.getRectHeight(this.mImagePoints) ? Math.max(Math.min((height / f) - cropWindowRect.centerY(), -BitmapUtils.INSTANCE.getRectTop(this.mImagePoints)), getHeight() - BitmapUtils.INSTANCE.getRectBottom(this.mImagePoints)) / f3 : 0.0f;
            } else {
                this.mZoomOffsetX = Math.min(Math.max(this.mZoomOffsetX * f2, -cropWindowRect.left), (-cropWindowRect.right) + width) / f2;
                this.mZoomOffsetY = Math.min(Math.max(this.mZoomOffsetY * f3, -cropWindowRect.top), (-cropWindowRect.bottom) + height) / f3;
            }
            this.mImageMatrix.postTranslate(this.mZoomOffsetX * f2, this.mZoomOffsetY * f3);
            cropWindowRect.offset(this.mZoomOffsetX * f2, this.mZoomOffsetY * f3);
            this.mCropOverlayView.setCropWindowRect(cropWindowRect);
            mapImagePointsByImageMatrix();
            this.mCropOverlayView.invalidate();
            if (animate) {
                CropImageAnimation cropImageAnimation = this.mAnimation;
                Intrinsics.checkNotNull(cropImageAnimation);
                cropImageAnimation.setEndState(this.mImagePoints, this.mImageMatrix);
                this.imageView.startAnimation(this.mAnimation);
            } else {
                this.imageView.setImageMatrix(this.mImageMatrix);
            }
            updateImageBounds(false);
        }
    }

    private final void mapImagePointsByImageMatrix() {
        float[] fArr = this.mImagePoints;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Intrinsics.checkNotNull(this.originalBitmap);
        fArr[2] = r4.getWidth();
        float[] fArr2 = this.mImagePoints;
        fArr2[3] = 0.0f;
        Intrinsics.checkNotNull(this.originalBitmap);
        fArr2[4] = r6.getWidth();
        float[] fArr3 = this.mImagePoints;
        Intrinsics.checkNotNull(this.originalBitmap);
        fArr3[5] = r6.getHeight();
        float[] fArr4 = this.mImagePoints;
        fArr4[6] = 0.0f;
        Intrinsics.checkNotNull(this.originalBitmap);
        fArr4[7] = r9.getHeight();
        this.mImageMatrix.mapPoints(this.mImagePoints);
        float[] fArr5 = this.mScaleImagePoints;
        fArr5[0] = 0.0f;
        fArr5[1] = 0.0f;
        fArr5[2] = 100.0f;
        fArr5[3] = 0.0f;
        fArr5[4] = 100.0f;
        fArr5[5] = 100.0f;
        fArr5[6] = 0.0f;
        fArr5[7] = 100.0f;
        this.mImageMatrix.mapPoints(fArr5);
    }

    private final void setCropOverlayVisibility() {
        CropOverlayView cropOverlayView = this.mCropOverlayView;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.mShowCropOverlay || this.originalBitmap == null) ? 4 : 0);
        }
    }

    private final void setProgressBarVisibility() {
        this.mProgressBar.setVisibility(this.mShowProgressBar && ((this.originalBitmap == null && this.bitmapLoadingWorkerJob != null) || this.bitmapCroppingWorkerJob != null) ? 0 : 4);
    }

    private final void updateImageBounds(boolean clear) {
        if (this.originalBitmap != null && !clear) {
            float rectWidth = (this.loadedSampleSize * 100.0f) / BitmapUtils.INSTANCE.getRectWidth(this.mScaleImagePoints);
            float rectHeight = (this.loadedSampleSize * 100.0f) / BitmapUtils.INSTANCE.getRectHeight(this.mScaleImagePoints);
            CropOverlayView cropOverlayView = this.mCropOverlayView;
            Intrinsics.checkNotNull(cropOverlayView);
            cropOverlayView.setCropWindowLimits(getWidth(), getHeight(), rectWidth, rectHeight);
        }
        CropOverlayView cropOverlayView2 = this.mCropOverlayView;
        Intrinsics.checkNotNull(cropOverlayView2);
        cropOverlayView2.setBounds(clear ? null : this.mImagePoints, getWidth(), getHeight());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CropImageView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/canhub/cropper/CropImageView$CropShape;", "", "<init>", "(Ljava/lang/String;I)V", "RECTANGLE", "OVAL", "RECTANGLE_VERTICAL_ONLY", "RECTANGLE_HORIZONTAL_ONLY", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CropShape {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CropShape[] $VALUES;
        public static final CropShape RECTANGLE = new CropShape("RECTANGLE", 0);
        public static final CropShape OVAL = new CropShape("OVAL", 1);
        public static final CropShape RECTANGLE_VERTICAL_ONLY = new CropShape("RECTANGLE_VERTICAL_ONLY", 2);
        public static final CropShape RECTANGLE_HORIZONTAL_ONLY = new CropShape("RECTANGLE_HORIZONTAL_ONLY", 3);

        private static final /* synthetic */ CropShape[] $values() {
            return new CropShape[]{RECTANGLE, OVAL, RECTANGLE_VERTICAL_ONLY, RECTANGLE_HORIZONTAL_ONLY};
        }

        public static EnumEntries<CropShape> getEntries() {
            return $ENTRIES;
        }

        private CropShape(String str, int i) {
        }

        static {
            CropShape[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static CropShape valueOf(String str) {
            return (CropShape) Enum.valueOf(CropShape.class, str);
        }

        public static CropShape[] values() {
            return (CropShape[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CropImageView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/canhub/cropper/CropImageView$CropCornerShape;", "", "<init>", "(Ljava/lang/String;I)V", "RECTANGLE", "OVAL", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CropCornerShape {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CropCornerShape[] $VALUES;
        public static final CropCornerShape RECTANGLE = new CropCornerShape("RECTANGLE", 0);
        public static final CropCornerShape OVAL = new CropCornerShape("OVAL", 1);

        private static final /* synthetic */ CropCornerShape[] $values() {
            return new CropCornerShape[]{RECTANGLE, OVAL};
        }

        public static EnumEntries<CropCornerShape> getEntries() {
            return $ENTRIES;
        }

        private CropCornerShape(String str, int i) {
        }

        static {
            CropCornerShape[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static CropCornerShape valueOf(String str) {
            return (CropCornerShape) Enum.valueOf(CropCornerShape.class, str);
        }

        public static CropCornerShape[] values() {
            return (CropCornerShape[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CropImageView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/canhub/cropper/CropImageView$ScaleType;", "", "<init>", "(Ljava/lang/String;I)V", "FIT_CENTER", "CENTER", "CENTER_CROP", "CENTER_INSIDE", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ScaleType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ScaleType[] $VALUES;
        public static final ScaleType FIT_CENTER = new ScaleType("FIT_CENTER", 0);
        public static final ScaleType CENTER = new ScaleType("CENTER", 1);
        public static final ScaleType CENTER_CROP = new ScaleType("CENTER_CROP", 2);
        public static final ScaleType CENTER_INSIDE = new ScaleType("CENTER_INSIDE", 3);

        private static final /* synthetic */ ScaleType[] $values() {
            return new ScaleType[]{FIT_CENTER, CENTER, CENTER_CROP, CENTER_INSIDE};
        }

        public static EnumEntries<ScaleType> getEntries() {
            return $ENTRIES;
        }

        private ScaleType(String str, int i) {
        }

        static {
            ScaleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) Enum.valueOf(ScaleType.class, str);
        }

        public static ScaleType[] values() {
            return (ScaleType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CropImageView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/canhub/cropper/CropImageView$Guidelines;", "", "<init>", "(Ljava/lang/String;I)V", "OFF", "ON_TOUCH", "ON", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Guidelines {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Guidelines[] $VALUES;
        public static final Guidelines OFF = new Guidelines("OFF", 0);
        public static final Guidelines ON_TOUCH = new Guidelines("ON_TOUCH", 1);
        public static final Guidelines ON = new Guidelines("ON", 2);

        private static final /* synthetic */ Guidelines[] $values() {
            return new Guidelines[]{OFF, ON_TOUCH, ON};
        }

        public static EnumEntries<Guidelines> getEntries() {
            return $ENTRIES;
        }

        private Guidelines(String str, int i) {
        }

        static {
            Guidelines[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Guidelines valueOf(String str) {
            return (Guidelines) Enum.valueOf(Guidelines.class, str);
        }

        public static Guidelines[] values() {
            return (Guidelines[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CropImageView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/canhub/cropper/CropImageView$RequestSizeOptions;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "SAMPLING", "RESIZE_INSIDE", "RESIZE_FIT", "RESIZE_EXACT", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RequestSizeOptions {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RequestSizeOptions[] $VALUES;
        public static final RequestSizeOptions NONE = new RequestSizeOptions("NONE", 0);
        public static final RequestSizeOptions SAMPLING = new RequestSizeOptions("SAMPLING", 1);
        public static final RequestSizeOptions RESIZE_INSIDE = new RequestSizeOptions("RESIZE_INSIDE", 2);
        public static final RequestSizeOptions RESIZE_FIT = new RequestSizeOptions("RESIZE_FIT", 3);
        public static final RequestSizeOptions RESIZE_EXACT = new RequestSizeOptions("RESIZE_EXACT", 4);

        private static final /* synthetic */ RequestSizeOptions[] $values() {
            return new RequestSizeOptions[]{NONE, SAMPLING, RESIZE_INSIDE, RESIZE_FIT, RESIZE_EXACT};
        }

        public static EnumEntries<RequestSizeOptions> getEntries() {
            return $ENTRIES;
        }

        private RequestSizeOptions(String str, int i) {
        }

        static {
            RequestSizeOptions[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static RequestSizeOptions valueOf(String str) {
            return (RequestSizeOptions) Enum.valueOf(RequestSizeOptions.class, str);
        }

        public static RequestSizeOptions[] values() {
            return (RequestSizeOptions[]) $VALUES.clone();
        }
    }

    /* compiled from: CropImageView.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001Bm\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010)\u001a\u00020*J\u001a\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010-\u001a\u00020'R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u001b\u0010\b\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\t¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010&\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b&\u0010(¨\u0006."}, d2 = {"Lcom/canhub/cropper/CropImageView$CropResult;", "", "originalBitmap", "Landroid/graphics/Bitmap;", "originalUri", "Landroid/net/Uri;", "bitmap", "uriContent", "error", "Lkotlin/Exception;", "Ljava/lang/Exception;", "cropPoints", "", "cropRect", "Landroid/graphics/Rect;", "wholeImageRect", "rotation", "", "sampleSize", "<init>", "(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;Landroid/graphics/Rect;II)V", "getOriginalBitmap", "()Landroid/graphics/Bitmap;", "getOriginalUri", "()Landroid/net/Uri;", "getBitmap", "getUriContent", "getError", "()Ljava/lang/Exception;", "Ljava/lang/Exception;", "getCropPoints", "()[F", "getCropRect", "()Landroid/graphics/Rect;", "getWholeImageRect", "getRotation", "()I", "getSampleSize", "isSuccessful", "", "()Z", "context", "Landroid/content/Context;", "getUriFilePath", "", "uniqueName", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class CropResult {
        private final Bitmap bitmap;
        private final float[] cropPoints;
        private final Rect cropRect;
        private final Exception error;
        private final Bitmap originalBitmap;
        private final Uri originalUri;
        private final int rotation;
        private final int sampleSize;
        private final Uri uriContent;
        private final Rect wholeImageRect;

        public CropResult(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] cropPoints, Rect rect, Rect rect2, int i, int i2) {
            Intrinsics.checkNotNullParameter(cropPoints, "cropPoints");
            this.originalBitmap = bitmap;
            this.originalUri = uri;
            this.bitmap = bitmap2;
            this.uriContent = uri2;
            this.error = exc;
            this.cropPoints = cropPoints;
            this.cropRect = rect;
            this.wholeImageRect = rect2;
            this.rotation = i;
            this.sampleSize = i2;
        }

        public final Bitmap getOriginalBitmap() {
            return this.originalBitmap;
        }

        public final Uri getOriginalUri() {
            return this.originalUri;
        }

        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        public final Uri getUriContent() {
            return this.uriContent;
        }

        public final Exception getError() {
            return this.error;
        }

        public final float[] getCropPoints() {
            return this.cropPoints;
        }

        public final Rect getCropRect() {
            return this.cropRect;
        }

        public final Rect getWholeImageRect() {
            return this.wholeImageRect;
        }

        public final int getRotation() {
            return this.rotation;
        }

        public final int getSampleSize() {
            return this.sampleSize;
        }

        public final boolean isSuccessful() {
            return this.error == null;
        }

        public final Bitmap getBitmap(Context context) {
            Bitmap bitmap;
            Intrinsics.checkNotNullParameter(context, "context");
            Bitmap bitmap2 = this.bitmap;
            if (bitmap2 != null) {
                return bitmap2;
            }
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uri = this.uriContent;
                    Intrinsics.checkNotNull(uri);
                    bitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, uri));
                } else {
                    bitmap = MediaStore.Images.Media.getBitmap(context.getContentResolver(), this.uriContent);
                }
                return bitmap;
            } catch (Exception unused) {
                return null;
            }
        }

        public static /* synthetic */ String getUriFilePath$default(CropResult cropResult, Context context, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUriFilePath");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return cropResult.getUriFilePath(context, z);
        }

        public final String getUriFilePath(Context context, boolean uniqueName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Uri uri = this.uriContent;
            if (uri != null) {
                return GetFilePathFromUriKt.getFilePathFromUri(context, uri, uniqueName);
            }
            return null;
        }
    }

    /* compiled from: CropImageView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/canhub/cropper/CropImageView$Companion;", "", "<init>", "()V", "getOnMeasureSpec", "", "measureSpecMode", "measureSpecSize", "desiredSize", "getOnMeasureSpec$cropper_release", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int getOnMeasureSpec$cropper_release(int measureSpecMode, int measureSpecSize, int desiredSize) {
            if (measureSpecMode != Integer.MIN_VALUE) {
                return measureSpecMode != 1073741824 ? desiredSize : measureSpecSize;
            }
            return Math.min(desiredSize, measureSpecSize);
        }
    }

    @Override // com.canhub.cropper.CropOverlayView.CropWindowChangeListener
    public void onCropWindowChanged(boolean inProgress) {
        handleCropWindowChanged(inProgress, true);
        if (inProgress) {
            OnSetCropOverlayMovedListener onSetCropOverlayMovedListener = this.mOnSetCropOverlayMovedListener;
            if (onSetCropOverlayMovedListener != null) {
                onSetCropOverlayMovedListener.onCropOverlayMoved(getCropRect());
                return;
            }
            return;
        }
        OnSetCropOverlayReleasedListener onSetCropOverlayReleasedListener = this.mOnCropOverlayReleasedListener;
        if (onSetCropOverlayReleasedListener != null) {
            onSetCropOverlayReleasedListener.onCropOverlayReleased(getCropRect());
        }
    }
}
