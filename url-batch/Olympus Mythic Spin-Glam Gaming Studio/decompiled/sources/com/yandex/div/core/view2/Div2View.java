package com.yandex.div.core.view2;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import androidx.transition.Scene;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.sdk.controller.f;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import com.yandex.div.DivDataTag;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivCreationTracker;
import com.yandex.div.core.DivCustomContainerChildFactory;
import com.yandex.div.core.DivDataChangeListener;
import com.yandex.div.core.DivKit;
import com.yandex.div.core.DivViewConfig;
import com.yandex.div.core.DivViewDataPreloader;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.ObserverList;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.dagger.Div2ViewComponent;
import com.yandex.div.core.downloader.DivDataChangedObserver;
import com.yandex.div.core.downloader.DivPatchApply;
import com.yandex.div.core.downloader.PersistentDivDataObserver;
import com.yandex.div.core.expression.ExpressionFallbacksHelperKt;
import com.yandex.div.core.expression.ExpressionResolverImpl;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.local.RuntimeStoreImpl;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.player.DivVideoActionHandler;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.DivViewState;
import com.yandex.div.core.state.StateConflictException;
import com.yandex.div.core.timer.DivTimerEventDispatcher;
import com.yandex.div.core.timer.TimerController;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.util.DivTreeWalkKt;
import com.yandex.div.core.util.SingleTimeOnAttachCallback;
import com.yandex.div.core.view2.animations.DivComparator;
import com.yandex.div.core.view2.animations.DivTransitionHandler;
import com.yandex.div.core.view2.animations.DivTransitionsKt;
import com.yandex.div.core.view2.animations.SceneRootWatcher;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.divs.DivLayoutProviderVariablesHolder;
import com.yandex.div.core.view2.divs.widgets.DivAnimator;
import com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor;
import com.yandex.div.core.view2.divs.widgets.ReleaseUtils;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.core.view2.logging.bind.BindingEventReporter;
import com.yandex.div.core.view2.logging.bind.BindingEventReporterProvider;
import com.yandex.div.core.view2.logging.bind.ForceRebindReporter;
import com.yandex.div.core.view2.logging.bind.SimpleRebindReporter;
import com.yandex.div.core.view2.logging.patch.PatchEventReporter;
import com.yandex.div.core.view2.logging.patch.PatchEventReporterProvider;
import com.yandex.div.core.view2.reuse.ComplexRebindReporter;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.view2.reuse.RebindTask;
import com.yandex.div.core.view2.reuse.ReusableTokenList;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.histogram.Div2ViewHistogramReporter;
import com.yandex.div.histogram.HistogramCallType;
import com.yandex.div.histogram.RenderConfiguration;
import com.yandex.div.histogram.reporter.HistogramReporter;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.internal.util.ViewGroupsKt;
import com.yandex.div.internal.widget.FrameContainerLayout;
import com.yandex.div.internal.widget.menu.OverflowMenuSubscriber;
import com.yandex.div.json.ParsingException;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div.util.DivDataUtilsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivBase;
import com.yandex.div2.DivData;
import com.yandex.div2.DivPatch;
import com.yandex.div2.DivTransitionSelector;
import com.yandex.div2.DivTransitionTrigger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Div2View.kt */
@Metadata(d1 = {"\u0000ì\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002:\u0002ð\u0002B%\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010Ð\u0001\u001a\u00030Ñ\u00012\u0007\u0010Ò\u0001\u001a\u00020[H\u0016J\u001e\u0010Ó\u0001\u001a\u00030Ñ\u00012\b\u0010Ô\u0001\u001a\u00030\u0085\u00012\b\u0010Õ\u0001\u001a\u00030Ä\u0001H\u0016JP\u0010Ö\u0001\u001a\u00030Ñ\u00012\t\u0010×\u0001\u001a\u0004\u0018\u00010S2\u0007\u0010Ø\u0001\u001a\u00020S2\n\u0010Ù\u0001\u001a\u0005\u0018\u00010Å\u00012\b\u0010Ú\u0001\u001a\u00030Í\u00012\b\u0010Û\u0001\u001a\u00030Ä\u00012\u0007\u0010Ü\u0001\u001a\u00020\u00142\u0007\u0010Ý\u0001\u001a\u00020\u0014H\u0012J\u001a\u0010Þ\u0001\u001a\u00030Ñ\u00012\b\u0010Ò\u0001\u001a\u00030\u0099\u0001H\u0010¢\u0006\u0003\bß\u0001J\u0013\u0010à\u0001\u001a\u00020\u00142\b\u0010á\u0001\u001a\u00030â\u0001H\u0016J\u001c\u0010ã\u0001\u001a\u00030Ñ\u00012\u0007\u0010ä\u0001\u001a\u0002042\u0007\u0010å\u0001\u001a\u000204H\u0016J'\u0010æ\u0001\u001a\u00020\u00142\u0007\u0010ç\u0001\u001a\u0002042\u0007\u0010å\u0001\u001a\u0002042\n\b\u0002\u0010è\u0001\u001a\u00030\u0081\u0001H\u0017J$\u0010é\u0001\u001a\u00030Ñ\u00012\b\u0010ê\u0001\u001a\u00030Ä\u00012\b\u0010ë\u0001\u001a\u00030Å\u0001H\u0010¢\u0006\u0003\bì\u0001J(\u0010í\u0001\u001a\u00030Ä\u00012\b\u0010Ú\u0001\u001a\u00030Í\u00012\u0007\u0010®\u0001\u001a\u00020\u000b2\t\b\u0002\u0010î\u0001\u001a\u00020\u0014H\u0012J(\u0010ï\u0001\u001a\u00030Ä\u00012\b\u0010Ú\u0001\u001a\u00030Í\u00012\u0007\u0010®\u0001\u001a\u00020\u000b2\t\b\u0002\u0010î\u0001\u001a\u00020\u0014H\u0012J!\u0010ð\u0001\u001a\u00030Ñ\u00012\u000f\u0010ñ\u0001\u001a\n\u0012\u0005\u0012\u00030Ñ\u00010¥\u0001H\u0010¢\u0006\u0003\bò\u0001J\n\u0010ó\u0001\u001a\u00030Ñ\u0001H\u0012J\n\u0010ô\u0001\u001a\u00030Ñ\u0001H\u0016J\n\u0010õ\u0001\u001a\u00030Ñ\u0001H\u0016J\u0013\u0010õ\u0001\u001a\u00030Ñ\u00012\u0007\u0010ö\u0001\u001a\u00020\u0014H\u0012J\n\u0010÷\u0001\u001a\u00030Ñ\u0001H\u0016J%\u0010ø\u0001\u001a\u00020\u00142\u0007\u0010Ø\u0001\u001a\u00020S2\u0007\u0010×\u0001\u001a\u00020S2\b\u0010ù\u0001\u001a\u00030ú\u0001H\u0012J\n\u0010û\u0001\u001a\u00030Ñ\u0001H\u0012J\u0014\u0010ü\u0001\u001a\u00030Ñ\u00012\b\u0010ý\u0001\u001a\u00030Í\u0001H\u0012J\n\u0010þ\u0001\u001a\u00030Ñ\u0001H\u0016J\n\u0010ÿ\u0001\u001a\u00030Ñ\u0001H\u0016J\u0014\u0010\u0080\u0002\u001a\u00030Ñ\u00012\b\u0010\u0081\u0002\u001a\u00030\u0082\u0002H\u0014J\u0014\u0010\u0083\u0002\u001a\u00030Ñ\u00012\b\u0010\u0081\u0002\u001a\u00030\u0082\u0002H\u0016J(\u0010\u0084\u0002\u001a\u00020\u00142\b\u0010\u0081\u0002\u001a\u00030\u0082\u00022\n\u0010\u0085\u0002\u001a\u0005\u0018\u00010Ä\u00012\u0007\u0010\u0086\u0002\u001a\u00020\u000bH\u0014J\u001b\u0010\u0087\u0002\u001a\u00020\u00142\u0007\u0010®\u0001\u001a\u00020\u000b2\u0007\u0010\u0088\u0002\u001a\u00020\u0014H\u0012J\t\u0010\u0089\u0002\u001a\u00020;H\u0016J\f\u0010\u008a\u0002\u001a\u0005\u0018\u00010\u008b\u0002H\u0016J\t\u0010\u008c\u0002\u001a\u00020\u000bH\u0016J\u0010\u0010\u008d\u0002\u001a\u00030\u008e\u0002H\u0010¢\u0006\u0003\b\u008f\u0002J\t\u0010\u0090\u0002\u001a\u00020GH\u0016J\n\u0010\u0091\u0002\u001a\u00030\u0081\u0001H\u0016J\t\u0010\u0092\u0002\u001a\u00020\u0000H\u0016J+\u0010\u0093\u0002\u001a\u00030Ñ\u00012\b\u0010\u0094\u0002\u001a\u00030\u0095\u00022\t\b\u0002\u0010\u0096\u0002\u001a\u0002042\n\b\u0002\u0010É\u0001\u001a\u00030\u0081\u0001H\u0017J*\u0010\u0097\u0002\u001a\u00020\u00142\b\u0010\u0094\u0002\u001a\u00030\u0095\u00022\t\b\u0002\u0010\u0096\u0002\u001a\u0002042\n\b\u0002\u0010É\u0001\u001a\u00030\u0081\u0001H\u0017J\u0014\u0010\u0098\u0002\u001a\u00030Ñ\u00012\b\u0010\u0099\u0002\u001a\u00030\u009a\u0002H\u0016J\u0013\u0010\u009b\u0002\u001a\u00020\u00142\b\u0010\u009c\u0002\u001a\u00030\u009d\u0002H\u0016J\u0013\u0010\u009e\u0002\u001a\u00030Ñ\u00012\u0007\u0010\u009f\u0002\u001a\u000204H\u0016J\u0012\u0010 \u0002\u001a\u00020\u00142\u0007\u0010¡\u0002\u001a\u00020DH\u0016J/\u0010¢\u0002\u001a\n\u0012\u0005\u0012\u00030¤\u00020£\u00022\b\u0010T\u001a\u0004\u0018\u00010S2\b\u0010ë\u0001\u001a\u00030Å\u00012\b\u0010É\u0001\u001a\u00030\u0081\u0001H\u0012J\n\u0010¥\u0002\u001a\u00030Ñ\u0001H\u0012J\n\u0010¦\u0002\u001a\u00030Ñ\u0001H\u0012J\n\u0010§\u0002\u001a\u00030Ñ\u0001H\u0014J\u0014\u0010¨\u0002\u001a\u00030Ñ\u00012\b\u0010©\u0002\u001a\u00030ª\u0002H\u0016J\n\u0010«\u0002\u001a\u00030Ñ\u0001H\u0014J7\u0010¬\u0002\u001a\u00030Ñ\u00012\u0007\u0010\u00ad\u0002\u001a\u00020\u00142\u0007\u0010®\u0002\u001a\u00020\b2\u0007\u0010¯\u0002\u001a\u00020\b2\u0007\u0010°\u0002\u001a\u00020\b2\u0007\u0010±\u0002\u001a\u00020\bH\u0014J\u001c\u0010²\u0002\u001a\u00030Ñ\u00012\u0007\u0010³\u0002\u001a\u00020\b2\u0007\u0010´\u0002\u001a\u00020\bH\u0014J\u0013\u0010µ\u0002\u001a\u00020\u00142\b\u0010\u009c\u0002\u001a\u00030\u009d\u0002H\u0017J,\u0010¶\u0002\u001a\u00020\u00142\u0007\u0010Ø\u0001\u001a\u00020S2\u000b\b\u0002\u0010×\u0001\u001a\u0004\u0018\u00010S2\u000b\b\u0002\u0010·\u0002\u001a\u0004\u0018\u00010GH\u0016J8\u0010¸\u0002\u001a\u0005\u0018\u00010¹\u00022\t\u0010×\u0001\u001a\u0004\u0018\u00010S2\u0007\u0010Ø\u0001\u001a\u00020S2\n\u0010Ù\u0001\u001a\u0005\u0018\u00010Å\u00012\n\u0010º\u0002\u001a\u0005\u0018\u00010Å\u0001H\u0012J&\u0010»\u0002\u001a\u00030Ñ\u00012\u0007\u0010Ø\u0001\u001a\u00020S2\u0007\u0010¼\u0002\u001a\u00020\u00142\b\u0010ù\u0001\u001a\u00030½\u0002H\u0012J\n\u0010¾\u0002\u001a\u00030Ñ\u0001H\u0016J\u0013\u0010¿\u0002\u001a\u00030Ñ\u00012\u0007\u0010Ò\u0001\u001a\u00020[H\u0016J\u001a\u0010À\u0002\u001a\u00030Ñ\u00012\b\u0010Ò\u0001\u001a\u00030\u0099\u0001H\u0010¢\u0006\u0003\bÁ\u0002J\n\u0010Â\u0002\u001a\u00030Ñ\u0001H\u0016J\u0012\u0010Ã\u0002\u001a\u0005\u0018\u00010Å\u0001H\u0010¢\u0006\u0003\bÄ\u0002J\n\u0010Å\u0002\u001a\u00030Ñ\u0001H\u0012J\u0013\u0010Æ\u0002\u001a\u00030Ñ\u00012\u0007\u0010Ç\u0002\u001a\u00020;H\u0016J\u001d\u0010È\u0002\u001a\u00020\u00142\t\u0010É\u0002\u001a\u0004\u0018\u00010S2\u0007\u0010Ê\u0002\u001a\u00020GH\u0016J(\u0010È\u0002\u001a\u00020\u00142\t\u0010É\u0002\u001a\u0004\u0018\u00010S2\t\u0010Ë\u0002\u001a\u0004\u0018\u00010S2\u0007\u0010Ê\u0002\u001a\u00020GH\u0016J6\u0010Ì\u0002\u001a\u00020\u00142\t\u0010É\u0002\u001a\u0004\u0018\u00010S2\u0007\u0010Ê\u0002\u001a\u00020G2\u000e\u0010Í\u0002\u001a\t\u0012\u0004\u0012\u00020D0Î\u00022\u0007\u0010\u0088\u0002\u001a\u00020\u0014H\u0016J\u001d\u0010Ï\u0002\u001a\u0005\u0018\u00010Ð\u00022\u0007\u0010Ñ\u0002\u001a\u0002042\u0006\u00103\u001a\u000204H\u0016J\u0013\u0010Ò\u0002\u001a\u00030Ñ\u00012\u0007\u0010\u009f\u0002\u001a\u000204H\u0016J\u001c\u0010Ò\u0002\u001a\u00030Ñ\u00012\u0007\u0010\u009f\u0002\u001a\u0002042\u0007\u0010Ó\u0002\u001a\u00020\u0014H\u0016J\n\u0010Ô\u0002\u001a\u00030Ñ\u0001H\u0016J\u0014\u0010Ì\u0001\u001a\u0005\u0018\u00010Í\u00012\u0006\u0010T\u001a\u00020SH\u0016J\n\u0010Õ\u0002\u001a\u00030Ñ\u0001H\u0016J\n\u0010Ö\u0002\u001a\u00030Ñ\u0001H\u0012J\u0014\u0010×\u0002\u001a\u00030Ñ\u00012\b\u0010Ø\u0002\u001a\u00030\u0094\u0001H\u0016J'\u0010Ù\u0002\u001a\u00020\u00142\t\u0010×\u0001\u001a\u0004\u0018\u00010S2\u0007\u0010Ø\u0001\u001a\u00020S2\b\u0010ù\u0001\u001a\u00030Ú\u0002H\u0012J\n\u0010Û\u0002\u001a\u00030Ñ\u0001H\u0016J,\u0010Ü\u0002\u001a\u00030Ñ\u00012\u000e\u0010Ý\u0002\u001a\t\u0012\u0004\u0012\u00020D0Î\u00022\u0007\u0010\u0088\u0002\u001a\u00020\u00142\u0007\u0010Þ\u0002\u001a\u00020\u0014H\u0016J\u001c\u0010ß\u0002\u001a\u00030Ñ\u00012\u0007\u0010à\u0002\u001a\u00020D2\u0007\u0010\u0088\u0002\u001a\u00020\u0014H\u0016J\u001c\u0010ß\u0002\u001a\u00030Ñ\u00012\u0007\u0010®\u0001\u001a\u00020\u000b2\u0007\u0010\u0088\u0002\u001a\u00020\u0014H\u0016J\u001c\u0010á\u0002\u001a\u0005\u0018\u00010Å\u00012\b\u0010ê\u0001\u001a\u00030Ä\u0001H\u0010¢\u0006\u0003\bâ\u0002J\n\u0010ã\u0002\u001a\u00030Ñ\u0001H\u0016J\u0014\u0010ä\u0002\u001a\u00030Ñ\u00012\b\u0010ý\u0001\u001a\u00030Í\u0001H\u0012J/\u0010å\u0002\u001a\u00020\u00142\b\u0010á\u0001\u001a\u00030â\u00012\u0007\u0010×\u0001\u001a\u00020S2\u0007\u0010æ\u0002\u001a\u00020S2\b\u0010ù\u0001\u001a\u00030ç\u0002H\u0012J\u0015\u0010è\u0002\u001a\u00030Ñ\u00012\t\u0010É\u0002\u001a\u0004\u0018\u00010SH\u0012J\n\u0010é\u0002\u001a\u00030Ñ\u0001H\u0016J\u001c\u0010ê\u0002\u001a\u0005\u0018\u00010Å\u00012\b\u0010ê\u0001\u001a\u00030Ä\u0001H\u0010¢\u0006\u0003\bë\u0002J%\u0010ì\u0002\u001a\u00020\u00142\u0007\u0010É\u0002\u001a\u00020S2\u0007\u0010Ê\u0002\u001a\u00020G2\b\u0010ù\u0001\u001a\u00030Ú\u0002H\u0012J\"\u0010í\u0002\u001a\u00030Ñ\u00012\u000b\b\u0002\u0010É\u0002\u001a\u0004\u0018\u00010S2\t\b\u0002\u0010Ê\u0002\u001a\u00020GH\u0012J\u001c\u0010î\u0002\u001a\u00030Ä\u00012\u0007\u0010®\u0001\u001a\u00020\u000b2\u0007\u0010\u0088\u0002\u001a\u00020\u0014H\u0012J\n\u0010ï\u0002\u001a\u00030Ñ\u0001H\u0012J\u0010\u0010ý\u0001\u001a\u0005\u0018\u00010Í\u0001*\u00020SH\u0012J\r\u0010®\u0001\u001a\u00020\u000b*\u00020SH\u0012R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0092\u0004¢\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0010@\u0010X\u0091\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0092\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0092\u0004¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u00060(R\u00020\u0000X\u0092\u0004¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u00020\u0014X\u0092\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\u00020\u00148PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R(\u00105\u001a\u0004\u0018\u0001042\b\u00103\u001a\u0004\u0018\u0001048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010:\u001a\n <*\u0004\u0018\u00010;0;X\u0092\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u00020\u0004X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0016\u0010?\u001a\u0004\u0018\u00010@8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020D8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR$\u0010H\u001a\u00020G2\u0006\u00103\u001a\u00020G@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020NX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u000e\u0010Q\u001a\u00020RX\u0092\u0004¢\u0006\u0002\n\u0000R(\u0010T\u001a\u0004\u0018\u00010S2\b\u00103\u001a\u0004\u0018\u00010S@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0014\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0ZX\u0092\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\\\u001a\u0004\u0018\u00010]X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020cX\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020g8RX\u0092\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u000e\u0010j\u001a\u00020\u0014X\u0092\u000e¢\u0006\u0002\n\u0000R$\u0010k\u001a\u00020\u00148\u0010@\u0010X\u0091\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bl\u0010\u0018\u001a\u0004\bm\u00102\"\u0004\bn\u0010oR\u000e\u0010p\u001a\u00020qX\u0092\u0004¢\u0006\u0002\n\u0000R\u001b\u0010r\u001a\u00020s8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bt\u0010uR\u001a\u0010x\u001a\u00020\u0014X\u0090\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u00102\"\u0004\bz\u0010oR\u0014\u0010{\u001a\u00020|X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b}\u0010~R1\u0010\u007f\u001a\u001d\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\b0\u0080\u00010\u0080\u0001X\u0090\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0016\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030\u0085\u00010ZX\u0092\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0086\u0001\u001a\u0002048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u00107R\u0018\u0010\u0088\u0001\u001a\u00030\u0089\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0010\u0010\u008c\u0001\u001a\u00030\u008d\u0001X\u0092\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u008e\u0001\u001a\u00030\u0081\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0012\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0092\u0001X\u0092\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0093\u0001\u001a\t\u0012\u0005\u0012\u00030\u0094\u00010ZX\u0092\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0095\u0001\u001a\u00030\u0096\u0001X\u0092\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0097\u0001\u001a\n\u0012\u0005\u0012\u00030\u0099\u00010\u0098\u0001X\u0092\u0004¢\u0006\u0002\n\u0000R(\u0010\u009b\u0001\u001a\u00020G2\u0007\u0010\u009a\u0001\u001a\u00020G@PX\u0096\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u0010J\"\u0005\b\u009d\u0001\u0010LR\u0012\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u0001X\u0092\u000e¢\u0006\u0002\n\u0000R\u0018\u0010 \u0001\u001a\u00030¡\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001R \u0010¤\u0001\u001a\u0013\u0012\u000e\u0012\f <*\u0005\u0018\u00010¦\u00010¦\u00010¥\u0001X\u0092\u0004¢\u0006\u0002\n\u0000R\u0011\u0010§\u0001\u001a\u0004\u0018\u00010\u0016X\u0092\u000e¢\u0006\u0002\n\u0000R\u0011\u0010¨\u0001\u001a\u0004\u0018\u00010\u0016X\u0092\u000e¢\u0006\u0002\n\u0000R \u0010©\u0001\u001a\u00030\u0092\u0001X\u0090\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R*\u0010®\u0001\u001a\u00020\u000b8\u0010@\u0010X\u0091\u000e¢\u0006\u0019\n\u0000\u0012\u0005\b¯\u0001\u0010\u0018\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R\u000f\u0010´\u0001\u001a\u00020\u000bX\u0092\u000e¢\u0006\u0002\n\u0000R\u0018\u0010µ\u0001\u001a\u00030¶\u00018RX\u0092\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001R%\u0010¹\u0001\u001a\u0010\u0012\u0004\u0012\u00020S\u0012\u0005\u0012\u00030º\u00010\u0080\u0001X\u0090\u0004¢\u0006\n\n\u0000\u001a\u0006\b»\u0001\u0010\u0083\u0001R\u0018\u0010¼\u0001\u001a\u00030½\u0001X\u0090\u0004¢\u0006\n\n\u0000\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0018\u0010À\u0001\u001a\u0002048\u0012X\u0093\u0004¢\u0006\t\n\u0000\u0012\u0005\bÁ\u0001\u0010\u0018R\u001e\u0010Â\u0001\u001a\u0011\u0012\u0005\u0012\u00030Ä\u0001\u0012\u0005\u0012\u00030Å\u00010Ã\u0001X\u0092\u0004¢\u0006\u0002\n\u0000R'\u0010Æ\u0001\u001a\u00020\u00142\u0006\u00103\u001a\u00020\u00148V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\bÇ\u0001\u00102\"\u0005\bÈ\u0001\u0010oR\u001f\u0010É\u0001\u001a\u00030\u0081\u0001*\u0005\u0018\u00010\u0092\u00018RX\u0092\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R\u001e\u0010Ì\u0001\u001a\u0005\u0018\u00010Í\u0001*\u00020S8RX\u0092\u0004¢\u0006\b\u001a\u0006\bÎ\u0001\u0010Ï\u0001¨\u0006ñ\u0002"}, d2 = {"Lcom/yandex/div/core/view2/Div2View;", "Lcom/yandex/div/internal/widget/FrameContainerLayout;", "Lcom/yandex/div/core/DivViewFacade;", "context", "Lcom/yandex/div/core/Div2Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Lcom/yandex/div/core/Div2Context;Landroid/util/AttributeSet;I)V", "constructorCallTime", "", "(Lcom/yandex/div/core/Div2Context;Landroid/util/AttributeSet;IJ)V", "actionHandler", "Lcom/yandex/div/core/DivActionHandler;", "getActionHandler", "()Lcom/yandex/div/core/DivActionHandler;", "setActionHandler", "(Lcom/yandex/div/core/DivActionHandler;)V", "bindOnAttachEnabled", "", "bindOnAttachRunnable", "Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;", "getBindOnAttachRunnable$div_release$annotations", "()V", "getBindOnAttachRunnable$div_release", "()Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;", "setBindOnAttachRunnable$div_release", "(Lcom/yandex/div/core/util/SingleTimeOnAttachCallback;)V", "bindingContext", "Lcom/yandex/div/core/view2/BindingContext;", "getBindingContext$div_release", "()Lcom/yandex/div/core/view2/BindingContext;", "setBindingContext$div_release", "(Lcom/yandex/div/core/view2/BindingContext;)V", "bindingProvider", "Lcom/yandex/div/core/view2/ViewBindingProvider;", "bindingReporterProvider", "Lcom/yandex/div/core/view2/logging/bind/BindingEventReporterProvider;", "bulkActionsHandler", "Lcom/yandex/div/core/view2/Div2View$BulkActionHandler;", "clearVariablesListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getClearVariablesListener$div_release", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "setClearVariablesListener$div_release", "(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V", "complexRebindEnabled", "complexRebindInProgress", "getComplexRebindInProgress$div_release", "()Z", "value", "", "componentName", "getComponentName", "()Ljava/lang/String;", "setComponentName", "(Ljava/lang/String;)V", "config", "Lcom/yandex/div/core/DivViewConfig;", "kotlin.jvm.PlatformType", "getContext$div_release", "()Lcom/yandex/div/core/Div2Context;", "currentRebindReusableList", "Lcom/yandex/div/core/view2/reuse/ReusableTokenList;", "getCurrentRebindReusableList$div_release", "()Lcom/yandex/div/core/view2/reuse/ReusableTokenList;", "currentRootPath", "Lcom/yandex/div/core/state/DivStatePath;", "getCurrentRootPath$div_release", "()Lcom/yandex/div/core/state/DivStatePath;", "Lcom/yandex/div/DivDataTag;", "dataTag", "getDataTag", "()Lcom/yandex/div/DivDataTag;", "setDataTag$div_release", "(Lcom/yandex/div/DivDataTag;)V", "div2Component", "Lcom/yandex/div/core/dagger/Div2Component;", "getDiv2Component$div_release", "()Lcom/yandex/div/core/dagger/Div2Component;", "divBuilder", "Lcom/yandex/div/core/view2/Div2Builder;", "Lcom/yandex/div2/DivData;", "divData", "getDivData", "()Lcom/yandex/div2/DivData;", "setDivData$div_release", "(Lcom/yandex/div2/DivData;)V", "divDataChangedObservers", "", "Lcom/yandex/div/core/downloader/DivDataChangedObserver;", "divTimerEventDispatcher", "Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "getDivTimerEventDispatcher$div_release", "()Lcom/yandex/div/core/timer/DivTimerEventDispatcher;", "setDivTimerEventDispatcher$div_release", "(Lcom/yandex/div/core/timer/DivTimerEventDispatcher;)V", "divTransitionHandler", "Lcom/yandex/div/core/view2/animations/DivTransitionHandler;", "getDivTransitionHandler$div_release", "()Lcom/yandex/div/core/view2/animations/DivTransitionHandler;", "divVideoActionHandler", "Lcom/yandex/div/core/player/DivVideoActionHandler;", "getDivVideoActionHandler", "()Lcom/yandex/div/core/player/DivVideoActionHandler;", "drawWasSkipped", "forceCanvasClipping", "getForceCanvasClipping$annotations", "getForceCanvasClipping", "setForceCanvasClipping", "(Z)V", "gestureDetector", "Landroid/view/GestureDetector;", "histogramReporter", "Lcom/yandex/div/histogram/Div2ViewHistogramReporter;", "getHistogramReporter", "()Lcom/yandex/div/histogram/Div2ViewHistogramReporter;", "histogramReporter$delegate", "Lkotlin/Lazy;", "inMiddleOfBind", "getInMiddleOfBind$div_release", "setInMiddleOfBind$div_release", "inputFocusTracker", "Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "getInputFocusTracker$div_release", "()Lcom/yandex/div/core/view2/reuse/InputFocusTracker;", "layoutSizes", "", "Lcom/yandex/div/json/expressions/ExpressionResolver;", "getLayoutSizes$div_release", "()Ljava/util/Map;", "loadReferences", "Lcom/yandex/div/core/images/LoadReference;", "logId", "getLogId", "mediaReleaseViewVisitor", "Lcom/yandex/div/core/view2/divs/widgets/MediaReleaseViewVisitor;", "getMediaReleaseViewVisitor$div_release", "()Lcom/yandex/div/core/view2/divs/widgets/MediaReleaseViewVisitor;", "monitor", "", "oldExpressionResolver", "getOldExpressionResolver$div_release", "()Lcom/yandex/div/json/expressions/ExpressionResolver;", "oldRuntimeStore", "Lcom/yandex/div/core/expression/local/RuntimeStore;", "overflowMenuListeners", "Lcom/yandex/div/internal/widget/menu/OverflowMenuSubscriber$Listener;", "patchReporterProvider", "Lcom/yandex/div/core/view2/logging/patch/PatchEventReporterProvider;", "persistentDivDataObservers", "Lcom/yandex/div/core/ObserverList;", "Lcom/yandex/div/core/downloader/PersistentDivDataObserver;", "<set-?>", "prevDataTag", "getPrevDataTag", "setPrevDataTag$div_release", "rebindTask", "Lcom/yandex/div/core/view2/reuse/RebindTask;", "releaseViewVisitor", "Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;", "getReleaseViewVisitor$div_release", "()Lcom/yandex/div/core/view2/divs/widgets/ReleaseViewVisitor;", "renderConfig", "Lkotlin/Function0;", "Lcom/yandex/div/histogram/RenderConfiguration;", "reportBindingFinishedRunnable", "reportBindingResumedRunnable", "runtimeStore", "getRuntimeStore$div_release", "()Lcom/yandex/div/core/expression/local/RuntimeStore;", "setRuntimeStore$div_release", "(Lcom/yandex/div/core/expression/local/RuntimeStore;)V", "stateId", "getStateId$div_release$annotations", "getStateId$div_release", "()J", "setStateId$div_release", "(J)V", "timeCreated", "tooltipController", "Lcom/yandex/div/core/tooltip/DivTooltipController;", "getTooltipController", "()Lcom/yandex/div/core/tooltip/DivTooltipController;", "variablesHolders", "Lcom/yandex/div/core/view2/divs/DivLayoutProviderVariablesHolder;", "getVariablesHolders$div_release", "viewComponent", "Lcom/yandex/div/core/dagger/Div2ViewComponent;", "getViewComponent$div_release", "()Lcom/yandex/div/core/dagger/Div2ViewComponent;", "viewCreateCallType", "getViewCreateCallType$annotations", "viewToDivBindings", "Ljava/util/WeakHashMap;", "Landroid/view/View;", "Lcom/yandex/div2/Div;", "visualErrorsEnabled", "getVisualErrorsEnabled", "setVisualErrorsEnabled", "resolver", "getResolver", "(Lcom/yandex/div/core/expression/local/RuntimeStore;)Lcom/yandex/div/json/expressions/ExpressionResolver;", "stateToBind", "Lcom/yandex/div2/DivData$State;", "getStateToBind", "(Lcom/yandex/div2/DivData;)Lcom/yandex/div2/DivData$State;", "addDivDataChangeObserver", "", "observer", "addLoadReference", "loadReference", "targetView", "addNewStateViewWithTransition", "oldData", "newData", "oldDiv", "newState", "newStateView", "allowsTransition", "bindBeforeViewAdded", "addPersistentDivDataObserver", "addPersistentDivDataObserver$div_release", "applyPatch", DivActionHandler.DivActionReason.PATCH, "Lcom/yandex/div2/DivPatch;", "applyTimerCommand", "id", f.b.g, "applyVideoCommand", "divId", "expressionResolver", "bindViewToDiv", "view", "div", "bindViewToDiv$div_release", "buildViewAndUpdateState", "isUpdateTemporary", "buildViewAsyncAndUpdateState", "bulkActions", "function", "bulkActions$div_release", "cancelImageLoads", "cancelTooltips", "cleanup", "removeChildren", "clearSubscriptions", "complexRebind", "reporter", "Lcom/yandex/div/core/view2/reuse/ComplexRebindReporter;", "discardChildrenVisibility", "discardStateVisibility", "state", "discardVisibilityTracking", "dismissPendingOverflowMenus", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "draw", "drawChild", "child", "drawingTime", "forceSwitchToState", "temporary", "getConfig", "getCurrentState", "Lcom/yandex/div/core/state/DivViewState;", "getCurrentStateId", "getCustomContainerChildFactory", "Lcom/yandex/div/core/DivCustomContainerChildFactory;", "getCustomContainerChildFactory$div_release", "getDivTag", "getExpressionResolver", "getView", "handleAction", "action", "Lcom/yandex/div2/DivAction;", "reason", "handleActionWithResult", "handleUri", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "hasScrollableViewUnder", "event", "Landroid/view/MotionEvent;", "hideTooltip", "tooltipId", "isInState", "statePath", "itemSequenceForTransition", "Lkotlin/sequences/Sequence;", "Lcom/yandex/div/internal/core/DivItemBuilderResult;", "notifyBindEnded", "notifyBindStarted", "onAttachedToWindow", "onConfigurationChangedOutside", "newConfig", "Landroid/content/res/Configuration;", "onDetachedFromWindow", "onLayout", "changed", "left", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onTouchEvent", "prepareForRecycleOrCleanup", "newDataTag", "prepareTransition", "Landroidx/transition/Transition;", "newDiv", "rebind", "isAutoanimations", "Lcom/yandex/div/core/view2/logging/bind/SimpleRebindReporter;", "releaseMedia", "removeDivDataChangeObserver", "removePersistentDivDataObserver", "removePersistentDivDataObserver$div_release", "resetToInitialState", "rootDiv", "rootDiv$div_release", "sendCreationHistograms", "setConfig", "viewConfig", "setData", "data", "tag", "oldDivData", "setDataWithStates", "paths", "", "setVariable", "Lcom/yandex/div/data/VariableMutationException;", "name", "showTooltip", "multiple", "startDivAnimation", "stopDivAnimation", "stopLoadAndSubscriptions", "subscribe", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "switchToDivData", "Lcom/yandex/div/core/view2/logging/bind/ForceRebindReporter;", "switchToInitialState", "switchToMultipleStates", "pathList", "withAnimations", "switchToState", "path", "takeBindingDiv", "takeBindingDiv$div_release", "trackChildrenVisibility", "trackStateVisibility", "tryApplyPatch", "newDivData", "Lcom/yandex/div/core/view2/logging/patch/PatchEventReporter;", "tryAttachVariableTriggers", "tryLogVisibility", "unbindViewFromDiv", "unbindViewFromDiv$div_release", "updateNow", "updateRuntimeStore", "updateState", "updateTimers", "BulkActionHandler", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public class Div2View extends FrameContainerLayout implements DivViewFacade {

    @Nullable
    private DivActionHandler actionHandler;
    private final boolean bindOnAttachEnabled;

    @Nullable
    private SingleTimeOnAttachCallback bindOnAttachRunnable;

    @NotNull
    private BindingContext bindingContext;

    @NotNull
    private final ViewBindingProvider bindingProvider;

    @NotNull
    private final BindingEventReporterProvider bindingReporterProvider;

    @NotNull
    private final BulkActionHandler bulkActionsHandler;

    @Nullable
    private ViewTreeObserver.OnPreDrawListener clearVariablesListener;
    private final boolean complexRebindEnabled;
    private DivViewConfig config;
    private final long constructorCallTime;

    @NotNull
    private final Div2Context context;

    @NotNull
    private DivDataTag dataTag;

    @NotNull
    private final Div2Component div2Component;

    @NotNull
    private final Div2Builder divBuilder;

    @Nullable
    private DivData divData;

    @NotNull
    private final List<DivDataChangedObserver> divDataChangedObservers;

    @Nullable
    private DivTimerEventDispatcher divTimerEventDispatcher;

    @NotNull
    private final DivTransitionHandler divTransitionHandler;
    private boolean drawWasSkipped;
    private boolean forceCanvasClipping;

    @NotNull
    private final GestureDetector gestureDetector;

    /* renamed from: histogramReporter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy histogramReporter;
    private boolean inMiddleOfBind;

    @NotNull
    private final InputFocusTracker inputFocusTracker;

    @NotNull
    private final Map<ExpressionResolver, Map<String, Integer>> layoutSizes;

    @NotNull
    private final List<LoadReference> loadReferences;

    @NotNull
    private final Object monitor;

    @Nullable
    private RuntimeStore oldRuntimeStore;

    @NotNull
    private final List<OverflowMenuSubscriber.Listener> overflowMenuListeners;

    @NotNull
    private final PatchEventReporterProvider patchReporterProvider;

    @NotNull
    private final ObserverList<PersistentDivDataObserver> persistentDivDataObservers;

    @NotNull
    private DivDataTag prevDataTag;

    @Nullable
    private RebindTask rebindTask;

    @NotNull
    private final Function0 renderConfig;

    @Nullable
    private SingleTimeOnAttachCallback reportBindingFinishedRunnable;

    @Nullable
    private SingleTimeOnAttachCallback reportBindingResumedRunnable;

    @NotNull
    private RuntimeStore runtimeStore;
    private long stateId;
    private long timeCreated;

    @NotNull
    private final Map<DivData, DivLayoutProviderVariablesHolder> variablesHolders;

    @NotNull
    private final Div2ViewComponent viewComponent;

    @NotNull
    private final String viewCreateCallType;

    @NotNull
    private final WeakHashMap<View, Div> viewToDivBindings;

    public Div2View(@NotNull Div2Context div2Context) {
        this(div2Context, null, 0, 6, null);
    }

    public Div2View(@NotNull Div2Context div2Context, @Nullable AttributeSet attributeSet) {
        this(div2Context, attributeSet, 0, 4, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getBindOnAttachRunnable$div_release$annotations() {
    }

    public static /* synthetic */ void getForceCanvasClipping$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getStateId$div_release$annotations() {
    }

    @HistogramCallType
    private static /* synthetic */ void getViewCreateCallType$annotations() {
    }

    public final boolean applyVideoCommand(@NotNull String str, @NotNull String str2) {
        return applyVideoCommand$default(this, str, str2, null, 4, null);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(h.y, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.yandex.div.core.DivViewFacade
    @NotNull
    public Div2View getView() {
        return this;
    }

    public final void handleAction(@NotNull DivAction divAction) {
        handleAction$default(this, divAction, null, null, 6, null);
    }

    public final void handleAction(@NotNull DivAction divAction, @NotNull String str) {
        handleAction$default(this, divAction, str, null, 4, null);
    }

    public final boolean handleActionWithResult(@NotNull DivAction divAction) {
        return handleActionWithResult$default(this, divAction, null, null, 6, null);
    }

    public final boolean handleActionWithResult(@NotNull DivAction divAction, @NotNull String str) {
        return handleActionWithResult$default(this, divAction, str, null, 4, null);
    }

    /* synthetic */ Div2View(Div2Context div2Context, AttributeSet attributeSet, int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(div2Context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, j);
    }

    @NotNull
    /* renamed from: getContext$div_release, reason: from getter */
    public Div2Context getContext() {
        return this.context;
    }

    private Div2View(Div2Context div2Context, AttributeSet attributeSet, int i, long j) {
        super(div2Context, attributeSet, i);
        this.context = div2Context;
        this.constructorCallTime = j;
        this.div2Component = getContext().getDiv2Component();
        this.viewComponent = getDiv2Component().viewComponent().divView(this).build();
        this.bindOnAttachEnabled = getDiv2Component().isBindOnAttachEnabled();
        this.complexRebindEnabled = getDiv2Component().isComplexRebindEnabled();
        this.bindingProvider = getViewComponent().getBindingProvider();
        this.bindingReporterProvider = new BindingEventReporterProvider(this);
        this.patchReporterProvider = new PatchEventReporterProvider(this);
        this.divBuilder = getContext().getDiv2Component().getDiv2Builder();
        this.loadReferences = new ArrayList();
        this.overflowMenuListeners = new ArrayList();
        this.divDataChangedObservers = new ArrayList();
        this.persistentDivDataObservers = new ObserverList<>();
        this.viewToDivBindings = new WeakHashMap<>();
        this.bulkActionsHandler = new BulkActionHandler();
        this.runtimeStore = RuntimeStore.INSTANCE.getEMPTY();
        this.bindingContext = new BindingContext(this, ExpressionResolver.EMPTY);
        this.monitor = new Object();
        this.stateId = DivDataUtilsKt.getINVALID_STATE_ID(DivData.Companion);
        this.config = DivViewConfig.DEFAULT;
        this.renderConfig = new Function0() { // from class: com.yandex.div.core.view2.Div2View$renderConfig$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public final RenderConfiguration mo4828invoke() {
                return (RenderConfiguration) DivKit.INSTANCE.getInstance(Div2View.this.getContext()).getComponent().getHistogramRecordConfiguration().getRenderConfiguration().get();
            }
        };
        this.histogramReporter = LazyKt.lazy(LazyThreadSafetyMode.NONE, new Function0() { // from class: com.yandex.div.core.view2.Div2View$histogramReporter$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: invoke */
            public final Div2ViewHistogramReporter mo4828invoke() {
                Function0 function0;
                final Div2View div2View = Div2View.this;
                Function0 function02 = new Function0() { // from class: com.yandex.div.core.view2.Div2View$histogramReporter$2.1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    /* renamed from: invoke */
                    public final HistogramReporter mo4828invoke() {
                        return Div2View.this.getDiv2Component().getHistogramReporter();
                    }
                };
                function0 = Div2View.this.renderConfig;
                return new Div2ViewHistogramReporter(function02, function0);
            }
        });
        this.gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.yandex.div.core.view2.Div2View$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(@NotNull MotionEvent e) {
                Div2View div2View = Div2View.this;
                BaseDivViewExtensionsKt.clearFocusOnClick(div2View, div2View.getInputFocusTracker());
                return true;
            }
        }, new Handler(Looper.getMainLooper()));
        this.inputFocusTracker = getViewComponent().getInputFocusTracker();
        this.layoutSizes = new LinkedHashMap();
        this.variablesHolders = new LinkedHashMap();
        DivDataTag divDataTag = DivDataTag.INVALID;
        this.dataTag = divDataTag;
        this.prevDataTag = divDataTag;
        this.timeCreated = -1L;
        this.viewCreateCallType = getDiv2Component().getDivCreationTracker().getViewCreateCallType();
        this.drawWasSkipped = true;
        this.divTransitionHandler = new DivTransitionHandler(this);
        this.timeCreated = DivCreationTracker.INSTANCE.getCurrentUptimeMillis();
        getDiv2Component().getReleaseManager().observeDivLifecycle(this);
    }

    @NotNull
    /* renamed from: getDiv2Component$div_release, reason: from getter */
    public Div2Component getDiv2Component() {
        return this.div2Component;
    }

    @NotNull
    /* renamed from: getViewComponent$div_release, reason: from getter */
    public Div2ViewComponent getViewComponent() {
        return this.viewComponent;
    }

    private DivVideoActionHandler getDivVideoActionHandler() {
        return getDiv2Component().getDivVideoActionHandler();
    }

    private DivTooltipController getTooltipController() {
        return getDiv2Component().getTooltipController();
    }

    @NotNull
    public ReleaseViewVisitor getReleaseViewVisitor$div_release() {
        return getViewComponent().getReleaseViewVisitor();
    }

    @NotNull
    public MediaReleaseViewVisitor getMediaReleaseViewVisitor$div_release() {
        return getViewComponent().getMediaReleaseViewVisitor();
    }

    @NotNull
    public ExpressionResolver getOldExpressionResolver$div_release() {
        return getResolver(this.oldRuntimeStore);
    }

    @NotNull
    /* renamed from: getRuntimeStore$div_release, reason: from getter */
    public RuntimeStore getRuntimeStore() {
        return this.runtimeStore;
    }

    public void setRuntimeStore$div_release(@NotNull RuntimeStore runtimeStore) {
        this.runtimeStore = runtimeStore;
    }

    /* renamed from: getInMiddleOfBind$div_release, reason: from getter */
    public boolean getInMiddleOfBind() {
        return this.inMiddleOfBind;
    }

    public void setInMiddleOfBind$div_release(boolean z) {
        this.inMiddleOfBind = z;
    }

    @NotNull
    /* renamed from: getBindingContext$div_release, reason: from getter */
    public BindingContext getBindingContext() {
        return this.bindingContext;
    }

    public void setBindingContext$div_release(@NotNull BindingContext bindingContext) {
        this.bindingContext = bindingContext;
    }

    @Nullable
    /* renamed from: getDivTimerEventDispatcher$div_release, reason: from getter */
    public DivTimerEventDispatcher getDivTimerEventDispatcher() {
        return this.divTimerEventDispatcher;
    }

    public void setDivTimerEventDispatcher$div_release(@Nullable DivTimerEventDispatcher divTimerEventDispatcher) {
        this.divTimerEventDispatcher = divTimerEventDispatcher;
    }

    public boolean getForceCanvasClipping() {
        return this.forceCanvasClipping;
    }

    public void setForceCanvasClipping(boolean z) {
        this.forceCanvasClipping = z;
    }

    @Nullable
    /* renamed from: getBindOnAttachRunnable$div_release, reason: from getter */
    public SingleTimeOnAttachCallback getBindOnAttachRunnable() {
        return this.bindOnAttachRunnable;
    }

    public void setBindOnAttachRunnable$div_release(@Nullable SingleTimeOnAttachCallback singleTimeOnAttachCallback) {
        this.bindOnAttachRunnable = singleTimeOnAttachCallback;
    }

    /* renamed from: getStateId$div_release, reason: from getter */
    public long getStateId() {
        return this.stateId;
    }

    public void setStateId$div_release(long j) {
        this.stateId = j;
    }

    @Nullable
    public ReusableTokenList getCurrentRebindReusableList$div_release() {
        RebindTask rebindTask;
        if (getComplexRebindInProgress$div_release() && (rebindTask = this.rebindTask) != null) {
            return rebindTask.getReusableList();
        }
        return null;
    }

    public boolean getComplexRebindInProgress$div_release() {
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask != null) {
            return rebindTask.getRebindInProgress();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Div2ViewHistogramReporter getHistogramReporter() {
        return (Div2ViewHistogramReporter) this.histogramReporter.getValue();
    }

    @NotNull
    /* renamed from: getInputFocusTracker$div_release, reason: from getter */
    public InputFocusTracker getInputFocusTracker() {
        return this.inputFocusTracker;
    }

    @NotNull
    public Map<ExpressionResolver, Map<String, Integer>> getLayoutSizes$div_release() {
        return this.layoutSizes;
    }

    @NotNull
    public Map<DivData, DivLayoutProviderVariablesHolder> getVariablesHolders$div_release() {
        return this.variablesHolders;
    }

    @Nullable
    /* renamed from: getClearVariablesListener$div_release, reason: from getter */
    public ViewTreeObserver.OnPreDrawListener getClearVariablesListener() {
        return this.clearVariablesListener;
    }

    public void setClearVariablesListener$div_release(@Nullable ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.clearVariablesListener = onPreDrawListener;
    }

    @NotNull
    public DivDataTag getDataTag() {
        return this.dataTag;
    }

    public void setDataTag$div_release(@NotNull DivDataTag divDataTag) {
        setPrevDataTag$div_release(this.dataTag);
        this.dataTag = divDataTag;
        this.bindingProvider.update(divDataTag, getDivData());
    }

    @NotNull
    public DivDataTag getPrevDataTag() {
        return this.prevDataTag;
    }

    public void setPrevDataTag$div_release(@NotNull DivDataTag divDataTag) {
        this.prevDataTag = divDataTag;
    }

    @Nullable
    public DivData getDivData() {
        return this.divData;
    }

    public void setDivData$div_release(@Nullable DivData divData) {
        this.divData = divData;
        updateRuntimeStore$default(this, null, null, 3, null);
        updateTimers();
        this.bindingProvider.update(getDataTag(), this.divData);
    }

    static /* synthetic */ void updateRuntimeStore$default(Div2View div2View, DivData divData, DivDataTag divDataTag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRuntimeStore");
        }
        if ((i & 1) != 0) {
            divData = div2View.getDivData();
        }
        if ((i & 2) != 0) {
            divDataTag = div2View.getDataTag();
        }
        div2View.updateRuntimeStore(divData, divDataTag);
    }

    private void updateRuntimeStore(DivData data, DivDataTag tag) {
        RuntimeStore runtimeStore;
        if (data == null) {
            return;
        }
        this.oldRuntimeStore = getRuntimeStore();
        setRuntimeStore$div_release(getDiv2Component().getRuntimeStoreProvider().getOrCreate$div_release(tag, data, this));
        getRuntimeStore().updateSubscriptions();
        if (!Intrinsics.areEqual(this.oldRuntimeStore, getRuntimeStore()) && (runtimeStore = this.oldRuntimeStore) != null) {
            runtimeStore.clearBindings(this);
        }
        setBindingContext$div_release(new BindingContext(this, getExpressionResolver()));
    }

    private void tryAttachVariableTriggers(DivData data) {
        DivData.State state;
        if ((this.bindOnAttachEnabled && !getView().isAttachedToWindow()) || data == null || (state = state(data)) == null) {
            return;
        }
        getViewComponent().getRuntimeVisitor().createAndAttachRuntimes(state.div, DivStatePath.INSTANCE.fromState$div_release(state), this);
    }

    private void updateTimers() {
        DivTimerEventDispatcher divTimerEventDispatcher;
        DivData divData = getDivData();
        if (divData == null) {
            return;
        }
        DivTimerEventDispatcher orCreate$div_release = getDiv2Component().getDivTimersControllerProvider().getOrCreate$div_release(getDataTag(), divData, getExpressionResolver());
        if (!Intrinsics.areEqual(getDivTimerEventDispatcher(), orCreate$div_release) && (divTimerEventDispatcher = getDivTimerEventDispatcher()) != null) {
            divTimerEventDispatcher.onDetach(this);
        }
        setDivTimerEventDispatcher$div_release(orCreate$div_release);
        if (orCreate$div_release != null) {
            orCreate$div_release.onAttach(this);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(@NotNull Canvas canvas, @Nullable View child, long drawingTime) {
        if (child != null && child.getVisibility() == 0) {
            BaseDivViewExtensionsKt.drawShadow(child, canvas);
        }
        return super.drawChild(canvas, child, drawingTime);
    }

    @NotNull
    public String getLogId() {
        String str;
        DivData divData = getDivData();
        return (divData == null || (str = divData.logId) == null) ? "" : str;
    }

    @Nullable
    public DivActionHandler getActionHandler() {
        return this.actionHandler;
    }

    public void setActionHandler(@Nullable DivActionHandler divActionHandler) {
        this.actionHandler = divActionHandler;
    }

    @Nullable
    public String getComponentName() {
        return getHistogramReporter().getComponent();
    }

    public void setComponentName(@Nullable String str) {
        getHistogramReporter().setComponent(str);
    }

    @NotNull
    /* renamed from: getDivTransitionHandler$div_release, reason: from getter */
    public DivTransitionHandler getDivTransitionHandler() {
        return this.divTransitionHandler;
    }

    public /* synthetic */ Div2View(Div2Context div2Context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(div2Context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public Div2View(@NotNull Div2Context div2Context, @Nullable AttributeSet attributeSet, int i) {
        this(div2Context, attributeSet, i, SystemClock.uptimeMillis());
    }

    public boolean setData(@Nullable DivData data, @NotNull DivDataTag tag) {
        return setData(data, getDivData(), tag);
    }

    public boolean setData(@Nullable DivData data, @Nullable DivData oldDivData, @NotNull DivDataTag tag) {
        synchronized (this.monitor) {
            BindingEventReporter bindingEventReporter = this.bindingReporterProvider.get(oldDivData, data);
            boolean z = false;
            if (data == null) {
                bindingEventReporter.onBindingFatalNoData();
                return false;
            }
            if (getDivData() == data) {
                bindingEventReporter.onBindingFatalSameData();
                return false;
            }
            notifyBindStarted();
            SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
            if (bindOnAttachRunnable != null) {
                bindOnAttachRunnable.cancel();
            }
            getHistogramReporter().onRenderStarted();
            DivData divData = getDivData();
            DivData divData2 = divData == null ? oldDivData : divData;
            updateRuntimeStore(data, tag);
            setDataTag$div_release(tag);
            for (DivData.State state : data.states) {
                DivViewDataPreloader.preload$default(getDiv2Component().getDivViewDataPreloader(), state.div, getBindingContext(), DivStatePath.INSTANCE.fromState$div_release(state), null, 8, null);
            }
            boolean isDivDataReplaceable = DivComparator.INSTANCE.isDivDataReplaceable(divData2, data, getStateId(), getOldExpressionResolver$div_release(), getExpressionResolver(), bindingEventReporter);
            if (divData2 != null && !DivTransitionsKt.allowsTransitionsOnDataChange(data, getExpressionResolver())) {
                if (isDivDataReplaceable || !this.complexRebindEnabled || !(getView().getChildAt(0) instanceof ViewGroup) || !complexRebind(data, divData2, bindingEventReporter)) {
                    if (isDivDataReplaceable) {
                        rebind(data, false, bindingEventReporter);
                    } else {
                        z = updateNow(data, tag, bindingEventReporter);
                    }
                }
                getDiv2Component().getDivBinder().attachIndicators$div_release();
                sendCreationHistograms();
                notifyBindEnded();
                return z;
            }
            z = updateNow(data, tag, bindingEventReporter);
            getDiv2Component().getDivBinder().attachIndicators$div_release();
            sendCreationHistograms();
            notifyBindEnded();
            return z;
        }
    }

    public boolean setDataWithStates(@Nullable DivData data, @NotNull DivDataTag tag, @NotNull List<DivStatePath> paths, boolean temporary) {
        boolean updateNow;
        synchronized (this.monitor) {
            BindingEventReporter bindingEventReporter = this.bindingReporterProvider.get(getDivData(), data);
            if (data == null) {
                bindingEventReporter.onBindingFatalNoData();
                return false;
            }
            if (getDivData() == data) {
                bindingEventReporter.onBindingFatalSameData();
                return false;
            }
            notifyBindStarted();
            SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
            if (bindOnAttachRunnable != null) {
                bindOnAttachRunnable.cancel();
            }
            getHistogramReporter().onRenderStarted();
            DivData divData = getDivData();
            updateRuntimeStore(data, tag);
            boolean isDivDataReplaceable = DivComparator.INSTANCE.isDivDataReplaceable(divData, data, getStateId(), getOldExpressionResolver$div_release(), getExpressionResolver(), bindingEventReporter);
            setDataTag$div_release(tag);
            for (DivData.State state : data.states) {
                DivViewDataPreloader.preload$default(getDiv2Component().getDivViewDataPreloader(), state.div, getBindingContext(), DivStatePath.INSTANCE.fromState$div_release(state), null, 8, null);
            }
            Iterator<T> it = paths.iterator();
            while (it.hasNext()) {
                getDiv2Component().getStateManager().updateStates(getDivTag().getId(), (DivStatePath) it.next(), temporary);
            }
            if (divData == null) {
                updateNow = updateNow(data, tag, bindingEventReporter);
            } else {
                if (isDivDataReplaceable || !this.complexRebindEnabled || !(getView().getChildAt(0) instanceof ViewGroup) || !complexRebind(data, divData, bindingEventReporter)) {
                    if (isDivDataReplaceable) {
                        rebind(data, false, bindingEventReporter);
                    } else {
                        updateNow = updateNow(data, tag, bindingEventReporter);
                    }
                }
                updateNow = true;
            }
            getDiv2Component().getDivBinder().attachIndicators$div_release();
            sendCreationHistograms();
            notifyBindEnded();
            return updateNow;
        }
    }

    private void notifyBindStarted() {
        if (getInMiddleOfBind()) {
            DivActionTypedUtilsKt.logError(this, new RuntimeException("New binding started when previous not ended!"));
        }
        setInMiddleOfBind$div_release(true);
        Iterator<PersistentDivDataObserver> it = this.persistentDivDataObservers.iterator();
        while (it.hasNext()) {
            it.next().onBeforeDivDataChanged();
        }
    }

    private void notifyBindEnded() {
        setInMiddleOfBind$div_release(false);
        Iterator<PersistentDivDataObserver> it = this.persistentDivDataObservers.iterator();
        while (it.hasNext()) {
            it.next().onAfterDivDataChanged();
        }
    }

    public boolean applyPatch(@NotNull DivPatch patch) {
        synchronized (this.monitor) {
            try {
                DivData divData = getDivData();
                if (divData == null) {
                    return false;
                }
                DivData createPatchedDivData = getDiv2Component().getPatchManager().createPatchedDivData(divData, getDataTag(), patch, getExpressionResolver());
                PatchEventReporter patchEventReporter = this.patchReporterProvider.get(patch);
                if (createPatchedDivData != null && tryApplyPatch(patch, divData, createPatchedDivData, patchEventReporter)) {
                    getDiv2Component().getPatchManager().removePatch(getDataTag());
                    Iterator<T> it = this.divDataChangedObservers.iterator();
                    while (it.hasNext()) {
                        ((DivDataChangedObserver) it.next()).onDivPatchApplied(createPatchedDivData);
                    }
                    tryAttachVariableTriggers(createPatchedDivData);
                    getDiv2Component().getDivBinder().attachIndicators$div_release();
                    patchEventReporter.onPatchSuccess();
                    DivActionBinder.handleActions$div_release$default(getDiv2Component().getActionBinder(), this, getExpressionResolver(), patch.onAppliedActions, DivActionHandler.DivActionReason.PATCH, null, 16, null);
                    return true;
                }
                DivActionBinder.handleActions$div_release$default(getDiv2Component().getActionBinder(), this, getExpressionResolver(), patch.onFailedActions, DivActionHandler.DivActionReason.PATCH, null, 16, null);
                patchEventReporter.onPatchNoState();
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean tryApplyPatch(DivPatch patch, DivData oldData, DivData newDivData, PatchEventReporter reporter) {
        Div div;
        DivBase value;
        DivData.State stateToBind = getStateToBind(newDivData);
        if (stateToBind == null) {
            return false;
        }
        SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
        if (bindOnAttachRunnable != null) {
            bindOnAttachRunnable.cancel();
        }
        DivData.State state = state(oldData);
        Object obj = null;
        Div div2 = state != null ? state.div : null;
        Iterator it = patch.changes.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((DivPatch.Change) next).id, (div2 == null || (value = div2.value()) == null) ? null : value.getId())) {
                obj = next;
                break;
            }
        }
        DivPatch.Change change = (DivPatch.Change) obj;
        if (change == null) {
            rebind(oldData, false, reporter);
            setDivData$div_release(newDivData);
            getDiv2Component().getDivBinder().setDataWithoutBinding(getBindingContext(), getChildAt(0), stateToBind.div);
            return true;
        }
        List list = change.items;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            KLog kLog = KLog.INSTANCE;
            if (kLog.isAtLeast(Severity.ERROR)) {
                kLog.print(6, DivPatchApply.TAG, "Unable to patch root div because there is no div in patch.");
            }
            return false;
        }
        if (list.size() > 1) {
            KLog kLog2 = KLog.INSTANCE;
            if (kLog2.isAtLeast(Severity.ERROR)) {
                kLog2.print(6, DivPatchApply.TAG, "More than 1 div in patch for root div. The first was applied.");
            }
            div = (Div) list.get(0);
        } else {
            div = (Div) list.get(0);
        }
        Div div3 = div;
        BindingEventReporter bindingEventReporter = this.bindingReporterProvider.get(newDivData, oldData);
        boolean areDivsReplaceable = DivComparator.INSTANCE.areDivsReplaceable(div2, div3, getExpressionResolver(), getExpressionResolver(), bindingEventReporter);
        if (!areDivsReplaceable && this.complexRebindEnabled && (getView().getChildAt(0) instanceof ViewGroup) && complexRebind(newDivData, oldData, bindingEventReporter)) {
            return true;
        }
        if (areDivsReplaceable) {
            rebind(newDivData, false, reporter);
            return true;
        }
        return updateNow(newDivData, getDataTag(), reporter);
    }

    private boolean updateNow(DivData data, DivDataTag tag, ForceRebindReporter reporter) {
        DivData divData = getDivData();
        if (divData == null) {
            getHistogramReporter().onBindingStarted();
        } else {
            getHistogramReporter().onRebindingStarted();
        }
        cleanup(false);
        setDataTag$div_release(tag);
        setDivData$div_release(data);
        boolean switchToDivData = switchToDivData(divData, data, reporter);
        tryAttachVariableTriggers(data);
        if (divData != null) {
            getHistogramReporter().onRebindingFinished();
            return switchToDivData;
        }
        if (!this.bindOnAttachEnabled) {
            getHistogramReporter().onBindingFinished();
            return switchToDivData;
        }
        getHistogramReporter().onBindingPaused();
        this.reportBindingResumedRunnable = new SingleTimeOnAttachCallback(this, new Function0() { // from class: com.yandex.div.core.view2.Div2View$updateNow$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                Div2ViewHistogramReporter histogramReporter;
                histogramReporter = Div2View.this.getHistogramReporter();
                histogramReporter.onBindingResumed();
            }
        });
        this.reportBindingFinishedRunnable = new SingleTimeOnAttachCallback(this, new Function0() { // from class: com.yandex.div.core.view2.Div2View$updateNow$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ Object mo4828invoke() {
                invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                Div2ViewHistogramReporter histogramReporter;
                histogramReporter = Div2View.this.getHistogramReporter();
                histogramReporter.onBindingFinished();
            }
        });
        return switchToDivData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void tryLogVisibility() {
        List list;
        DivData divData = getDivData();
        DivData.State state = null;
        if (divData != null && (list = divData.states) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((DivData.State) next).stateId == getStateId()) {
                    state = next;
                    break;
                }
            }
            state = state;
        }
        if (state != null) {
            trackStateVisibility(state);
        }
        trackChildrenVisibility();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void discardVisibilityTracking() {
        List list;
        DivData divData = getDivData();
        DivData.State state = null;
        if (divData != null && (list = divData.states) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((DivData.State) next).stateId == getStateId()) {
                    state = next;
                    break;
                }
            }
            state = state;
        }
        if (state != null) {
            discardStateVisibility(state);
        }
        discardChildrenVisibility();
    }

    private void trackStateVisibility(DivData.State state) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(getDiv2Component().getVisibilityActionTracker(), this, getExpressionResolver(), getView(), state.div, null, null, 48, null);
    }

    private void discardStateVisibility(DivData.State state) {
        DivVisibilityActionTracker.trackVisibilityActionsOf$default(getDiv2Component().getVisibilityActionTracker(), this, getExpressionResolver(), null, state.div, null, null, 48, null);
    }

    public void trackChildrenVisibility() {
        ExpressionResolver expressionResolver;
        DivVisibilityActionTracker visibilityActionTracker = getDiv2Component().getVisibilityActionTracker();
        for (Map.Entry<View, Div> entry : this.viewToDivBindings.entrySet()) {
            View key = entry.getKey();
            Div value = entry.getValue();
            BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(key);
            if (bindingContext != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
                if (ViewCompat.isAttachedToWindow(key)) {
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, key, value, null, null, 48, null);
                } else {
                    DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, null, value, null, null, 48, null);
                }
            }
        }
    }

    private void discardChildrenVisibility() {
        ExpressionResolver expressionResolver;
        DivVisibilityActionTracker visibilityActionTracker = getDiv2Component().getVisibilityActionTracker();
        for (Map.Entry<View, Div> entry : this.viewToDivBindings.entrySet()) {
            View key = entry.getKey();
            Div value = entry.getValue();
            BindingContext bindingContext = BaseDivViewExtensionsKt.getBindingContext(key);
            if (bindingContext != null && (expressionResolver = bindingContext.getExpressionResolver()) != null) {
                DivVisibilityActionTracker.trackVisibilityActionsOf$default(visibilityActionTracker, this, expressionResolver, null, value, null, null, 48, null);
            }
        }
    }

    @NotNull
    public DivCustomContainerChildFactory getCustomContainerChildFactory$div_release() {
        return getDiv2Component().getDivCustomContainerChildFactory();
    }

    private void sendCreationHistograms() {
        if (this.timeCreated < 0) {
            return;
        }
        getDiv2Component().getDivCreationTracker().sendHistograms(this.constructorCallTime, this.timeCreated, getDiv2Component().getHistogramReporter(), this.viewCreateCallType);
        this.timeCreated = -1L;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        if (getInputFocusTracker().isFocusedOnInput()) {
            this.gestureDetector.onTouchEvent(event);
            if (event.getAction() == 0) {
                return true;
            }
        }
        return super.onTouchEvent(event);
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        getHistogramReporter().onLayoutStarted();
        super.onLayout(changed, left, top, right, bottom);
        tryLogVisibility();
        getHistogramReporter().onLayoutFinished();
    }

    @Override // com.yandex.div.internal.widget.FrameContainerLayout, com.yandex.div.internal.widget.DivViewGroup, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        getHistogramReporter().onMeasureStarted();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        getHistogramReporter().onMeasureFinished();
    }

    @Override // android.view.View
    public void draw(@NotNull Canvas canvas) {
        this.drawWasSkipped = false;
        getHistogramReporter().onDrawStarted();
        super.draw(canvas);
        getHistogramReporter().onDrawFinished();
        this.drawWasSkipped = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        SingleTimeOnAttachCallback singleTimeOnAttachCallback = this.reportBindingResumedRunnable;
        if (singleTimeOnAttachCallback != null) {
            singleTimeOnAttachCallback.onAttach();
        }
        tryAttachVariableTriggers(getDivData());
        SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
        if (bindOnAttachRunnable != null) {
            bindOnAttachRunnable.onAttach();
        }
        SingleTimeOnAttachCallback singleTimeOnAttachCallback2 = this.reportBindingFinishedRunnable;
        if (singleTimeOnAttachCallback2 != null) {
            singleTimeOnAttachCallback2.onAttach();
        }
        DivTimerEventDispatcher divTimerEventDispatcher = getDivTimerEventDispatcher();
        if (divTimerEventDispatcher != null) {
            divTimerEventDispatcher.onAttach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        discardVisibilityTracking();
        DivTimerEventDispatcher divTimerEventDispatcher = getDivTimerEventDispatcher();
        if (divTimerEventDispatcher != null) {
            divTimerEventDispatcher.onDetach(this);
        }
        getViewComponent().getAnimatorController().onDetachedFromWindow();
        getRuntimeStore().onDetachedFromWindow(this);
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void addLoadReference(@NotNull LoadReference loadReference, @NotNull View targetView) {
        synchronized (this.monitor) {
            this.loadReferences.add(loadReference);
        }
    }

    public static /* synthetic */ boolean prepareForRecycleOrCleanup$default(Div2View div2View, DivData divData, DivData divData2, DivDataTag divDataTag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareForRecycleOrCleanup");
        }
        if ((i & 2) != 0) {
            divData2 = null;
        }
        if ((i & 4) != 0) {
            divDataTag = null;
        }
        return div2View.prepareForRecycleOrCleanup(divData, divData2, divDataTag);
    }

    public boolean prepareForRecycleOrCleanup(@NotNull DivData newData, @Nullable DivData oldData, @Nullable DivDataTag newDataTag) {
        boolean isDivDataReplaceable;
        if (newDataTag == null) {
            newDataTag = new DivDataTag(UUID.randomUUID().toString());
        }
        DivComparator divComparator = DivComparator.INSTANCE;
        DivData divData = getDivData();
        if (divData == null) {
            divData = oldData;
        }
        isDivDataReplaceable = divComparator.isDivDataReplaceable(divData, newData, getStateId(), getExpressionResolver(), getDiv2Component().getRuntimeStoreProvider().getOrCreate$div_release(newDataTag, newData, this).getRootRuntime().getExpressionResolver(), (r17 & 32) != 0 ? null : null);
        if (isDivDataReplaceable) {
            ReleaseUtils.INSTANCE.releaseChildren$div_release(this, this);
            stopLoadAndSubscriptions();
        } else {
            cleanup();
        }
        return isDivDataReplaceable;
    }

    public void releaseMedia() {
        cancelImageLoads();
        ReleaseUtils.INSTANCE.releaseMedia$div_release(this, this);
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void cleanup() {
        synchronized (this.monitor) {
            cleanup(true);
            Unit unit = Unit.INSTANCE;
        }
    }

    private void cleanup(boolean removeChildren) {
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask != null) {
            rebindTask.clear();
            Unit unit = Unit.INSTANCE;
            this.rebindTask = null;
        }
        discardVisibilityTracking();
        cancelImageLoads();
        ReleaseUtils releaseUtils = ReleaseUtils.INSTANCE;
        releaseUtils.releaseMedia$div_release(this, this);
        stopLoadAndSubscriptions();
        getDiv2Component().getBitmapEffectHelper().release();
        if (removeChildren) {
            releaseUtils.releaseAndRemoveChildren$div_release(this, this);
        }
        ErrorCollector orNull = getViewComponent().getErrorCollectors().getOrNull(getDataTag(), getDivData());
        if (orNull != null) {
            orNull.cleanRuntimeWarningsAndErrors();
        }
        setDivData$div_release(null);
        setDataTag$div_release(DivDataTag.INVALID);
    }

    private void stopLoadAndSubscriptions() {
        this.viewToDivBindings.clear();
        cancelTooltips();
        clearSubscriptions();
        this.divDataChangedObservers.clear();
    }

    private void cancelImageLoads() {
        Iterator<T> it = this.loadReferences.iterator();
        while (it.hasNext()) {
            ((LoadReference) it.next()).cancel();
        }
        this.loadReferences.clear();
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void switchToState(long stateId, boolean temporary) {
        synchronized (this.monitor) {
            try {
                if (stateId != DivDataUtilsKt.getINVALID_STATE_ID(DivData.Companion)) {
                    SingleTimeOnAttachCallback bindOnAttachRunnable = getBindOnAttachRunnable();
                    if (bindOnAttachRunnable != null) {
                        bindOnAttachRunnable.cancel();
                    }
                    forceSwitchToState(stateId, temporary);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void switchToInitialState() {
        DivData divData = getDivData();
        if (divData == null) {
            return;
        }
        long initialStateId = DivDataUtilsKt.getInitialStateId(divData);
        DivViewState currentState = getCurrentState();
        if (currentState != null) {
            initialStateId = currentState.getCurrentDivStateId();
        }
        switchToState(initialStateId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.div.core.DivViewFacade
    public void switchToState(@NotNull DivStatePath path, boolean temporary) {
        List list;
        synchronized (this.monitor) {
            try {
                DivData divData = getDivData();
                DivData.State state = null;
                if (divData != null && (list = divData.states) != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (((DivData.State) next).stateId == path.getTopLevelStateId()) {
                            state = next;
                            break;
                        }
                    }
                    state = state;
                }
                this.bulkActionsHandler.switchState(state, path, temporary);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void switchToMultipleStates(@NotNull List<DivStatePath> pathList, boolean temporary, boolean withAnimations) {
        DivData.State state;
        Object obj;
        List list;
        if (!pathList.isEmpty()) {
            DivStatePath divStatePath = pathList.get(0);
            List<DivStatePath> list2 = pathList;
            Iterator<T> it = list2.iterator();
            while (true) {
                state = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((DivStatePath) obj).getTopLevelStateId() != divStatePath.getTopLevelStateId()) {
                        break;
                    }
                }
            }
            if (((DivStatePath) obj) != null) {
                Assert.fail("Trying to switch different top level states in path list!");
            }
            if (getStateId() == divStatePath.getTopLevelStateId()) {
                DivData divData = getDivData();
                if (divData != null && (list = divData.states) != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (((DivData.State) next).stateId == divStatePath.getTopLevelStateId()) {
                            state = next;
                            break;
                        }
                    }
                    state = state;
                }
                this.bulkActionsHandler.switchMultipleStates(state, pathList, temporary);
                return;
            }
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                getDiv2Component().getStateManager().updateStates(getDivTag().getId(), (DivStatePath) it3.next(), temporary);
            }
            switchToState(divStatePath.getTopLevelStateId());
            return;
        }
        Assert.fail("Empty path list!");
    }

    public boolean isInState(@NotNull DivStatePath statePath) {
        return Intrinsics.areEqual(getDiv2Component().getTemporaryDivStateCache().getState(getDataTag().getId(), String.valueOf(statePath.getPathToLastState())), statePath.getLastStateId());
    }

    public void addDivDataChangeObserver(@NotNull DivDataChangedObserver observer) {
        synchronized (this.monitor) {
            this.divDataChangedObservers.add(observer);
        }
    }

    public void removeDivDataChangeObserver(@NotNull DivDataChangedObserver observer) {
        synchronized (this.monitor) {
            this.divDataChangedObservers.remove(observer);
        }
    }

    public void addPersistentDivDataObserver$div_release(@NotNull PersistentDivDataObserver observer) {
        synchronized (this.monitor) {
            this.persistentDivDataObservers.addObserver(observer);
        }
    }

    public void removePersistentDivDataObserver$div_release(@NotNull PersistentDivDataObserver observer) {
        synchronized (this.monitor) {
            this.persistentDivDataObservers.removeObserver(observer);
        }
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void resetToInitialState() {
        DivViewState currentState = getCurrentState();
        if (currentState != null) {
            currentState.reset();
        }
        getDiv2Component().getTemporaryDivStateCache().resetCard(getDivTag().getId());
        switchToInitialState();
    }

    private boolean switchToDivData(DivData oldData, DivData newData, ForceRebindReporter reporter) {
        View buildViewAndUpdateState$default;
        DivData.State state = oldData != null ? state(oldData) : null;
        DivData.State state2 = state(newData);
        setStateId$div_release(stateId(newData));
        if (state2 == null) {
            reporter.onForceRebindFatalNoState();
            return false;
        }
        if (oldData == null) {
            buildViewAndUpdateState$default = buildViewAsyncAndUpdateState$default(this, state2, getStateId(), false, 4, null);
        } else {
            buildViewAndUpdateState$default = buildViewAndUpdateState$default(this, state2, getStateId(), false, 4, null);
        }
        View view = buildViewAndUpdateState$default;
        if (state != null) {
            discardStateVisibility(state);
        }
        trackStateVisibility(state2);
        addNewStateViewWithTransition(oldData, newData, state != null ? state.div : null, state2, view, (oldData != null && DivTransitionsKt.allowsTransitionsOnDataChange(oldData, getOldExpressionResolver$div_release())) || DivTransitionsKt.allowsTransitionsOnDataChange(newData, getExpressionResolver()), false);
        if (oldData != null) {
            reporter.onForceRebindSuccess();
        } else {
            reporter.onFirstBindingCompleted();
        }
        return true;
    }

    private long stateId(DivData divData) {
        DivViewState currentState = getCurrentState();
        return currentState != null ? currentState.getCurrentDivStateId() : DivDataUtilsKt.getInitialStateId(divData);
    }

    private DivData.State state(DivData divData) {
        Object obj;
        long stateId = stateId(divData);
        Iterator it = divData.states.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DivData.State) obj).stateId == stateId) {
                break;
            }
        }
        return (DivData.State) obj;
    }

    @Nullable
    public Div rootDiv$div_release() {
        DivData.State state;
        DivData divData = getDivData();
        if (divData == null || (state = state(divData)) == null) {
            return null;
        }
        return state.div;
    }

    private boolean forceSwitchToState(long stateId, boolean temporary) {
        Object obj;
        Object obj2;
        View buildViewAndUpdateState;
        setStateId$div_release(stateId);
        DivViewState currentState = getCurrentState();
        Long valueOf = currentState != null ? Long.valueOf(currentState.getCurrentDivStateId()) : null;
        DivData divData = getDivData();
        if (divData == null) {
            return false;
        }
        Iterator it = divData.states.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long j = ((DivData.State) obj).stateId;
            if (valueOf != null && j == valueOf.longValue()) {
                break;
            }
        }
        DivData.State state = (DivData.State) obj;
        Iterator it2 = divData.states.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((DivData.State) obj2).stateId == stateId) {
                break;
            }
        }
        DivData.State state2 = (DivData.State) obj2;
        if (state2 == null) {
            return false;
        }
        if (state != null) {
            discardStateVisibility(state);
        }
        trackStateVisibility(state2);
        boolean areDivsReplaceable$default = DivComparator.areDivsReplaceable$default(DivComparator.INSTANCE, state != null ? state.div : null, state2.div, getExpressionResolver(), getExpressionResolver(), null, 16, null);
        if (areDivsReplaceable$default) {
            buildViewAndUpdateState = updateState(stateId, temporary);
        } else {
            buildViewAndUpdateState = buildViewAndUpdateState(state2, stateId, temporary);
        }
        addNewStateViewWithTransition(divData, divData, state != null ? state.div : null, state2, buildViewAndUpdateState, DivTransitionsKt.allowsTransitionsOnDataChange(divData, getExpressionResolver()), areDivsReplaceable$default);
        return true;
    }

    private void addNewStateViewWithTransition(DivData oldData, DivData newData, Div oldDiv, DivData.State newState, View newStateView, boolean allowsTransition, boolean bindBeforeViewAdded) {
        Transition prepareTransition = allowsTransition ? prepareTransition(oldData, newData, oldDiv, newState.div) : null;
        if (prepareTransition != null) {
            Scene currentScene = Scene.getCurrentScene(this);
            if (currentScene != null) {
                currentScene.setExitAction(new Runnable() { // from class: com.yandex.div.core.view2.Div2View$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        Div2View.addNewStateViewWithTransition$lambda$41(Div2View.this);
                    }
                });
            }
        } else {
            ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(this, this);
        }
        if (bindBeforeViewAdded) {
            getDiv2Component().getDivBinder().bind(getBindingContext(), newStateView, newState.div, DivStatePath.INSTANCE.fromState$div_release(newState));
        }
        if (prepareTransition != null) {
            TransitionManager.endTransitions(this);
            Scene scene = new Scene(this, newStateView);
            SceneRootWatcher.INSTANCE.watchFor(scene, prepareTransition);
            TransitionManager.go(scene, prepareTransition);
            return;
        }
        addView(newStateView);
        getViewComponent().getErrorMonitor().connect(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addNewStateViewWithTransition$lambda$41(Div2View div2View) {
        ReleaseUtils.INSTANCE.releaseAndRemoveChildren$div_release(div2View, div2View);
    }

    private View updateState(long stateId, boolean temporary) {
        View childAt = getView().getChildAt(0);
        getDiv2Component().getStateManager().updateState(getDataTag(), stateId, temporary);
        getDiv2Component().getDivBinder().attachIndicators$div_release();
        return childAt;
    }

    static /* synthetic */ View buildViewAndUpdateState$default(Div2View div2View, DivData.State state, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildViewAndUpdateState");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return div2View.buildViewAndUpdateState(state, j, z);
    }

    private View buildViewAndUpdateState(DivData.State newState, long stateId, boolean isUpdateTemporary) {
        getDiv2Component().getStateManager().updateState(getDataTag(), stateId, isUpdateTemporary);
        View buildView = this.divBuilder.buildView(newState.div, getBindingContext(), DivStatePath.INSTANCE.fromState$div_release(newState));
        getDiv2Component().getDivBinder().attachIndicators$div_release();
        return buildView;
    }

    static /* synthetic */ View buildViewAsyncAndUpdateState$default(Div2View div2View, DivData.State state, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildViewAsyncAndUpdateState");
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return div2View.buildViewAsyncAndUpdateState(state, j, z);
    }

    private View buildViewAsyncAndUpdateState(final DivData.State newState, long stateId, boolean isUpdateTemporary) {
        getDiv2Component().getStateManager().updateState(getDataTag(), stateId, isUpdateTemporary);
        final DivStatePath fromState$div_release = DivStatePath.INSTANCE.fromState$div_release(newState);
        final View createView = this.divBuilder.createView(newState.div, getBindingContext(), fromState$div_release);
        if (this.bindOnAttachEnabled) {
            setBindOnAttachRunnable$div_release(new SingleTimeOnAttachCallback(this, new Function0() { // from class: com.yandex.div.core.view2.Div2View$buildViewAsyncAndUpdateState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo4828invoke() {
                    invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    Div2View div2View = Div2View.this;
                    View view = createView;
                    DivData.State state = newState;
                    try {
                        div2View.getDiv2Component().getDivBinder().bind(div2View.getBindingContext(), view, state.div, fromState$div_release);
                    } catch (ParsingException e) {
                        if (!ExpressionFallbacksHelperKt.isExpressionResolveFail(e)) {
                            throw e;
                        }
                    }
                    Div2View.this.getDiv2Component().getDivBinder().attachIndicators$div_release();
                }
            }));
        } else {
            getDiv2Component().getDivBinder().bind(getBindingContext(), createView, newState.div, fromState$div_release);
            if (!isAttachedToWindow()) {
                addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.Div2View$buildViewAsyncAndUpdateState$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(@NotNull View view) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(@NotNull View view) {
                        this.removeOnAttachStateChangeListener(this);
                        this.getDiv2Component().getDivBinder().attachIndicators$div_release();
                    }
                });
            } else {
                getDiv2Component().getDivBinder().attachIndicators$div_release();
            }
        }
        return createView;
    }

    private Transition prepareTransition(DivData oldData, final DivData newData, Div oldDiv, Div newDiv) {
        if (oldDiv == newDiv) {
            return null;
        }
        final TransitionSet buildTransitions = getViewComponent().getTransitionBuilder().buildTransitions(oldDiv != null ? itemSequenceForTransition(oldData, oldDiv, getOldExpressionResolver$div_release()) : null, newDiv != null ? itemSequenceForTransition(newData, newDiv, getExpressionResolver()) : null, getOldExpressionResolver$div_release(), getExpressionResolver());
        if (buildTransitions.getTransitionCount() == 0) {
            return null;
        }
        final DivDataChangeListener divDataChangeListener = getDiv2Component().getDivDataChangeListener();
        divDataChangeListener.beforeAnimatedDataChange(this, newData);
        buildTransitions.addListener((Transition.TransitionListener) new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.Div2View$prepareTransition$$inlined$doOnEnd$1
            @Override // androidx.transition.Transition.TransitionListener
            public /* bridge */ /* synthetic */ void onTransitionEnd(@NonNull Transition transition, boolean z) {
                super.onTransitionEnd(transition, z);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public /* bridge */ /* synthetic */ void onTransitionStart(@NonNull Transition transition, boolean z) {
                super.onTransitionStart(transition, z);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public void onTransitionEnd(@NotNull Transition transition) {
                divDataChangeListener.afterAnimatedDataChange(this, newData);
                Transition.this.removeListener(this);
            }
        });
        return buildTransitions;
    }

    private Sequence itemSequenceForTransition(DivData divData, Div div, final ExpressionResolver resolver) {
        DivTransitionSelector divTransitionSelector;
        Expression expression;
        final ArrayDeque arrayDeque = new ArrayDeque();
        if (divData == null || (expression = divData.transitionAnimationSelector) == null || (divTransitionSelector = (DivTransitionSelector) expression.evaluate(resolver)) == null) {
            divTransitionSelector = DivTransitionSelector.NONE;
        }
        arrayDeque.addLast(divTransitionSelector);
        return SequencesKt.filter(DivTreeWalkKt.walk(div, resolver).onEnter(new Function1() { // from class: com.yandex.div.core.view2.Div2View$itemSequenceForTransition$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull Div div2) {
                if (div2 instanceof Div.State) {
                    ArrayDeque.this.addLast(((Div.State) div2).getValue().transitionAnimationSelector.evaluate(resolver));
                }
                return Boolean.TRUE;
            }
        }).onLeave(new Function1() { // from class: com.yandex.div.core.view2.Div2View$itemSequenceForTransition$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Div) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Div div2) {
                if (div2 instanceof Div.State) {
                    ArrayDeque.this.removeLast();
                }
            }
        }), new Function1() { // from class: com.yandex.div.core.view2.Div2View$itemSequenceForTransition$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DivItemBuilderResult divItemBuilderResult) {
                boolean allowsTransitionsOnDataChange;
                List transitionTriggers = divItemBuilderResult.getDiv().value().getTransitionTriggers();
                if (transitionTriggers != null) {
                    allowsTransitionsOnDataChange = DivTransitionsKt.allowsTransitionsOnDataChange((List<? extends DivTransitionTrigger>) transitionTriggers);
                } else {
                    DivTransitionSelector divTransitionSelector2 = (DivTransitionSelector) ArrayDeque.this.lastOrNull();
                    allowsTransitionsOnDataChange = divTransitionSelector2 != null ? DivTransitionsKt.allowsTransitionsOnDataChange(divTransitionSelector2) : false;
                }
                return Boolean.valueOf(allowsTransitionsOnDataChange);
            }
        });
    }

    public void startDivAnimation() {
        if (getChildCount() > 0) {
            KeyEvent.Callback childAt = getChildAt(0);
            DivAnimator divAnimator = childAt instanceof DivAnimator ? (DivAnimator) childAt : null;
            if (divAnimator != null) {
                divAnimator.startDivAnimation();
            }
        }
    }

    public void stopDivAnimation() {
        if (getChildCount() > 0) {
            KeyEvent.Callback childAt = getChildAt(0);
            DivAnimator divAnimator = childAt instanceof DivAnimator ? (DivAnimator) childAt : null;
            if (divAnimator != null) {
                divAnimator.stopDivAnimation();
            }
        }
    }

    public static /* synthetic */ void handleAction$default(Div2View div2View, DivAction divAction, String str, ExpressionResolver expressionResolver, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAction");
        }
        if ((i & 2) != 0) {
            str = "external";
        }
        if ((i & 4) != 0) {
            expressionResolver = div2View.getExpressionResolver();
        }
        div2View.handleAction(divAction, str, expressionResolver);
    }

    public void handleAction(@NotNull DivAction action, @NotNull String reason, @NotNull ExpressionResolver resolver) {
        handleActionWithResult(action, reason, resolver);
    }

    public static /* synthetic */ boolean handleActionWithResult$default(Div2View div2View, DivAction divAction, String str, ExpressionResolver expressionResolver, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleActionWithResult");
        }
        if ((i & 2) != 0) {
            str = "external";
        }
        if ((i & 4) != 0) {
            expressionResolver = div2View.getExpressionResolver();
        }
        return div2View.handleActionWithResult(divAction, str, expressionResolver);
    }

    public boolean handleActionWithResult(@NotNull DivAction action, @NotNull String reason, @NotNull ExpressionResolver resolver) {
        return getDiv2Component().getActionBinder().handleAction$div_release(this, resolver, action, reason, null, getActionHandler());
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void handleUri(@NotNull Uri uri) {
        DivActionHandler actionHandler = getActionHandler();
        if (actionHandler == null || !actionHandler.handleActionUrl(uri, this)) {
            getDiv2Component().getActionHandler().handleActionUrl(uri, this);
        }
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void setConfig(@NotNull DivViewConfig viewConfig) {
        this.config = viewConfig;
    }

    @Override // com.yandex.div.core.DivViewFacade
    @NotNull
    public DivViewConfig getConfig() {
        return this.config;
    }

    @Override // com.yandex.div.core.DivViewFacade
    @NotNull
    public DivDataTag getDivTag() {
        return getDataTag();
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void subscribe(@NotNull OverflowMenuSubscriber.Listener listener) {
        synchronized (this.monitor) {
            this.overflowMenuListeners.add(listener);
        }
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void clearSubscriptions() {
        synchronized (this.monitor) {
            this.overflowMenuListeners.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void onConfigurationChangedOutside(@NotNull Configuration newConfig) {
        dismissPendingOverflowMenus();
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void dismissPendingOverflowMenus() {
        synchronized (this.monitor) {
            try {
                Iterator<T> it = this.overflowMenuListeners.iterator();
                while (it.hasNext()) {
                    ((OverflowMenuSubscriber.Listener) it.next()).dismiss();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.div.core.DivViewFacade
    public boolean hasScrollableViewUnder(@NotNull MotionEvent event) {
        return ViewGroupsKt.hasScrollableChildUnder(this, event);
    }

    @Override // com.yandex.div.core.DivViewFacade
    public long getCurrentStateId() {
        return getStateId();
    }

    @NotNull
    public DivStatePath getCurrentRootPath$div_release() {
        List list;
        Object obj;
        DivStatePath fromState$div_release;
        DivData divData = getDivData();
        if (divData != null && (list = divData.states) != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((DivData.State) obj).stateId == getStateId()) {
                    break;
                }
            }
            DivData.State state = (DivData.State) obj;
            if (state != null && (fromState$div_release = DivStatePath.INSTANCE.fromState$div_release(state)) != null) {
                return fromState$div_release;
            }
        }
        return DivStatePath.INSTANCE.fromState(getStateId());
    }

    @Override // com.yandex.div.core.DivViewFacade
    @Nullable
    public DivViewState getCurrentState() {
        DivData divData = getDivData();
        if (divData == null) {
            return null;
        }
        DivViewState state = getDiv2Component().getStateManager().getState(getDataTag());
        List<DivData.State> list = divData.states;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        for (DivData.State state2 : list) {
            if (state != null && state2.stateId == state.getCurrentDivStateId()) {
                return state;
            }
        }
        return null;
    }

    @Override // com.yandex.div.core.DivViewFacade
    @NotNull
    public ExpressionResolver getExpressionResolver() {
        return getResolver(getRuntimeStore());
    }

    private ExpressionResolver getResolver(RuntimeStore runtimeStore) {
        ExpressionsRuntime rootRuntime;
        ExpressionResolverImpl expressionResolver;
        RuntimeStoreImpl runtimeStoreImpl = runtimeStore instanceof RuntimeStoreImpl ? (RuntimeStoreImpl) runtimeStore : null;
        return (runtimeStoreImpl == null || (rootRuntime = runtimeStoreImpl.getRootRuntime()) == null || (expressionResolver = rootRuntime.getExpressionResolver()) == null) ? ExpressionResolver.EMPTY : expressionResolver;
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void showTooltip(@NotNull String tooltipId) {
        DivTooltipController.showTooltip$default(getTooltipController(), tooltipId, getBindingContext(), false, 4, null);
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void showTooltip(@NotNull String tooltipId, boolean multiple) {
        getTooltipController().showTooltip(tooltipId, getBindingContext(), multiple);
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void hideTooltip(@NotNull String tooltipId) {
        getTooltipController().hideTooltip(tooltipId, this);
    }

    @Override // com.yandex.div.core.DivViewFacade
    public void cancelTooltips() {
        getTooltipController().cancelTooltips(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        if (this.drawWasSkipped) {
            getHistogramReporter().onDrawStarted();
        }
        super.dispatchDraw(canvas);
        if (this.drawWasSkipped) {
            getHistogramReporter().onDrawFinished();
        }
    }

    public void bindViewToDiv$div_release(@NotNull View view, @NotNull Div div) {
        this.viewToDivBindings.put(view, div);
    }

    @Nullable
    public Div takeBindingDiv$div_release(@NotNull View view) {
        return this.viewToDivBindings.get(view);
    }

    @Nullable
    public VariableMutationException setVariable(@NotNull String name, @NotNull String value) {
        return VariableMutationHandler.INSTANCE.setVariable(this, name, value, getExpressionResolver());
    }

    public void applyTimerCommand(@NotNull String id, @NotNull String command) {
        DivTimerEventDispatcher divTimerEventDispatcher = getDivTimerEventDispatcher();
        if (divTimerEventDispatcher != null) {
            divTimerEventDispatcher.changeState(id, command);
        }
    }

    public static /* synthetic */ boolean applyVideoCommand$default(Div2View div2View, String str, String str2, ExpressionResolver expressionResolver, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyVideoCommand");
        }
        if ((i & 4) != 0) {
            expressionResolver = div2View.getExpressionResolver();
        }
        return div2View.applyVideoCommand(str, str2, expressionResolver);
    }

    public boolean applyVideoCommand(@NotNull String divId, @NotNull String command, @NotNull ExpressionResolver expressionResolver) {
        return getDivVideoActionHandler().handleAction(this, divId, command, expressionResolver);
    }

    @Nullable
    public Div unbindViewFromDiv$div_release(@NotNull View view) {
        return this.viewToDivBindings.remove(view);
    }

    private void rebind(DivData newData, boolean isAutoanimations, SimpleRebindReporter reporter) {
        try {
            if (getChildCount() == 0) {
                reporter.onSimpleRebindNoChild();
                updateNow(newData, getDataTag(), reporter);
                return;
            }
            DivData.State stateToBind = getStateToBind(newData);
            if (stateToBind == null) {
                reporter.onSimpleRebindFatalNoState();
                return;
            }
            getHistogramReporter().onRebindingStarted();
            ErrorCollector orNull = getViewComponent().getErrorCollectors().getOrNull(getDataTag(), getDivData());
            if (orNull != null) {
                orNull.cleanRuntimeWarningsAndErrors();
            }
            setDivData$div_release(newData);
            getDiv2Component().getStateManager().updateState(getDataTag(), stateToBind.stateId, true);
            getDiv2Component().getDivBinder().bind(getBindingContext(), getChildAt(0), stateToBind.div, DivStatePath.INSTANCE.fromState$div_release(stateToBind));
            requestLayout();
            if (isAutoanimations) {
                getDiv2Component().getDivStateChangeListener().onDivAnimatedStateChanged(this);
            }
            tryAttachVariableTriggers(newData);
            getHistogramReporter().onRebindingFinished();
            reporter.onSimpleRebindSuccess();
        } catch (Exception e) {
            reporter.onSimpleRebindException(e);
            updateNow(newData, getDataTag(), reporter);
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("", e);
            }
        }
    }

    private boolean complexRebind(DivData newData, DivData oldData, ComplexRebindReporter reporter) {
        DivData.State stateToBind = getStateToBind(newData);
        if (stateToBind == null) {
            reporter.onComplexRebindFatalNoState();
            return false;
        }
        getHistogramReporter().onRebindingStarted();
        setDivData$div_release(newData);
        RebindTask rebindTask = this.rebindTask;
        if (rebindTask == null) {
            rebindTask = new RebindTask(this, getDiv2Component().getDivBinder(), getOldExpressionResolver$div_release(), getExpressionResolver(), reporter);
            this.rebindTask = rebindTask;
        }
        getDiv2Component().getStateManager().updateState(getDataTag(), stateToBind.stateId, false);
        View childAt = getView().getChildAt(0);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.view.ViewGroup");
        if (!rebindTask.prepareAndRebind(oldData, newData, (ViewGroup) childAt, DivStatePath.INSTANCE.fromState$div_release(stateToBind))) {
            return false;
        }
        requestLayout();
        getHistogramReporter().onRebindingFinished();
        return true;
    }

    private DivData.State getStateToBind(DivData divData) {
        Object obj;
        Iterator it = divData.states.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((DivData.State) obj).stateId == getStateId()) {
                break;
            }
        }
        DivData.State state = (DivData.State) obj;
        return state == null ? (DivData.State) CollectionsKt.firstOrNull(divData.states) : state;
    }

    @Nullable
    public DivData.State stateToBind(@NotNull DivData divData) {
        return getStateToBind(divData);
    }

    public void setVisualErrorsEnabled(boolean z) {
        getViewComponent().getErrorMonitor().setEnabled$div_release(z);
    }

    public boolean getVisualErrorsEnabled() {
        return getViewComponent().getErrorMonitor().getEnabled();
    }

    public void bulkActions$div_release(@NotNull Function0 function) {
        this.bulkActionsHandler.bulkActions(function);
    }

    /* compiled from: Div2View.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000fJ\b\u0010\u0010\u001a\u00020\rH\u0002J\u0006\u0010\u0011\u001a\u00020\rJ&\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u0016\u001a\u00020\u0006J \u0010\u0017\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/yandex/div/core/view2/Div2View$BulkActionHandler;", "", "(Lcom/yandex/div/core/view2/Div2View;)V", "bulkModeDepth", "", "isPendingStateTemporary", "", "pendingPaths", "", "Lcom/yandex/div/core/state/DivStatePath;", "pendingState", "Lcom/yandex/div2/DivData$State;", "bulkActions", "", "function", "Lkotlin/Function0;", TimerController.RESET_COMMAND, "runBulkActions", "switchMultipleStates", "state", "paths", "", "temporary", "switchState", "path", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class BulkActionHandler {
        private int bulkModeDepth;
        private boolean isPendingStateTemporary = true;

        @NotNull
        private final List<DivStatePath> pendingPaths = new ArrayList();

        @Nullable
        private DivData.State pendingState;

        public BulkActionHandler() {
        }

        public static /* synthetic */ void bulkActions$default(BulkActionHandler bulkActionHandler, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                function0 = new Function0() { // from class: com.yandex.div.core.view2.Div2View$BulkActionHandler$bulkActions$1
                    public final void invoke() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo4828invoke() {
                        invoke();
                        return Unit.INSTANCE;
                    }
                };
            }
            bulkActionHandler.bulkActions(function0);
        }

        public final void bulkActions(@NotNull Function0 function) {
            this.bulkModeDepth++;
            function.mo4828invoke();
            int i = this.bulkModeDepth - 1;
            this.bulkModeDepth = i;
            if (i == 0) {
                runBulkActions();
            }
        }

        public final void switchState(@Nullable DivData.State state, @NotNull DivStatePath path, boolean temporary) {
            switchMultipleStates(state, CollectionsKt.listOf(path), temporary);
        }

        public final void switchMultipleStates(@Nullable DivData.State state, @NotNull List<DivStatePath> paths, boolean temporary) {
            DivData.State state2 = this.pendingState;
            if (state2 != null && !Intrinsics.areEqual(state, state2)) {
                reset();
            }
            this.pendingState = state;
            this.isPendingStateTemporary = this.isPendingStateTemporary && temporary;
            List<DivStatePath> list = paths;
            CollectionsKt.addAll(this.pendingPaths, list);
            Div2View div2View = Div2View.this;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                div2View.getDiv2Component().getStateManager().updateStates(div2View.getDivTag().getId(), (DivStatePath) it.next(), temporary);
            }
            if (this.bulkModeDepth == 0) {
                runBulkActions();
            }
        }

        public final void runBulkActions() {
            DivData.State state = this.pendingState;
            if (state == null) {
                return;
            }
            if (state.stateId != Div2View.this.getStateId()) {
                Div2View.this.switchToState(state.stateId, this.isPendingStateTemporary);
            } else if (Div2View.this.getChildCount() > 0) {
                try {
                    Div2View.this.getViewComponent().getStateSwitcher().switchStates(state, com.yandex.div.internal.util.CollectionsKt.immutableCopy(this.pendingPaths), Div2View.this.getExpressionResolver());
                } catch (StateConflictException e) {
                    DivActionTypedUtilsKt.logError(Div2View.this, e);
                    Div2View.this.resetToInitialState();
                }
            }
            reset();
        }

        private final void reset() {
            this.pendingState = null;
            this.isPendingStateTemporary = true;
            this.pendingPaths.clear();
        }
    }
}
