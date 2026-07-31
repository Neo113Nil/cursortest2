package io.intercom.android.sdk.ui.preview.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import androidx.compose.runtime.ProduceStateScope;
import com.facebook.cache.disk.DefaultDiskStorage;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: PreviewUri.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/ProduceStateScope;", "", "Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1", f = "PreviewUri.kt", i = {0, 0}, l = {251}, m = "invokeSuspend", n = {"$this$produceState", "bitmaps"}, s = {"L$0", "L$1"})
/* loaded from: classes8.dex */
final class PreviewUriKt$loadFilesAsBitmaps$1 extends SuspendLambda implements Function2<ProduceStateScope<List<? extends Bitmap>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ IntercomPreviewFile $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreviewUriKt$loadFilesAsBitmaps$1(IntercomPreviewFile intercomPreviewFile, Context context, Continuation<? super PreviewUriKt$loadFilesAsBitmaps$1> continuation) {
        super(2, continuation);
        this.$file = intercomPreviewFile;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PreviewUriKt$loadFilesAsBitmaps$1 previewUriKt$loadFilesAsBitmaps$1 = new PreviewUriKt$loadFilesAsBitmaps$1(this.$file, this.$context, continuation);
        previewUriKt$loadFilesAsBitmaps$1.L$0 = obj;
        return previewUriKt$loadFilesAsBitmaps$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ProduceStateScope<List<Bitmap>> produceStateScope, Continuation<? super Unit> continuation) {
        return ((PreviewUriKt$loadFilesAsBitmaps$1) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(ProduceStateScope<List<? extends Bitmap>> produceStateScope, Continuation<? super Unit> continuation) {
        return invoke2((ProduceStateScope<List<Bitmap>>) produceStateScope, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ProduceStateScope produceStateScope;
        List list;
        ParcelFileDescriptor openFileDescriptor;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                produceStateScope = (ProduceStateScope) this.L$0;
                ArrayList arrayList = new ArrayList();
                if (this.$file instanceof IntercomPreviewFile.NetworkFile) {
                    File createTempFile = File.createTempFile("download_", DefaultDiskStorage.FileType.TEMP, this.$context.getCacheDir());
                    this.L$0 = produceStateScope;
                    this.L$1 = arrayList;
                    this.label = 1;
                    Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new AnonymousClass1(this.$file, createTempFile, null), this);
                    if (withContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list = arrayList;
                    obj = withContext;
                } else {
                    list = arrayList;
                    openFileDescriptor = this.$context.getContentResolver().openFileDescriptor(this.$file.getUri(), "r");
                    if (openFileDescriptor != null) {
                        try {
                            PdfRenderer pdfRenderer = new PdfRenderer(openFileDescriptor);
                            int pageCount = pdfRenderer.getPageCount();
                            for (int i2 = 0; i2 < pageCount; i2++) {
                                PdfRenderer.Page openPage = pdfRenderer.openPage(i2);
                                Intrinsics.checkNotNullExpressionValue(openPage, "openPage(...)");
                                Bitmap createBitmap = Bitmap.createBitmap(openPage.getWidth(), openPage.getHeight(), Bitmap.Config.ARGB_8888);
                                Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                                new Canvas(createBitmap).drawColor(-1);
                                openPage.render(createBitmap, null, null, 1);
                                list.add(createBitmap);
                                openPage.close();
                            }
                        } catch (Throwable th) {
                            parcelFileDescriptor = openFileDescriptor;
                            th = th;
                            if (parcelFileDescriptor != null) {
                                parcelFileDescriptor.close();
                            }
                            throw th;
                        }
                    }
                    produceStateScope.setValue(list);
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$1;
                produceStateScope = (ProduceStateScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            openFileDescriptor = (ParcelFileDescriptor) obj;
            if (openFileDescriptor != null) {
            }
            produceStateScope.setValue(list);
            if (openFileDescriptor != null) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* compiled from: PreviewUri.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroid/os/ParcelFileDescriptor;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1$1", f = "PreviewUri.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.ui.preview.ui.PreviewUriKt$loadFilesAsBitmaps$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ParcelFileDescriptor>, Object> {
        final /* synthetic */ IntercomPreviewFile $file;
        final /* synthetic */ File $tempFile;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(IntercomPreviewFile intercomPreviewFile, File file, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$file = intercomPreviewFile;
            this.$tempFile = file;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$file, this.$tempFile, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ParcelFileDescriptor> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InputStream inputStream = ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(((IntercomPreviewFile.NetworkFile) this.$file).getUrl()).openConnection())).getInputStream();
            if (inputStream == null) {
                return null;
            }
            FileOutputStream fileOutputStream = inputStream;
            File file = this.$tempFile;
            try {
                InputStream inputStream2 = fileOutputStream;
                fileOutputStream = new FileOutputStream(file);
                try {
                    FileOutputStream fileOutputStream2 = fileOutputStream;
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream2.read(bArr);
                        if (read > 0) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(fileOutputStream, null);
                            ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                            CloseableKt.closeFinally(fileOutputStream, null);
                            return open;
                        }
                    }
                } finally {
                }
            } finally {
            }
        }
    }
}
