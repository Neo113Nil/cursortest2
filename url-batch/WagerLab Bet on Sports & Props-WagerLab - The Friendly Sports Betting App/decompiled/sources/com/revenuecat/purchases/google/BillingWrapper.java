package com.revenuecat.purchases.google;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import androidx.work.PeriodicWorkRequest;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingConfig;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.InAppMessageParams;
import com.android.billingclient.api.InAppMessageResult;
import com.android.billingclient.api.PendingPurchasesParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.NoCoreLibraryDesugaringException;
import com.revenuecat.purchases.PostReceiptInitiationSource;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.PurchaseExtensionsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.google.history.PurchaseHistoryManager;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.AcknowledgePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.BillingClientUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCase;
import com.revenuecat.purchases.google.usecase.ConsumePurchaseUseCaseParams;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCase;
import com.revenuecat.purchases.google.usecase.GetBillingConfigUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCase;
import com.revenuecat.purchases.google.usecase.QueryProductDetailsUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchaseHistoryUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesByTypeUseCaseParams;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCase;
import com.revenuecat.purchases.google.usecase.QueryPurchasesUseCaseParams;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfferingStrings;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.strings.RestoreStrings;
import com.revenuecat.purchases.utils.Result;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BillingWrapper.kt */
@Metadata(d1 = {"\u0000°\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 ¢\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004¡\u0001¢\u0001BU\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J@\u00105\u001a\u0002042\u0006\u00106\u001a\u00020#2\u0006\u00107\u001a\u0002082!\u00109\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(:\u0012\u0004\u0012\u0002040/H\u0000¢\u0006\u0002\b;J3\u0010<\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u0002000=2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020#2\b\u0010B\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0002\u0010CJ=\u0010D\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u0002000=2\u0006\u0010?\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010A\u001a\u00020#2\b\u0010B\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0002\u0010HJ\u0016\u0010I\u001a\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010?\u001a\u00020LH\u0002J=\u0010M\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u0002000=2\u0006\u0010?\u001a\u00020L2\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010A\u001a\u00020#2\b\u0010B\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0002\u0010NJ(\u0010O\u001a\u0002042\u0006\u0010P\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020\u00152\u0006\u00107\u001a\u000208H\u0016J@\u0010T\u001a\u0002042\u0006\u00106\u001a\u00020#2\u0006\u00107\u001a\u0002082!\u0010U\u001a\u001d\u0012\u0013\u0012\u00110#¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(:\u0012\u0004\u0012\u0002040/H\u0000¢\u0006\u0002\bVJ\b\u0010W\u001a\u000204H\u0014J\b\u0010X\u001a\u000204H\u0002J/\u0010Y\u001a\u0002042\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010*2\u0014\u0010[\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000100\u0012\u0004\u0012\u0002040/H\u0002¢\u0006\u0002\u0010\\JH\u0010]\u001a\u0002042\u0006\u0010A\u001a\u00020#2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020#2\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u0002040/2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002040/H\u0016J)\u0010c\u001a\u0002042\u0006\u0010:\u001a\u00020#2\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u0002040/H\u0001¢\u0006\u0002\beJ\b\u0010f\u001a\u00020#H\u0002J3\u0010g\u001a\u0002042\u0006\u0010Q\u001a\u00020h2!\u0010i\u001a\u001d\u0012\u0013\u0012\u00110R¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(j\u0012\u0004\u0012\u0002040/H\u0002J4\u0010k\u001a\u0002042\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u0002040/2\u0016\u0010b\u001a\u0012\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002040/j\u0002`mH\u0016J\b\u0010n\u001a\u00020\u0015H\u0016J\u0018\u0010o\u001a\u0002042\u0006\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020>H\u0003JC\u0010s\u001a\u0002042\u0006\u0010p\u001a\u00020q2\u0006\u0010A\u001a\u00020#2\u0006\u0010t\u001a\u00020u2\b\u0010F\u001a\u0004\u0018\u00010G2\b\u0010v\u001a\u0004\u0018\u00010w2\b\u0010B\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0002\u0010xJ\b\u0010y\u001a\u000204H\u0016J\u0010\u0010z\u001a\u0002042\u0006\u0010{\u001a\u00020|H\u0016J \u0010}\u001a\u0002042\u0006\u0010{\u001a\u00020|2\u000e\u0010~\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010JH\u0016J@\u0010\u007f\u001a\u0002042\u0006\u0010A\u001a\u00020#2\u0019\u0010\u0080\u0001\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0J\u0012\u0004\u0012\u0002040/2\u0013\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002040/H\u0016J9\u0010\u0082\u0001\u001a\u0002042\u0019\u0010\u0080\u0001\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0J\u0012\u0004\u0012\u0002040/2\u0013\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002040/H\u0002JZ\u0010\u0083\u0001\u001a\u0002042\u0006\u0010^\u001a\u00020_2\u000e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020#0\u0085\u00012\u001f\u0010\u0086\u0001\u001a\u001a\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0087\u00010J\u0012\u0004\u0012\u0002040/j\u0003`\u0088\u00012\u0016\u0010b\u001a\u0012\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002040/j\u0002`mH\u0016JJ\u0010\u0089\u0001\u001a\u0002042\u0006\u0010^\u001a\u00020#2\u0019\u0010\u0080\u0001\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020R0J\u0012\u0004\u0012\u0002040/2\u0013\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002040/2\t\b\u0002\u0010\u008a\u0001\u001a\u00020\u0015JB\u0010\u008b\u0001\u001a\u0002042\u0006\u0010^\u001a\u00020#2\u0006\u0010:\u001a\u00020#2\u0012\u0010d\u001a\u000e\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u0002040/2\u0013\u0010\u008c\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002040/H\u0002JF\u0010\u008d\u0001\u001a\u0002042\u0006\u0010A\u001a\u00020#2\u001f\u0010l\u001a\u001b\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020R0\u008e\u0001\u0012\u0004\u0012\u0002040/2\u0012\u0010b\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002040/H\u0016J\t\u0010\u008f\u0001\u001a\u000204H\u0002J\u0012\u0010\u0090\u0001\u001a\u0002042\u0007\u0010\u0091\u0001\u001a\u000200H\u0002J1\u0010\u0092\u0001\u001a\u0002042\u0006\u0010p\u001a\u00020q2\u000e\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010J2\u000e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u0002040\u0096\u0001H\u0016J\t\u0010\u0097\u0001\u001a\u000204H\u0016J\u0011\u0010\u0098\u0001\u001a\u0002042\u0006\u0010Z\u001a\u00020*H\u0016J\t\u0010\u0099\u0001\u001a\u000204H\u0002J\u001d\u0010\u009a\u0001\u001a\u0002042\u0007\u0010\u009b\u0001\u001a\u00020E2\t\u0010\u009c\u0001\u001a\u0004\u0018\u00010#H\u0002J!\u0010\u009d\u0001\u001a\u0002042\u0006\u0010{\u001a\u00020|2\u000e\u0010~\u001a\n\u0012\u0004\u0012\u00020h\u0018\u00010JH\u0002J$\u0010\u009e\u0001\u001a\u0002042\u0019\u0010\u009f\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u0002040/¢\u0006\u0003\b \u0001H\u0002R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R*\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b8F@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00158B@BX\u0082\u000e¢\u0006\u0002\n\u0000R?\u0010,\u001a3\u0012/\u0012-\u0012!\u0012\u001f\u0012\u0015\u0012\u0013\u0018\u000100¢\u0006\f\b1\u0012\b\b2\u0012\u0004\b\b(3\u0012\u0004\u0012\u0002040/\u0012\u0006\u0012\u0004\u0018\u00010*0.0-X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006£\u0001"}, d2 = {"Lcom/revenuecat/purchases/google/BillingWrapper;", "Lcom/revenuecat/purchases/common/BillingAbstract;", "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "Lcom/android/billingclient/api/BillingClientStateListener;", "clientFactory", "Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "mainHandler", "Landroid/os/Handler;", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "diagnosticsTrackerIfEnabled", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;", "purchasesStateProvider", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "purchaseHistoryManager", "Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "isAIDLEnabled", "", "(Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;Landroid/os/Handler;Lcom/revenuecat/purchases/common/caching/DeviceCache;Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsTracker;Lcom/revenuecat/purchases/PurchasesStateProvider;Lcom/revenuecat/purchases/google/history/PurchaseHistoryManager;Lcom/revenuecat/purchases/common/DateProvider;Lkotlinx/coroutines/CoroutineScope;Z)V", "appInBackground", "getAppInBackground", "()Z", "<set-?>", "Lcom/android/billingclient/api/BillingClient;", "billingClient", "getBillingClient", "()Lcom/android/billingclient/api/BillingClient;", "setBillingClient", "(Lcom/android/billingclient/api/BillingClient;)V", "purchaseContext", "", "", "Lcom/revenuecat/purchases/google/PurchaseContext;", "getPurchaseContext$purchases_defaultsBc8Release$annotations", "()V", "getPurchaseContext$purchases_defaultsBc8Release", "()Ljava/util/Map;", "reconnectMilliseconds", "", "reconnectionAlreadyScheduled", "serviceRequests", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lkotlin/Pair;", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lkotlin/ParameterName;", "name", "connectionError", "", "acknowledge", "token", "initiationSource", "Lcom/revenuecat/purchases/PostReceiptInitiationSource;", "onAcknowledged", "purchaseToken", "acknowledge$purchases_defaultsBc8Release", "buildOneTimePurchaseParams", "Lcom/revenuecat/purchases/utils/Result;", "Lcom/android/billingclient/api/BillingFlowParams;", "purchaseInfo", "Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "appUserID", "isPersonalizedPrice", "(Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "buildPurchaseParams", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "replaceProductInfo", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "(Lcom/revenuecat/purchases/models/GooglePurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "buildSubscriptionProductDetailsParams", "", "Lcom/android/billingclient/api/BillingFlowParams$ProductDetailsParams;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "buildSubscriptionPurchaseParams", "(Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/revenuecat/purchases/utils/Result;", "consumeAndSave", "finishTransactions", FirebaseAnalytics.Event.PURCHASE, "Lcom/revenuecat/purchases/models/StoreTransaction;", "shouldConsume", "consumePurchase", "onConsumed", "consumePurchase$purchases_defaultsBc8Release", "endConnection", "executePendingRequests", "executeRequestOnUIThread", "delayMilliseconds", "request", "(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)V", "findPurchaseInPurchaseHistory", "productType", "Lcom/revenuecat/purchases/ProductType;", "productId", "onCompletion", "onError", "getPurchaseType", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "getPurchaseType$purchases_defaultsBc8Release", "getStackTrace", "getStoreTransaction", "Lcom/android/billingclient/api/Purchase;", "completion", "storeTxn", "getStorefront", "onSuccess", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "isConnected", "launchBillingFlow", "activity", "Landroid/app/Activity;", "params", "makePurchaseAsync", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "presentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Lcom/revenuecat/purchases/PresentedOfferingContext;Ljava/lang/Boolean;)V", InAppPurchaseConstants.METHOD_ON_BILLING_SERVICE_DISCONNECTED, InAppPurchaseConstants.METHOD_ON_BILLING_SETUP_FINISHED, "billingResult", "Lcom/android/billingclient/api/BillingResult;", "onPurchasesUpdated", "purchases", "queryAllPurchases", "onReceivePurchaseHistory", "onReceivePurchaseHistoryError", "queryInAppPurchaseHistoryWithAIDL", InAppPurchaseConstants.METHOD_QUERY_PRODUCT_DETAILS_ASYNC, "productIds", "", "onReceive", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", InAppPurchaseConstants.METHOD_QUERY_PURCHASE_HISTORY_ASYNC, "shouldUseAIDL", "queryPurchaseType", "resultHandler", InAppPurchaseConstants.METHOD_QUERY_PURCHASES, "", "retryBillingServiceConnectionWithExponentialBackoff", "sendErrorsToAllPendingRequests", "error", "showInAppMessagesIfNeeded", "inAppMessageTypes", "Lcom/revenuecat/purchases/models/InAppMessageType;", "subscriptionStatusChange", "Lkotlin/Function0;", InAppPurchaseConstants.METHOD_START_CONNECTION, "startConnectionOnMainThread", "trackProductDetailsNotSupportedIfNeeded", "trackPurchaseStartIfNeeded", "googlePurchasingData", "oldProductId", "trackPurchaseUpdateReceivedIfNeeded", "withConnectedClient", "receivingFunction", "Lkotlin/ExtensionFunctionType;", "ClientFactory", "Companion", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BillingWrapper extends BillingAbstract implements PurchasesUpdatedListener, BillingClientStateListener {
    private static final Companion Companion = new Companion(null);
    private static final int MAX_PENDING_REQUEST_COUNT_REPORTED = 100;
    private volatile BillingClient billingClient;
    private final ClientFactory clientFactory;
    private final CoroutineScope coroutineScope;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final boolean isAIDLEnabled;
    private final Handler mainHandler;
    private final Map<String, PurchaseContext> purchaseContext;
    private final PurchaseHistoryManager purchaseHistoryManager;
    private long reconnectMilliseconds;
    private boolean reconnectionAlreadyScheduled;
    private final ConcurrentLinkedQueue<Pair<Function1<PurchasesError, Unit>, Long>> serviceRequests;

    public static /* synthetic */ void getPurchaseContext$purchases_defaultsBc8Release$annotations() {
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ BillingWrapper(com.revenuecat.purchases.google.BillingWrapper.ClientFactory r13, android.os.Handler r14, com.revenuecat.purchases.common.caching.DeviceCache r15, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker r16, com.revenuecat.purchases.PurchasesStateProvider r17, com.revenuecat.purchases.google.history.PurchaseHistoryManager r18, com.revenuecat.purchases.common.DateProvider r19, kotlinx.coroutines.CoroutineScope r20, boolean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 64
            if (r1 == 0) goto Lf
            com.revenuecat.purchases.common.DefaultDateProvider r1 = new com.revenuecat.purchases.common.DefaultDateProvider
            r1.<init>()
            com.revenuecat.purchases.common.DateProvider r1 = (com.revenuecat.purchases.common.DateProvider) r1
            r9 = r1
            goto L11
        Lf:
            r9 = r19
        L11:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r2 = 1
            if (r1 == 0) goto L2b
            r1 = 0
            kotlinx.coroutines.CompletableJob r1 = kotlinx.coroutines.SupervisorKt.SupervisorJob$default(r1, r2, r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            kotlin.coroutines.CoroutineContext r1 = r1.plus(r3)
            kotlinx.coroutines.CoroutineScope r1 = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(r1)
            r10 = r1
            goto L2d
        L2b:
            r10 = r20
        L2d:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L3d
            r11 = r2
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r2 = r12
            goto L49
        L3d:
            r11 = r21
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
        L49:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.google.BillingWrapper.<init>(com.revenuecat.purchases.google.BillingWrapper$ClientFactory, android.os.Handler, com.revenuecat.purchases.common.caching.DeviceCache, com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker, com.revenuecat.purchases.PurchasesStateProvider, com.revenuecat.purchases.google.history.PurchaseHistoryManager, com.revenuecat.purchases.common.DateProvider, kotlinx.coroutines.CoroutineScope, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper(ClientFactory clientFactory, Handler mainHandler, DeviceCache deviceCache, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, PurchaseHistoryManager purchaseHistoryManager, DateProvider dateProvider, CoroutineScope coroutineScope, boolean z) {
        super(purchasesStateProvider);
        Intrinsics.checkNotNullParameter(clientFactory, "clientFactory");
        Intrinsics.checkNotNullParameter(mainHandler, "mainHandler");
        Intrinsics.checkNotNullParameter(deviceCache, "deviceCache");
        Intrinsics.checkNotNullParameter(purchasesStateProvider, "purchasesStateProvider");
        Intrinsics.checkNotNullParameter(purchaseHistoryManager, "purchaseHistoryManager");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.clientFactory = clientFactory;
        this.mainHandler = mainHandler;
        this.deviceCache = deviceCache;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.purchaseHistoryManager = purchaseHistoryManager;
        this.dateProvider = dateProvider;
        this.coroutineScope = coroutineScope;
        this.isAIDLEnabled = z;
        this.purchaseContext = new LinkedHashMap();
        this.serviceRequests = new ConcurrentLinkedQueue<>();
        this.reconnectMilliseconds = 1000L;
    }

    /* compiled from: BillingWrapper.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/google/BillingWrapper$Companion;", "", "()V", "MAX_PENDING_REQUEST_COUNT_REPORTED", "", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final synchronized BillingClient getBillingClient() {
        return this.billingClient;
    }

    public final synchronized void setBillingClient(BillingClient billingClient) {
        this.billingClient = billingClient;
    }

    public final Map<String, PurchaseContext> getPurchaseContext$purchases_defaultsBc8Release() {
        return this.purchaseContext;
    }

    public final boolean getAppInBackground() {
        return getPurchasesStateProvider().getPurchasesState().getAppInBackground();
    }

    /* compiled from: BillingWrapper.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/google/BillingWrapper$ClientFactory;", "", "context", "Landroid/content/Context;", "pendingTransactionsForPrepaidPlansEnabled", "", "(Landroid/content/Context;Z)V", "buildClient", "Lcom/android/billingclient/api/BillingClient;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/android/billingclient/api/PurchasesUpdatedListener;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ClientFactory {
        private final Context context;
        private final boolean pendingTransactionsForPrepaidPlansEnabled;

        public ClientFactory(Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.context = context;
            this.pendingTransactionsForPrepaidPlansEnabled = z;
        }

        public final BillingClient buildClient(PurchasesUpdatedListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            PendingPurchasesParams.Builder enableOneTimeProducts = PendingPurchasesParams.newBuilder().enableOneTimeProducts();
            if (this.pendingTransactionsForPrepaidPlansEnabled) {
                enableOneTimeProducts.enablePrepaidPlans();
            }
            PendingPurchasesParams build = enableOneTimeProducts.build();
            Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …\n                .build()");
            BillingClient build2 = BillingClient.newBuilder(this.context).enablePendingPurchases(build).setListener(listener).build();
            Intrinsics.checkNotNullExpressionValue(build2, "newBuilder(context).enab…\n                .build()");
            return build2;
        }
    }

    private final void executePendingRequests() {
        Pair<Function1<PurchasesError, Unit>, Long> poll;
        synchronized (this) {
            while (true) {
                BillingClient billingClient = this.billingClient;
                if (billingClient == null || !billingClient.isReady() || (poll = this.serviceRequests.poll()) == null) {
                    break;
                }
                Intrinsics.checkNotNullExpressionValue(poll, "poll()");
                final Function1<PurchasesError, Unit> component1 = poll.component1();
                Long component2 = poll.component2();
                if (component2 != null) {
                    this.mainHandler.postDelayed(new Runnable() { // from class: com.revenuecat.purchases.google.BillingWrapper$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Function1.this.invoke(null);
                        }
                    }, component2.longValue());
                } else {
                    this.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.google.BillingWrapper$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Function1.this.invoke(null);
                        }
                    });
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnectionOnMainThread(long delayMilliseconds) {
        this.mainHandler.postDelayed(new Runnable() { // from class: com.revenuecat.purchases.google.BillingWrapper$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.this.startConnection();
            }
        }, delayMilliseconds);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void startConnection() {
        String str;
        LogHandler currentLogHandler;
        String str2;
        String invoke;
        synchronized (this) {
            if (this.billingClient == null) {
                str = "[Purchases] - ";
                this.billingClient = this.clientFactory.buildClient(this);
            } else {
                str = "[Purchases] - ";
            }
            this.reconnectionAlreadyScheduled = false;
            final BillingClient billingClient = this.billingClient;
            if (billingClient != null) {
                if (!billingClient.isReady()) {
                    final LogIntent logIntent = LogIntent.DEBUG;
                    Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                            String format = String.format(BillingStrings.BILLING_CLIENT_STARTING, Arrays.copyOf(new Object[]{billingClient}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            return append.append(format).toString();
                        }
                    };
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                        case 1:
                            LogLevel logLevel = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                str2 = "[Purchases] - " + logLevel.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
                                break;
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel2 = LogLevel.WARN;
                            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 4:
                            LogLevel logLevel3 = LogLevel.INFO;
                            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 5:
                            LogLevel logLevel4 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                str2 = "[Purchases] - " + logLevel4.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
                                break;
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel5 = LogLevel.INFO;
                            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 8:
                            LogLevel logLevel6 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                str2 = "[Purchases] - " + logLevel6.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
                                break;
                            }
                            break;
                        case 9:
                            LogLevel logLevel7 = LogLevel.DEBUG;
                            currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                str2 = "[Purchases] - " + logLevel7.name();
                                invoke = function0.invoke();
                                currentLogHandler.d(str2, invoke);
                                break;
                            }
                            break;
                        case 10:
                            LogLevel logLevel8 = LogLevel.WARN;
                            LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 11:
                            LogLevel logLevel9 = LogLevel.WARN;
                            LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                                break;
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                            break;
                    }
                    DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
                    if (diagnosticsTracker != null) {
                        diagnosticsTracker.trackGoogleBillingStartConnection();
                    }
                    try {
                        try {
                            billingClient.startConnection(this);
                        } catch (SecurityException e) {
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", BillingStrings.SECURITY_EXCEPTION_WHEN_CONNECTING, e);
                            sendErrorsToAllPendingRequests(new PurchasesError(PurchasesErrorCode.StoreProblemError, e.getMessage()));
                        }
                    } catch (IllegalStateException e2) {
                        final LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
                        Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$startConnection$lambda$9$lambda$8$$inlined$log$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                                String format = String.format(BillingStrings.ILLEGAL_STATE_EXCEPTION_WHEN_CONNECTING, Arrays.copyOf(new Object[]{e2}, 1));
                                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                return append.append(format).toString();
                            }
                        };
                        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                            case 1:
                                LogLevel logLevel10 = LogLevel.DEBUG;
                                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                    currentLogHandler7.d("[Purchases] - " + logLevel10.name(), function02.invoke());
                                    break;
                                }
                                break;
                            case 2:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                                break;
                            case 3:
                                LogLevel logLevel11 = LogLevel.WARN;
                                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                    currentLogHandler8.w("[Purchases] - " + logLevel11.name(), function02.invoke());
                                    break;
                                }
                                break;
                            case 4:
                                LogLevel logLevel12 = LogLevel.INFO;
                                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                    currentLogHandler9.i("[Purchases] - " + logLevel12.name(), function02.invoke());
                                    break;
                                }
                                break;
                            case 5:
                                LogLevel logLevel13 = LogLevel.DEBUG;
                                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                    currentLogHandler10.d("[Purchases] - " + logLevel13.name(), function02.invoke());
                                    break;
                                }
                                break;
                            case 6:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                                break;
                            case 7:
                                LogLevel logLevel14 = LogLevel.INFO;
                                LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                    currentLogHandler11.i(str + logLevel14.name(), function02.invoke());
                                    break;
                                }
                                break;
                            case 8:
                                LogLevel logLevel15 = LogLevel.DEBUG;
                                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                    currentLogHandler12.d("[Purchases] - " + logLevel15.name(), function02.invoke());
                                    break;
                                }
                                break;
                            case 9:
                                LogLevel logLevel16 = LogLevel.DEBUG;
                                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                    currentLogHandler13.d("[Purchases] - " + logLevel16.name(), function02.invoke());
                                    break;
                                }
                                break;
                            case 10:
                                LogLevel logLevel17 = LogLevel.WARN;
                                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                    currentLogHandler14.w("[Purchases] - " + logLevel17.name(), function02.invoke());
                                    break;
                                }
                                break;
                            case 11:
                                LogLevel logLevel18 = LogLevel.WARN;
                                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                    currentLogHandler15.w("[Purchases] - " + logLevel18.name(), function02.invoke());
                                    break;
                                }
                                break;
                            case 12:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                                break;
                        }
                        sendErrorsToAllPendingRequests(new PurchasesError(PurchasesErrorCode.StoreProblemError, e2.getMessage()));
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    protected void endConnection() {
        this.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.google.BillingWrapper$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.endConnection$lambda$13(BillingWrapper.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void endConnection$lambda$13(BillingWrapper billingWrapper) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        synchronized (billingWrapper) {
            final BillingClient billingClient = billingWrapper.billingClient;
            if (billingClient != null) {
                final LogIntent logIntent = LogIntent.DEBUG;
                Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$endConnection$lambda$13$lambda$12$lambda$11$$inlined$log$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                        String format = String.format(BillingStrings.BILLING_CLIENT_ENDING, Arrays.copyOf(new Object[]{billingClient}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        return append.append(format).toString();
                    }
                };
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                            str = "[Purchases] - " + logLevel.name();
                            invoke = function0.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        }
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                        break;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                            currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                            break;
                        }
                        break;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                            currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                            break;
                        }
                        break;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                            str = "[Purchases] - " + logLevel4.name();
                            invoke = function0.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        }
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                        break;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                            currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                            break;
                        }
                        break;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                            str = "[Purchases] - " + logLevel6.name();
                            invoke = function0.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        }
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                            str = "[Purchases] - " + logLevel7.name();
                            invoke = function0.invoke();
                            currentLogHandler.d(str, invoke);
                            break;
                        }
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                            currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                            break;
                        }
                        break;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                            currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                            break;
                        }
                        break;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                        break;
                }
                billingClient.endConnection();
            }
            billingWrapper.billingClient = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    static /* synthetic */ void executeRequestOnUIThread$default(BillingWrapper billingWrapper, Long l, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        billingWrapper.executeRequestOnUIThread(l, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executeRequestOnUIThread(Long delayMilliseconds, Function1<? super PurchasesError, Unit> request) {
        if (getPurchasesUpdatedListener() != null) {
            this.serviceRequests.add(TuplesKt.to(request, delayMilliseconds));
            BillingClient billingClient = this.billingClient;
            if (billingClient != null && !billingClient.isReady()) {
                BillingAbstract.startConnectionOnMainThread$default(this, 0L, 1, null);
            } else {
                executePendingRequests();
            }
        } else {
            request.invoke(new PurchasesError(PurchasesErrorCode.UnknownError, "BillingWrapper is not attached to a listener"));
        }
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryProductDetailsAsync(ProductType productType, final Set<String> productIds, Function1<? super List<? extends StoreProduct>, Unit> onReceive, Function1<? super PurchasesError, Unit> onError) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(onReceive, "onReceive");
        Intrinsics.checkNotNullParameter(onError, "onError");
        final LogIntent logIntent = LogIntent.DEBUG;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$queryProductDetailsAsync$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format = String.format(OfferingStrings.FETCHING_PRODUCTS, Arrays.copyOf(new Object[]{CollectionsKt.joinToString$default(productIds, null, null, null, 0, null, null, 63, null)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        BillingClientUseCase.run$default(new QueryProductDetailsUseCase(new QueryProductDetailsUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, productIds, productType, getAppInBackground()), onReceive, onError, new BillingWrapper$queryProductDetailsAsync$useCase$1(this), new BillingWrapper$queryProductDetailsAsync$useCase$2(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void makePurchaseAsync(final Activity activity, final String appUserID, final PurchasingData purchasingData, final ReplaceProductInfo replaceProductInfo, PresentedOfferingContext presentedOfferingContext, final Boolean isPersonalizedPrice) {
        String optionId;
        ReplacementMode replacementMode;
        List addOnProducts;
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(purchasingData, "purchasingData");
        final GooglePurchasingData googlePurchasingData = purchasingData instanceof GooglePurchasingData ? (GooglePurchasingData) purchasingData : null;
        if (googlePurchasingData == null) {
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.UnknownError;
            String format = String.format(PurchaseStrings.INVALID_PURCHASE_TYPE, Arrays.copyOf(new Object[]{"Play", "GooglePurchasingData"}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            PurchasesError purchasesError = new PurchasesError(purchasesErrorCode, format);
            LogUtilsKt.errorLog(purchasesError);
            BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
            if (purchasesUpdatedListener != null) {
                purchasesUpdatedListener.onPurchasesFailedToUpdate(purchasesError);
                Unit unit = Unit.INSTANCE;
                return;
            }
            return;
        }
        if (googlePurchasingData instanceof GooglePurchasingData.InAppProduct) {
            optionId = null;
        } else {
            if (!(googlePurchasingData instanceof GooglePurchasingData.Subscription)) {
                throw new NoWhenBranchMatchedException();
            }
            optionId = ((GooglePurchasingData.Subscription) googlePurchasingData).getOptionId();
        }
        if (replaceProductInfo != null) {
            final LogIntent logIntent = LogIntent.PURCHASE;
            Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$makePurchaseAsync$$inlined$log$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                    String format2 = String.format(PurchaseStrings.UPGRADING_SKU, Arrays.copyOf(new Object[]{replaceProductInfo.getOldPurchase().getProductIds().get(0), googlePurchasingData.getProductId()}, 2));
                    Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                    return append.append(format2).toString();
                }
            };
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
            }
        } else {
            final LogIntent logIntent2 = LogIntent.PURCHASE;
            Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$makePurchaseAsync$$inlined$log$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                    String format2 = String.format(PurchaseStrings.PURCHASING_PRODUCT, Arrays.copyOf(new Object[]{googlePurchasingData.getProductId()}, 1));
                    Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                    return append.append(format2).toString();
                }
            };
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel10 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.d("[Purchases] - " + logLevel10.name(), function02.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel11 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel11.name(), function02.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel12 = LogLevel.INFO;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.i("[Purchases] - " + logLevel12.name(), function02.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel13 = LogLevel.DEBUG;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.d("[Purchases] - " + logLevel13.name(), function02.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel14 = LogLevel.INFO;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.i("[Purchases] - " + logLevel14.name(), function02.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel15 = LogLevel.DEBUG;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.d("[Purchases] - " + logLevel15.name(), function02.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), function02.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel17 = LogLevel.WARN;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.w("[Purchases] - " + logLevel17.name(), function02.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), function02.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                    break;
            }
        }
        synchronized (this) {
            if (replaceProductInfo != null) {
                try {
                    replacementMode = replaceProductInfo.getReplacementMode();
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                replacementMode = null;
            }
            String productId = replacementMode == GoogleReplacementMode.DEFERRED ? (String) CollectionsKt.first((List) replaceProductInfo.getOldPurchase().getProductIds()) : googlePurchasingData.getProductId();
            Map createMapBuilder = MapsKt.createMapBuilder();
            if (optionId != null) {
            }
            GooglePurchasingData.Subscription subscription = googlePurchasingData instanceof GooglePurchasingData.Subscription ? (GooglePurchasingData.Subscription) googlePurchasingData : null;
            if (subscription != null && (addOnProducts = subscription.getAddOnProducts()) != null) {
                ArrayList<GooglePurchasingData.Subscription> arrayList = new ArrayList();
                for (Object obj : addOnProducts) {
                    if (obj instanceof GooglePurchasingData.Subscription) {
                        arrayList.add(obj);
                    }
                }
                for (GooglePurchasingData.Subscription subscription2 : arrayList) {
                    createMapBuilder.put(subscription2.getProductId(), subscription2.getOptionId());
                }
                Unit unit2 = Unit.INSTANCE;
            }
            Map build = MapsKt.build(createMapBuilder);
            Map<String, PurchaseContext> map = this.purchaseContext;
            ProductType productType = googlePurchasingData.getProductType();
            ReplacementMode replacementMode2 = replaceProductInfo != null ? replaceProductInfo.getReplacementMode() : null;
            map.put(productId, new PurchaseContext(productType, presentedOfferingContext, optionId, replacementMode2 instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode2 : null, build));
            Unit unit3 = Unit.INSTANCE;
        }
        executeRequestOnUIThread$default(this, null, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$makePurchaseAsync$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError2) {
                invoke2(purchasesError2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError purchasesError2) {
                Result buildPurchaseParams;
                BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener2;
                StoreTransaction oldPurchase;
                List<String> productIds;
                buildPurchaseParams = BillingWrapper.this.buildPurchaseParams((GooglePurchasingData) purchasingData, replaceProductInfo, appUserID, isPersonalizedPrice);
                if (buildPurchaseParams instanceof Result.Success) {
                    BillingWrapper billingWrapper = BillingWrapper.this;
                    GooglePurchasingData googlePurchasingData2 = googlePurchasingData;
                    ReplaceProductInfo replaceProductInfo2 = replaceProductInfo;
                    billingWrapper.trackPurchaseStartIfNeeded(googlePurchasingData2, (replaceProductInfo2 == null || (oldPurchase = replaceProductInfo2.getOldPurchase()) == null || (productIds = oldPurchase.getProductIds()) == null) ? null : (String) CollectionsKt.firstOrNull((List) productIds));
                    BillingWrapper.this.launchBillingFlow(activity, (BillingFlowParams) ((Result.Success) buildPurchaseParams).getValue());
                    return;
                }
                if (!(buildPurchaseParams instanceof Result.Error) || (purchasesUpdatedListener2 = BillingWrapper.this.getPurchasesUpdatedListener()) == null) {
                    return;
                }
                purchasesUpdatedListener2.onPurchasesFailedToUpdate((PurchasesError) ((Result.Error) buildPurchaseParams).getValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchBillingFlow(final Activity activity, final BillingFlowParams params) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        if (activity.getIntent() == null) {
            final LogIntent logIntent = LogIntent.WARNING;
            Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$launchBillingFlow$$inlined$log$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Activity passed into launchBillingFlow has a null intent, which may cause a crash. See https://github.com/RevenueCat/purchases-android/issues/381 for more information.";
                }
            };
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
            }
        }
        withConnectedClient(new Function1<BillingClient, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$launchBillingFlow$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
                invoke2(billingClient);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BillingClient withConnectedClient) {
                Intrinsics.checkNotNullParameter(withConnectedClient, "$this$withConnectedClient");
                final BillingResult launchBillingFlow = withConnectedClient.launchBillingFlow(activity, params);
                if (launchBillingFlow.getResponseCode() == 0) {
                    launchBillingFlow = null;
                }
                if (launchBillingFlow != null) {
                    final LogIntent logIntent2 = LogIntent.GOOGLE_ERROR;
                    Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$launchBillingFlow$2$invoke$lambda$2$$inlined$log$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final String invoke() {
                            StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                            BillingResult billingResult = launchBillingFlow;
                            Intrinsics.checkNotNullExpressionValue(billingResult, "billingResult");
                            String format = String.format(BillingStrings.BILLING_INTENT_FAILED, Arrays.copyOf(new Object[]{BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(launchBillingFlow)}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            return append.append(format).toString();
                        }
                    };
                    switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                        case 1:
                            LogLevel logLevel10 = LogLevel.DEBUG;
                            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                                currentLogHandler7.d("[Purchases] - " + logLevel10.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 2:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                            break;
                        case 3:
                            LogLevel logLevel11 = LogLevel.WARN;
                            LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                                currentLogHandler8.w("[Purchases] - " + logLevel11.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 4:
                            LogLevel logLevel12 = LogLevel.INFO;
                            LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                                currentLogHandler9.i("[Purchases] - " + logLevel12.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 5:
                            LogLevel logLevel13 = LogLevel.DEBUG;
                            LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                                currentLogHandler10.d("[Purchases] - " + logLevel13.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 6:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                            break;
                        case 7:
                            LogLevel logLevel14 = LogLevel.INFO;
                            LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                                currentLogHandler11.i("[Purchases] - " + logLevel14.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 8:
                            LogLevel logLevel15 = LogLevel.DEBUG;
                            LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                                currentLogHandler12.d("[Purchases] - " + logLevel15.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 9:
                            LogLevel logLevel16 = LogLevel.DEBUG;
                            LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                                currentLogHandler13.d("[Purchases] - " + logLevel16.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 10:
                            LogLevel logLevel17 = LogLevel.WARN;
                            LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                                currentLogHandler14.w("[Purchases] - " + logLevel17.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 11:
                            LogLevel logLevel18 = LogLevel.WARN;
                            LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                            if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                                currentLogHandler15.w("[Purchases] - " + logLevel18.name(), function02.invoke());
                                break;
                            }
                            break;
                        case 12:
                            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                            break;
                    }
                }
            }
        });
    }

    public static /* synthetic */ void queryPurchaseHistoryAsync$default(BillingWrapper billingWrapper, String str, Function1 function1, Function1 function12, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = billingWrapper.isAIDLEnabled && Intrinsics.areEqual(str, "inapp");
        }
        billingWrapper.queryPurchaseHistoryAsync(str, function1, function12, z);
    }

    public final void queryPurchaseHistoryAsync(final String productType, Function1<? super List<StoreTransaction>, Unit> onReceivePurchaseHistory, Function1<? super PurchasesError, Unit> onReceivePurchaseHistoryError, boolean shouldUseAIDL) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        Intrinsics.checkNotNullParameter(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        final LogIntent logIntent = LogIntent.DEBUG;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseHistoryAsync$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format = String.format(RestoreStrings.QUERYING_PURCHASE_HISTORY, Arrays.copyOf(new Object[]{productType}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        if (shouldUseAIDL) {
            queryInAppPurchaseHistoryWithAIDL(onReceivePurchaseHistory, onReceivePurchaseHistoryError);
        } else {
            BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, productType, getAppInBackground()), onReceivePurchaseHistory, onReceivePurchaseHistoryError, new BillingWrapper$queryPurchaseHistoryAsync$2(this), new BillingWrapper$queryPurchaseHistoryAsync$3(this)), 0L, 1, null);
        }
    }

    private final void queryInAppPurchaseHistoryWithAIDL(Function1<? super List<StoreTransaction>, Unit> onReceivePurchaseHistory, Function1<? super PurchasesError, Unit> onReceivePurchaseHistoryError) {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new BillingWrapper$queryInAppPurchaseHistoryWithAIDL$1(this, onReceivePurchaseHistory, onReceivePurchaseHistoryError, null), 3, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryAllPurchases(String appUserID, final Function1<? super List<StoreTransaction>, Unit> onReceivePurchaseHistory, final Function1<? super PurchasesError, Unit> onReceivePurchaseHistoryError) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(onReceivePurchaseHistory, "onReceivePurchaseHistory");
        Intrinsics.checkNotNullParameter(onReceivePurchaseHistoryError, "onReceivePurchaseHistoryError");
        queryPurchaseHistoryAsync$default(this, "subs", new Function1<List<? extends StoreTransaction>, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends StoreTransaction> list) {
                invoke2((List<StoreTransaction>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final List<StoreTransaction> subsPurchasesList) {
                Intrinsics.checkNotNullParameter(subsPurchasesList, "subsPurchasesList");
                BillingWrapper billingWrapper = BillingWrapper.this;
                final Function1<List<StoreTransaction>, Unit> function1 = onReceivePurchaseHistory;
                BillingWrapper.queryPurchaseHistoryAsync$default(billingWrapper, "inapp", new Function1<List<? extends StoreTransaction>, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$queryAllPurchases$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends StoreTransaction> list) {
                        invoke2((List<StoreTransaction>) list);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<StoreTransaction> inAppPurchasesList) {
                        Intrinsics.checkNotNullParameter(inAppPurchasesList, "inAppPurchasesList");
                        function1.invoke(CollectionsKt.plus((Collection) subsPurchasesList, (Iterable) inAppPurchasesList));
                    }
                }, onReceivePurchaseHistoryError, false, 8, null);
            }
        }, onReceivePurchaseHistoryError, false, 8, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void consumeAndSave(boolean finishTransactions, StoreTransaction purchase, boolean shouldConsume, PostReceiptInitiationSource initiationSource) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        Intrinsics.checkNotNullParameter(initiationSource, "initiationSource");
        if (purchase.getType() == ProductType.UNKNOWN || purchase.getPurchaseState() == PurchaseState.PENDING) {
            return;
        }
        Purchase originalGooglePurchase = StoreTransactionConversionsKt.getOriginalGooglePurchase(purchase);
        boolean isAcknowledged = originalGooglePurchase != null ? originalGooglePurchase.isAcknowledged() : false;
        if (purchase.getType() != ProductType.INAPP) {
            if (!finishTransactions || isAcknowledged) {
                this.deviceCache.addSuccessfullyPostedToken(purchase.getPurchaseToken());
                return;
            } else {
                acknowledge$purchases_defaultsBc8Release(purchase.getPurchaseToken(), initiationSource, new BillingWrapper$consumeAndSave$4(this.deviceCache));
                return;
            }
        }
        if (finishTransactions && shouldConsume) {
            consumePurchase$purchases_defaultsBc8Release(purchase.getPurchaseToken(), initiationSource, new BillingWrapper$consumeAndSave$1(this.deviceCache));
            return;
        }
        if (!finishTransactions || isAcknowledged) {
            this.deviceCache.addSuccessfullyPostedToken(purchase.getPurchaseToken());
            return;
        }
        final LogIntent logIntent = LogIntent.PURCHASE;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$consumeAndSave$$inlined$log$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Not consuming in-app purchase according to server configuration. This is expected for non-consumable products. The user won't be able to purchase this product again.";
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        acknowledge$purchases_defaultsBc8Release(purchase.getPurchaseToken(), initiationSource, new BillingWrapper$consumeAndSave$3(this.deviceCache));
    }

    public final void consumePurchase$purchases_defaultsBc8Release(final String token, PostReceiptInitiationSource initiationSource, Function1<? super String, Unit> onConsumed) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(initiationSource, "initiationSource");
        Intrinsics.checkNotNullParameter(onConsumed, "onConsumed");
        final LogIntent logIntent = LogIntent.PURCHASE;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$consumePurchase$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format = String.format(PurchaseStrings.CONSUMING_PURCHASE, Arrays.copyOf(new Object[]{token}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        BillingClientUseCase.run$default(new ConsumePurchaseUseCase(new ConsumePurchaseUseCaseParams(token, initiationSource, getAppInBackground()), onConsumed, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$consumePurchase$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError purchasesError) {
                Intrinsics.checkNotNullParameter(purchasesError, "<anonymous parameter 0>");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }
        }, new BillingWrapper$consumePurchase$3(this), new BillingWrapper$consumePurchase$4(this)), 0L, 1, null);
    }

    public final void acknowledge$purchases_defaultsBc8Release(final String token, PostReceiptInitiationSource initiationSource, Function1<? super String, Unit> onAcknowledged) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(initiationSource, "initiationSource");
        Intrinsics.checkNotNullParameter(onAcknowledged, "onAcknowledged");
        final LogIntent logIntent = LogIntent.PURCHASE;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$acknowledge$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format = String.format(PurchaseStrings.ACKNOWLEDGING_PURCHASE, Arrays.copyOf(new Object[]{token}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        BillingClientUseCase.run$default(new AcknowledgePurchaseUseCase(new AcknowledgePurchaseUseCaseParams(token, initiationSource, getAppInBackground()), onAcknowledged, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$acknowledge$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError purchasesError) {
                Intrinsics.checkNotNullParameter(purchasesError, "<anonymous parameter 0>");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }
        }, new BillingWrapper$acknowledge$3(this), new BillingWrapper$acknowledge$4(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void queryPurchases(String appUserID, Function1<? super Map<String, StoreTransaction>, Unit> onSuccess, Function1<? super PurchasesError, Unit> onError) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        final LogIntent logIntent = LogIntent.DEBUG;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$queryPurchases$$inlined$log$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " Querying purchases";
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        BillingClientUseCase.run$default(new QueryPurchasesUseCase(new QueryPurchasesUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground()), onSuccess, onError, new BillingWrapper$queryPurchases$2(this), new BillingWrapper$queryPurchases$3(this)), 0L, 1, null);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void findPurchaseInPurchaseHistory(String appUserID, final ProductType productType, final String productId, final Function1<? super StoreTransaction, Unit> onCompletion, final Function1<? super PurchasesError, Unit> onError) {
        Function1<? super PurchasesError, Unit> function1;
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(onCompletion, "onCompletion");
        Intrinsics.checkNotNullParameter(onError, "onError");
        final LogIntent logIntent = LogIntent.DEBUG;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$findPurchaseInPurchaseHistory$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format = String.format(RestoreStrings.QUERYING_PURCHASE_WITH_TYPE, Arrays.copyOf(new Object[]{productId, productType.name()}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        Unit unit = null;
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        String googleProductType = ProductTypeConversionsKt.toGoogleProductType(productType);
        if (googleProductType != null) {
            function1 = onError;
            BillingClientUseCase.run$default(new QueryPurchaseHistoryUseCase(new QueryPurchaseHistoryUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, googleProductType, getAppInBackground()), new Function1<List<? extends StoreTransaction>, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$findPurchaseInPurchaseHistory$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<StoreTransaction> purchasesList) {
                    Object obj;
                    Intrinsics.checkNotNullParameter(purchasesList, "purchasesList");
                    String str2 = productId;
                    Iterator<T> it = purchasesList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (((StoreTransaction) obj).getProductIds().contains(str2)) {
                                break;
                            }
                        }
                    }
                    StoreTransaction storeTransaction = (StoreTransaction) obj;
                    if (storeTransaction != null) {
                        onCompletion.invoke(storeTransaction);
                        return;
                    }
                    String format = String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{productId}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, format));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends StoreTransaction> list) {
                    invoke2((List<StoreTransaction>) list);
                    return Unit.INSTANCE;
                }
            }, function1, new BillingWrapper$findPurchaseInPurchaseHistory$2$2(this), new BillingWrapper$findPurchaseInPurchaseHistory$2$3(this)), 0L, 1, null);
            unit = Unit.INSTANCE;
        } else {
            function1 = onError;
        }
        if (unit == null) {
            function1.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, PurchaseStrings.NOT_RECOGNIZED_PRODUCT_TYPE));
        }
    }

    public final void getPurchaseType$purchases_defaultsBc8Release(final String purchaseToken, final Function1<? super ProductType, Unit> listener) {
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(listener, "listener");
        queryPurchaseType("subs", purchaseToken, listener, new Function1<Boolean, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$getPurchaseType$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                if (z) {
                    listener.invoke(ProductType.SUBS);
                    return;
                }
                BillingWrapper billingWrapper = this;
                String str = purchaseToken;
                Function1<ProductType, Unit> function1 = listener;
                final Function1<ProductType, Unit> function12 = listener;
                billingWrapper.queryPurchaseType("inapp", str, function1, new Function1<Boolean, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$getPurchaseType$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(boolean z2) {
                        if (z2) {
                            function12.invoke(ProductType.INAPP);
                        } else {
                            function12.invoke(ProductType.UNKNOWN);
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void queryPurchaseType(String productType, final String purchaseToken, final Function1<? super ProductType, Unit> listener, final Function1<? super Boolean, Unit> resultHandler) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.dateProvider, this.diagnosticsTrackerIfEnabled, getAppInBackground(), productType), new Function1<Map<String, ? extends StoreTransaction>, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Map<String, StoreTransaction> purchases) {
                Intrinsics.checkNotNullParameter(purchases, "purchases");
                Function1<Boolean, Unit> function1 = resultHandler;
                Collection<StoreTransaction> values = purchases.values();
                String str = purchaseToken;
                boolean z = false;
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator<T> it = values.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (Intrinsics.areEqual(((StoreTransaction) it.next()).getPurchaseToken(), str)) {
                            z = true;
                            break;
                        }
                    }
                }
                function1.invoke(Boolean.valueOf(z));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends StoreTransaction> map) {
                invoke2((Map<String, StoreTransaction>) map);
                return Unit.INSTANCE;
            }
        }, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$queryPurchaseType$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                LogUtilsKt.errorLog(error);
                listener.invoke(ProductType.UNKNOWN);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }
        }, new BillingWrapper$queryPurchaseType$3(this), new BillingWrapper$queryPurchaseType$4(this)), 0L, 1, null);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public void onPurchasesUpdated(final BillingResult billingResult, List<? extends Purchase> purchases) {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        trackPurchaseUpdateReceivedIfNeeded(billingResult, purchases);
        final List<? extends Purchase> emptyList = purchases == null ? CollectionsKt.emptyList() : purchases;
        if (billingResult.getResponseCode() == 0 && !emptyList.isEmpty()) {
            final ArrayList arrayList = new ArrayList();
            Iterator<T> it = emptyList.iterator();
            while (it.hasNext()) {
                getStoreTransaction((Purchase) it.next(), new Function1<StoreTransaction, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$onPurchasesUpdated$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(StoreTransaction storeTransaction) {
                        invoke2(storeTransaction);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(StoreTransaction storeTxn) {
                        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener;
                        Intrinsics.checkNotNullParameter(storeTxn, "storeTxn");
                        arrayList.add(storeTxn);
                        if (arrayList.size() != emptyList.size() || (purchasesUpdatedListener = this.getPurchasesUpdatedListener()) == null) {
                            return;
                        }
                        purchasesUpdatedListener.onPurchasesUpdated(arrayList);
                    }
                });
            }
            return;
        }
        final LogIntent logIntent = LogIntent.GOOGLE_ERROR;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$onPurchasesUpdated$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                String str2;
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                StringBuilder sb = new StringBuilder();
                String format = String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(billingResult)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                StringBuilder append2 = sb.append(format);
                List list = emptyList;
                if (Boolean.valueOf(list.isEmpty()).booleanValue()) {
                    list = null;
                }
                if (list == null || (str2 = " Purchases:" + CollectionsKt.joinToString$default(list, ", ", null, null, 0, null, new Function1<Purchase, CharSequence>() { // from class: com.revenuecat.purchases.google.BillingWrapper$onPurchasesUpdated$2$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final CharSequence invoke(Purchase it2) {
                        Intrinsics.checkNotNullParameter(it2, "it");
                        return PurchaseExtensionsKt.toHumanReadableDescription(it2);
                    }
                }, 30, null)) == null) {
                    str2 = " No purchases received";
                }
                return append.append(append2.append(str2).toString()).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        String str2 = "Error updating purchases. " + BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(billingResult);
        int responseCode = billingResult.getResponseCode();
        if (purchases == null && billingResult.getResponseCode() == 0) {
            str2 = "Error: onPurchasesUpdated received an OK BillingResult with a Null purchases list.";
            responseCode = 6;
        }
        PurchasesError billingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(responseCode, str2);
        LogUtilsKt.errorLog(billingResponseToPurchasesError);
        BillingAbstract.PurchasesUpdatedListener purchasesUpdatedListener = getPurchasesUpdatedListener();
        if (purchasesUpdatedListener != null) {
            purchasesUpdatedListener.onPurchasesFailedToUpdate(billingResponseToPurchasesError);
        }
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingSetupFinished(final BillingResult billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            Intrinsics.checkNotNullExpressionValue(debugMessage, "billingResult.debugMessage");
            diagnosticsTracker.trackGoogleBillingSetupFinished(responseCode, debugMessage, SequencesKt.count(SequencesKt.take(CollectionsKt.asSequence(this.serviceRequests), 100)));
        }
        this.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.google.BillingWrapper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BillingWrapper.onBillingSetupFinished$lambda$39(BillingResult.this, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingSetupFinished$lambda$39(final BillingResult billingResult, final BillingWrapper billingWrapper) {
        PurchasesError billingResponseToPurchasesError;
        LogHandler currentLogHandler;
        String str;
        String invoke;
        int responseCode = billingResult.getResponseCode();
        if (responseCode != 6) {
            if (responseCode != 7 && responseCode != 8) {
                if (responseCode != 12) {
                    switch (responseCode) {
                        case -2:
                        case 3:
                            String humanReadableDescription = BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(billingResult);
                            if (Intrinsics.areEqual(billingResult.getDebugMessage(), ErrorsKt.IN_APP_BILLING_LESS_THAN_3_ERROR_MESSAGE)) {
                                String format = String.format(BillingStrings.BILLING_UNAVAILABLE_LESS_THAN_3, Arrays.copyOf(new Object[]{humanReadableDescription}, 1));
                                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                billingResponseToPurchasesError = new PurchasesError(PurchasesErrorCode.StoreProblemError, format);
                                LogUtilsKt.errorLog(billingResponseToPurchasesError);
                            } else {
                                String format2 = String.format(BillingStrings.BILLING_UNAVAILABLE, Arrays.copyOf(new Object[]{humanReadableDescription}, 1));
                                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                                billingResponseToPurchasesError = ErrorsKt.billingResponseToPurchasesError(billingResult.getResponseCode(), format2);
                                LogUtilsKt.errorLog(billingResponseToPurchasesError);
                            }
                            billingWrapper.sendErrorsToAllPendingRequests(billingResponseToPurchasesError);
                            break;
                        case 0:
                            final LogIntent logIntent = LogIntent.DEBUG;
                            Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final String invoke() {
                                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                                    BillingClient billingClient = billingWrapper.getBillingClient();
                                    String format3 = String.format(BillingStrings.BILLING_SERVICE_SETUP_FINISHED, Arrays.copyOf(new Object[]{billingClient != null ? billingClient.toString() : null}, 1));
                                    Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                                    return append.append(format3).toString();
                                }
                            };
                            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                                case 1:
                                    LogLevel logLevel = LogLevel.DEBUG;
                                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                        str = "[Purchases] - " + logLevel.name();
                                        invoke = function0.invoke();
                                        currentLogHandler.d(str, invoke);
                                        break;
                                    }
                                    break;
                                case 2:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                                    break;
                                case 3:
                                    LogLevel logLevel2 = LogLevel.WARN;
                                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                                        break;
                                    }
                                    break;
                                case 4:
                                    LogLevel logLevel3 = LogLevel.INFO;
                                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                                        break;
                                    }
                                    break;
                                case 5:
                                    LogLevel logLevel4 = LogLevel.DEBUG;
                                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                        str = "[Purchases] - " + logLevel4.name();
                                        invoke = function0.invoke();
                                        currentLogHandler.d(str, invoke);
                                        break;
                                    }
                                    break;
                                case 6:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                                    break;
                                case 7:
                                    LogLevel logLevel5 = LogLevel.INFO;
                                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                                        break;
                                    }
                                    break;
                                case 8:
                                    LogLevel logLevel6 = LogLevel.DEBUG;
                                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                        str = "[Purchases] - " + logLevel6.name();
                                        invoke = function0.invoke();
                                        currentLogHandler.d(str, invoke);
                                        break;
                                    }
                                    break;
                                case 9:
                                    LogLevel logLevel7 = LogLevel.DEBUG;
                                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                        str = "[Purchases] - " + logLevel7.name();
                                        invoke = function0.invoke();
                                        currentLogHandler.d(str, invoke);
                                        break;
                                    }
                                    break;
                                case 10:
                                    LogLevel logLevel8 = LogLevel.WARN;
                                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                                        break;
                                    }
                                    break;
                                case 11:
                                    LogLevel logLevel9 = LogLevel.WARN;
                                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                                        break;
                                    }
                                    break;
                                case 12:
                                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                                    break;
                            }
                            BillingAbstract.StateListener stateListener = billingWrapper.getStateListener();
                            if (stateListener != null) {
                                stateListener.onConnected();
                            }
                            billingWrapper.executePendingRequests();
                            billingWrapper.reconnectMilliseconds = 1000L;
                            billingWrapper.trackProductDetailsNotSupportedIfNeeded();
                            break;
                    }
                    return;
                }
            }
            final LogIntent logIntent2 = LogIntent.GOOGLE_WARNING;
            Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                    String format3 = String.format(BillingStrings.BILLING_CLIENT_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(billingResult)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                    return append.append(format3).toString();
                }
            };
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
                case 1:
                    LogLevel logLevel10 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.d("[Purchases] - " + logLevel10.name(), function02.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel11 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel11.name(), function02.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel12 = LogLevel.INFO;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.i("[Purchases] - " + logLevel12.name(), function02.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel13 = LogLevel.DEBUG;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.d("[Purchases] - " + logLevel13.name(), function02.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel14 = LogLevel.INFO;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.i("[Purchases] - " + logLevel14.name(), function02.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel15 = LogLevel.DEBUG;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.d("[Purchases] - " + logLevel15.name(), function02.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), function02.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel17 = LogLevel.WARN;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.w("[Purchases] - " + logLevel17.name(), function02.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), function02.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                    break;
            }
            return;
        }
        final LogIntent logIntent3 = LogIntent.GOOGLE_WARNING;
        Function0<String> function03 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$onBillingSetupFinished$lambda$39$$inlined$log$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                String format3 = String.format(BillingStrings.BILLING_CLIENT_ERROR, Arrays.copyOf(new Object[]{BillingResultExtensionsBillingIndependentKt.toHumanReadableDescription(billingResult)}, 1));
                Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                return append.append(format3).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent3.ordinal()]) {
            case 1:
                LogLevel logLevel19 = LogLevel.DEBUG;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                    currentLogHandler16.d("[Purchases] - " + logLevel19.name(), function03.invoke());
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                break;
            case 3:
                LogLevel logLevel20 = LogLevel.WARN;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                    currentLogHandler17.w("[Purchases] - " + logLevel20.name(), function03.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel21 = LogLevel.INFO;
                LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel21) <= 0) {
                    currentLogHandler18.i("[Purchases] - " + logLevel21.name(), function03.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel22 = LogLevel.DEBUG;
                LogHandler currentLogHandler19 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel22) <= 0) {
                    currentLogHandler19.d("[Purchases] - " + logLevel22.name(), function03.invoke());
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                break;
            case 7:
                LogLevel logLevel23 = LogLevel.INFO;
                LogHandler currentLogHandler20 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel23) <= 0) {
                    currentLogHandler20.i("[Purchases] - " + logLevel23.name(), function03.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel24 = LogLevel.DEBUG;
                LogHandler currentLogHandler21 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel24) <= 0) {
                    currentLogHandler21.d("[Purchases] - " + logLevel24.name(), function03.invoke());
                    break;
                }
                break;
            case 9:
                LogLevel logLevel25 = LogLevel.DEBUG;
                LogHandler currentLogHandler22 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel25) <= 0) {
                    currentLogHandler22.d("[Purchases] - " + logLevel25.name(), function03.invoke());
                    break;
                }
                break;
            case 10:
                LogLevel logLevel26 = LogLevel.WARN;
                LogHandler currentLogHandler23 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel26) <= 0) {
                    currentLogHandler23.w("[Purchases] - " + logLevel26.name(), function03.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel27 = LogLevel.WARN;
                LogHandler currentLogHandler24 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel27) <= 0) {
                    currentLogHandler24.w("[Purchases] - " + logLevel27.name(), function03.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function03.invoke(), null);
                break;
        }
        billingWrapper.retryBillingServiceConnectionWithExponentialBackoff();
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public void onBillingServiceDisconnected() {
        LogHandler currentLogHandler;
        String str;
        String invoke;
        final LogIntent logIntent = LogIntent.WARNING;
        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$onBillingServiceDisconnected$$inlined$log$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                BillingClient billingClient = this.getBillingClient();
                String format = String.format(BillingStrings.BILLING_SERVICE_DISCONNECTED_INSTANCE, Arrays.copyOf(new Object[]{billingClient != null ? billingClient.toString() : null}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    invoke = function0.invoke();
                    currentLogHandler.d(str, invoke);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                break;
        }
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackGoogleBillingServiceDisconnected();
        }
    }

    private final void retryBillingServiceConnectionWithExponentialBackoff() {
        if (this.reconnectionAlreadyScheduled) {
            final LogIntent logIntent = LogIntent.WARNING;
            Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null) + " BillingClient connection retry already scheduled. Ignoring";
                }
            };
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.d("[Purchases] - " + logLevel.name(), function0.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.d("[Purchases] - " + logLevel4.name(), function0.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler5.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        currentLogHandler6.d("[Purchases] - " + logLevel6.name(), function0.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        currentLogHandler7.d("[Purchases] - " + logLevel7.name(), function0.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler8.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
            }
            return;
        }
        final LogIntent logIntent2 = LogIntent.WARNING;
        Function0<String> function02 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$retryBillingServiceConnectionWithExponentialBackoff$$inlined$log$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                long j;
                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                j = this.reconnectMilliseconds;
                String format = String.format(BillingStrings.BILLING_CLIENT_RETRY, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return append.append(format).toString();
            }
        };
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent2.ordinal()]) {
            case 1:
                LogLevel logLevel10 = LogLevel.DEBUG;
                LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler10.d("[Purchases] - " + logLevel10.name(), function02.invoke());
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                break;
            case 3:
                LogLevel logLevel11 = LogLevel.WARN;
                LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                    currentLogHandler11.w("[Purchases] - " + logLevel11.name(), function02.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel12 = LogLevel.INFO;
                LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler12.i("[Purchases] - " + logLevel12.name(), function02.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel13 = LogLevel.DEBUG;
                LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                    currentLogHandler13.d("[Purchases] - " + logLevel13.name(), function02.invoke());
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                break;
            case 7:
                LogLevel logLevel14 = LogLevel.INFO;
                LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                    currentLogHandler14.i("[Purchases] - " + logLevel14.name(), function02.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel15 = LogLevel.DEBUG;
                LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                    currentLogHandler15.d("[Purchases] - " + logLevel15.name(), function02.invoke());
                    break;
                }
                break;
            case 9:
                LogLevel logLevel16 = LogLevel.DEBUG;
                LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                    currentLogHandler16.d("[Purchases] - " + logLevel16.name(), function02.invoke());
                    break;
                }
                break;
            case 10:
                LogLevel logLevel17 = LogLevel.WARN;
                LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                    currentLogHandler17.w("[Purchases] - " + logLevel17.name(), function02.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel18 = LogLevel.WARN;
                LogHandler currentLogHandler18 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                    currentLogHandler18.w("[Purchases] - " + logLevel18.name(), function02.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function02.invoke(), null);
                break;
        }
        this.reconnectionAlreadyScheduled = true;
        startConnectionOnMainThread(this.reconnectMilliseconds);
        this.reconnectMilliseconds = Math.min(this.reconnectMilliseconds * 2, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    /* renamed from: isConnected */
    public boolean getConnected() {
        BillingClient billingClient = this.billingClient;
        if (billingClient != null) {
            return billingClient.isReady();
        }
        return false;
    }

    @Override // com.revenuecat.purchases.common.BillingAbstract
    public void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes, final Function0<Unit> subscriptionStatusChange) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(inAppMessageTypes, "inAppMessageTypes");
        Intrinsics.checkNotNullParameter(subscriptionStatusChange, "subscriptionStatusChange");
        if (!inAppMessageTypes.isEmpty()) {
            InAppMessageParams.Builder newBuilder = InAppMessageParams.newBuilder();
            Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
            Iterator<? extends InAppMessageType> it = inAppMessageTypes.iterator();
            while (it.hasNext()) {
                newBuilder.addInAppMessageCategoryToShow(it.next().getInAppMessageCategoryId());
            }
            final InAppMessageParams build = newBuilder.build();
            Intrinsics.checkNotNullExpressionValue(build, "inAppMessageParamsBuilder.build()");
            final WeakReference weakReference = new WeakReference(activity);
            executeRequestOnUIThread$default(this, null, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                    invoke2(purchasesError);
                    return Unit.INSTANCE;
                }

                /* compiled from: BillingWrapper.kt */
                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$2$2, reason: invalid class name */
                static final class AnonymousClass2 extends Lambda implements Function1<BillingClient, Unit> {
                    final /* synthetic */ InAppMessageParams $inAppMessageParams;
                    final /* synthetic */ Function0<Unit> $subscriptionStatusChange;
                    final /* synthetic */ WeakReference<Activity> $weakActivity;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass2(WeakReference<Activity> weakReference, InAppMessageParams inAppMessageParams, Function0<Unit> function0) {
                        super(1);
                        this.$weakActivity = weakReference;
                        this.$inAppMessageParams = inAppMessageParams;
                        this.$subscriptionStatusChange = function0;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(BillingClient billingClient) {
                        invoke2(billingClient);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(BillingClient withConnectedClient) {
                        Intrinsics.checkNotNullParameter(withConnectedClient, "$this$withConnectedClient");
                        Activity activity = this.$weakActivity.get();
                        if (activity != null) {
                            InAppMessageParams inAppMessageParams = this.$inAppMessageParams;
                            final Function0<Unit> function0 = this.$subscriptionStatusChange;
                            withConnectedClient.showInAppMessages(activity, inAppMessageParams, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0046: INVOKE 
                                  (r5v0 'withConnectedClient' com.android.billingclient.api.BillingClient)
                                  (r0v3 'activity' android.app.Activity)
                                  (r1v0 'inAppMessageParams' com.android.billingclient.api.InAppMessageParams)
                                  (wrap:com.android.billingclient.api.InAppMessageResponseListener:0x0043: CONSTRUCTOR (r2v0 'function0' kotlin.jvm.functions.Function0<kotlin.Unit> A[DONT_INLINE]) A[MD:(kotlin.jvm.functions.Function0):void (m), WRAPPED] call: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$2$2$$ExternalSyntheticLambda0.<init>(kotlin.jvm.functions.Function0):void type: CONSTRUCTOR)
                                 VIRTUAL call: com.android.billingclient.api.BillingClient.showInAppMessages(android.app.Activity, com.android.billingclient.api.InAppMessageParams, com.android.billingclient.api.InAppMessageResponseListener):com.android.billingclient.api.BillingResult A[MD:(android.app.Activity, com.android.billingclient.api.InAppMessageParams, com.android.billingclient.api.InAppMessageResponseListener):com.android.billingclient.api.BillingResult (m)] in method: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$2.2.invoke(com.android.billingclient.api.BillingClient):void, file: classes7.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$2$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 21 more
                                */
                            /*
                                this = this;
                                java.lang.String r0 = "$this$withConnectedClient"
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                                java.lang.ref.WeakReference<android.app.Activity> r0 = r4.$weakActivity
                                java.lang.Object r0 = r0.get()
                                android.app.Activity r0 = (android.app.Activity) r0
                                if (r0 != 0) goto L3d
                                com.revenuecat.purchases.LogLevel r5 = com.revenuecat.purchases.LogLevel.DEBUG
                                com.revenuecat.purchases.LogHandler r0 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler()
                                com.revenuecat.purchases.common.Config r1 = com.revenuecat.purchases.common.Config.INSTANCE
                                com.revenuecat.purchases.LogLevel r1 = r1.getLogLevel()
                                r2 = r5
                                java.lang.Enum r2 = (java.lang.Enum) r2
                                int r1 = r1.compareTo(r2)
                                if (r1 > 0) goto L3c
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                java.lang.String r2 = "[Purchases] - "
                                r1.<init>(r2)
                                java.lang.String r5 = r5.name()
                                java.lang.StringBuilder r5 = r1.append(r5)
                                java.lang.String r5 = r5.toString()
                                java.lang.String r1 = "Activity is null, not showing Google Play in-app message."
                                r0.d(r5, r1)
                            L3c:
                                return
                            L3d:
                                com.android.billingclient.api.InAppMessageParams r1 = r4.$inAppMessageParams
                                kotlin.jvm.functions.Function0<kotlin.Unit> r2 = r4.$subscriptionStatusChange
                                com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$2$2$$ExternalSyntheticLambda0 r3 = new com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$2$2$$ExternalSyntheticLambda0
                                r3.<init>(r2)
                                r5.showInAppMessages(r0, r1, r3)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$2.AnonymousClass2.invoke2(com.android.billingclient.api.BillingClient):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final void invoke$lambda$5(Function0 function0, InAppMessageResult inAppMessageResult) {
                            Intrinsics.checkNotNullParameter(inAppMessageResult, "inAppMessageResult");
                            int responseCode = inAppMessageResult.getResponseCode();
                            if (responseCode == 0) {
                                LogLevel logLevel = LogLevel.VERBOSE;
                                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                    currentLogHandler.v("[Purchases] - " + logLevel.name(), BillingStrings.BILLING_INAPP_MESSAGE_NONE);
                                    return;
                                }
                                return;
                            }
                            if (responseCode == 1) {
                                LogLevel logLevel2 = LogLevel.DEBUG;
                                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                    currentLogHandler2.d("[Purchases] - " + logLevel2.name(), BillingStrings.BILLING_INAPP_MESSAGE_UPDATE);
                                }
                                function0.invoke();
                                return;
                            }
                            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                            String format = String.format(BillingStrings.BILLING_INAPP_MESSAGE_UNEXPECTED_CODE, Arrays.copyOf(new Object[]{Integer.valueOf(responseCode)}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            currentLogHandler3.e("[Purchases] - ERROR", format, null);
                        }
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PurchasesError purchasesError) {
                        if (purchasesError == null) {
                            BillingWrapper.this.withConnectedClient(new AnonymousClass2(weakReference, build, subscriptionStatusChange));
                            return;
                        }
                        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        String format = String.format(BillingStrings.BILLING_CONNECTION_ERROR_INAPP_MESSAGES, Arrays.copyOf(new Object[]{purchasesError}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        currentLogHandler.e("[Purchases] - ERROR", format, null);
                    }
                }, 1, null);
                return;
            }
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", BillingStrings.BILLING_UNSPECIFIED_INAPP_MESSAGE_TYPES, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:64:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void withConnectedClient(Function1<? super BillingClient, Unit> receivingFunction) {
            Unit unit;
            BillingClient billingClient = this.billingClient;
            if (billingClient != null) {
                if (!billingClient.isReady()) {
                    billingClient = null;
                }
                if (billingClient != null) {
                    receivingFunction.invoke(billingClient);
                    unit = Unit.INSTANCE;
                    if (unit != null) {
                        final LogIntent logIntent = LogIntent.GOOGLE_WARNING;
                        Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$withConnectedClient$$inlined$log$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final String invoke() {
                                String stackTrace;
                                StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                                stackTrace = this.getStackTrace();
                                String format = String.format(BillingStrings.BILLING_CLIENT_DISCONNECTED, Arrays.copyOf(new Object[]{stackTrace}, 1));
                                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                return append.append(format).toString();
                            }
                        };
                        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                            case 1:
                                LogLevel logLevel = LogLevel.DEBUG;
                                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                                    currentLogHandler.d("[Purchases] - " + logLevel.name(), function0.invoke());
                                    break;
                                }
                                break;
                            case 2:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                                break;
                            case 3:
                                LogLevel logLevel2 = LogLevel.WARN;
                                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                                    break;
                                }
                                break;
                            case 4:
                                LogLevel logLevel3 = LogLevel.INFO;
                                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                                    break;
                                }
                                break;
                            case 5:
                                LogLevel logLevel4 = LogLevel.DEBUG;
                                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                                    currentLogHandler4.d("[Purchases] - " + logLevel4.name(), function0.invoke());
                                    break;
                                }
                                break;
                            case 6:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                                break;
                            case 7:
                                LogLevel logLevel5 = LogLevel.INFO;
                                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                                    currentLogHandler5.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                                    break;
                                }
                                break;
                            case 8:
                                LogLevel logLevel6 = LogLevel.DEBUG;
                                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                                    currentLogHandler6.d("[Purchases] - " + logLevel6.name(), function0.invoke());
                                    break;
                                }
                                break;
                            case 9:
                                LogLevel logLevel7 = LogLevel.DEBUG;
                                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                                    currentLogHandler7.d("[Purchases] - " + logLevel7.name(), function0.invoke());
                                    break;
                                }
                                break;
                            case 10:
                                LogLevel logLevel8 = LogLevel.WARN;
                                LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                                    currentLogHandler8.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                                    break;
                                }
                                break;
                            case 11:
                                LogLevel logLevel9 = LogLevel.WARN;
                                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                                    currentLogHandler9.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                                    break;
                                }
                                break;
                            case 12:
                                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                                break;
                        }
                        return;
                    }
                    return;
                }
            }
            unit = null;
            if (unit != null) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getStackTrace() {
            StringWriter stringWriter = new StringWriter();
            new Throwable().printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(stringWriter2, "stringWriter.toString()");
            return stringWriter2;
        }

        private final void getStoreTransaction(final Purchase purchase, final Function1<? super StoreTransaction, Unit> completion) {
            LogHandler currentLogHandler;
            String str;
            String invoke;
            final LogIntent logIntent = LogIntent.DEBUG;
            Function0<String> function0 = new Function0<String>() { // from class: com.revenuecat.purchases.google.BillingWrapper$getStoreTransaction$$inlined$log$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    StringBuilder append = new StringBuilder().append(CollectionsKt.joinToString$default(LogIntent.this.getEmojiList(), "", null, null, 0, null, null, 62, null)).append(' ');
                    String format = String.format(BillingStrings.BILLING_WRAPPER_PURCHASES_UPDATED, Arrays.copyOf(new Object[]{PurchaseExtensionsKt.toHumanReadableDescription(purchase)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    return append.append(format).toString();
                }
            };
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str = "[Purchases] - " + logLevel.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), function0.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), function0.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str = "[Purchases] - " + logLevel4.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), function0.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str = "[Purchases] - " + logLevel6.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str = "[Purchases] - " + logLevel7.name();
                        invoke = function0.invoke();
                        currentLogHandler.d(str, invoke);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), function0.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), function0.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", function0.invoke(), null);
                    break;
            }
            synchronized (this) {
                PurchaseContext purchaseContext = this.purchaseContext.get(PurchaseExtensionsKt.getFirstProductId(purchase));
                if (purchaseContext != null && purchaseContext.getProductType() != null) {
                    completion.invoke(StoreTransactionConversionsKt.toStoreTransaction(purchase, purchaseContext));
                    return;
                }
                String purchaseToken = purchase.getPurchaseToken();
                Intrinsics.checkNotNullExpressionValue(purchaseToken, "purchase.purchaseToken");
                getPurchaseType$purchases_defaultsBc8Release(purchaseToken, new Function1<ProductType, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$getStoreTransaction$2$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ProductType productType) {
                        invoke2(productType);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ProductType type) {
                        Intrinsics.checkNotNullParameter(type, "type");
                        completion.invoke(StoreTransactionConversionsKt.toStoreTransaction$default(purchase, type, null, null, null, null, 30, null));
                    }
                });
                Unit unit = Unit.INSTANCE;
            }
        }

        private final void trackProductDetailsNotSupportedIfNeeded() {
            if (this.diagnosticsTrackerIfEnabled == null) {
                return;
            }
            BillingClient billingClient = this.billingClient;
            BillingResult isFeatureSupported = billingClient != null ? billingClient.isFeatureSupported(BillingClient.FeatureType.PRODUCT_DETAILS) : null;
            if (isFeatureSupported == null || isFeatureSupported.getResponseCode() != -2) {
                return;
            }
            DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
            int responseCode = isFeatureSupported.getResponseCode();
            String debugMessage = isFeatureSupported.getDebugMessage();
            Intrinsics.checkNotNullExpressionValue(debugMessage, "billingResult.debugMessage");
            diagnosticsTracker.trackProductDetailsNotSupported(responseCode, debugMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0089  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void trackPurchaseStartIfNeeded(GooglePurchasingData googlePurchasingData, String oldProductId) {
            List<ProductDetails.PricingPhase> list;
            boolean z;
            Boolean bool;
            List dropLast;
            List list2;
            Iterator it;
            boolean z2;
            ProductDetails productDetails;
            List<ProductDetails.SubscriptionOfferDetails> subscriptionOfferDetails;
            ProductDetails.PricingPhases pricingPhases;
            if (this.diagnosticsTrackerIfEnabled == null) {
                return;
            }
            Boolean bool2 = null;
            GooglePurchasingData.Subscription subscription = googlePurchasingData instanceof GooglePurchasingData.Subscription ? (GooglePurchasingData.Subscription) googlePurchasingData : null;
            if (subscription != null && (productDetails = subscription.getProductDetails()) != null && (subscriptionOfferDetails = productDetails.getSubscriptionOfferDetails()) != null) {
                for (ProductDetails.SubscriptionOfferDetails subscriptionOfferDetails2 : subscriptionOfferDetails) {
                    if (Intrinsics.areEqual(subscriptionOfferDetails2.getOfferToken(), subscription.getToken())) {
                        if (subscriptionOfferDetails2 != null && (pricingPhases = subscriptionOfferDetails2.getPricingPhases()) != null) {
                            list = pricingPhases.getPricingPhaseList();
                            z = true;
                            if (list == null) {
                                List<ProductDetails.PricingPhase> list3 = list;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator<T> it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        if (((ProductDetails.PricingPhase) it2.next()).getPriceAmountMicros() == 0) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                                z2 = false;
                                bool = Boolean.valueOf(z2);
                            } else {
                                bool = null;
                            }
                            if (list != null && (dropLast = CollectionsKt.dropLast(list, 1)) != null) {
                                list2 = dropLast;
                                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                    it = list2.iterator();
                                    while (it.hasNext()) {
                                        if (((ProductDetails.PricingPhase) it.next()).getPriceAmountMicros() > 0) {
                                            break;
                                        }
                                    }
                                }
                                z = false;
                                bool2 = Boolean.valueOf(z);
                            }
                            this.diagnosticsTrackerIfEnabled.trackGooglePurchaseStarted(googlePurchasingData.getProductId(), oldProductId, bool, bool2);
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            list = null;
            z = true;
            if (list == null) {
            }
            if (list != null) {
                list2 = dropLast;
                if (list2 instanceof Collection) {
                }
                it = list2.iterator();
                while (it.hasNext()) {
                }
                z = false;
                bool2 = Boolean.valueOf(z);
            }
            this.diagnosticsTrackerIfEnabled.trackGooglePurchaseStarted(googlePurchasingData.getProductId(), oldProductId, bool, bool2);
        }

        private final void trackPurchaseUpdateReceivedIfNeeded(BillingResult billingResult, List<? extends Purchase> purchases) {
            ArrayList arrayList;
            DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
            if (diagnosticsTracker == null) {
                return;
            }
            ArrayList arrayList2 = null;
            if (purchases != null) {
                ArrayList arrayList3 = new ArrayList();
                Iterator<T> it = purchases.iterator();
                while (it.hasNext()) {
                    List<String> products = ((Purchase) it.next()).getProducts();
                    Intrinsics.checkNotNullExpressionValue(products, "it.products");
                    CollectionsKt.addAll(arrayList3, products);
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            if (purchases != null) {
                List<? extends Purchase> list = purchases;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(PurchaseStateConversionsKt.toRevenueCatPurchaseState(((Purchase) it2.next()).getPurchaseState()).name());
                }
                arrayList2 = arrayList4;
            }
            int responseCode = billingResult.getResponseCode();
            String debugMessage = billingResult.getDebugMessage();
            Intrinsics.checkNotNullExpressionValue(debugMessage, "billingResult.debugMessage");
            diagnosticsTracker.trackGooglePurchaseUpdateReceived(arrayList, arrayList2, responseCode, debugMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Result<BillingFlowParams, PurchasesError> buildPurchaseParams(GooglePurchasingData purchaseInfo, ReplaceProductInfo replaceProductInfo, String appUserID, Boolean isPersonalizedPrice) {
            if (purchaseInfo instanceof GooglePurchasingData.InAppProduct) {
                return buildOneTimePurchaseParams((GooglePurchasingData.InAppProduct) purchaseInfo, appUserID, isPersonalizedPrice);
            }
            if (purchaseInfo instanceof GooglePurchasingData.Subscription) {
                return buildSubscriptionPurchaseParams((GooglePurchasingData.Subscription) purchaseInfo, replaceProductInfo, appUserID, isPersonalizedPrice);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final Result<BillingFlowParams, PurchasesError> buildOneTimePurchaseParams(GooglePurchasingData.InAppProduct purchaseInfo, String appUserID, Boolean isPersonalizedPrice) {
            BillingFlowParams.ProductDetailsParams.Builder newBuilder = BillingFlowParams.ProductDetailsParams.newBuilder();
            newBuilder.setProductDetails(purchaseInfo.getProductDetails());
            BillingFlowParams.ProductDetailsParams build = newBuilder.build();
            Intrinsics.checkNotNullExpressionValue(build, "newBuilder().apply {\n   …etails)\n        }.build()");
            try {
                BillingFlowParams.Builder obfuscatedAccountId = BillingFlowParams.newBuilder().setProductDetailsParamsList(CollectionsKt.listOf(build)).setObfuscatedAccountId(UtilsKt.sha256(appUserID));
                if (isPersonalizedPrice != null) {
                    obfuscatedAccountId.setIsOfferPersonalized(isPersonalizedPrice.booleanValue());
                }
                BillingFlowParams build2 = obfuscatedAccountId.build();
                Intrinsics.checkNotNullExpressionValue(build2, "newBuilder()\n           …                 .build()");
                return new Result.Success(build2);
            } catch (NoClassDefFoundError e) {
                throw new NoCoreLibraryDesugaringException(e);
            }
        }

        private final Result<BillingFlowParams, PurchasesError> buildSubscriptionPurchaseParams(GooglePurchasingData.Subscription purchaseInfo, ReplaceProductInfo replaceProductInfo, String appUserID, Boolean isPersonalizedPrice) {
            try {
                BillingFlowParams.Builder productDetailsParamsList = BillingFlowParams.newBuilder().setProductDetailsParamsList(buildSubscriptionProductDetailsParams(purchaseInfo));
                if (replaceProductInfo != null) {
                    Intrinsics.checkNotNullExpressionValue(productDetailsParamsList, "buildSubscriptionPurchas…arams$lambda$61$lambda$59");
                    BillingFlowParamsExtensionsKt.setUpgradeInfo(productDetailsParamsList, replaceProductInfo);
                    Unit unit = Unit.INSTANCE;
                } else {
                    Intrinsics.checkNotNullExpressionValue(productDetailsParamsList.setObfuscatedAccountId(UtilsKt.sha256(appUserID)), "setObfuscatedAccountId(appUserID.sha256())");
                }
                if (isPersonalizedPrice != null) {
                    productDetailsParamsList.setIsOfferPersonalized(isPersonalizedPrice.booleanValue());
                }
                BillingFlowParams build = productDetailsParamsList.build();
                Intrinsics.checkNotNullExpressionValue(build, "newBuilder()\n           …                 .build()");
                return new Result.Success(build);
            } catch (NoClassDefFoundError e) {
                throw new NoCoreLibraryDesugaringException(e);
            }
        }

        private static final BillingFlowParams.ProductDetailsParams buildSubscriptionProductDetailsParams$buildProductDetailParams(GooglePurchasingData.Subscription subscription) {
            BillingFlowParams.ProductDetailsParams.Builder newBuilder = BillingFlowParams.ProductDetailsParams.newBuilder();
            newBuilder.setOfferToken(subscription.getToken());
            newBuilder.setProductDetails(subscription.getProductDetails());
            BillingFlowParams.ProductDetailsParams build = newBuilder.build();
            Intrinsics.checkNotNullExpressionValue(build, "newBuilder().apply {\n   …ls)\n            }.build()");
            return build;
        }

        private final List<BillingFlowParams.ProductDetailsParams> buildSubscriptionProductDetailsParams(GooglePurchasingData.Subscription purchaseInfo) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(buildSubscriptionProductDetailsParams$buildProductDetailParams(purchaseInfo));
            List addOnProducts = purchaseInfo.getAddOnProducts();
            if (addOnProducts != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : addOnProducts) {
                    if (obj instanceof GooglePurchasingData.Subscription) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(buildSubscriptionProductDetailsParams$buildProductDetailParams((GooglePurchasingData.Subscription) it.next()));
                }
                arrayList.addAll(arrayList4);
            }
            return arrayList;
        }

        private final synchronized void sendErrorsToAllPendingRequests(final PurchasesError error) {
            while (true) {
                Pair<Function1<PurchasesError, Unit>, Long> poll = this.serviceRequests.poll();
                if (poll != null) {
                    final Function1<PurchasesError, Unit> component1 = poll.component1();
                    this.mainHandler.post(new Runnable() { // from class: com.revenuecat.purchases.google.BillingWrapper$$ExternalSyntheticLambda4
                        @Override // java.lang.Runnable
                        public final void run() {
                            Function1.this.invoke(error);
                        }
                    });
                }
            }
        }

        @Override // com.revenuecat.purchases.common.BillingAbstract
        public void getStorefront(final Function1<? super String, Unit> onSuccess, Function1<? super PurchasesError, Unit> onError) {
            Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
            Intrinsics.checkNotNullParameter(onError, "onError");
            LogLevel logLevel = LogLevel.VERBOSE;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), BillingStrings.BILLING_INITIATE_GETTING_COUNTRY_CODE);
            }
            BillingClientUseCase.run$default(new GetBillingConfigUseCase(new GetBillingConfigUseCaseParams(getAppInBackground()), this.deviceCache, new Function1<BillingConfig, Unit>() { // from class: com.revenuecat.purchases.google.BillingWrapper$getStorefront$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BillingConfig billingConfig) {
                    Intrinsics.checkNotNullParameter(billingConfig, "billingConfig");
                    Function1<String, Unit> function1 = onSuccess;
                    String countryCode = billingConfig.getCountryCode();
                    Intrinsics.checkNotNullExpressionValue(countryCode, "billingConfig.countryCode");
                    function1.invoke(countryCode);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BillingConfig billingConfig) {
                    invoke2(billingConfig);
                    return Unit.INSTANCE;
                }
            }, onError, new BillingWrapper$getStorefront$3(this), new BillingWrapper$getStorefront$4(this)), 0L, 1, null);
        }
    }
