package expo.modules.updates.reloadscreen;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import android.widget.ImageView;
import com.facebook.common.util.UriUtil;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReloadScreenView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "expo.modules.updates.reloadscreen.ReloadScreenView$loadImageFromUrl$1", f = "ReloadScreenView.kt", i = {}, l = {133, 139}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class ReloadScreenView$loadImageFromUrl$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ImageView $imageView;
    final /* synthetic */ Uri $uri;
    int label;
    final /* synthetic */ ReloadScreenView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReloadScreenView$loadImageFromUrl$1(Uri uri, ReloadScreenView reloadScreenView, ImageView imageView, Continuation<? super ReloadScreenView$loadImageFromUrl$1> continuation) {
        super(2, continuation);
        this.$uri = uri;
        this.this$0 = reloadScreenView;
        this.$imageView = imageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReloadScreenView$loadImageFromUrl$1(this.$uri, this.this$0, this.$imageView, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ReloadScreenView$loadImageFromUrl$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new expo.modules.updates.reloadscreen.ReloadScreenView$loadImageFromUrl$1.AnonymousClass1(r13, r12.this$0, r12.$imageView, null), r12) != r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fc, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fa, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new expo.modules.updates.reloadscreen.ReloadScreenView$loadImageFromUrl$1.AnonymousClass2(r12.this$0, null), r12) != r0) goto L41;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String scheme = this.$uri.getScheme();
                if (scheme != null) {
                    switch (scheme.hashCode()) {
                        case 3076010:
                            if (!scheme.equals(UriUtil.DATA_SCHEME)) {
                                break;
                            } else {
                                String uri = this.$uri.toString();
                                Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
                                if (StringsKt.startsWith$default(uri, "data:image/", false, 2, (Object) null)) {
                                    String substring = uri.substring(StringsKt.indexOf$default((CharSequence) uri, ",", 0, false, 6, (Object) null) + 1);
                                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                                    byte[] decode = Base64.decode(substring, 0);
                                    bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                                    break;
                                }
                            }
                            break;
                        case 3143036:
                            if (!scheme.equals("file")) {
                                break;
                            } else {
                                bitmap = BitmapFactory.decodeFile(this.$uri.getPath());
                                break;
                            }
                        case 3213448:
                            if (!scheme.equals("http")) {
                                break;
                            }
                            URLConnection openConnection = new URL(this.$uri.toString()).openConnection();
                            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                            httpURLConnection.setDoInput(true);
                            httpURLConnection.connect();
                            InputStream inputStream = httpURLConnection.getInputStream();
                            Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
                            bitmap = BitmapFactory.decodeStream(inputStream);
                            break;
                        case 99617003:
                            if (scheme.equals("https")) {
                                URLConnection openConnection2 = new URL(this.$uri.toString()).openConnection();
                                Intrinsics.checkNotNull(openConnection2, "null cannot be cast to non-null type java.net.HttpURLConnection");
                                HttpURLConnection httpURLConnection2 = (HttpURLConnection) openConnection2;
                                httpURLConnection2.setDoInput(true);
                                httpURLConnection2.connect();
                                InputStream inputStream2 = httpURLConnection2.getInputStream();
                                Intrinsics.checkNotNullExpressionValue(inputStream2, "getInputStream(...)");
                                bitmap = BitmapFactory.decodeStream(inputStream2);
                                break;
                            }
                            break;
                    }
                    this.label = 1;
                }
                bitmap = null;
                this.label = 1;
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception unused) {
            this.label = 2;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ReloadScreenView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.updates.reloadscreen.ReloadScreenView$loadImageFromUrl$1$1", f = "ReloadScreenView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: expo.modules.updates.reloadscreen.ReloadScreenView$loadImageFromUrl$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ ImageView $imageView;
        int label;
        final /* synthetic */ ReloadScreenView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Bitmap bitmap, ReloadScreenView reloadScreenView, ImageView imageView, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$bitmap = bitmap;
            this.this$0 = reloadScreenView;
            this.$imageView = imageView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$bitmap, this.this$0, this.$imageView, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Bitmap bitmap = this.$bitmap;
            if (bitmap == null) {
                this.this$0.handleImageLoadFailure();
            } else {
                this.$imageView.setImageBitmap(bitmap);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ReloadScreenView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.updates.reloadscreen.ReloadScreenView$loadImageFromUrl$1$2", f = "ReloadScreenView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: expo.modules.updates.reloadscreen.ReloadScreenView$loadImageFromUrl$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ReloadScreenView this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ReloadScreenView reloadScreenView, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = reloadScreenView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.handleImageLoadFailure();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
