package io.intercom.android.sdk.m5.conversation;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.intercom.twig.Twig;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleMetadata;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.SearchQuery;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.data.GetConversationReason;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.reducers.ConversationReducer;
import io.intercom.android.sdk.m5.conversation.reducers.InitialStateReducerKt;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiEffect;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import io.intercom.android.sdk.m5.conversation.states.JumpToBottomButtonState;
import io.intercom.android.sdk.m5.conversation.states.LaunchMode;
import io.intercom.android.sdk.m5.conversation.states.NetworkState;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposerInputType;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.m5.conversation.usecase.Action;
import io.intercom.android.sdk.m5.conversation.usecase.AppendPartToConversationUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.AudioRecordingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.ChangeInputUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import io.intercom.android.sdk.m5.conversation.usecase.FallbackPollingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.FinStreamingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.GetNetworkState;
import io.intercom.android.sdk.m5.conversation.usecase.LoadGifUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.MarkUserContentAsSeenByAdmin;
import io.intercom.android.sdk.m5.conversation.usecase.OpenConversationUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.PushNotificationsBannerUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RecordOpenedInteractionUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RefreshConversationUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.RefreshUnreadConversationsCountUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendGifUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendMediaUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendMessageUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendQuickReplyUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SendSuggestionUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.ShowAdminIsTypingUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SoundEffectsUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.SubmitAttributeUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.TrackLastReceivedPartsUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.UpdateFloatingIndicatorUseCase;
import io.intercom.android.sdk.m5.conversation.usecase.VoiceTranscriptionUseCase;
import io.intercom.android.sdk.m5.conversation.utils.SoundPlayer;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioRecordingManager;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.connectivity.NetworkConnectivityMonitor;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: ConversationViewModel.kt */
@Metadata(d1 = {"\u0000¬\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 ³\u00012\u00020\u0001:\u0002³\u0001B\u008d\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020'\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\b\b\u0002\u0010*\u001a\u00020+\u0012\b\b\u0002\u0010,\u001a\u00020-\u0012\b\b\u0002\u0010.\u001a\u00020/\u0012\b\b\u0002\u00100\u001a\u000201\u0012\b\b\u0002\u00102\u001a\u000203\u0012\b\b\u0002\u00104\u001a\u000205\u0012\b\b\u0002\u00106\u001a\u000207\u0012\b\b\u0002\u00108\u001a\u000209\u0012\b\b\u0002\u0010:\u001a\u00020;\u0012\b\b\u0002\u0010<\u001a\u00020=\u0012\b\b\u0002\u0010>\u001a\u00020?\u0012\b\b\u0002\u0010@\u001a\u00020A\u0012\b\b\u0002\u0010B\u001a\u00020C\u0012\b\b\u0002\u0010D\u001a\u00020E\u0012\b\b\u0002\u0010F\u001a\u00020G\u0012\b\b\u0002\u0010H\u001a\u00020I\u0012\b\b\u0002\u0010J\u001a\u00020K\u0012\b\b\u0002\u0010L\u001a\u00020M¢\u0006\u0004\bN\u0010OJ\b\u0010o\u001a\u0004\u0018\u00010\u0003J\u000e\u0010p\u001a\u00020q2\u0006\u0010r\u001a\u00020sJ\u000e\u0010t\u001a\u00020q2\u0006\u0010r\u001a\u00020sJ\u000e\u0010u\u001a\u00020q2\u0006\u0010v\u001a\u00020wJ\u0016\u0010x\u001a\u00020q2\u0006\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020zJ\u0016\u0010|\u001a\u00020q2\u0006\u0010}\u001a\u00020\u00032\u0006\u0010~\u001a\u00020iJ\u0010\u0010\u007f\u001a\u00020q2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001J\u0011\u0010\u0082\u0001\u001a\u00020q2\b\u0010\u0083\u0001\u001a\u00030\u0084\u0001J\u0011\u0010\u0085\u0001\u001a\u00020q2\b\u0010\u0086\u0001\u001a\u00030\u0087\u0001J\u0012\u0010\u0088\u0001\u001a\u00020q2\u0007\u0010\u0089\u0001\u001a\u00020\u0003H\u0007J\u0011\u0010\u008a\u0001\u001a\u00020q2\b\u0010\u008b\u0001\u001a\u00030\u008c\u0001J\t\u0010\u008d\u0001\u001a\u00020\u0003H\u0002J\u0013\u0010\u008e\u0001\u001a\u00020q2\b\u0010\u008f\u0001\u001a\u00030\u0090\u0001H\u0002J\u0007\u0010\u0091\u0001\u001a\u00020qJ\u0010\u0010\u0092\u0001\u001a\u00020q2\u0007\u0010\u0093\u0001\u001a\u00020\u0003J\u0007\u0010\u0094\u0001\u001a\u00020qJ\u001a\u0010\u0095\u0001\u001a\u00020q2\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u0098\u0001\u001a\u00020\u0003J\u0013\u0010\u0099\u0001\u001a\u00020q2\b\u0010\u008f\u0001\u001a\u00030\u009a\u0001H\u0002J\u0011\u0010\u009b\u0001\u001a\u00020q2\b\u0010\u009c\u0001\u001a\u00030\u009d\u0001J\u0011\u0010\u009e\u0001\u001a\u00020q2\b\u0010\u008f\u0001\u001a\u00030\u009f\u0001J\u0011\u0010 \u0001\u001a\u00020q2\b\u0010¡\u0001\u001a\u00030¢\u0001J\u0011\u0010£\u0001\u001a\u00020q2\b\u0010¤\u0001\u001a\u00030¥\u0001J\u0007\u0010¦\u0001\u001a\u00020qJ\u0007\u0010§\u0001\u001a\u00020qJ\t\u0010¨\u0001\u001a\u00020qH\u0002J\t\u0010©\u0001\u001a\u00020qH\u0014J\u0007\u0010ª\u0001\u001a\u00020qJ\u0007\u0010«\u0001\u001a\u00020qJ\u0010\u0010¬\u0001\u001a\u00020q2\u0007\u0010\u00ad\u0001\u001a\u00020\u0003J\u0018\u0010®\u0001\u001a\u00020q2\u0007\u0010¯\u0001\u001a\u00020i2\u0006\u0010~\u001a\u00020iJ\u0007\u0010°\u0001\u001a\u00020qJ\u0007\u0010±\u0001\u001a\u00020qJ\u0007\u0010²\u0001\u001a\u00020qR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020AX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020EX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020KX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020MX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010P\u001a\n Q*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010RR\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020U0TX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020X0W¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0014\u0010[\u001a\b\u0012\u0004\u0012\u00020\\0TX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010]\u001a\b\u0012\u0004\u0012\u00020_0^X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020_0a¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR\u0014\u0010d\u001a\b\u0012\u0004\u0012\u00020e0^X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020e0a¢\u0006\b\n\u0000\u001a\u0004\bg\u0010cR\u0014\u0010h\u001a\b\u0012\u0004\u0012\u00020i0TX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010j\u001a\u0004\u0018\u00010kX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010l\u001a\b\u0012\u0004\u0012\u00020m0W8F¢\u0006\u0006\u001a\u0004\bn\u0010Z¨\u0006´\u0001"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ConversationViewModel;", "Landroidx/lifecycle/ViewModel;", "initialConversationId", "", "launchMode", "Lio/intercom/android/sdk/m5/conversation/states/LaunchMode;", "articleMetadata", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "initialMessage", "networkConnectivityMonitor", "Lio/intercom/android/sdk/utilities/connectivity/NetworkConnectivityMonitor;", "soundPlayer", "Lio/intercom/android/sdk/m5/conversation/utils/SoundPlayer;", "nexusCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "audioAmplitudeCoroutineScope", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "conversationReducer", "Lio/intercom/android/sdk/m5/conversation/reducers/ConversationReducer;", "trackLastReceivedPartsUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/TrackLastReceivedPartsUseCase;", "recordOpenedInteractionUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/RecordOpenedInteractionUseCase;", "soundEffectsUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;", "sendSuggestionUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/SendSuggestionUseCase;", "refreshUnreadConversationsCountUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshUnreadConversationsCountUseCase;", "refreshConversationUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;", "appendPartToConversationUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/AppendPartToConversationUseCase;", "openConversationUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/OpenConversationUseCase;", "sendMessageUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;", "sendQuickReplyUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/SendQuickReplyUseCase;", "loadGifUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/LoadGifUseCase;", "changeInputUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/ChangeInputUseCase;", "sendGifUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/SendGifUseCase;", "sendMediaUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/SendMediaUseCase;", "updateFloatingIndicatorUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/UpdateFloatingIndicatorUseCase;", "getNetworkState", "Lio/intercom/android/sdk/m5/conversation/usecase/GetNetworkState;", "adminIsTypingUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/ShowAdminIsTypingUseCase;", "submitAttributeUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/SubmitAttributeUseCase;", "fallbackPollingUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/FallbackPollingUseCase;", "pushNotificationsBannerUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/PushNotificationsBannerUseCase;", "audioRecordingManager", "Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager;", "audioRecordingUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/AudioRecordingUseCase;", "voiceTranscriptionUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/VoiceTranscriptionUseCase;", "markUserContentAsSeenByAdmin", "Lio/intercom/android/sdk/m5/conversation/usecase/MarkUserContentAsSeenByAdmin;", "finStreamingUseCase", "Lio/intercom/android/sdk/m5/conversation/usecase/FinStreamingUseCase;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "twig", "Lcom/intercom/twig/Twig;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/conversation/states/LaunchMode;Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Ljava/lang/String;Lio/intercom/android/sdk/utilities/connectivity/NetworkConnectivityMonitor;Lio/intercom/android/sdk/m5/conversation/utils/SoundPlayer;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/CoroutineScope;Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;Lio/intercom/android/sdk/m5/conversation/reducers/ConversationReducer;Lio/intercom/android/sdk/m5/conversation/usecase/TrackLastReceivedPartsUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/RecordOpenedInteractionUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/SoundEffectsUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/SendSuggestionUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/RefreshUnreadConversationsCountUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/RefreshConversationUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/AppendPartToConversationUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/OpenConversationUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/SendMessageUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/SendQuickReplyUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/LoadGifUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/ChangeInputUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/SendGifUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/SendMediaUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/UpdateFloatingIndicatorUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/GetNetworkState;Lio/intercom/android/sdk/m5/conversation/usecase/ShowAdminIsTypingUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/SubmitAttributeUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/FallbackPollingUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/PushNotificationsBannerUseCase;Lio/intercom/android/sdk/m5/conversation/utils/audio/AudioRecordingManager;Lio/intercom/android/sdk/m5/conversation/usecase/AudioRecordingUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/VoiceTranscriptionUseCase;Lio/intercom/android/sdk/m5/conversation/usecase/MarkUserContentAsSeenByAdmin;Lio/intercom/android/sdk/m5/conversation/usecase/FinStreamingUseCase;Lkotlinx/coroutines/CoroutineDispatcher;Lio/intercom/android/sdk/metrics/MetricTracker;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lcom/intercom/twig/Twig;)V", "decodedInitialMessage", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "clientState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "gifQueryStateFlow", "Lio/intercom/android/sdk/m5/conversation/SearchQuery;", "_uiEffect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationUiEffect;", "uiEffect", "Lkotlinx/coroutines/flow/SharedFlow;", "getUiEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "_composerUiEffect", "Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect;", "composerUiEffect", "getComposerUiEffect", "resumedState", "", "adminIsTypingJob", "Lkotlinx/coroutines/Job;", "amplitudeLevel", "", "getAmplitudeLevel", "getConversationId", "onResume", "", "context", "Landroid/content/Context;", "onPause", "onConversationScrolled", "conversationScrolledState", "Lio/intercom/android/sdk/m5/conversation/usecase/ConversationScrolledState;", "onJumpToBottomButtonClicked", "scrollToPosition", "", "lastSeenItemIndex", "sendMessage", "messageText", "arePushNotificationsEnabled", "onSuggestionClick", MetricTracker.Object.SUGGESTION, "Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "onReplyOptionClicked", "replyOption", "Lio/intercom/android/sdk/models/ReplyOption;", "onInputChange", "inputType", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;", "trackClickedInput", MetricTracker.Object.INPUT, "trackMetric", "metricData", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "getConversationContext", "sendGif", "mediaData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Gif;", "loadGifs", "onGifSearchQueryChange", "searchQuery", "onRetryClick", "onSubmitAttribute", "attribute", "Lio/intercom/android/sdk/models/Attribute;", "partId", "sendMedia", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "updateBottomSheet", "bottomSheetState", "Lio/intercom/android/sdk/m5/conversation/states/BottomSheetState;", "sendAfterPreview", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData;", "onRetryMessageClicked", "part", "Lio/intercom/android/sdk/models/Part;", "onRetryMediaClicked", "failedImageUploadData", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "onTyping", "onNetworkMessageDismissed", "loadConversation", "onCleared", "onPrivacyNoticeDismissed", "onReportAiAnswer", "updateTranscribedText", "text", "updatePushNotificationsBanner", "dismissed", "startVoiceRecording", "stopVoiceRecordingAndTranscribe", "cancelVoiceRecording", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ConversationViewModel extends ViewModel {
    private static final long DEBOUNCE_DELAY_MS = 500;
    private final MutableSharedFlow<ComposerUiEffect> _composerUiEffect;
    private final MutableSharedFlow<ConversationUiEffect> _uiEffect;
    private Job adminIsTypingJob;
    private final ShowAdminIsTypingUseCase adminIsTypingUseCase;
    private final AppendPartToConversationUseCase appendPartToConversationUseCase;
    private final ArticleMetadata articleMetadata;
    private final CoroutineScope audioAmplitudeCoroutineScope;
    private final AudioRecordingManager audioRecordingManager;
    private final AudioRecordingUseCase audioRecordingUseCase;
    private final ChangeInputUseCase changeInputUseCase;
    private final MutableStateFlow<ConversationClientState> clientState;
    private final SharedFlow<ComposerUiEffect> composerUiEffect;
    private final ConversationReducer conversationReducer;
    private final ConversationRepository conversationRepository;
    private final String decodedInitialMessage;
    private final CoroutineDispatcher dispatcher;
    private final FallbackPollingUseCase fallbackPollingUseCase;
    private final FinStreamingUseCase finStreamingUseCase;
    private final MutableStateFlow<SearchQuery> gifQueryStateFlow;
    private final String initialConversationId;
    private final IntercomDataLayer intercomDataLayer;
    private final LaunchMode launchMode;
    private final LoadGifUseCase loadGifUseCase;
    private final MarkUserContentAsSeenByAdmin markUserContentAsSeenByAdmin;
    private final MetricTracker metricTracker;
    private final NetworkConnectivityMonitor networkConnectivityMonitor;
    private final CoroutineScope nexusCoroutineScope;
    private final OpenConversationUseCase openConversationUseCase;
    private final PushNotificationsBannerUseCase pushNotificationsBannerUseCase;
    private final RecordOpenedInteractionUseCase recordOpenedInteractionUseCase;
    private final RefreshConversationUseCase refreshConversationUseCase;
    private final RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase;
    private final MutableStateFlow<Boolean> resumedState;
    private final SendGifUseCase sendGifUseCase;
    private final SendMediaUseCase sendMediaUseCase;
    private final SendMessageUseCase sendMessageUseCase;
    private final SendQuickReplyUseCase sendQuickReplyUseCase;
    private final SendSuggestionUseCase sendSuggestionUseCase;
    private final SoundEffectsUseCase soundEffectsUseCase;
    private final SoundPlayer soundPlayer;
    private final SubmitAttributeUseCase submitAttributeUseCase;
    private final TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase;
    private final Twig twig;
    private final SharedFlow<ConversationUiEffect> uiEffect;
    private final StateFlow<ConversationUiState> uiState;
    private final UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase;
    private final VoiceTranscriptionUseCase voiceTranscriptionUseCase;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ ConversationViewModel(String str, LaunchMode launchMode, ArticleMetadata articleMetadata, String str2, NetworkConnectivityMonitor networkConnectivityMonitor, SoundPlayer soundPlayer, CoroutineScope coroutineScope, CoroutineScope coroutineScope2, ConversationRepository conversationRepository, ConversationReducer conversationReducer, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase, SoundEffectsUseCase soundEffectsUseCase, SendSuggestionUseCase sendSuggestionUseCase, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, RefreshConversationUseCase refreshConversationUseCase, AppendPartToConversationUseCase appendPartToConversationUseCase, OpenConversationUseCase openConversationUseCase, SendMessageUseCase sendMessageUseCase, SendQuickReplyUseCase sendQuickReplyUseCase, LoadGifUseCase loadGifUseCase, ChangeInputUseCase changeInputUseCase, SendGifUseCase sendGifUseCase, SendMediaUseCase sendMediaUseCase, UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase, GetNetworkState getNetworkState, ShowAdminIsTypingUseCase showAdminIsTypingUseCase, SubmitAttributeUseCase submitAttributeUseCase, FallbackPollingUseCase fallbackPollingUseCase, PushNotificationsBannerUseCase pushNotificationsBannerUseCase, AudioRecordingManager audioRecordingManager, AudioRecordingUseCase audioRecordingUseCase, VoiceTranscriptionUseCase voiceTranscriptionUseCase, MarkUserContentAsSeenByAdmin markUserContentAsSeenByAdmin, FinStreamingUseCase finStreamingUseCase, CoroutineDispatcher coroutineDispatcher, MetricTracker metricTracker, IntercomDataLayer intercomDataLayer, Twig twig, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(r4, launchMode, r6, str2, r8, r9, r17, r1, r12, r13, r14, r15, r16, r3, r18, r19, r20, r21, r22, r23, r24, r10, r26, r27, r28, r29, r30, r31, r32, r33, r5, r0, (i2 & 1) != 0 ? new VoiceTranscriptionUseCase(r0, r12) : voiceTranscriptionUseCase, (i2 & 2) != 0 ? new MarkUserContentAsSeenByAdmin() : markUserContentAsSeenByAdmin, (i2 & 4) != 0 ? new FinStreamingUseCase() : finStreamingUseCase, (i2 & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i2 & 16) != 0 ? Injector.get().getMetricTracker() : metricTracker, (i2 & 32) != 0 ? Injector.get().getDataLayer() : intercomDataLayer, (i2 & 64) != 0 ? LumberMill.getLogger() : twig);
        TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase2;
        SendMessageUseCase sendMessageUseCase2;
        SendMediaUseCase sendMediaUseCase2;
        PushNotificationsBannerUseCase pushNotificationsBannerUseCase2;
        AudioRecordingManager audioRecordingManager2;
        MetricTracker metricTracker2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        String str3 = (i & 1) != 0 ? null : str;
        ArticleMetadata articleMetadata2 = (i & 4) != 0 ? null : articleMetadata;
        NetworkConnectivityMonitor networkConnectivityMonitor2 = (i & 16) != 0 ? new NetworkConnectivityMonitor() : networkConnectivityMonitor;
        SoundPlayer soundPlayer2 = (i & 32) != 0 ? new SoundPlayer() : soundPlayer;
        CoroutineScope CoroutineScope = (i & 64) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()) : coroutineScope;
        CoroutineScope CoroutineScope2 = (i & 128) != 0 ? CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()) : coroutineScope2;
        CoroutineScope coroutineScope3 = CoroutineScope;
        ConversationRepository conversationRepository2 = (i & 256) != 0 ? new ConversationRepository(null, null, null, null, null, null, coroutineScope3, 63, null) : conversationRepository;
        ConversationReducer conversationReducer2 = (i & 512) != 0 ? new ConversationReducer(null, null, null, null, 15, null) : conversationReducer;
        int i3 = 3;
        if ((i & 1024) != 0) {
            trackLastReceivedPartsUseCase2 = new TrackLastReceivedPartsUseCase(metricTracker2, objArr5 == true ? 1 : 0, i3, objArr4 == true ? 1 : 0);
        } else {
            trackLastReceivedPartsUseCase2 = trackLastReceivedPartsUseCase;
        }
        RecordOpenedInteractionUseCase recordOpenedInteractionUseCase2 = (i & 2048) != 0 ? new RecordOpenedInteractionUseCase(conversationRepository2) : recordOpenedInteractionUseCase;
        SoundEffectsUseCase soundEffectsUseCase2 = (i & 4096) != 0 ? new SoundEffectsUseCase(null, soundPlayer2, 1, null) : soundEffectsUseCase;
        SendSuggestionUseCase sendSuggestionUseCase2 = (i & 8192) != 0 ? new SendSuggestionUseCase(conversationRepository2, soundEffectsUseCase2, null, null, 12, null) : sendSuggestionUseCase;
        RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase2 = (i & 16384) != 0 ? new RefreshUnreadConversationsCountUseCase(null, null, 3, null) : refreshUnreadConversationsCountUseCase;
        RefreshConversationUseCase refreshConversationUseCase2 = (32768 & i) != 0 ? new RefreshConversationUseCase(conversationRepository2, null, trackLastReceivedPartsUseCase2, recordOpenedInteractionUseCase2, 2, null) : refreshConversationUseCase;
        AppendPartToConversationUseCase appendPartToConversationUseCase2 = (65536 & i) != 0 ? new AppendPartToConversationUseCase(trackLastReceivedPartsUseCase2, recordOpenedInteractionUseCase2) : appendPartToConversationUseCase;
        OpenConversationUseCase openConversationUseCase2 = (131072 & i) != 0 ? new OpenConversationUseCase(refreshConversationUseCase2, refreshUnreadConversationsCountUseCase2, null, 4, null) : openConversationUseCase;
        SendMessageUseCase sendMessageUseCase3 = (262144 & i) != 0 ? new SendMessageUseCase(conversationRepository2, refreshConversationUseCase2, soundEffectsUseCase2, null, null, 24, null) : sendMessageUseCase;
        SendQuickReplyUseCase sendQuickReplyUseCase2 = (524288 & i) != 0 ? new SendQuickReplyUseCase(conversationRepository2, refreshConversationUseCase2, soundEffectsUseCase2, null, 8, null) : sendQuickReplyUseCase;
        LoadGifUseCase loadGifUseCase2 = (1048576 & i) != 0 ? new LoadGifUseCase(conversationRepository2) : loadGifUseCase;
        ChangeInputUseCase changeInputUseCase2 = (2097152 & i) != 0 ? new ChangeInputUseCase() : changeInputUseCase;
        SendGifUseCase sendGifUseCase2 = (4194304 & i) != 0 ? new SendGifUseCase(sendMessageUseCase3, changeInputUseCase2) : sendGifUseCase;
        if ((8388608 & i) != 0) {
            SendMessageUseCase sendMessageUseCase4 = sendMessageUseCase3;
            sendMessageUseCase2 = sendMessageUseCase4;
            sendMediaUseCase2 = new SendMediaUseCase(sendMessageUseCase4, conversationRepository2, null, null, null, 28, null);
        } else {
            sendMessageUseCase2 = sendMessageUseCase3;
            sendMediaUseCase2 = sendMediaUseCase;
        }
        UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase2 = (16777216 & i) != 0 ? new UpdateFloatingIndicatorUseCase() : updateFloatingIndicatorUseCase;
        GetNetworkState getNetworkState2 = (33554432 & i) != 0 ? new GetNetworkState(networkConnectivityMonitor2) : getNetworkState;
        ShowAdminIsTypingUseCase showAdminIsTypingUseCase2 = (67108864 & i) != 0 ? new ShowAdminIsTypingUseCase() : showAdminIsTypingUseCase;
        SubmitAttributeUseCase submitAttributeUseCase2 = (134217728 & i) != 0 ? new SubmitAttributeUseCase(conversationRepository2) : submitAttributeUseCase;
        FallbackPollingUseCase fallbackPollingUseCase2 = (268435456 & i) != 0 ? new FallbackPollingUseCase(null, null, refreshConversationUseCase2, 3, null) : fallbackPollingUseCase;
        if ((536870912 & i) != 0) {
            pushNotificationsBannerUseCase2 = new PushNotificationsBannerUseCase(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, i3, objArr == true ? 1 : 0);
        } else {
            pushNotificationsBannerUseCase2 = pushNotificationsBannerUseCase;
        }
        if ((1073741824 & i) != 0) {
            Application application = Injector.get().getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
            audioRecordingManager2 = new AudioRecordingManager(application, CoroutineScope2);
        } else {
            audioRecordingManager2 = audioRecordingManager;
        }
        AudioRecordingUseCase audioRecordingUseCase2 = (i & Integer.MIN_VALUE) != 0 ? new AudioRecordingUseCase(audioRecordingManager2, null, 2, null) : audioRecordingUseCase;
    }

    public ConversationViewModel(String str, LaunchMode launchMode, ArticleMetadata articleMetadata, String initialMessage, NetworkConnectivityMonitor networkConnectivityMonitor, SoundPlayer soundPlayer, CoroutineScope nexusCoroutineScope, CoroutineScope audioAmplitudeCoroutineScope, ConversationRepository conversationRepository, final ConversationReducer conversationReducer, TrackLastReceivedPartsUseCase trackLastReceivedPartsUseCase, RecordOpenedInteractionUseCase recordOpenedInteractionUseCase, SoundEffectsUseCase soundEffectsUseCase, SendSuggestionUseCase sendSuggestionUseCase, RefreshUnreadConversationsCountUseCase refreshUnreadConversationsCountUseCase, RefreshConversationUseCase refreshConversationUseCase, AppendPartToConversationUseCase appendPartToConversationUseCase, OpenConversationUseCase openConversationUseCase, SendMessageUseCase sendMessageUseCase, SendQuickReplyUseCase sendQuickReplyUseCase, LoadGifUseCase loadGifUseCase, ChangeInputUseCase changeInputUseCase, SendGifUseCase sendGifUseCase, SendMediaUseCase sendMediaUseCase, UpdateFloatingIndicatorUseCase updateFloatingIndicatorUseCase, GetNetworkState getNetworkState, ShowAdminIsTypingUseCase adminIsTypingUseCase, SubmitAttributeUseCase submitAttributeUseCase, FallbackPollingUseCase fallbackPollingUseCase, PushNotificationsBannerUseCase pushNotificationsBannerUseCase, AudioRecordingManager audioRecordingManager, AudioRecordingUseCase audioRecordingUseCase, VoiceTranscriptionUseCase voiceTranscriptionUseCase, MarkUserContentAsSeenByAdmin markUserContentAsSeenByAdmin, FinStreamingUseCase finStreamingUseCase, CoroutineDispatcher dispatcher, MetricTracker metricTracker, IntercomDataLayer intercomDataLayer, Twig twig) {
        SharedFlow<ConversationUiEffect> shareIn$default;
        SharedFlow<ComposerUiEffect> shareIn$default2;
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(initialMessage, "initialMessage");
        Intrinsics.checkNotNullParameter(networkConnectivityMonitor, "networkConnectivityMonitor");
        Intrinsics.checkNotNullParameter(soundPlayer, "soundPlayer");
        Intrinsics.checkNotNullParameter(nexusCoroutineScope, "nexusCoroutineScope");
        Intrinsics.checkNotNullParameter(audioAmplitudeCoroutineScope, "audioAmplitudeCoroutineScope");
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(conversationReducer, "conversationReducer");
        Intrinsics.checkNotNullParameter(trackLastReceivedPartsUseCase, "trackLastReceivedPartsUseCase");
        Intrinsics.checkNotNullParameter(recordOpenedInteractionUseCase, "recordOpenedInteractionUseCase");
        Intrinsics.checkNotNullParameter(soundEffectsUseCase, "soundEffectsUseCase");
        Intrinsics.checkNotNullParameter(sendSuggestionUseCase, "sendSuggestionUseCase");
        Intrinsics.checkNotNullParameter(refreshUnreadConversationsCountUseCase, "refreshUnreadConversationsCountUseCase");
        Intrinsics.checkNotNullParameter(refreshConversationUseCase, "refreshConversationUseCase");
        Intrinsics.checkNotNullParameter(appendPartToConversationUseCase, "appendPartToConversationUseCase");
        Intrinsics.checkNotNullParameter(openConversationUseCase, "openConversationUseCase");
        Intrinsics.checkNotNullParameter(sendMessageUseCase, "sendMessageUseCase");
        Intrinsics.checkNotNullParameter(sendQuickReplyUseCase, "sendQuickReplyUseCase");
        Intrinsics.checkNotNullParameter(loadGifUseCase, "loadGifUseCase");
        Intrinsics.checkNotNullParameter(changeInputUseCase, "changeInputUseCase");
        Intrinsics.checkNotNullParameter(sendGifUseCase, "sendGifUseCase");
        Intrinsics.checkNotNullParameter(sendMediaUseCase, "sendMediaUseCase");
        Intrinsics.checkNotNullParameter(updateFloatingIndicatorUseCase, "updateFloatingIndicatorUseCase");
        Intrinsics.checkNotNullParameter(getNetworkState, "getNetworkState");
        Intrinsics.checkNotNullParameter(adminIsTypingUseCase, "adminIsTypingUseCase");
        Intrinsics.checkNotNullParameter(submitAttributeUseCase, "submitAttributeUseCase");
        Intrinsics.checkNotNullParameter(fallbackPollingUseCase, "fallbackPollingUseCase");
        Intrinsics.checkNotNullParameter(pushNotificationsBannerUseCase, "pushNotificationsBannerUseCase");
        Intrinsics.checkNotNullParameter(audioRecordingManager, "audioRecordingManager");
        Intrinsics.checkNotNullParameter(audioRecordingUseCase, "audioRecordingUseCase");
        Intrinsics.checkNotNullParameter(voiceTranscriptionUseCase, "voiceTranscriptionUseCase");
        Intrinsics.checkNotNullParameter(markUserContentAsSeenByAdmin, "markUserContentAsSeenByAdmin");
        Intrinsics.checkNotNullParameter(finStreamingUseCase, "finStreamingUseCase");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(twig, "twig");
        this.initialConversationId = str;
        this.launchMode = launchMode;
        this.articleMetadata = articleMetadata;
        this.networkConnectivityMonitor = networkConnectivityMonitor;
        this.soundPlayer = soundPlayer;
        this.nexusCoroutineScope = nexusCoroutineScope;
        this.audioAmplitudeCoroutineScope = audioAmplitudeCoroutineScope;
        this.conversationRepository = conversationRepository;
        this.conversationReducer = conversationReducer;
        this.trackLastReceivedPartsUseCase = trackLastReceivedPartsUseCase;
        this.recordOpenedInteractionUseCase = recordOpenedInteractionUseCase;
        this.soundEffectsUseCase = soundEffectsUseCase;
        this.sendSuggestionUseCase = sendSuggestionUseCase;
        this.refreshUnreadConversationsCountUseCase = refreshUnreadConversationsCountUseCase;
        this.refreshConversationUseCase = refreshConversationUseCase;
        this.appendPartToConversationUseCase = appendPartToConversationUseCase;
        this.openConversationUseCase = openConversationUseCase;
        this.sendMessageUseCase = sendMessageUseCase;
        this.sendQuickReplyUseCase = sendQuickReplyUseCase;
        this.loadGifUseCase = loadGifUseCase;
        this.changeInputUseCase = changeInputUseCase;
        this.sendGifUseCase = sendGifUseCase;
        this.sendMediaUseCase = sendMediaUseCase;
        this.updateFloatingIndicatorUseCase = updateFloatingIndicatorUseCase;
        this.adminIsTypingUseCase = adminIsTypingUseCase;
        this.submitAttributeUseCase = submitAttributeUseCase;
        this.fallbackPollingUseCase = fallbackPollingUseCase;
        this.pushNotificationsBannerUseCase = pushNotificationsBannerUseCase;
        this.audioRecordingManager = audioRecordingManager;
        this.audioRecordingUseCase = audioRecordingUseCase;
        this.voiceTranscriptionUseCase = voiceTranscriptionUseCase;
        this.markUserContentAsSeenByAdmin = markUserContentAsSeenByAdmin;
        this.finStreamingUseCase = finStreamingUseCase;
        this.dispatcher = dispatcher;
        this.metricTracker = metricTracker;
        this.intercomDataLayer = intercomDataLayer;
        this.twig = twig;
        String decodedInitialMessage = Uri.decode(initialMessage);
        this.decodedInitialMessage = decodedInitialMessage;
        Intrinsics.checkNotNullExpressionValue(decodedInitialMessage, "decodedInitialMessage");
        MutableStateFlow<ConversationClientState> MutableStateFlow = StateFlowKt.MutableStateFlow(new ConversationClientState(null, null, str, null, new ComposerState.TextInput(decodedInitialMessage, new StringProvider.StringRes(R.string.intercom_reply_to_conversation, null, 2, null), false, null, null, 28, null), null, launchMode, null, articleMetadata, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4193963, null));
        this.clientState = MutableStateFlow;
        final MutableStateFlow<ConversationClientState> mutableStateFlow = MutableStateFlow;
        Flow<ConversationUiState> flow = new Flow<ConversationUiState>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ ConversationReducer receiver$inlined;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, ConversationReducer conversationReducer) {
                    this.$this_unsafeFlow = flowCollector;
                    this.receiver$inlined = conversationReducer;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label -= Integer.MIN_VALUE;
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                ConversationUiState computeUiState$intercom_sdk_base_release = this.receiver$inlined.computeUiState$intercom_sdk_base_release((ConversationClientState) obj);
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(computeUiState$intercom_sdk_base_release, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super ConversationUiState> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, conversationReducer), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        };
        ConversationViewModel conversationViewModel = this;
        this.uiState = FlowKt.stateIn(flow, ViewModelKt.getViewModelScope(conversationViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), InitialStateReducerKt.reduceInitialState(MutableStateFlow.getValue().getLaunchMode()));
        this.gifQueryStateFlow = StateFlowKt.MutableStateFlow(SearchQuery.None.INSTANCE);
        MutableSharedFlow<ConversationUiEffect> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._uiEffect = MutableSharedFlow$default;
        shareIn$default = FlowKt__ShareKt.shareIn$default(MutableSharedFlow$default, ViewModelKt.getViewModelScope(conversationViewModel), SharingStarted.INSTANCE.getEagerly(), 0, 4, null);
        this.uiEffect = shareIn$default;
        MutableSharedFlow<ComposerUiEffect> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._composerUiEffect = MutableSharedFlow$default2;
        shareIn$default2 = FlowKt__ShareKt.shareIn$default(MutableSharedFlow$default2, ViewModelKt.getViewModelScope(conversationViewModel), SharingStarted.INSTANCE.getEagerly(), 0, 4, null);
        this.composerUiEffect = shareIn$default2;
        this.resumedState = StateFlowKt.MutableStateFlow(false);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(conversationViewModel), dispatcher, null, new AnonymousClass1(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(conversationViewModel), dispatcher, null, new AnonymousClass2(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(conversationViewModel), dispatcher, null, new AnonymousClass3(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(conversationViewModel), dispatcher, null, new AnonymousClass4(null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(conversationViewModel), null, null, new AnonymousClass5(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(conversationViewModel), dispatcher, null, new AnonymousClass6(getNetworkState, this, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(conversationViewModel), dispatcher, null, new AnonymousClass7(null), 2, null);
        if (str == null) {
            Injector.get().getDataLayer().clearOpenResponse();
        }
        loadConversation();
    }

    public final StateFlow<ConversationUiState> getUiState() {
        return this.uiState;
    }

    public final SharedFlow<ConversationUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final SharedFlow<ComposerUiEffect> getComposerUiEffect() {
        return this.composerUiEffect;
    }

    public final StateFlow<Float> getAmplitudeLevel() {
        return this.audioRecordingManager.getAmplitudeLevel();
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1", f = "ConversationViewModel.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = ConversationViewModel.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                final Flow<ParsedNexusEvent> realTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
                final Flow<Object> flow = new Flow<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        if (obj instanceof ParsedNexusEvent.ConversationNexusEvent) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }
                };
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                Flow<ParsedNexusEvent.ConversationNexusEvent> flow2 = new Flow<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, ConversationViewModel conversationViewModel) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = conversationViewModel;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
                        
                            if (r2 == true) goto L23;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            boolean isFastFinTyping;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) obj;
                                        if (!Intrinsics.areEqual(conversationNexusEvent.getConversationId(), ((ConversationClientState) this.this$0.clientState.getValue()).getConversationId())) {
                                            ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping adminIsTyping = conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping ? (ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) conversationNexusEvent : null;
                                            if (adminIsTyping != null) {
                                                isFastFinTyping = ConversationViewModelKt.isFastFinTyping(adminIsTyping, (ConversationClientState) this.this$0.clientState.getValue());
                                            }
                                        }
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ParsedNexusEvent.ConversationNexusEvent> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, conversationViewModel), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }
                };
                final ConversationViewModel conversationViewModel2 = ConversationViewModel.this;
                this.label = 1;
                if (flow2.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent) obj2, (Continuation<? super Unit>) continuation);
                    }

                    /* compiled from: ConversationViewModel.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$1", f = "ConversationViewModel.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$1, reason: invalid class name and collision with other inner class name */
                    static final class C01221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ ParsedNexusEvent.ConversationNexusEvent $it;
                        int label;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C01221(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, ConversationViewModel conversationViewModel, Continuation<? super C01221> continuation) {
                            super(2, continuation);
                            this.$it = conversationNexusEvent;
                            this.this$0 = conversationViewModel;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C01221(this.$it, this.this$0, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C01221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                if (((ParsedNexusEvent.ConversationNexusEvent.NewComment) this.$it).getPartBuilder() != null) {
                                    this.this$0.appendPartToConversationUseCase.invoke(this.this$0.clientState, ((ParsedNexusEvent.ConversationNexusEvent.NewComment) this.$it).getPartBuilder());
                                } else {
                                    this.label = 1;
                                    if (this.this$0.refreshConversationUseCase.invoke(this.this$0.clientState, GetConversationReason.NEW_COMMENT, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            this.this$0.soundEffectsUseCase.invoke$intercom_sdk_base_release(StringsKt.isBlank(((ParsedNexusEvent.ConversationNexusEvent.NewComment) this.$it).getCreatedByUser()) ? Action.OPERATOR_MESSAGE_RECEIVED : Action.ADMIN_MESSAGE_RECEIVED);
                            return Unit.INSTANCE;
                        }
                    }

                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, Continuation<? super Unit> continuation) {
                        Job launch$default;
                        if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.NewComment) {
                            BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C01221(conversationNexusEvent, conversationViewModel2, null), 3, null);
                        } else if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) {
                            Job job = conversationViewModel2.adminIsTypingJob;
                            if (job != null) {
                                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                            }
                            ConversationViewModel conversationViewModel3 = conversationViewModel2;
                            launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScope.this, null, null, new C01232(conversationViewModel2, conversationNexusEvent, null), 3, null);
                            conversationViewModel3.adminIsTypingJob = launch$default;
                        } else if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.UserContentSeenByAdmin) {
                            conversationViewModel2.markUserContentAsSeenByAdmin.invoke(conversationViewModel2.clientState);
                        } else if (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.FinStreaming) {
                            Object invoke = conversationViewModel2.finStreamingUseCase.invoke(conversationViewModel2.clientState, (ParsedNexusEvent.ConversationNexusEvent.FinStreaming) conversationNexusEvent, continuation);
                            return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
                        }
                        return Unit.INSTANCE;
                    }

                    /* compiled from: ConversationViewModel.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$2", f = "ConversationViewModel.kt", i = {}, l = {262}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$1$2$2, reason: invalid class name and collision with other inner class name */
                    static final class C01232 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ ParsedNexusEvent.ConversationNexusEvent $it;
                        int label;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C01232(ConversationViewModel conversationViewModel, ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, Continuation<? super C01232> continuation) {
                            super(2, continuation);
                            this.this$0 = conversationViewModel;
                            this.$it = conversationNexusEvent;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C01232(this.this$0, this.$it, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((C01232) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                this.label = 1;
                                if (this.this$0.adminIsTypingUseCase.invoke(this.this$0.clientState, ((ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) this.$it).getAvatar(), ((ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) this.$it).isBot(), ((ParsedNexusEvent.ConversationNexusEvent.AdminIsTyping) this.$it).getShowAvatar(), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$2", f = "ConversationViewModel.kt", i = {}, l = {291}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (ConversationViewModel.this.fallbackPollingUseCase.invoke(ConversationViewModel.this.clientState, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3", f = "ConversationViewModel.kt", i = {}, l = {303}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3, reason: invalid class name */
    static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<ParsedNexusEvent> realTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
                final Flow<Object> flow = new Flow<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        if (obj instanceof ParsedNexusEvent.ConversationNexusEvent) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }
                };
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                this.label = 1;
                if (FlowKt.collectLatest(FlowKt.filterNotNull(FlowKt.flowCombine(new Flow<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ ConversationViewModel this$0;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, ConversationViewModel conversationViewModel) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = conversationViewModel;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) obj;
                                        if (!Intrinsics.areEqual(conversationNexusEvent.getConversationId(), ((ConversationClientState) this.this$0.clientState.getValue()).getConversationId()) && (conversationNexusEvent instanceof ParsedNexusEvent.ConversationNexusEvent.NewComment)) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ParsedNexusEvent.ConversationNexusEvent> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, conversationViewModel), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }
                }, ConversationViewModel.this.resumedState, new AnonymousClass2(null))), new C01243(ConversationViewModel.this, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: ConversationViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u00042\u0015\u0010\u0005\u001a\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u00042\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "Lkotlin/ParameterName;", "name", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "nexusEvent", "resumed", "", "b"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$2", f = "ConversationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function3<ParsedNexusEvent.ConversationNexusEvent, Boolean, Continuation<? super ParsedNexusEvent.ConversationNexusEvent>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
            }

            public final Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, boolean z, Continuation<? super ParsedNexusEvent.ConversationNexusEvent> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = conversationNexusEvent;
                anonymousClass2.Z$0 = z;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, Boolean bool, Continuation<? super ParsedNexusEvent.ConversationNexusEvent> continuation) {
                return invoke(conversationNexusEvent, bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) this.L$0;
                if (this.Z$0) {
                    return conversationNexusEvent;
                }
                return null;
            }
        }

        /* compiled from: ConversationViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012$\u0010\u0002\u001a 0\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007H\n"}, d2 = {"<anonymous>", "", "it", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "Lkotlin/ParameterName;", "name", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$3", f = "ConversationViewModel.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$3$3, reason: invalid class name and collision with other inner class name */
        static final class C01243 extends SuspendLambda implements Function2<ParsedNexusEvent.ConversationNexusEvent, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ConversationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01243(ConversationViewModel conversationViewModel, Continuation<? super C01243> continuation) {
                super(2, continuation);
                this.this$0 = conversationViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01243(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, Continuation<? super Unit> continuation) {
                return ((C01243) create(conversationNexusEvent, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.refreshUnreadConversationsCountUseCase.invoke(this.this$0.clientState, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$4", f = "ConversationViewModel.kt", i = {}, l = {312}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4, reason: invalid class name */
    static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new AnonymousClass4(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow<ParsedNexusEvent> realTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
                Flow<Object> flow = new Flow<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$4$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        if (obj instanceof ParsedNexusEvent.NexusConnected) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }
                };
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                this.label = 1;
                if (flow.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel.4.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ParsedNexusEvent.NexusConnected) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ParsedNexusEvent.NexusConnected nexusConnected, Continuation<? super Unit> continuation) {
                        ConversationViewModel.this.twig.d("Nexus connected", new Object[0]);
                        Object invoke = ConversationViewModel.this.refreshConversationUseCase.invoke(ConversationViewModel.this.clientState, GetConversationReason.NEXUS_CONNECTED, continuation);
                        return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$5", f = "ConversationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5, reason: invalid class name */
    static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new AnonymousClass5(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final Flow<ParsedNexusEvent> realTimeEvents = ConversationViewModel.this.conversationRepository.realTimeEvents();
            final Flow<Object> flow = new Flow<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (obj instanceof ParsedNexusEvent.ConversationNexusEvent) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(continuation);
                        Object obj22 = anonymousClass1.result;
                        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }
            };
            FlowKt.filterNotNull(FlowKt.flowCombine(new Flow<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filter$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (((ParsedNexusEvent.ConversationNexusEvent) obj).getEventType() == NexusEventType.NewComment) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(continuation);
                        Object obj22 = anonymousClass1.result;
                        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super ParsedNexusEvent.ConversationNexusEvent> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }
            }, ConversationViewModel.this.resumedState, new AnonymousClass2(null)));
            return Unit.INSTANCE;
        }

        /* compiled from: ConversationViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u0013\u0018\u00010\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u00042\u0015\u0010\u0005\u001a\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u00042\u0015\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "Lio/intercom/android/sdk/m5/conversation/data/ParsedNexusEvent$ConversationNexusEvent;", "Lkotlin/ParameterName;", "name", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "nexusEvent", "resumed", "", "b"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$2", f = "ConversationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$5$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function3<ParsedNexusEvent.ConversationNexusEvent, Boolean, Continuation<? super ParsedNexusEvent.ConversationNexusEvent>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ boolean Z$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(3, continuation);
            }

            public final Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, boolean z, Continuation<? super ParsedNexusEvent.ConversationNexusEvent> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = conversationNexusEvent;
                anonymousClass2.Z$0 = z;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, Boolean bool, Continuation<? super ParsedNexusEvent.ConversationNexusEvent> continuation) {
                return invoke(conversationNexusEvent, bool.booleanValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent = (ParsedNexusEvent.ConversationNexusEvent) this.L$0;
                if (this.Z$0) {
                    return conversationNexusEvent;
                }
                return null;
            }
        }
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$6", f = "ConversationViewModel.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$6, reason: invalid class name */
    static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GetNetworkState $getNetworkState;
        int label;
        final /* synthetic */ ConversationViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(GetNetworkState getNetworkState, ConversationViewModel conversationViewModel, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.$getNetworkState = getNetworkState;
            this.this$0 = conversationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.$getNetworkState, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ConversationViewModel.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$6$1, reason: invalid class name */
        static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ ConversationViewModel this$0;

            AnonymousClass1(ConversationViewModel conversationViewModel) {
                this.this$0 = conversationViewModel;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(NetworkState networkState, Continuation<? super Unit> continuation) {
                ConversationViewModel$6$1$emit$1 conversationViewModel$6$1$emit$1;
                int i;
                AnonymousClass1<T> anonymousClass1;
                NetworkState networkState2;
                MutableStateFlow mutableStateFlow;
                Object value;
                NetworkState networkState3 = networkState;
                if (continuation instanceof ConversationViewModel$6$1$emit$1) {
                    conversationViewModel$6$1$emit$1 = (ConversationViewModel$6$1$emit$1) continuation;
                    if ((conversationViewModel$6$1$emit$1.label & Integer.MIN_VALUE) != 0) {
                        conversationViewModel$6$1$emit$1.label -= Integer.MIN_VALUE;
                        Object obj = conversationViewModel$6$1$emit$1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = conversationViewModel$6$1$emit$1.label;
                        if (i != 0) {
                            ResultKt.throwOnFailure(obj);
                            if (Intrinsics.areEqual(networkState3, NetworkState.Reconnected.INSTANCE)) {
                                OpenConversationUseCase openConversationUseCase = this.this$0.openConversationUseCase;
                                MutableStateFlow<ConversationClientState> mutableStateFlow2 = this.this$0.clientState;
                                GetConversationReason getConversationReason = GetConversationReason.NETWORK_CONNECTED;
                                conversationViewModel$6$1$emit$1.L$0 = this;
                                conversationViewModel$6$1$emit$1.L$1 = networkState3;
                                conversationViewModel$6$1$emit$1.label = 1;
                                if (openConversationUseCase.invoke(mutableStateFlow2, getConversationReason, conversationViewModel$6$1$emit$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            anonymousClass1 = this;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            networkState3 = (NetworkState) conversationViewModel$6$1$emit$1.L$1;
                            anonymousClass1 = (AnonymousClass1) conversationViewModel$6$1$emit$1.L$0;
                            ResultKt.throwOnFailure(obj);
                        }
                        networkState2 = networkState3;
                        mutableStateFlow = anonymousClass1.this$0.clientState;
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.compareAndSet(value, ConversationClientState.copy$default((ConversationClientState) value, null, null, null, null, null, null, null, null, null, networkState2, null, null, null, null, 0, 0, null, null, false, false, null, null, 4193791, null)));
                        return Unit.INSTANCE;
                    }
                }
                conversationViewModel$6$1$emit$1 = new ConversationViewModel$6$1$emit$1(this, continuation);
                Object obj2 = conversationViewModel$6$1$emit$1.result;
                Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = conversationViewModel$6$1$emit$1.label;
                if (i != 0) {
                }
                networkState2 = networkState3;
                mutableStateFlow = anonymousClass1.this$0.clientState;
                do {
                    value = mutableStateFlow.getValue();
                } while (!mutableStateFlow.compareAndSet(value, ConversationClientState.copy$default((ConversationClientState) value, null, null, null, null, null, null, null, null, null, networkState2, null, null, null, null, 0, 0, null, null, false, false, null, null, 4193791, null)));
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((NetworkState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.distinctUntilChanged(this.$getNetworkState.invoke()).collect(new AnonymousClass1(this.this$0), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7", f = "ConversationViewModel.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7, reason: invalid class name */
    static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass7(Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new AnonymousClass7(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final MutableStateFlow mutableStateFlow = ConversationViewModel.this.gifQueryStateFlow;
                final Flow<Object> flow = new Flow<Object>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        if (obj instanceof SearchQuery.Query) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }
                };
                Flow distinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.mapLatest(FlowKt.debounce(new Flow<String>() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1$2", f = "ConversationViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        String value = ((SearchQuery.Query) obj).getValue();
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(value, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }
                }, 500L), new AnonymousClass2(null)));
                final ConversationViewModel conversationViewModel = ConversationViewModel.this;
                this.label = 1;
                if (distinctUntilChanged.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel.7.3
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(String str, Continuation<? super Unit> continuation) {
                        Object invoke = ConversationViewModel.this.loadGifUseCase.invoke(ConversationViewModel.this.clientState, str, continuation);
                        return invoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? invoke : Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: ConversationViewModel.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0001¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$2", f = "ConversationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.intercom.android.sdk.m5.conversation.ConversationViewModel$7$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<String, Continuation<? super String>, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super String> continuation) {
                return ((AnonymousClass2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return StringsKt.trim((CharSequence) this.L$0).toString();
            }
        }
    }

    public final String getConversationId() {
        return this.clientState.getValue().getConversationId();
    }

    public final void onResume(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.networkConnectivityMonitor.startListening(context);
        this.soundPlayer.loadSounds(context);
        this.resumedState.setValue(true);
    }

    public final void onPause(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.networkConnectivityMonitor.stopListening(context);
        this.soundPlayer.release();
        this.resumedState.setValue(false);
        cancelVoiceRecording();
    }

    public final void onConversationScrolled(ConversationScrolledState conversationScrolledState) {
        ConversationClientState value;
        Intrinsics.checkNotNullParameter(conversationScrolledState, "conversationScrolledState");
        MutableStateFlow<ConversationClientState> mutableStateFlow = this.clientState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, conversationScrolledState.getScrolled(), false, null, null, 3932159, null)));
        this.updateFloatingIndicatorUseCase.invoke(this.clientState, conversationScrolledState);
    }

    public final void onJumpToBottomButtonClicked(int scrollToPosition, int lastSeenItemIndex) {
        ConversationClientState value;
        FloatingIndicatorState floatingIndicatorState = this.clientState.getValue().getFloatingIndicatorState();
        if (floatingIndicatorState instanceof FloatingIndicatorState.JumpToBottomIndicator) {
            MutableStateFlow<ConversationClientState> mutableStateFlow = this.clientState;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, ((FloatingIndicatorState.JumpToBottomIndicator) floatingIndicatorState).copy(new JumpToBottomButtonState(0, scrollToPosition, lastSeenItemIndex)), null, false, false, null, null, 4128767, null)));
        }
    }

    public final void sendMessage(String messageText, boolean arePushNotificationsEnabled) {
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$sendMessage$1(this, messageText, null), 2, null);
        this.pushNotificationsBannerUseCase.invoke(this.clientState, arePushNotificationsEnabled);
    }

    public final void onSuggestionClick(ReplySuggestion suggestion) {
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$onSuggestionClick$1(this, suggestion, null), 2, null);
    }

    public final void onReplyOptionClicked(ReplyOption replyOption) {
        Intrinsics.checkNotNullParameter(replyOption, "replyOption");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$onReplyOptionClicked$1(this, replyOption, null), 2, null);
    }

    public final void onInputChange(ComposerInputType inputType) {
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$onInputChange$1(this, inputType, null), 2, null);
    }

    @Deprecated(message = "Use trackMetric instead")
    public final void trackClickedInput(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        MetricTracker metricTracker = this.metricTracker;
        String conversationId = this.clientState.getValue().getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        metricTracker.clickedInput(conversationId, input);
    }

    public final void trackMetric(MetricData metricData) {
        Intrinsics.checkNotNullParameter(metricData, "metricData");
        if (metricData instanceof MetricData.MoreMenuClicked) {
            this.metricTracker.moreMenuClicked(getConversationContext());
            return;
        }
        if (metricData instanceof MetricData.ConversationsInMoreMenuClicked) {
            this.metricTracker.conversationsInMoreMenuClicked(((MetricData.ConversationsInMoreMenuClicked) metricData).isMoreMenuContext() ? "more_menu" : getConversationContext());
            return;
        }
        if (metricData instanceof MetricData.NewConversationInMoreMenuClicked) {
            this.metricTracker.newConversationInMoreMenuClicked(((MetricData.NewConversationInMoreMenuClicked) metricData).isMoreMenuContext() ? "more_menu" : getConversationContext());
            return;
        }
        if (metricData instanceof MetricData.TicketsInMoreMenuClicked) {
            this.metricTracker.ticketsInMoreMenuClicked(((MetricData.TicketsInMoreMenuClicked) metricData).isMoreMenuContext() ? "more_menu" : getConversationContext());
            return;
        }
        if (Intrinsics.areEqual(metricData, MetricData.HelpInMoreMenuClicked.INSTANCE)) {
            this.metricTracker.helpInMoreMenuClicked(getConversationContext());
            return;
        }
        if (Intrinsics.areEqual(metricData, MetricData.PoweredByClicked.INSTANCE)) {
            this.metricTracker.clickedPoweredBy("conversation");
            return;
        }
        if (!(metricData instanceof MetricData.ComposerInputClicked)) {
            throw new NoWhenBranchMatchedException();
        }
        MetricTracker metricTracker = this.metricTracker;
        String conversationId = this.clientState.getValue().getConversationId();
        if (conversationId == null) {
            conversationId = "";
        }
        metricTracker.clickedInput(conversationId, ((MetricData.ComposerInputClicked) metricData).getInput());
    }

    private final String getConversationContext() {
        if (this.clientState.getValue().getConversationId() == null) {
            return "new_conversation";
        }
        return MetricTracker.Context.EXISTING_CONVERSATION;
    }

    private final void sendGif(MediaData.Gif mediaData) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$sendGif$1(this, mediaData, null), 2, null);
    }

    public final void loadGifs() {
        ConversationClientState value;
        MutableStateFlow<ConversationClientState> mutableStateFlow = this.clientState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, new BottomSheetState.GifSearch(CollectionsKt.emptyList()), null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194271, null)));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$loadGifs$2(this, null), 2, null);
    }

    public final void onGifSearchQueryChange(String searchQuery) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.gifQueryStateFlow.setValue(new SearchQuery.Query(searchQuery));
    }

    public final void onRetryClick() {
        ConversationClientState value;
        MutableStateFlow<ConversationClientState> mutableStateFlow = this.clientState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194175, null)));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$onRetryClick$2(this, null), 2, null);
    }

    public final void onSubmitAttribute(Attribute attribute, String partId) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(partId, "partId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$onSubmitAttribute$1(this, attribute, partId, null), 2, null);
    }

    private final void sendMedia(MediaData.Media mediaData) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$sendMedia$1(this, mediaData, null), 2, null);
    }

    public final void updateBottomSheet(BottomSheetState bottomSheetState) {
        BottomSheetState bottomSheetState2 = bottomSheetState;
        Intrinsics.checkNotNullParameter(bottomSheetState2, "bottomSheetState");
        MutableStateFlow<ConversationClientState> mutableStateFlow = this.clientState;
        while (true) {
            ConversationClientState value = mutableStateFlow.getValue();
            MutableStateFlow<ConversationClientState> mutableStateFlow2 = mutableStateFlow;
            if (mutableStateFlow2.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, bottomSheetState2, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194271, null))) {
                return;
            }
            bottomSheetState2 = bottomSheetState;
            mutableStateFlow = mutableStateFlow2;
        }
    }

    public final void sendAfterPreview(MediaData mediaData) {
        Intrinsics.checkNotNullParameter(mediaData, "mediaData");
        if (mediaData instanceof MediaData.Media) {
            sendMedia((MediaData.Media) mediaData);
        } else {
            if (!(mediaData instanceof MediaData.Gif)) {
                throw new NoWhenBranchMatchedException();
            }
            sendGif((MediaData.Gif) mediaData);
        }
    }

    public final void onRetryMessageClicked(Part part) {
        Intrinsics.checkNotNullParameter(part, "part");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$onRetryMessageClicked$1(this, part, null), 2, null);
    }

    public final void onRetryMediaClicked(PendingMessage.FailedImageUploadData failedImageUploadData) {
        Intrinsics.checkNotNullParameter(failedImageUploadData, "failedImageUploadData");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$onRetryMediaClicked$1(this, failedImageUploadData, null), 2, null);
    }

    public final void onTyping() {
        String conversationId = this.clientState.getValue().getConversationId();
        if (conversationId != null) {
            this.conversationRepository.nexusEventsRepository().userTyping(conversationId);
        }
    }

    public final void onNetworkMessageDismissed() {
        ConversationClientState value;
        if (Intrinsics.areEqual(this.clientState.getValue().getNetworkState(), NetworkState.Reconnected.INSTANCE)) {
            MutableStateFlow<ConversationClientState> mutableStateFlow = this.clientState;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, NetworkState.Connected.INSTANCE, null, null, null, null, 0, 0, null, null, false, false, null, null, 4193791, null)));
        }
    }

    private final void loadConversation() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$loadConversation$1(this, null), 2, null);
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        super.onCleared();
        CoroutineScopeKt.cancel$default(this.nexusCoroutineScope, null, 1, null);
        CoroutineScopeKt.cancel$default(this.audioAmplitudeCoroutineScope, null, 1, null);
        this.audioRecordingManager.dispose();
    }

    public final void onPrivacyNoticeDismissed() {
        ConversationClientState value;
        MutableStateFlow<ConversationClientState> mutableStateFlow = this.clientState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, false, true, null, null, 3670015, null)));
        this.conversationRepository.dismissPrivacyPolicy();
    }

    public final void onReportAiAnswer() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$onReportAiAnswer$1(this, null), 2, null);
    }

    public final void updateTranscribedText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$updateTranscribedText$1(this, text, null), 2, null);
    }

    public final void updatePushNotificationsBanner(boolean dismissed, boolean arePushNotificationsEnabled) {
        this.intercomDataLayer.updatePushNotificationsBannerDismissed(dismissed);
        this.pushNotificationsBannerUseCase.invoke(this.clientState, arePushNotificationsEnabled);
    }

    public final void startVoiceRecording() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$startVoiceRecording$1(this, null), 2, null);
    }

    public final void stopVoiceRecordingAndTranscribe() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$stopVoiceRecordingAndTranscribe$1(this, null), 2, null);
    }

    public final void cancelVoiceRecording() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ConversationViewModel$cancelVoiceRecording$1(this, null), 2, null);
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000*\u0001\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eJ1\u0010\u000f\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/ConversationViewModel$Companion;", "", "<init>", "()V", "create", "Lio/intercom/android/sdk/m5/conversation/ConversationViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "conversationId", "", "initialMessage", "articleMetadata", "Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;", "launchMode", "Lio/intercom/android/sdk/m5/conversation/states/LaunchMode;", "factory", "io/intercom/android/sdk/m5/conversation/ConversationViewModel$Companion$factory$1", "(Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/articles/ArticleMetadata;Lio/intercom/android/sdk/m5/conversation/states/LaunchMode;)Lio/intercom/android/sdk/m5/conversation/ConversationViewModel$Companion$factory$1;", "DEBOUNCE_DELAY_MS", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ConversationViewModel create$default(Companion companion, ViewModelStoreOwner viewModelStoreOwner, String str, String str2, ArticleMetadata articleMetadata, LaunchMode launchMode, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = "";
            }
            String str3 = str2;
            if ((i & 8) != 0) {
                articleMetadata = null;
            }
            return companion.create(viewModelStoreOwner, str, str3, articleMetadata, launchMode);
        }

        public final ConversationViewModel create(ViewModelStoreOwner owner, String conversationId, String initialMessage, ArticleMetadata articleMetadata, LaunchMode launchMode) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(initialMessage, "initialMessage");
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            return (ConversationViewModel) new ViewModelProvider(owner, factory(conversationId, initialMessage, articleMetadata, launchMode)).get(ConversationViewModel.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.m5.conversation.ConversationViewModel$Companion$factory$1] */
        private final ConversationViewModel$Companion$factory$1 factory(final String conversationId, final String initialMessage, final ArticleMetadata articleMetadata, final LaunchMode launchMode) {
            return new ViewModelProvider.Factory() { // from class: io.intercom.android.sdk.m5.conversation.ConversationViewModel$Companion$factory$1
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new ConversationViewModel(conversationId, launchMode, articleMetadata, initialMessage, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16, 127, null);
                }
            };
        }
    }
}
