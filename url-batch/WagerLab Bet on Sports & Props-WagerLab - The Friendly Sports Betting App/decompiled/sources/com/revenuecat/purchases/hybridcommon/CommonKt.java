package com.revenuecat.purchases.hybridcommon;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.media3.exoplayer.RendererCapabilities;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.revenuecat.purchases.AmazonLWAConsentStatus;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.DangerousSettings;
import com.revenuecat.purchases.EntitlementVerificationMode;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.ListenerConversionsKt;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesConfiguration;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.WebPurchaseRedemption;
import com.revenuecat.purchases.common.PlatformInfo;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.hybridcommon.PurchasableItem;
import com.revenuecat.purchases.hybridcommon.mappers.CustomerInfoMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.LogHandlerWithMapping;
import com.revenuecat.purchases.hybridcommon.mappers.MappedProductCategory;
import com.revenuecat.purchases.hybridcommon.mappers.OfferingsMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.PurchasesErrorKt;
import com.revenuecat.purchases.hybridcommon.mappers.StoreProductMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.StoreTransactionMapperKt;
import com.revenuecat.purchases.hybridcommon.mappers.VirtualCurrenciesMapperKt;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener;
import com.revenuecat.purchases.models.BillingFeature;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.GoogleStoreProductKt;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: common.kt */
@Metadata(d1 = {"\u0000ê\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aJ\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001c\u0010\u0003\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00012\u001c\u0010\u0006\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0001H\u0002\u001a*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u001a,\u0010\u0010\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00012\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\u0002\u001a*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0010\u0010\u0013\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0002\u001a,\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00040\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\u001a\u0097\u0001\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0002\u0010&\u001a\u0019\u0010'\u001a\u0004\u0018\u00010\f2\b\u0010(\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\u0010)\u001a6\u0010*\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010\u00012\u001c\u0010,\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00012\u0006\u0010-\u001a\u00020.H\u0002\u001a<\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010\u00012\u001c\u00101\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00012\f\u00102\u001a\b\u0012\u0004\u0012\u0002000\u0001H\u0002\u001a<\u00103\u001a\n\u0012\u0004\u0012\u000204\u0018\u00010\u00012\u001c\u00105\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00012\f\u00102\u001a\b\u0012\u0004\u0012\u0002000\u0001H\u0002\u001a\u0010\u00106\u001a\u00020\b2\u0006\u00107\u001a\u00020\u0002H\u0000\u001a¯\u0001\u00108\u001a\u00020\b2\u001c\u0010\u0003\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00012\u001c\u0010\u0006\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00012!\u00109\u001a\u001d\u0012\u0013\u0012\u00110;¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(>\u0012\u0004\u0012\u00020\b0:2F\u0010\r\u001aB\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u000200\u0018\u00010\u0001¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(\u0003\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u000204\u0018\u00010\u0001¢\u0006\f\b<\u0012\b\b=\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\b0?H\u0002\u001a\u0014\u0010@\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u001a\u0006\u0010A\u001a\u00020\u0002\u001a\u0016\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0004\u001a\u0016\u0010C\u001a\u00020\b2\u0006\u0010D\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020E\u001a\u000e\u0010F\u001a\u00020\b2\u0006\u0010\r\u001a\u00020G\u001a\u0019\u0010H\u001a\u0004\u0018\u00010I2\b\u0010J\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0002\u0010K\u001a\u000e\u0010L\u001a\u00020\b2\u0006\u0010\r\u001a\u00020G\u001a$\u0010M\u001a\u00020\b2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010O\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020P\u001a\u0006\u0010Q\u001a\u00020R\u001a\b\u0010S\u001a\u0004\u0018\u00010\u0002\u001a$\u0010T\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010U\u0012\u0004\u0012\u00020V\u0012\u0004\u0012\u00020\b0?2\u0006\u0010\r\u001a\u00020GH\u0002\u001a\"\u0010W\u001a\u0014\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0?2\u0006\u0010\r\u001a\u00020GH\u0002\u001a(\u0010X\u001a\u00020\b2 \u0010Y\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0004\u0012\u00020\b0:\u001a\u000e\u0010Z\u001a\u00020\b2\u0006\u0010\r\u001a\u00020G\u001a\u0006\u0010[\u001a\u00020\b\u001a\u0006\u0010\\\u001a\u00020\b\u001a\u0006\u0010]\u001a\u00020\u000f\u001a\u000e\u0010^\u001a\u00020\u000f2\u0006\u0010_\u001a\u00020\u0002\u001a\u0016\u0010`\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020G\u001a\u000e\u0010a\u001a\u00020\b2\u0006\u0010\r\u001a\u00020G\u001a\u0010\u0010b\u001a\u00020c2\u0006\u0010O\u001a\u00020\u0002H\u0001\u001a\u0010\u0010d\u001a\u00020\b2\b\u0010e\u001a\u0004\u0018\u00010\u0002\u001a.\u0010f\u001a\u00020\b2\b\u0010g\u001a\u0004\u0018\u00010h2\u0014\u0010i\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\r\u001a\u00020G\u001a»\u0001\u0010j\u001a\u00020\b2\b\u0010g\u001a\u0004\u0018\u00010h2\u0006\u0010k\u001a\u00020\u00022\u0014\u0010l\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\u0010m\u001a\u0004\u0018\u00010\u00022\b\u0010n\u001a\u0004\u0018\u00010\f2\b\u0010o\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\r\u001a\u00020G2\u001e\b\u0002\u0010\u0003\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00012\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00012\u001e\b\u0002\u0010p\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010q\u001aÏ\u0001\u0010r\u001a\u00020\b2\b\u0010g\u001a\u0004\u0018\u00010h2\u0006\u0010s\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u00022\b\u0010t\u001a\u0004\u0018\u00010\u00022\b\u0010m\u001a\u0004\u0018\u00010\u00022\b\u0010n\u001a\u0004\u0018\u00010\f2\b\u0010o\u001a\u0004\u0018\u00010\u000f2\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020G2\u001e\b\u0002\u0010\u0003\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00012\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00012\u001e\b\u0002\u0010p\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010u\u001aÅ\u0001\u0010v\u001a\u00020\b2\b\u0010g\u001a\u0004\u0018\u00010h2\u0006\u0010s\u001a\u00020\u00022\u0006\u0010w\u001a\u00020\u00022\b\u0010m\u001a\u0004\u0018\u00010\u00022\b\u0010n\u001a\u0004\u0018\u00010\f2\b\u0010o\u001a\u0004\u0018\u00010\u000f2\u0016\u0010l\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020G2\u001e\b\u0002\u0010\u0003\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00012\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u00012\u001e\b\u0002\u0010p\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0002\u0010x\u001a\u0016\u0010y\u001a\u00020\b2\u0006\u0010_\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020G\u001a\u000e\u0010z\u001a\u00020\b2\u0006\u0010\r\u001a\u00020G\u001a\u0010\u0010{\u001a\u00020\b2\u0006\u0010|\u001a\u00020\u000fH\u0007\u001a\u0010\u0010}\u001a\u00020\b2\u0006\u0010~\u001a\u00020\u000fH\u0007\u001a6\u0010\u007f\u001a\u00020\b2.\u0010Y\u001a*\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\r\b<\u0012\t\b=\u0012\u0005\b\b(\u0080\u0001\u0012\u0004\u0012\u00020\b0:\u001a\u000f\u0010\u0081\u0001\u001a\u00020\b2\u0006\u0010\r\u001a\u00020G\u001a\u0010\u0010\u0082\u0001\u001a\u00020\b2\u0007\u0010\u0083\u0001\u001a\u00020\u0002\u001a\u0012\u0010\u0084\u0001\u001a\u00020\b2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0002\u001a\u000f\u0010\u0086\u0001\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0002\u001a'\u0010\u0087\u0001\u001a\u00020\b2\b\u0010g\u001a\u0004\u0018\u00010h2\u0012\b\u0002\u0010\u0088\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0089\u0001\u0018\u00010\u0001H\u0007\u001a5\u0010\u008a\u0001\u001a\u0004\u0018\u0001002\u0007\u0010\u008b\u0001\u001a\u00020\u00022\u0006\u0010O\u001a\u00020c2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u0002000\u0001H\u0002\u001a)\u0010\u008d\u0001\u001a\u0004\u0018\u0001042\u0006\u0010s\u001a\u00020\u00022\u0006\u0010w\u001a\u00020\u00022\f\u00102\u001a\b\u0012\u0004\u0012\u0002000\u0001H\u0002\u001a\u000f\u0010\u008e\u0001\u001a\u00020\b2\u0006\u0010\r\u001a\u00020G\u001a\u0007\u0010\u008f\u0001\u001a\u00020\b\u001a\u000f\u0010\u008f\u0001\u001a\u00020\b2\u0006\u0010\r\u001a\u00020G\u001a-\u0010\u0090\u0001\u001a\n\u0012\u0005\u0012\u00030\u0092\u00010\u0091\u00012\u0014\u0010i\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0003\u0010\u0093\u0001\u001a\u0011\u0010\u0094\u0001\u001a\u00020\b2\u0006\u00107\u001a\u00020\u0002H\u0000\u001a\u001e\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u0001*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0000\u001a\u0010\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u0001*\u00020\u0002H\u0002\u001a\u000e\u0010\u0099\u0001\u001a\u00020\u0002*\u00030\u009a\u0001H\u0002\u001a\u0010\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009c\u0001*\u00020\u0002H\u0002¨\u0006\u009d\u0001"}, d2 = {"addOnProductIdsToFetch", "", "", "addOnStoreProducts", "", "", "addOnSubscriptionOptions", "canMakePayments", "", "context", "Landroid/content/Context;", "features", "", "onResult", "Lcom/revenuecat/purchases/hybridcommon/OnResultAny;", "", "castWildcardListToListOfStringToAnyMaps", "wildCardList", "castWildcardMapToStringToOptionalAnyMap", "wildCardMap", "checkTrialOrIntroductoryPriceEligibility", "productIdentifiers", "configure", "apiKey", "appUserID", "purchasesAreCompletedBy", "platformInfo", "Lcom/revenuecat/purchases/common/PlatformInfo;", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "dangerousSettings", "Lcom/revenuecat/purchases/DangerousSettings;", "shouldShowInAppMessagesAutomatically", "verificationMode", "pendingTransactionsForPrepaidPlansEnabled", "diagnosticsEnabled", "automaticDeviceIdentifierCollectionEnabled", "preferredLocale", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/common/PlatformInfo;Lcom/revenuecat/purchases/Store;Lcom/revenuecat/purchases/DangerousSettings;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "convertToInt", "value", "(Ljava/lang/Object;)Ljava/lang/Integer;", "createAddOnPackages", "Lcom/revenuecat/purchases/Package;", "rawAddOnPackages", "offerings", "Lcom/revenuecat/purchases/Offerings;", "createAddOnStoreProducts", "Lcom/revenuecat/purchases/models/StoreProduct;", "rawAddOnStoreProducts", "storeProducts", "createAddOnSubscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "rawAddOnSubscriptionOptions", "errorLog", "message", "fetchAddOnStoreProductsAndSubscriptionOptions", "onError", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "Lkotlin/ParameterName;", "name", "error", "Lkotlin/Function2;", "getAmazonLWAConsentStatus", "getAppUserID", "getCachedVirtualCurrencies", "getCurrentOfferingForPlacement", "placementIdentifier", "Lcom/revenuecat/purchases/hybridcommon/OnNullableResult;", "getCustomerInfo", "Lcom/revenuecat/purchases/hybridcommon/OnResult;", "getGoogleReplacementMode", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "replacementModeInt", "(Ljava/lang/Integer;)Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getOfferings", "getProductInfo", "productIDs", "type", "Lcom/revenuecat/purchases/hybridcommon/OnResultList;", "getPromotionalOffer", "Lcom/revenuecat/purchases/hybridcommon/ErrorContainer;", "getProxyURLString", "getPurchaseCompletedFunction", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/CustomerInfo;", "getPurchaseErrorFunction", "getStorefront", "callback", "getVirtualCurrencies", "invalidateCustomerInfoCache", "invalidateVirtualCurrenciesCache", "isAnonymous", "isWebPurchaseRedemptionURL", "urlString", "logIn", "logOut", "mapStringToProductType", "Lcom/revenuecat/purchases/ProductType;", "overridePreferredLocale", Constants.LOCALE, FirebaseAnalytics.Event.PURCHASE, "activity", "Landroid/app/Activity;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "purchasePackage", "packageIdentifier", "presentedOfferingContext", "googleOldProductId", "googleReplacementModeInt", "googleIsPersonalizedPrice", "addOnPackages", "(Landroid/app/Activity;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/revenuecat/purchases/hybridcommon/OnResult;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "purchaseProduct", "productIdentifier", "googleBasePlanId", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/hybridcommon/OnResult;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "purchaseSubscriptionOption", "optionIdentifier", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Lcom/revenuecat/purchases/hybridcommon/OnResult;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "redeemWebPurchase", "restorePurchases", "setAllowSharingAppStoreAccount", "allowSharingAppStoreAccount", "setDebugLogsEnabled", ViewProps.ENABLED, "setLogHandler", "logDetails", "setLogHandlerWithOnResult", "setLogLevel", FirebaseAnalytics.Param.LEVEL, "setProxyURLString", "proxyURLString", "setPurchasesAreCompletedBy", "showInAppMessagesIfNeeded", "inAppMessageTypes", "Lcom/revenuecat/purchases/models/InAppMessageType;", "storeProductForProductId", "productId", com.facebook.appevents.internal.Constants.GP_IAP_BASE_PLAN_ID, "subscriptionOptionForIdentifiers", "syncAttributesAndOfferingsIfNeeded", "syncPurchases", "validatePurchaseParams", "Lkotlin/Result;", "Lcom/revenuecat/purchases/hybridcommon/CommonPurchaseParams;", "(Ljava/util/Map;)Ljava/lang/Object;", "warnLog", "toPresentedOfferingContext", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "toPurchasesAreCompletedBy", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "toResultName", "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener$Result;", "toWebPurchaseRedemption", "Lcom/revenuecat/purchases/WebPurchaseRedemption;", "hybridcommon_bc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonKt {
    public static final void configure(Context context, String apiKey, String str, PlatformInfo platformInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        configure$default(context, apiKey, str, null, platformInfo, null, null, null, null, null, null, null, null, 8168, null);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        configure$default(context, apiKey, str, str2, platformInfo, null, null, null, null, null, null, null, null, 8160, null);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        Intrinsics.checkNotNullParameter(store, "store");
        configure$default(context, apiKey, str, str2, platformInfo, store, null, null, null, null, null, null, null, 8128, null);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(dangerousSettings, "dangerousSettings");
        configure$default(context, apiKey, str, str2, platformInfo, store, dangerousSettings, null, null, null, null, null, null, 8064, null);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(dangerousSettings, "dangerousSettings");
        configure$default(context, apiKey, str, str2, platformInfo, store, dangerousSettings, bool, null, null, null, null, null, 7936, null);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(dangerousSettings, "dangerousSettings");
        configure$default(context, apiKey, str, str2, platformInfo, store, dangerousSettings, bool, str3, null, null, null, null, 7680, null);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str3, Boolean bool2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(dangerousSettings, "dangerousSettings");
        configure$default(context, apiKey, str, str2, platformInfo, store, dangerousSettings, bool, str3, bool2, null, null, null, 7168, null);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str3, Boolean bool2, Boolean bool3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(dangerousSettings, "dangerousSettings");
        configure$default(context, apiKey, str, str2, platformInfo, store, dangerousSettings, bool, str3, bool2, bool3, null, null, 6144, null);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str3, Boolean bool2, Boolean bool3, Boolean bool4) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(dangerousSettings, "dangerousSettings");
        configure$default(context, apiKey, str, str2, platformInfo, store, dangerousSettings, bool, str3, bool2, bool3, bool4, null, 4096, null);
    }

    public static final void purchasePackage(Activity activity, String packageIdentifier, Map<String, ? extends Object> presentedOfferingContext, String str, Integer num, Boolean bool, OnResult onResult) {
        Intrinsics.checkNotNullParameter(packageIdentifier, "packageIdentifier");
        Intrinsics.checkNotNullParameter(presentedOfferingContext, "presentedOfferingContext");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        purchasePackage$default(activity, packageIdentifier, presentedOfferingContext, str, num, bool, onResult, null, null, null, 896, null);
    }

    public static final void purchasePackage(Activity activity, String packageIdentifier, Map<String, ? extends Object> presentedOfferingContext, String str, Integer num, Boolean bool, OnResult onResult, List<? extends Map<String, ? extends Object>> list) {
        Intrinsics.checkNotNullParameter(packageIdentifier, "packageIdentifier");
        Intrinsics.checkNotNullParameter(presentedOfferingContext, "presentedOfferingContext");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        purchasePackage$default(activity, packageIdentifier, presentedOfferingContext, str, num, bool, onResult, list, null, null, 768, null);
    }

    public static final void purchasePackage(Activity activity, String packageIdentifier, Map<String, ? extends Object> presentedOfferingContext, String str, Integer num, Boolean bool, OnResult onResult, List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2) {
        Intrinsics.checkNotNullParameter(packageIdentifier, "packageIdentifier");
        Intrinsics.checkNotNullParameter(presentedOfferingContext, "presentedOfferingContext");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        purchasePackage$default(activity, packageIdentifier, presentedOfferingContext, str, num, bool, onResult, list, list2, null, 512, null);
    }

    public static final void purchaseProduct(Activity activity, String productIdentifier, String type, String str, String str2, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        purchaseProduct$default(activity, productIdentifier, type, str, str2, num, bool, map, onResult, null, null, null, RendererCapabilities.AUDIO_OFFLOAD_SUPPORT_MASK, null);
    }

    public static final void purchaseProduct(Activity activity, String productIdentifier, String type, String str, String str2, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult, List<? extends Map<String, ? extends Object>> list) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        purchaseProduct$default(activity, productIdentifier, type, str, str2, num, bool, map, onResult, list, null, null, 3072, null);
    }

    public static final void purchaseProduct(Activity activity, String productIdentifier, String type, String str, String str2, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult, List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        purchaseProduct$default(activity, productIdentifier, type, str, str2, num, bool, map, onResult, list, list2, null, 2048, null);
    }

    public static final void purchaseSubscriptionOption(Activity activity, String productIdentifier, String optionIdentifier, String str, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(optionIdentifier, "optionIdentifier");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        purchaseSubscriptionOption$default(activity, productIdentifier, optionIdentifier, str, num, bool, map, onResult, null, null, null, 1792, null);
    }

    public static final void purchaseSubscriptionOption(Activity activity, String productIdentifier, String optionIdentifier, String str, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult, List<? extends Map<String, ? extends Object>> list) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(optionIdentifier, "optionIdentifier");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        purchaseSubscriptionOption$default(activity, productIdentifier, optionIdentifier, str, num, bool, map, onResult, list, null, null, 1536, null);
    }

    public static final void purchaseSubscriptionOption(Activity activity, String productIdentifier, String optionIdentifier, String str, Integer num, Boolean bool, Map<String, ? extends Object> map, OnResult onResult, List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(optionIdentifier, "optionIdentifier");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        purchaseSubscriptionOption$default(activity, productIdentifier, optionIdentifier, str, num, bool, map, onResult, list, list2, null, 1024, null);
    }

    public static final void showInAppMessagesIfNeeded(Activity activity) {
        showInAppMessagesIfNeeded$default(activity, null, 2, null);
    }

    @Deprecated(message = "Replaced with configuration in the RevenueCat dashboard", replaceWith = @ReplaceWith(expression = "configure through the RevenueCat dashboard", imports = {}))
    public static final void setAllowSharingAppStoreAccount(boolean z) {
        Purchases.INSTANCE.getSharedInstance().setAllowSharingPlayStoreAccount(z);
    }

    public static final void getOfferings(final OnResult onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        ListenerConversionsCommonKt.getOfferingsWith(Purchases.INSTANCE.getSharedInstance(), new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getOfferings$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OnResult.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
            }
        }, new Function1<Offerings, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getOfferings$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offerings offerings) {
                invoke2(offerings);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Offerings offerings) {
                Intrinsics.checkNotNullParameter(offerings, "offerings");
                final OnResult onResult2 = OnResult.this;
                OfferingsMapperKt.mapAsync(offerings, new Function1<Map<String, ? extends Object>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getOfferings$2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
                        invoke2(map);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Map<String, ? extends Object> map) {
                        Intrinsics.checkNotNullParameter(map, "map");
                        OnResult.this.onReceived(map);
                    }
                });
            }
        });
    }

    public static final void getCurrentOfferingForPlacement(final String placementIdentifier, final OnNullableResult onResult) {
        Intrinsics.checkNotNullParameter(placementIdentifier, "placementIdentifier");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        ListenerConversionsCommonKt.getOfferingsWith(Purchases.INSTANCE.getSharedInstance(), new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getCurrentOfferingForPlacement$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OnNullableResult.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
            }
        }, new Function1<Offerings, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getCurrentOfferingForPlacement$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offerings offerings) {
                invoke2(offerings);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Offerings it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Offering currentOfferingForPlacement = it.getCurrentOfferingForPlacement(placementIdentifier);
                if (currentOfferingForPlacement != null) {
                    final OnNullableResult onNullableResult = onResult;
                    OfferingsMapperKt.mapAsync(currentOfferingForPlacement, new Function1<Map<String, ? extends Object>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getCurrentOfferingForPlacement$2.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
                            invoke2(map);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Map<String, ? extends Object> map) {
                            Intrinsics.checkNotNullParameter(map, "map");
                            OnNullableResult.this.onReceived(map);
                        }
                    });
                } else {
                    onResult.onReceived(null);
                }
            }
        });
    }

    public static final void syncAttributesAndOfferingsIfNeeded(final OnResult onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        ListenerConversionsKt.syncAttributesAndOfferingsIfNeededWith(Purchases.INSTANCE.getSharedInstance(), new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$syncAttributesAndOfferingsIfNeeded$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OnResult.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
            }
        }, new Function1<Offerings, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$syncAttributesAndOfferingsIfNeeded$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offerings offerings) {
                invoke2(offerings);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Offerings it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final OnResult onResult2 = OnResult.this;
                OfferingsMapperKt.mapAsync(it, new Function1<Map<String, ? extends Object>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$syncAttributesAndOfferingsIfNeeded$2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
                        invoke2(map);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Map<String, ? extends Object> map) {
                        Intrinsics.checkNotNullParameter(map, "map");
                        OnResult.this.onReceived(map);
                    }
                });
            }
        });
    }

    public static final void getProductInfo(List<String> productIDs, String type, final OnResultList onResult) {
        Intrinsics.checkNotNullParameter(productIDs, "productIDs");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Function1<PurchasesError, Unit> function1 = new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getProductInfo$onError$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OnResultList.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
            }
        };
        Function1<List<? extends StoreProduct>, Unit> function12 = new Function1<List<? extends StoreProduct>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getProductInfo$onReceived$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends StoreProduct> list) {
                invoke2(list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<? extends StoreProduct> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                final OnResultList onResultList = OnResultList.this;
                StoreProductMapperKt.mapAsync(it, new Function1<List<? extends Map<String, ? extends Object>>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getProductInfo$onReceived$1.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Map<String, ? extends Object>> list) {
                        invoke2(list);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<? extends Map<String, ? extends Object>> list) {
                        Intrinsics.checkNotNullParameter(list, "list");
                        OnResultList.this.onReceived(list);
                    }
                });
            }
        };
        if (mapStringToProductType(type) == ProductType.SUBS) {
            ListenerConversionsCommonKt.getProductsWith(Purchases.INSTANCE.getSharedInstance(), productIDs, ProductType.SUBS, function1, function12);
        } else {
            ListenerConversionsCommonKt.getProductsWith(Purchases.INSTANCE.getSharedInstance(), productIDs, ProductType.INAPP, function1, function12);
        }
    }

    public static final void purchase(Activity activity, Map<String, ? extends Object> options, OnResult onResult) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        Object validatePurchaseParams = validatePurchaseParams(options);
        Throwable m12366exceptionOrNullimpl = Result.m12366exceptionOrNullimpl(validatePurchaseParams);
        if (m12366exceptionOrNullimpl != null) {
            Intrinsics.checkNotNull(m12366exceptionOrNullimpl, "null cannot be cast to non-null type com.revenuecat.purchases.PurchasesException");
            onResult.onError(PurchasesErrorKt.map$default(((PurchasesException) m12366exceptionOrNullimpl).getError(), null, 1, null));
        }
        if (Result.m12369isFailureimpl(validatePurchaseParams)) {
            validatePurchaseParams = null;
        }
        CommonPurchaseParams commonPurchaseParams = (CommonPurchaseParams) validatePurchaseParams;
        if (commonPurchaseParams == null) {
            return;
        }
        PurchasableItem purchasableItem = commonPurchaseParams.getPurchasableItem();
        if (purchasableItem instanceof PurchasableItem.Product) {
            PurchasableItem.Product product = (PurchasableItem.Product) purchasableItem;
            purchaseProduct(activity, product.getProductIdentifier(), product.getType(), product.getGoogleBasePlanId(), commonPurchaseParams.getGoogleOldProductId(), commonPurchaseParams.getGoogleReplacementMode(), commonPurchaseParams.getGoogleIsPersonalizedPrice(), commonPurchaseParams.getPresentedOfferingContext(), onResult, commonPurchaseParams.getAddOnStoreProducts(), commonPurchaseParams.getAddOnSubscriptionOptions(), commonPurchaseParams.getAddOnPackages());
            return;
        }
        if (purchasableItem instanceof PurchasableItem.Package) {
            String packageIdentifier = ((PurchasableItem.Package) purchasableItem).getPackageIdentifier();
            Map<String, Object> presentedOfferingContext = commonPurchaseParams.getPresentedOfferingContext();
            if (presentedOfferingContext == null) {
                presentedOfferingContext = MapsKt.emptyMap();
            }
            purchasePackage(activity, packageIdentifier, presentedOfferingContext, commonPurchaseParams.getGoogleOldProductId(), commonPurchaseParams.getGoogleReplacementMode(), commonPurchaseParams.getGoogleIsPersonalizedPrice(), onResult, commonPurchaseParams.getAddOnStoreProducts(), commonPurchaseParams.getAddOnSubscriptionOptions(), commonPurchaseParams.getAddOnPackages());
            return;
        }
        if (purchasableItem instanceof PurchasableItem.SubscriptionOption) {
            PurchasableItem.SubscriptionOption subscriptionOption = (PurchasableItem.SubscriptionOption) purchasableItem;
            purchaseSubscriptionOption(activity, subscriptionOption.getProductIdentifier(), subscriptionOption.getOptionIdentifier(), commonPurchaseParams.getGoogleOldProductId(), commonPurchaseParams.getGoogleReplacementMode(), commonPurchaseParams.getGoogleIsPersonalizedPrice(), commonPurchaseParams.getPresentedOfferingContext(), onResult, commonPurchaseParams.getAddOnStoreProducts(), commonPurchaseParams.getAddOnSubscriptionOptions(), commonPurchaseParams.getAddOnPackages());
        }
    }

    private static final Object validatePurchaseParams(Map<String, ? extends Object> map) {
        Object obj = map.get("packageIdentifier");
        PurchasableItem.Product product = null;
        product = null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("productIdentifier");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("optionIdentifier");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = map.get("googleOldProductId");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = map.get("googleReplacementMode");
        Integer num = obj5 instanceof Integer ? (Integer) obj5 : null;
        Object obj6 = map.get("googleIsPersonalizedPrice");
        Boolean bool = obj6 instanceof Boolean ? (Boolean) obj6 : null;
        Object obj7 = map.get("presentedOfferingContext");
        Map<String, Object> castWildcardMapToStringToOptionalAnyMap = castWildcardMapToStringToOptionalAnyMap(obj7 instanceof Map ? (Map) obj7 : null);
        Object obj8 = map.get("type");
        String str5 = obj8 instanceof String ? (String) obj8 : null;
        Object obj9 = map.get("addOnStoreProducts");
        List<Map<String, Object>> castWildcardListToListOfStringToAnyMaps = castWildcardListToListOfStringToAnyMaps(obj9 instanceof List ? (List) obj9 : null);
        Object obj10 = map.get("addOnSubscriptionOptions");
        List<Map<String, Object>> castWildcardListToListOfStringToAnyMaps2 = castWildcardListToListOfStringToAnyMaps(obj10 instanceof List ? (List) obj10 : null);
        Object obj11 = map.get("addOnPackages");
        List<Map<String, Object>> castWildcardListToListOfStringToAnyMaps3 = castWildcardListToListOfStringToAnyMaps(obj11 instanceof List ? (List) obj11 : null);
        if (str != null) {
            product = new PurchasableItem.Package(str);
        } else if (str3 != null && str2 != null) {
            product = new PurchasableItem.SubscriptionOption(str2, str3);
        } else if (str2 != null && str5 != null) {
            Object obj12 = map.get("googleBasePlanId");
            product = new PurchasableItem.Product(str2, str5, obj12 instanceof String ? (String) obj12 : null);
        }
        PurchasableItem purchasableItem = product;
        if (purchasableItem != null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m12363constructorimpl(new CommonPurchaseParams(purchasableItem, str4, num, bool, castWildcardMapToStringToOptionalAnyMap, castWildcardListToListOfStringToAnyMaps, castWildcardListToListOfStringToAnyMaps2, castWildcardListToListOfStringToAnyMaps3));
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m12363constructorimpl(ResultKt.createFailure(new PurchasesException(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "Invalid purchase parameters provided: " + map))));
    }

    public static /* synthetic */ void purchaseProduct$default(Activity activity, String str, String str2, String str3, String str4, Integer num, Boolean bool, Map map, OnResult onResult, List list, List list2, List list3, int i, Object obj) {
        if ((i & 512) != 0) {
            list = null;
        }
        if ((i & 1024) != 0) {
            list2 = null;
        }
        if ((i & 2048) != 0) {
            list3 = null;
        }
        purchaseProduct(activity, str, str2, str3, str4, num, bool, map, onResult, list, list2, list3);
    }

    public static final void purchaseProduct(final Activity activity, final String productIdentifier, String type, final String str, final String str2, Integer num, final Boolean bool, final Map<String, ? extends Object> map, final OnResult onResult, final List<? extends Map<String, ? extends Object>> list, final List<? extends Map<String, ? extends Object>> list2, final List<? extends Map<String, ? extends Object>> list3) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        try {
            final GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
            final ProductType mapStringToProductType = mapStringToProductType(type);
            if (activity != null) {
                Function1<List<? extends StoreProduct>, Unit> function1 = new Function1<List<? extends StoreProduct>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseProduct$onReceiveStoreProducts$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends StoreProduct> list4) {
                        invoke2(list4);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<? extends StoreProduct> storeProducts) {
                        StoreProduct storeProductForProductId;
                        List<? extends StoreProduct> createAddOnStoreProducts;
                        List<? extends SubscriptionOption> createAddOnSubscriptionOptions;
                        Function2 purchaseErrorFunction;
                        Function2 purchaseCompletedFunction;
                        PresentedOfferingContext presentedOfferingContext;
                        Intrinsics.checkNotNullParameter(storeProducts, "storeProducts");
                        storeProductForProductId = CommonKt.storeProductForProductId(productIdentifier, mapStringToProductType, str, storeProducts);
                        List<? extends SubscriptionOption> list4 = null;
                        if (storeProductForProductId != null) {
                            final PurchaseParams.Builder builder = new PurchaseParams.Builder(activity, storeProductForProductId);
                            Map<String, Object> map2 = map;
                            if (map2 != null && (presentedOfferingContext = CommonKt.toPresentedOfferingContext(map2)) != null) {
                                builder.presentedOfferingContext(presentedOfferingContext);
                            }
                            String str3 = str2;
                            if (str3 != null && !StringsKt.isBlank(str3)) {
                                builder.oldProductId(str2);
                                GoogleReplacementMode googleReplacementMode2 = googleReplacementMode;
                                if (googleReplacementMode2 != null) {
                                    builder.googleReplacementMode(googleReplacementMode2);
                                }
                            }
                            Boolean bool2 = bool;
                            if (bool2 != null) {
                                bool2.booleanValue();
                                builder.isPersonalizedPrice(bool2.booleanValue());
                            }
                            createAddOnStoreProducts = CommonKt.createAddOnStoreProducts(list, storeProducts);
                            List<? extends StoreProduct> list5 = createAddOnStoreProducts;
                            if (list5 == null || list5.isEmpty()) {
                                createAddOnStoreProducts = null;
                            }
                            if (createAddOnStoreProducts != null) {
                                builder.addOnStoreProducts(createAddOnStoreProducts);
                            }
                            createAddOnSubscriptionOptions = CommonKt.createAddOnSubscriptionOptions(list2, storeProducts);
                            List<? extends SubscriptionOption> list6 = createAddOnSubscriptionOptions;
                            if (list6 != null && !list6.isEmpty()) {
                                list4 = createAddOnSubscriptionOptions;
                            }
                            if (list4 != null) {
                                builder.addOnSubscriptionOptions(list4);
                            }
                            List<Map<String, Object>> list7 = list3;
                            if (list7 == null || list7.isEmpty()) {
                                Purchases sharedInstance = Purchases.INSTANCE.getSharedInstance();
                                PurchaseParams build = builder.build();
                                purchaseErrorFunction = CommonKt.getPurchaseErrorFunction(onResult);
                                purchaseCompletedFunction = CommonKt.getPurchaseCompletedFunction(onResult);
                                ListenerConversionsCommonKt.purchaseWith(sharedInstance, build, purchaseErrorFunction, purchaseCompletedFunction);
                                return;
                            }
                            Purchases sharedInstance2 = Purchases.INSTANCE.getSharedInstance();
                            final OnResult onResult2 = onResult;
                            Function1<PurchasesError, Unit> function12 = new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseProduct$onReceiveStoreProducts$1.7
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                                    invoke2(purchasesError);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(PurchasesError it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    OnResult.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
                                }
                            };
                            final Map<String, Object> map3 = map;
                            final OnResult onResult3 = onResult;
                            final List<Map<String, Object>> list8 = list3;
                            ListenerConversionsCommonKt.getOfferingsWith(sharedInstance2, function12, new Function1<Offerings, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseProduct$onReceiveStoreProducts$1.8
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Offerings offerings) {
                                    invoke2(offerings);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Offerings offerings) {
                                    List<Package> createAddOnPackages;
                                    Function2 purchaseErrorFunction2;
                                    Function2 purchaseCompletedFunction2;
                                    Intrinsics.checkNotNullParameter(offerings, "offerings");
                                    Map<String, Object> map4 = map3;
                                    if ((map4 != null ? CommonKt.toPresentedOfferingContext(map4) : null) != null) {
                                        try {
                                            createAddOnPackages = CommonKt.createAddOnPackages(list8, offerings);
                                            List<Package> list9 = createAddOnPackages;
                                            if (list9 == null || list9.isEmpty()) {
                                                createAddOnPackages = null;
                                            }
                                            if (createAddOnPackages != null) {
                                                builder.addOnPackages(createAddOnPackages);
                                            }
                                            Purchases sharedInstance3 = Purchases.INSTANCE.getSharedInstance();
                                            PurchaseParams build2 = builder.build();
                                            purchaseErrorFunction2 = CommonKt.getPurchaseErrorFunction(onResult3);
                                            purchaseCompletedFunction2 = CommonKt.getPurchaseCompletedFunction(onResult3);
                                            ListenerConversionsCommonKt.purchaseWith(sharedInstance3, build2, purchaseErrorFunction2, purchaseCompletedFunction2);
                                            return;
                                        } catch (IllegalArgumentException e) {
                                            onResult3.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, e.getLocalizedMessage()), null, 1, null));
                                            return;
                                        }
                                    }
                                    onResult3.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no or invalid presented offering context data provided to make this purchase"), null, 1, null));
                                }
                            });
                            return;
                        }
                        onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Couldn't find product " + productIdentifier), null, 1, null));
                    }
                };
                if (mapStringToProductType == ProductType.SUBS) {
                    ListenerConversionsCommonKt.getProductsWith(Purchases.INSTANCE.getSharedInstance(), CollectionsKt.plus((Collection) CollectionsKt.listOf((String) CollectionsKt.first(StringsKt.split$default((CharSequence) productIdentifier, new String[]{com.revenuecat.purchases.common.Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR}, false, 0, 6, (Object) null))), (Iterable) addOnProductIdsToFetch(list, list2)), ProductType.SUBS, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseProduct$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                            invoke2(purchasesError);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(PurchasesError it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            OnResult.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
                        }
                    }, function1);
                    return;
                } else {
                    ListenerConversionsCommonKt.getProductsWith(Purchases.INSTANCE.getSharedInstance(), CollectionsKt.listOf(productIdentifier), ProductType.INAPP, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseProduct$2
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                            invoke2(purchasesError);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(PurchasesError it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            OnResult.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
                        }
                    }, function1);
                    return;
                }
            }
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
        } catch (InvalidReplacementModeException unused) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchaseProduct."), null, 1, null));
        }
    }

    public static /* synthetic */ void purchasePackage$default(Activity activity, String str, Map map, String str2, Integer num, Boolean bool, OnResult onResult, List list, List list2, List list3, int i, Object obj) {
        if ((i & 128) != 0) {
            list = null;
        }
        if ((i & 256) != 0) {
            list2 = null;
        }
        if ((i & 512) != 0) {
            list3 = null;
        }
        purchasePackage(activity, str, map, str2, num, bool, onResult, list, list2, list3);
    }

    public static final void purchasePackage(final Activity activity, final String packageIdentifier, final Map<String, ? extends Object> presentedOfferingContext, final String str, Integer num, final Boolean bool, final OnResult onResult, final List<? extends Map<String, ? extends Object>> list, final List<? extends Map<String, ? extends Object>> list2, final List<? extends Map<String, ? extends Object>> list3) {
        Intrinsics.checkNotNullParameter(packageIdentifier, "packageIdentifier");
        Intrinsics.checkNotNullParameter(presentedOfferingContext, "presentedOfferingContext");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        try {
            final GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
            if (activity != null) {
                ListenerConversionsCommonKt.getOfferingsWith(Purchases.INSTANCE.getSharedInstance(), new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$purchasePackage$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                        invoke2(purchasesError);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PurchasesError it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        OnResult.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
                    }
                }, new Function1<Offerings, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$purchasePackage$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Offerings offerings) {
                        invoke2(offerings);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(final Offerings offerings) {
                        Package r5;
                        List<Map<String, Object>> list4;
                        List<Map<String, Object>> list5;
                        Function2 purchaseErrorFunction;
                        Function2 purchaseCompletedFunction;
                        List<Package> availablePackages;
                        Object obj;
                        Intrinsics.checkNotNullParameter(offerings, "offerings");
                        PresentedOfferingContext presentedOfferingContext2 = CommonKt.toPresentedOfferingContext(presentedOfferingContext);
                        if (presentedOfferingContext2 == null) {
                            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no or invalid presented offering context data provided to make this purchase"), null, 1, null));
                            return;
                        }
                        Offering offering = offerings.get(presentedOfferingContext2.getOfferingIdentifier());
                        if (offering == null || (availablePackages = offering.getAvailablePackages()) == null) {
                            r5 = null;
                        } else {
                            String str2 = packageIdentifier;
                            Iterator<T> it = availablePackages.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                } else {
                                    obj = it.next();
                                    if (StringsKt.equals(((Package) obj).getIdentifier(), str2, true)) {
                                        break;
                                    }
                                }
                            }
                            r5 = (Package) obj;
                        }
                        if (r5 != null) {
                            final PurchaseParams.Builder builder = new PurchaseParams.Builder(activity, r5);
                            builder.presentedOfferingContext(presentedOfferingContext2);
                            String str3 = str;
                            if (str3 != null && !StringsKt.isBlank(str3)) {
                                builder.oldProductId(str);
                                GoogleReplacementMode googleReplacementMode2 = googleReplacementMode;
                                if (googleReplacementMode2 != null) {
                                    builder.googleReplacementMode(googleReplacementMode2);
                                }
                            }
                            Boolean bool2 = bool;
                            if (bool2 != null) {
                                bool2.booleanValue();
                                builder.isPersonalizedPrice(bool2.booleanValue());
                            }
                            List<Map<String, Object>> list6 = list;
                            if ((list6 != null && !list6.isEmpty()) || (((list4 = list2) != null && !list4.isEmpty()) || ((list5 = list3) != null && !list5.isEmpty()))) {
                                List<Map<String, Object>> list7 = list;
                                List<Map<String, Object>> list8 = list2;
                                final OnResult onResult2 = onResult;
                                Function1<PurchasesError, Unit> function1 = new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$purchasePackage$2.2
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                                        invoke2(purchasesError);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(PurchasesError it2) {
                                        Intrinsics.checkNotNullParameter(it2, "it");
                                        OnResult.this.onError(PurchasesErrorKt.map$default(it2, null, 1, null));
                                    }
                                };
                                final List<Map<String, Object>> list9 = list3;
                                final OnResult onResult3 = onResult;
                                CommonKt.fetchAddOnStoreProductsAndSubscriptionOptions(list7, list8, function1, new Function2<List<? extends StoreProduct>, List<? extends SubscriptionOption>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$purchasePackage$2.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends StoreProduct> list10, List<? extends SubscriptionOption> list11) {
                                        invoke2(list10, list11);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(List<? extends StoreProduct> list10, List<? extends SubscriptionOption> list11) {
                                        List<Package> createAddOnPackages;
                                        Function2 purchaseErrorFunction2;
                                        Function2 purchaseCompletedFunction2;
                                        List<? extends StoreProduct> list12 = list10;
                                        if (list12 == null || list12.isEmpty()) {
                                            list10 = null;
                                        }
                                        if (list10 != null) {
                                            builder.addOnStoreProducts(list10);
                                        }
                                        List<? extends SubscriptionOption> list13 = list11;
                                        if (list13 == null || list13.isEmpty()) {
                                            list11 = null;
                                        }
                                        if (list11 != null) {
                                            builder.addOnSubscriptionOptions(list11);
                                        }
                                        try {
                                            createAddOnPackages = CommonKt.createAddOnPackages(list9, offerings);
                                            List<Package> list14 = createAddOnPackages;
                                            if (list14 == null || list14.isEmpty()) {
                                                createAddOnPackages = null;
                                            }
                                            if (createAddOnPackages != null) {
                                                builder.addOnPackages(createAddOnPackages);
                                            }
                                            Purchases sharedInstance = Purchases.INSTANCE.getSharedInstance();
                                            PurchaseParams build = builder.build();
                                            purchaseErrorFunction2 = CommonKt.getPurchaseErrorFunction(onResult3);
                                            purchaseCompletedFunction2 = CommonKt.getPurchaseCompletedFunction(onResult3);
                                            ListenerConversionsCommonKt.purchaseWith(sharedInstance, build, purchaseErrorFunction2, purchaseCompletedFunction2);
                                        } catch (IllegalArgumentException e) {
                                            onResult3.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, e.getMessage()), null, 1, null));
                                        }
                                    }
                                });
                                return;
                            }
                            Purchases sharedInstance = Purchases.INSTANCE.getSharedInstance();
                            PurchaseParams build = builder.build();
                            purchaseErrorFunction = CommonKt.getPurchaseErrorFunction(onResult);
                            purchaseCompletedFunction = CommonKt.getPurchaseCompletedFunction(onResult);
                            ListenerConversionsCommonKt.purchaseWith(sharedInstance, build, purchaseErrorFunction, purchaseCompletedFunction);
                            return;
                        }
                        onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Couldn't find product for package " + packageIdentifier), null, 1, null));
                    }
                });
            } else {
                onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
            }
        } catch (InvalidReplacementModeException unused) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchasePackage."), null, 1, null));
        }
    }

    public static /* synthetic */ void purchaseSubscriptionOption$default(Activity activity, String str, String str2, String str3, Integer num, Boolean bool, Map map, OnResult onResult, List list, List list2, List list3, int i, Object obj) {
        if ((i & 256) != 0) {
            list = null;
        }
        if ((i & 512) != 0) {
            list2 = null;
        }
        if ((i & 1024) != 0) {
            list3 = null;
        }
        purchaseSubscriptionOption(activity, str, str2, str3, num, bool, map, onResult, list, list2, list3);
    }

    public static final void purchaseSubscriptionOption(final Activity activity, final String productIdentifier, final String optionIdentifier, final String str, Integer num, final Boolean bool, final Map<String, ? extends Object> map, final OnResult onResult, final List<? extends Map<String, ? extends Object>> list, final List<? extends Map<String, ? extends Object>> list2, final List<? extends Map<String, ? extends Object>> list3) {
        Intrinsics.checkNotNullParameter(productIdentifier, "productIdentifier");
        Intrinsics.checkNotNullParameter(optionIdentifier, "optionIdentifier");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        if (Purchases.INSTANCE.getSharedInstance().getStore() != Store.PLAY_STORE) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "purchaseSubscriptionOption() is only supported on the Play Store."), null, 1, null));
            return;
        }
        try {
            final GoogleReplacementMode googleReplacementMode = getGoogleReplacementMode(num);
            if (activity != null) {
                Function1<List<? extends StoreProduct>, Unit> function1 = new Function1<List<? extends StoreProduct>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends StoreProduct> list4) {
                        invoke2(list4);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(List<? extends StoreProduct> storeProducts) {
                        SubscriptionOption subscriptionOptionForIdentifiers;
                        List<? extends StoreProduct> createAddOnStoreProducts;
                        List<? extends SubscriptionOption> createAddOnSubscriptionOptions;
                        Function2 purchaseErrorFunction;
                        Function2 purchaseCompletedFunction;
                        PresentedOfferingContext presentedOfferingContext;
                        Intrinsics.checkNotNullParameter(storeProducts, "storeProducts");
                        subscriptionOptionForIdentifiers = CommonKt.subscriptionOptionForIdentifiers(productIdentifier, optionIdentifier, storeProducts);
                        List<? extends SubscriptionOption> list4 = null;
                        if (subscriptionOptionForIdentifiers != null) {
                            final PurchaseParams.Builder builder = new PurchaseParams.Builder(activity, subscriptionOptionForIdentifiers);
                            Map<String, Object> map2 = map;
                            if (map2 != null && (presentedOfferingContext = CommonKt.toPresentedOfferingContext(map2)) != null) {
                                builder.presentedOfferingContext(presentedOfferingContext);
                            }
                            String str2 = str;
                            String str3 = str2;
                            if (str3 == null || StringsKt.isBlank(str3)) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                GoogleReplacementMode googleReplacementMode2 = googleReplacementMode;
                                builder.oldProductId(str2);
                                if (googleReplacementMode2 != null) {
                                    builder.googleReplacementMode(googleReplacementMode2);
                                }
                            }
                            Boolean bool2 = bool;
                            if (bool2 != null) {
                                bool2.booleanValue();
                                builder.isPersonalizedPrice(bool2.booleanValue());
                            }
                            createAddOnStoreProducts = CommonKt.createAddOnStoreProducts(list, storeProducts);
                            List<? extends StoreProduct> list5 = createAddOnStoreProducts;
                            if (list5 == null || list5.isEmpty()) {
                                createAddOnStoreProducts = null;
                            }
                            if (createAddOnStoreProducts != null) {
                                builder.addOnStoreProducts(createAddOnStoreProducts);
                            }
                            createAddOnSubscriptionOptions = CommonKt.createAddOnSubscriptionOptions(list2, storeProducts);
                            List<? extends SubscriptionOption> list6 = createAddOnSubscriptionOptions;
                            if (list6 != null && !list6.isEmpty()) {
                                list4 = createAddOnSubscriptionOptions;
                            }
                            if (list4 != null) {
                                builder.addOnSubscriptionOptions(list4);
                            }
                            List<Map<String, Object>> list7 = list3;
                            if (list7 == null || list7.isEmpty()) {
                                Purchases sharedInstance = Purchases.INSTANCE.getSharedInstance();
                                PurchaseParams build = builder.build();
                                purchaseErrorFunction = CommonKt.getPurchaseErrorFunction(onResult);
                                purchaseCompletedFunction = CommonKt.getPurchaseCompletedFunction(onResult);
                                ListenerConversionsCommonKt.purchaseWith(sharedInstance, build, purchaseErrorFunction, purchaseCompletedFunction);
                                return;
                            }
                            Purchases sharedInstance2 = Purchases.INSTANCE.getSharedInstance();
                            final OnResult onResult2 = onResult;
                            Function1<PurchasesError, Unit> function12 = new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1.9
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                                    invoke2(purchasesError);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(PurchasesError it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    OnResult.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
                                }
                            };
                            final Map<String, Object> map3 = map;
                            final OnResult onResult3 = onResult;
                            final List<Map<String, Object>> list8 = list3;
                            ListenerConversionsCommonKt.getOfferingsWith(sharedInstance2, function12, new Function1<Offerings, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseSubscriptionOption$onReceiveStoreProducts$1.10
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Offerings offerings) {
                                    invoke2(offerings);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Offerings offerings) {
                                    List<Package> createAddOnPackages;
                                    Function2 purchaseErrorFunction2;
                                    Function2 purchaseCompletedFunction2;
                                    Intrinsics.checkNotNullParameter(offerings, "offerings");
                                    Map<String, Object> map4 = map3;
                                    if ((map4 != null ? CommonKt.toPresentedOfferingContext(map4) : null) != null) {
                                        try {
                                            createAddOnPackages = CommonKt.createAddOnPackages(list8, offerings);
                                            List<Package> list9 = createAddOnPackages;
                                            if (list9 == null || list9.isEmpty()) {
                                                createAddOnPackages = null;
                                            }
                                            if (createAddOnPackages != null) {
                                                builder.addOnPackages(createAddOnPackages);
                                            }
                                            Purchases sharedInstance3 = Purchases.INSTANCE.getSharedInstance();
                                            PurchaseParams build2 = builder.build();
                                            purchaseErrorFunction2 = CommonKt.getPurchaseErrorFunction(onResult3);
                                            purchaseCompletedFunction2 = CommonKt.getPurchaseCompletedFunction(onResult3);
                                            ListenerConversionsCommonKt.purchaseWith(sharedInstance3, build2, purchaseErrorFunction2, purchaseCompletedFunction2);
                                            return;
                                        } catch (IllegalArgumentException e) {
                                            onResult3.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, e.getMessage()), null, 1, null));
                                            return;
                                        }
                                    }
                                    onResult3.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no or invalid presented offering context data provided to make this purchase"), null, 1, null));
                                }
                            });
                            return;
                        }
                        onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Couldn't find product " + productIdentifier + AbstractJsonLexerKt.COLON + optionIdentifier), null, 1, null));
                    }
                };
                ListenerConversionsCommonKt.getProductsWith(Purchases.INSTANCE.getSharedInstance(), CollectionsKt.plus((Collection) CollectionsKt.listOf(productIdentifier), (Iterable) addOnProductIdsToFetch(list, list2)), ProductType.SUBS, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$purchaseSubscriptionOption$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                        invoke2(purchasesError);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(PurchasesError it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        OnResult.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
                    }
                }, function1);
                return;
            }
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, "There is no current Activity"), null, 1, null));
        } catch (InvalidReplacementModeException unused) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid google replacement mode passed to purchaseSubscriptionOption."), null, 1, null));
        }
    }

    public static final String getAppUserID() {
        return Purchases.INSTANCE.getSharedInstance().getAppUserID();
    }

    public static final void getStorefront(final Function1<? super Map<String, ? extends Object>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ListenerConversionsCommonKt.getStorefrontCountryCodeWith(Purchases.INSTANCE.getSharedInstance(), new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getStorefront$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                callback.invoke(null);
            }
        }, new Function1<String, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getStorefront$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                callback.invoke(MapsKt.mapOf(TuplesKt.to(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, it)));
            }
        });
    }

    public static final void restorePurchases(final OnResult onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        ListenerConversionsCommonKt.restorePurchasesWith(Purchases.INSTANCE.getSharedInstance(), new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$restorePurchases$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OnResult.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
            }
        }, new Function1<CustomerInfo, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$restorePurchases$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CustomerInfo customerInfo) {
                invoke2(customerInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomerInfo customerInfo) {
                Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
                final OnResult onResult2 = OnResult.this;
                CustomerInfoMapperKt.mapAsync(customerInfo, new Function1<Map<String, ? extends Object>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$restorePurchases$2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
                        invoke2(map);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Map<String, ? extends Object> map) {
                        Intrinsics.checkNotNullParameter(map, "map");
                        OnResult.this.onReceived(map);
                    }
                });
            }
        });
    }

    public static final void logIn(String appUserID, final OnResult onResult) {
        Intrinsics.checkNotNullParameter(appUserID, "appUserID");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        ListenerConversionsKt.logInWith(Purchases.INSTANCE.getSharedInstance(), appUserID, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$logIn$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OnResult.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
            }
        }, new Function2<CustomerInfo, Boolean, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$logIn$2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(CustomerInfo customerInfo, Boolean bool) {
                invoke(customerInfo, bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(CustomerInfo customerInfo, final boolean z) {
                Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
                final OnResult onResult2 = OnResult.this;
                CustomerInfoMapperKt.mapAsync(customerInfo, new Function1<Map<String, ? extends Object>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$logIn$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
                        invoke2(map);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Map<String, ? extends Object> map) {
                        Intrinsics.checkNotNullParameter(map, "map");
                        onResult2.onReceived(MapsKt.mapOf(TuplesKt.to("customerInfo", map), TuplesKt.to("created", Boolean.valueOf(z))));
                    }
                });
            }
        });
    }

    public static final void logOut(final OnResult onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        ListenerConversionsKt.logOutWith(Purchases.INSTANCE.getSharedInstance(), new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$logOut$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OnResult.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
            }
        }, new Function1<CustomerInfo, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$logOut$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CustomerInfo customerInfo) {
                invoke2(customerInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomerInfo customerInfo) {
                Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
                final OnResult onResult2 = OnResult.this;
                CustomerInfoMapperKt.mapAsync(customerInfo, new Function1<Map<String, ? extends Object>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$logOut$2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
                        invoke2(map);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Map<String, ? extends Object> map) {
                        Intrinsics.checkNotNullParameter(map, "map");
                        OnResult.this.onReceived(map);
                    }
                });
            }
        });
    }

    @Deprecated(message = "Use setLogLevel instead")
    public static final void setDebugLogsEnabled(boolean z) {
        Purchases.INSTANCE.setDebugLogsEnabled(z);
    }

    public static final void setLogLevel(String level) {
        Intrinsics.checkNotNullParameter(level, "level");
        try {
            Purchases.INSTANCE.setLogLevel(LogLevel.valueOf(level));
        } catch (IllegalArgumentException unused) {
            warnLog("Unrecognized log level: " + level);
        }
    }

    public static final void setLogHandler(Function1<? super Map<String, String>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Purchases.INSTANCE.setLogHandler(new LogHandlerWithMapping(callback));
    }

    public static final void setLogHandlerWithOnResult(final OnResult onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        setLogHandler(new Function1<Map<String, ? extends String>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$setLogHandlerWithOnResult$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends String> map) {
                invoke2((Map<String, String>) map);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Map<String, String> logDetails) {
                Intrinsics.checkNotNullParameter(logDetails, "logDetails");
                OnResult.this.onReceived(logDetails);
            }
        });
    }

    public static final void setProxyURLString(String str) {
        Purchases.INSTANCE.setProxyURL(str != null ? new URL(str) : null);
    }

    public static final String getProxyURLString() {
        return String.valueOf(Purchases.INSTANCE.getProxyURL());
    }

    public static final void getCustomerInfo(final OnResult onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        ListenerConversionsKt.getCustomerInfoWith(Purchases.INSTANCE.getSharedInstance(), new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getCustomerInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OnResult.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
            }
        }, new Function1<CustomerInfo, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getCustomerInfo$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CustomerInfo customerInfo) {
                invoke2(customerInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomerInfo customerInfo) {
                Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
                final OnResult onResult2 = OnResult.this;
                CustomerInfoMapperKt.mapAsync(customerInfo, new Function1<Map<String, ? extends Object>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getCustomerInfo$2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
                        invoke2(map);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Map<String, ? extends Object> map) {
                        Intrinsics.checkNotNullParameter(map, "map");
                        OnResult.this.onReceived(map);
                    }
                });
            }
        });
    }

    public static final void syncPurchases() {
        Purchases.syncPurchases$default(Purchases.INSTANCE.getSharedInstance(), null, 1, null);
    }

    public static final void syncPurchases(final OnResult onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        ListenerConversionsKt.syncPurchasesWith(Purchases.INSTANCE.getSharedInstance(), new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$syncPurchases$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OnResult.this.onError(PurchasesErrorKt.map$default(it, null, 1, null));
            }
        }, new Function1<CustomerInfo, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$syncPurchases$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(CustomerInfo customerInfo) {
                invoke2(customerInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(CustomerInfo customerInfo) {
                Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
                final OnResult onResult2 = OnResult.this;
                CustomerInfoMapperKt.mapAsync(customerInfo, new Function1<Map<String, ? extends Object>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$syncPurchases$2.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
                        invoke2(map);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Map<String, ? extends Object> map) {
                        Intrinsics.checkNotNullParameter(map, "map");
                        OnResult.this.onReceived(map);
                    }
                });
            }
        });
    }

    public static final boolean isAnonymous() {
        return Purchases.INSTANCE.getSharedInstance().isAnonymous();
    }

    public static final void setPurchasesAreCompletedBy(String purchasesAreCompletedBy) {
        Intrinsics.checkNotNullParameter(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        PurchasesAreCompletedBy purchasesAreCompletedBy2 = toPurchasesAreCompletedBy(purchasesAreCompletedBy);
        if (purchasesAreCompletedBy2 != null) {
            Purchases.INSTANCE.getSharedInstance().setPurchasesAreCompletedBy(purchasesAreCompletedBy2);
        }
    }

    public static final Map<String, Map<String, Object>> checkTrialOrIntroductoryPriceEligibility(List<String> productIdentifiers) {
        Intrinsics.checkNotNullParameter(productIdentifiers, "productIdentifiers");
        List<String> list = productIdentifiers;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(TuplesKt.to((String) it.next(), MapsKt.mapOf(TuplesKt.to("status", 0), TuplesKt.to("description", "Status indeterminate."))));
        }
        return MapsKt.toMap(arrayList);
    }

    public static final void invalidateCustomerInfoCache() {
        Purchases.INSTANCE.getSharedInstance().invalidateCustomerInfoCache();
    }

    public static final void overridePreferredLocale(String str) {
        Purchases.INSTANCE.getSharedInstance().overridePreferredUILocale(str);
    }

    public static final void canMakePayments(Context context, List<Integer> features, final OnResultAny<Boolean> onResult) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        ArrayList arrayList = new ArrayList();
        try {
            BillingFeature[] values = BillingFeature.values();
            List<Integer> list = features;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(values[((Number) it.next()).intValue()]);
            }
            arrayList.addAll(arrayList2);
            Purchases.INSTANCE.canMakePayments(context, arrayList, new Callback() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$$ExternalSyntheticLambda1
                @Override // com.revenuecat.purchases.interfaces.Callback
                public final void onReceived(Object obj) {
                    CommonKt.canMakePayments$lambda$4(OnResultAny.this, (Boolean) obj);
                }
            });
        } catch (IndexOutOfBoundsException unused) {
            onResult.onError(PurchasesErrorKt.map$default(new PurchasesError(PurchasesErrorCode.UnknownError, "Invalid feature type passed to canMakePayments."), null, 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void canMakePayments$lambda$4(OnResultAny onResultAny, Boolean it) {
        Intrinsics.checkNotNullExpressionValue(it, "it");
        onResultAny.onReceived(it);
    }

    public static final void getAmazonLWAConsentStatus(final OnResultAny<Boolean> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        ListenerConversionsKt.getAmazonLWAConsentStatusWith(Purchases.INSTANCE.getSharedInstance(), new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getAmazonLWAConsentStatus$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError it) {
                Intrinsics.checkNotNullParameter(it, "it");
                onResult.onError(PurchasesErrorKt.map$default(it, null, 1, null));
            }
        }, new Function1<AmazonLWAConsentStatus, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getAmazonLWAConsentStatus$2

            /* compiled from: common.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AmazonLWAConsentStatus.values().length];
                    try {
                        iArr[AmazonLWAConsentStatus.CONSENTED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AmazonLWAConsentStatus.UNAVAILABLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AmazonLWAConsentStatus amazonLWAConsentStatus) {
                invoke2(amazonLWAConsentStatus);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(AmazonLWAConsentStatus it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OnResultAny<Boolean> onResultAny = onResult;
                int i = WhenMappings.$EnumSwitchMapping$0[it.ordinal()];
                boolean z = true;
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = false;
                }
                onResultAny.onReceived(Boolean.valueOf(z));
            }
        });
    }

    public static /* synthetic */ void showInAppMessagesIfNeeded$default(Activity activity, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        showInAppMessagesIfNeeded(activity, list);
    }

    public static final void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> list) {
        if (activity == null) {
            errorLog("showInAppMessages called with null activity");
        } else if (list == null) {
            Purchases.showInAppMessagesIfNeeded$default(Purchases.INSTANCE.getSharedInstance(), activity, null, 2, null);
        } else {
            Purchases.INSTANCE.getSharedInstance().showInAppMessagesIfNeeded(activity, list);
        }
    }

    public static /* synthetic */ void configure$default(Context context, String str, String str2, String str3, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str4, Boolean bool2, Boolean bool3, Boolean bool4, String str5, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            store = Store.PLAY_STORE;
        }
        if ((i & 64) != 0) {
            dangerousSettings = new DangerousSettings(true);
        }
        if ((i & 128) != 0) {
            bool = null;
        }
        if ((i & 256) != 0) {
            str4 = null;
        }
        if ((i & 512) != 0) {
            bool2 = null;
        }
        if ((i & 1024) != 0) {
            bool3 = null;
        }
        if ((i & 2048) != 0) {
            bool4 = null;
        }
        if ((i & 4096) != 0) {
            str5 = null;
        }
        configure(context, str, str2, str3, platformInfo, store, dangerousSettings, bool, str4, bool2, bool3, bool4, str5);
    }

    public static final void configure(Context context, String apiKey, String str, String str2, PlatformInfo platformInfo, Store store, DangerousSettings dangerousSettings, Boolean bool, String str3, Boolean bool2, Boolean bool3, Boolean bool4, String str4) {
        PurchasesAreCompletedBy purchasesAreCompletedBy;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(platformInfo, "platformInfo");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(dangerousSettings, "dangerousSettings");
        Purchases.INSTANCE.setPlatformInfo(platformInfo);
        PurchasesConfiguration.Builder dangerousSettings2 = new PurchasesConfiguration.Builder(context, apiKey).appUserID(str).store(store).dangerousSettings(dangerousSettings);
        if (str2 != null && (purchasesAreCompletedBy = toPurchasesAreCompletedBy(str2)) != null) {
            dangerousSettings2.purchasesAreCompletedBy(purchasesAreCompletedBy);
        }
        if (bool != null) {
            dangerousSettings2.showInAppMessagesAutomatically(bool.booleanValue());
        }
        if (str3 != null) {
            try {
                dangerousSettings2.entitlementVerificationMode(EntitlementVerificationMode.valueOf(str3));
            } catch (IllegalArgumentException unused) {
                warnLog("Attempted to configure with unknown verification mode: " + str3 + '.');
                Unit unit = Unit.INSTANCE;
            }
        }
        if (bool2 != null) {
            dangerousSettings2.pendingTransactionsForPrepaidPlansEnabled(bool2.booleanValue());
        }
        if (bool3 != null) {
            dangerousSettings2.diagnosticsEnabled(bool3.booleanValue());
        }
        if (bool4 != null) {
            dangerousSettings2.automaticDeviceIdentifierCollectionEnabled(bool4.booleanValue());
        }
        if (str4 != null) {
            dangerousSettings2.preferredUILocaleOverride(str4);
        }
        Purchases.INSTANCE.configure(dangerousSettings2.build());
    }

    public static final ErrorContainer getPromotionalOffer() {
        return new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Android platform doesn't support promotional offers", MapsKt.emptyMap());
    }

    public static final boolean isWebPurchaseRedemptionURL(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        return toWebPurchaseRedemption(urlString) != null;
    }

    public static final void redeemWebPurchase(String urlString, final OnResult onResult) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        WebPurchaseRedemption webPurchaseRedemption = toWebPurchaseRedemption(urlString);
        if (webPurchaseRedemption == null) {
            onResult.onError(new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Invalid URL for web purchase redemption", MapsKt.emptyMap()));
        } else {
            Purchases.INSTANCE.getSharedInstance().redeemWebPurchase(webPurchaseRedemption, new RedeemWebPurchaseListener() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$$ExternalSyntheticLambda0
                @Override // com.revenuecat.purchases.interfaces.RedeemWebPurchaseListener
                public final void handleResult(RedeemWebPurchaseListener.Result result) {
                    CommonKt.redeemWebPurchase$lambda$14(OnResult.this, result);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void redeemWebPurchase$lambda$14(final OnResult onResult, final RedeemWebPurchaseListener.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof RedeemWebPurchaseListener.Result.Success) {
            CustomerInfoMapperKt.mapAsync(((RedeemWebPurchaseListener.Result.Success) result).getCustomerInfo(), new Function1<Map<String, ? extends Object>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$redeemWebPurchase$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
                    invoke2(map);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Map<String, ? extends Object> map) {
                    String resultName;
                    Intrinsics.checkNotNullParameter(map, "map");
                    OnResult onResult2 = OnResult.this;
                    resultName = CommonKt.toResultName(result);
                    onResult2.onReceived(MapsKt.mutableMapOf(TuplesKt.to("result", resultName), TuplesKt.to("customerInfo", map)));
                }
            });
            return;
        }
        if (result instanceof RedeemWebPurchaseListener.Result.Error) {
            onResult.onReceived(MapsKt.mutableMapOf(TuplesKt.to("result", toResultName(result)), TuplesKt.to("error", PurchasesErrorKt.map$default(((RedeemWebPurchaseListener.Result.Error) result).getError(), null, 1, null))));
        } else {
            if (result instanceof RedeemWebPurchaseListener.Result.Expired) {
                onResult.onReceived(MapsKt.mutableMapOf(TuplesKt.to("result", toResultName(result)), TuplesKt.to("obfuscatedEmail", ((RedeemWebPurchaseListener.Result.Expired) result).getObfuscatedEmail())));
                return;
            }
            if (Intrinsics.areEqual(result, RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE) ? true : Intrinsics.areEqual(result, RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE)) {
                onResult.onReceived(MapsKt.mutableMapOf(TuplesKt.to("result", toResultName(result))));
            }
        }
    }

    public static final void getVirtualCurrencies(final OnResult onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        ListenerConversionsKt.getVirtualCurrenciesWith(Purchases.INSTANCE.getSharedInstance(), new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getVirtualCurrencies$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                invoke2(purchasesError);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(PurchasesError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                OnResult.this.onError(PurchasesErrorKt.map$default(error, null, 1, null));
            }
        }, new Function1<VirtualCurrencies, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getVirtualCurrencies$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(VirtualCurrencies virtualCurrencies) {
                invoke2(virtualCurrencies);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(VirtualCurrencies virtualCurrencies) {
                Intrinsics.checkNotNullParameter(virtualCurrencies, "virtualCurrencies");
                OnResult.this.onReceived(VirtualCurrenciesMapperKt.map(virtualCurrencies));
            }
        });
    }

    public static final void invalidateVirtualCurrenciesCache() {
        Purchases.INSTANCE.getSharedInstance().invalidateVirtualCurrenciesCache();
    }

    public static final Map<String, Object> getCachedVirtualCurrencies() {
        VirtualCurrencies cachedVirtualCurrencies = Purchases.INSTANCE.getSharedInstance().getCachedVirtualCurrencies();
        if (cachedVirtualCurrencies != null) {
            return VirtualCurrenciesMapperKt.map(cachedVirtualCurrencies);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r2.getType() == r8) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final StoreProduct storeProductForProductId(String str, ProductType productType, String str2, List<? extends StoreProduct> list) {
        Object obj;
        Object next;
        boolean z;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
            StoreProduct storeProduct = (StoreProduct) next;
            z = true;
            boolean z2 = Intrinsics.areEqual(storeProduct.getId(), str) && storeProduct.getType() == productType;
            if (Intrinsics.areEqual(storeProduct.getPurchasingData().getProductId(), str)) {
                GoogleStoreProduct googleProduct = GoogleStoreProductKt.getGoogleProduct(storeProduct);
                if (Intrinsics.areEqual(googleProduct != null ? googleProduct.getBasePlanId() : null, str2)) {
                }
            }
            z = false;
            if (z2) {
                break;
            }
        } while (!z);
        obj = next;
        return (StoreProduct) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SubscriptionOption subscriptionOptionForIdentifiers(String str, String str2, List<? extends StoreProduct> list) {
        SubscriptionOption subscriptionOption;
        Iterator<T> it = list.iterator();
        do {
            subscriptionOption = null;
            if (!it.hasNext()) {
                break;
            }
            StoreProduct storeProduct = (StoreProduct) it.next();
            SubscriptionOptions subscriptionOptions = storeProduct.getSubscriptionOptions();
            if (subscriptionOptions != null) {
                Iterator<SubscriptionOption> it2 = subscriptionOptions.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    SubscriptionOption next = it2.next();
                    SubscriptionOption subscriptionOption2 = next;
                    if (Intrinsics.areEqual(storeProduct.getPurchasingData().getProductId(), str) && Intrinsics.areEqual(subscriptionOption2.getId(), str2)) {
                        subscriptionOption = next;
                        break;
                    }
                }
                subscriptionOption = subscriptionOption;
            }
        } while (subscriptionOption == null);
        return subscriptionOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<SubscriptionOption> createAddOnSubscriptionOptions(List<? extends Map<String, ? extends Object>> list, List<? extends StoreProduct> list2) {
        SubscriptionOption subscriptionOptionForIdentifiers;
        List<? extends Map<String, ? extends Object>> list3 = list;
        if (list3 == null || list3.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            Object obj = map.get("productIdentifier");
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                Object obj2 = map.get("optionIdentifier");
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                if (str2 != null) {
                    subscriptionOptionForIdentifiers = subscriptionOptionForIdentifiers(str, str2, list2);
                    if (subscriptionOptionForIdentifiers == null) {
                        arrayList.add(subscriptionOptionForIdentifiers);
                    }
                }
            }
            subscriptionOptionForIdentifiers = null;
            if (subscriptionOptionForIdentifiers == null) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Package> createAddOnPackages(List<? extends Map<String, ? extends Object>> list, Offerings offerings) throws IllegalArgumentException {
        Package r2;
        List<? extends Map<String, ? extends Object>> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            Object obj = map.get("packageIdentifier");
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                Object obj2 = map.get("presentedOfferingContext");
                Map map2 = obj2 instanceof Map ? (Map) obj2 : null;
                if (map2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : map2.entrySet()) {
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        String str2 = key instanceof String ? (String) key : null;
                        Pair pair = str2 != null ? TuplesKt.to(str2, value) : null;
                        if (pair != null) {
                            arrayList2.add(pair);
                        }
                    }
                    Map map3 = MapsKt.toMap(arrayList2);
                    if (map3 != null) {
                        Object obj3 = map3.get("offeringIdentifier");
                        String str3 = obj3 instanceof String ? (String) obj3 : null;
                        if (str3 == null) {
                            throw new IllegalArgumentException("Missing offeringIdentifier for add-on package " + str);
                        }
                        Offering offering = offerings.get(str3);
                        if (offering == null) {
                            throw new IllegalArgumentException("Could not find offering with identifier " + str3 + " for add-on package " + str);
                        }
                        try {
                            r2 = offering.getPackage(str);
                        } catch (NoSuchElementException unused) {
                            throw new IllegalArgumentException("Could not find package with identifier " + str + " in offering with identifier " + str3);
                        }
                    }
                }
                throw new IllegalArgumentException("Missing presentedOfferingContext for add-on package " + str);
            }
            r2 = null;
            if (r2 != null) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x001a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<StoreProduct> createAddOnStoreProducts(List<? extends Map<String, ? extends Object>> list, List<? extends StoreProduct> list2) {
        StoreProduct storeProductForProductId;
        List<? extends Map<String, ? extends Object>> list3 = list;
        if (list3 == null || list3.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            Object obj = map.get("productIdentifier");
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                Object obj2 = map.get("type");
                String str2 = obj2 instanceof String ? (String) obj2 : null;
                if (str2 != null) {
                    storeProductForProductId = storeProductForProductId(str, mapStringToProductType(str2), null, list2);
                    if (storeProductForProductId == null) {
                        arrayList.add(storeProductForProductId);
                    }
                }
            }
            storeProductForProductId = null;
            if (storeProductForProductId == null) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toResultName(RedeemWebPurchaseListener.Result result) {
        if (result instanceof RedeemWebPurchaseListener.Result.Success) {
            return "SUCCESS";
        }
        if (result instanceof RedeemWebPurchaseListener.Result.Error) {
            return "ERROR";
        }
        if (Intrinsics.areEqual(result, RedeemWebPurchaseListener.Result.PurchaseBelongsToOtherUser.INSTANCE)) {
            return "PURCHASE_BELONGS_TO_OTHER_USER";
        }
        if (Intrinsics.areEqual(result, RedeemWebPurchaseListener.Result.InvalidToken.INSTANCE)) {
            return "INVALID_TOKEN";
        }
        if (result instanceof RedeemWebPurchaseListener.Result.Expired) {
            return "EXPIRED";
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final WebPurchaseRedemption toWebPurchaseRedemption(String str) {
        try {
            return Purchases.INSTANCE.parseAsWebPurchaseRedemption(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Throwable th) {
            errorLog("Error parsing WebPurchaseRedemption from URL: " + str + ". Error: " + th);
            return null;
        }
    }

    private static final PurchasesAreCompletedBy toPurchasesAreCompletedBy(String str) {
        try {
            return PurchasesAreCompletedBy.valueOf(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static final ProductType mapStringToProductType(String type) {
        MappedProductCategory mappedProductCategory;
        Intrinsics.checkNotNullParameter(type, "type");
        MappedProductCategory[] values = MappedProductCategory.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                mappedProductCategory = null;
                break;
            }
            mappedProductCategory = values[i];
            if (StringsKt.equals(mappedProductCategory.getValue(), type, true)) {
                break;
            }
            i++;
        }
        if (mappedProductCategory != null) {
            return mappedProductCategory.getToProductType();
        }
        String lowerCase = type.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (Intrinsics.areEqual(lowerCase, "subs")) {
            return ProductType.SUBS;
        }
        if (Intrinsics.areEqual(lowerCase, "inapp")) {
            return ProductType.INAPP;
        }
        warnLog("Unrecognized product type: " + type + "... Defaulting to INAPP");
        return ProductType.INAPP;
    }

    private static final Map<String, Object> castWildcardMapToStringToOptionalAnyMap(Map<?, ?> map) {
        LinkedHashMap linkedHashMap = null;
        if (map != null) {
            Set<?> keySet = map.keySet();
            if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                Iterator<T> it = keySet.iterator();
                while (it.hasNext()) {
                    if (!(it.next() instanceof String)) {
                        return null;
                    }
                }
            }
            linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
            Iterator<T> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) key, entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final List<Map<String, Object>> castWildcardListToListOfStringToAnyMaps(List<?> list) {
        LinkedHashMap linkedHashMap;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Map map = obj instanceof Map ? (Map) obj : null;
            if (map != null) {
                Set keySet = map.keySet();
                if (!(keySet instanceof Collection) || !keySet.isEmpty()) {
                    Iterator it = keySet.iterator();
                    while (it.hasNext()) {
                        if (!(it.next() instanceof String)) {
                        }
                    }
                }
                linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Intrinsics.checkNotNull(key, "null cannot be cast to non-null type kotlin.String");
                    linkedHashMap.put((String) key, entry.getValue());
                }
                if (linkedHashMap == null) {
                    arrayList.add(linkedHashMap);
                }
            }
            linkedHashMap = null;
            if (linkedHashMap == null) {
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetchAddOnStoreProductsAndSubscriptionOptions(final List<? extends Map<String, ? extends Object>> list, final List<? extends Map<String, ? extends Object>> list2, final Function1<? super PurchasesError, Unit> function1, final Function2<? super List<? extends StoreProduct>, ? super List<? extends SubscriptionOption>, Unit> function2) {
        List<String> addOnProductIdsToFetch = addOnProductIdsToFetch(list, list2);
        if (!addOnProductIdsToFetch.isEmpty()) {
            ListenerConversionsCommonKt.getProductsWith(Purchases.INSTANCE.getSharedInstance(), addOnProductIdsToFetch, ProductType.SUBS, new Function1<PurchasesError, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$fetchAddOnStoreProductsAndSubscriptionOptions$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError) {
                    invoke2(purchasesError);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(PurchasesError it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    function1.invoke(it);
                }
            }, new Function1<List<? extends StoreProduct>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$fetchAddOnStoreProductsAndSubscriptionOptions$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends StoreProduct> list3) {
                    invoke2(list3);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(List<? extends StoreProduct> storeProducts) {
                    List<? extends StoreProduct> createAddOnStoreProducts;
                    List<? extends SubscriptionOption> createAddOnSubscriptionOptions;
                    Intrinsics.checkNotNullParameter(storeProducts, "storeProducts");
                    createAddOnStoreProducts = CommonKt.createAddOnStoreProducts(list, storeProducts);
                    createAddOnSubscriptionOptions = CommonKt.createAddOnSubscriptionOptions(list2, storeProducts);
                    function2.invoke(createAddOnStoreProducts, createAddOnSubscriptionOptions);
                }
            });
        } else {
            function2.invoke(null, null);
        }
    }

    private static final List<String> addOnProductIdsToFetch(List<? extends Map<String, ? extends Object>> list, List<? extends Map<String, ? extends Object>> list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = null;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Object obj = ((Map) it.next()).get("productIdentifier");
                String str = obj instanceof String ? (String) obj : null;
                String str2 = str == null ? null : (String) CollectionsKt.first(StringsKt.split$default((CharSequence) str, new String[]{com.revenuecat.purchases.common.Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR}, false, 0, 6, (Object) null));
                if (str2 != null) {
                    arrayList3.add(str2);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = CollectionsKt.emptyList();
        }
        if (list2 != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((Map) it2.next()).get("productIdentifier");
                String str3 = obj2 instanceof String ? (String) obj2 : null;
                String str4 = str3 == null ? null : (String) CollectionsKt.first(StringsKt.split$default((CharSequence) str3, new String[]{com.revenuecat.purchases.common.Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR}, false, 0, 6, (Object) null));
                if (str4 != null) {
                    arrayList4.add(str4);
                }
            }
            arrayList2 = arrayList4;
        }
        if (arrayList2 == null) {
            arrayList2 = CollectionsKt.emptyList();
        }
        return CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
    }

    public static final GoogleReplacementMode getGoogleReplacementMode(Integer num) throws InvalidReplacementModeException {
        GoogleReplacementMode googleReplacementMode = null;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        GoogleReplacementMode[] values = GoogleReplacementMode.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            GoogleReplacementMode googleReplacementMode2 = values[i];
            if (googleReplacementMode2.getPlayBillingClientMode() == intValue) {
                googleReplacementMode = googleReplacementMode2;
                break;
            }
            i++;
        }
        if (googleReplacementMode != null) {
            return googleReplacementMode;
        }
        throw new InvalidReplacementModeException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<PurchasesError, Boolean, Unit> getPurchaseErrorFunction(final OnResult onResult) {
        return new Function2<PurchasesError, Boolean, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getPurchaseErrorFunction$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PurchasesError purchasesError, Boolean bool) {
                invoke(purchasesError, bool.booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PurchasesError error, boolean z) {
                Intrinsics.checkNotNullParameter(error, "error");
                OnResult.this.onError(PurchasesErrorKt.map(error, MapsKt.mapOf(TuplesKt.to("userCancelled", Boolean.valueOf(z)))));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<StoreTransaction, CustomerInfo, Unit> getPurchaseCompletedFunction(final OnResult onResult) {
        return new Function2<StoreTransaction, CustomerInfo, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getPurchaseCompletedFunction$1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                invoke2(storeTransaction, customerInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                Unit unit;
                Intrinsics.checkNotNullParameter(customerInfo, "customerInfo");
                if (storeTransaction != null) {
                    final OnResult onResult2 = OnResult.this;
                    CustomerInfoMapperKt.mapAsync(customerInfo, new Function1<Map<String, ? extends Object>, Unit>() { // from class: com.revenuecat.purchases.hybridcommon.CommonKt$getPurchaseCompletedFunction$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
                            invoke2(map);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Map<String, ? extends Object> map) {
                            Intrinsics.checkNotNullParameter(map, "map");
                            OnResult.this.onReceived(MapsKt.mapOf(TuplesKt.to("productIdentifier", storeTransaction.getProductIds().get(0)), TuplesKt.to("customerInfo", map), TuplesKt.to("transaction", StoreTransactionMapperKt.map(storeTransaction))));
                        }
                    });
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    OnResult.this.onError(new ErrorContainer(PurchasesErrorCode.UnsupportedError.getCode(), "Error purchasing. Null transaction returned from a successful non-upgrade purchase.", MapsKt.emptyMap()));
                }
            }
        };
    }

    public static final void warnLog(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (Purchases.INSTANCE.getLogLevel().compareTo(LogLevel.WARN) <= 0) {
            Log.w("PurchasesHybridCommon", message);
        }
    }

    public static final void errorLog(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (Purchases.INSTANCE.getLogLevel().compareTo(LogLevel.ERROR) <= 0) {
            Log.e("PurchasesHybridCommon", message);
        }
    }

    public static final PresentedOfferingContext toPresentedOfferingContext(Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Object obj = map.get("offeringIdentifier");
        PresentedOfferingContext.TargetingContext targetingContext = null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return null;
        }
        Object obj2 = map.get("placementIdentifier");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("targetingContext");
        Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
        if (map2 != null) {
            Integer convertToInt = convertToInt(map2.get("revision"));
            Object obj4 = map2.get("ruleId");
            String str3 = obj4 instanceof String ? (String) obj4 : null;
            if (convertToInt != null && str3 != null) {
                targetingContext = new PresentedOfferingContext.TargetingContext(convertToInt.intValue(), str3);
            }
        }
        return new PresentedOfferingContext(str, str2, targetingContext);
    }

    public static final Integer convertToInt(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Double) {
            return Integer.valueOf((int) ((Number) obj).doubleValue());
        }
        return null;
    }
}
