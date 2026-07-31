package io.intercom.android.sdk.tickets.create.reducers;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.FormField;
import io.intercom.android.sdk.blocks.lib.models.ListOption;
import io.intercom.android.sdk.blocks.lib.models.Options;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CreateTicketReducer.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0000\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u001a\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\u000f"}, d2 = {"convertToTicketFormUiState", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "ticketData", "Lio/intercom/android/sdk/blocks/lib/models/TicketTypeV2;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", "config", "Lio/intercom/android/sdk/identity/AppConfig;", "currentState", "getPlaceholderText", "", "type", "", "getInputType", "Lio/intercom/android/sdk/survey/model/SurveyData$Step$Question$QuestionValidation$ValidationType;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CreateTicketReducerKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00fc, code lost:
    
        if (r10.equals("integer") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x031d, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x032a, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5.getIdentifier(), "multiline") == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x032c, code lost:
    
        r9 = new io.intercom.android.sdk.survey.QuestionState(new io.intercom.android.sdk.survey.model.SurveyData.Step.Question.LongTextQuestionModel(r5.getId(), kotlin.collections.CollectionsKt.listOf(new io.intercom.android.sdk.blocks.lib.models.Block.Builder().withType(io.intercom.android.sdk.blocks.lib.BlockType.PARAGRAPH.getSerializedName()).withText(r5.getName())), r5.getRequired(), null, getInputType(r5.getType()), null, androidx.compose.ui.unit.Dp.m8401constructorimpl(androidx.compose.material.MenuKt.InTransitionDuration), 0, java.lang.Integer.valueOf(r6), androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_HD, null), io.intercom.android.sdk.survey.SurveyViewModelKt.toSurveyUiColors(new io.intercom.android.sdk.survey.model.SurveyCustomization(null, null, 3, null)));
        r10 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x03d9, code lost:
    
        r7.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0386, code lost:
    
        r10 = 3;
        r9 = new io.intercom.android.sdk.survey.QuestionState(new io.intercom.android.sdk.survey.model.SurveyData.Step.Question.ShortTextQuestionModel(r5.getId(), kotlin.collections.CollectionsKt.listOf(new io.intercom.android.sdk.blocks.lib.models.Block.Builder().withType(io.intercom.android.sdk.blocks.lib.BlockType.PARAGRAPH.getSerializedName()).withText(r5.getName())), r5.getRequired(), null, getInputType(r5.getType()), null, false, java.lang.Integer.valueOf(r6), null, 328, null), io.intercom.android.sdk.survey.SurveyViewModelKt.toSurveyUiColors(new io.intercom.android.sdk.survey.model.SurveyCustomization(null, null, 3, null)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x014d, code lost:
    
        if (r10.equals("float") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0318, code lost:
    
        if (r10.equals(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING) == false) goto L85;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CreateTicketViewModel.CreateTicketFormUiState convertToTicketFormUiState(TicketTypeV2 ticketData, UserIdentity userIdentity, AppConfig config, CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState) {
        Object obj;
        ArrayList emptyList;
        Options options;
        List<ListOption> listOptions;
        Object obj2;
        List<ListOption> listOptions2;
        int i;
        int i2;
        StringProvider.StringRes stringRes;
        Intrinsics.checkNotNullParameter(ticketData, "ticketData");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(config, "config");
        ArrayList arrayList = new ArrayList();
        List<QuestionState> questions = createTicketFormUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Content ? ((CreateTicketViewModel.CreateTicketFormUiState.Content) createTicketFormUiState).getQuestions() : CollectionsKt.emptyList();
        String email = userIdentity.getEmail();
        Intrinsics.checkNotNullExpressionValue(email, "getEmail(...)");
        int i3 = 3;
        if (!StringsKt.isBlank(email)) {
            QuestionState questionState = new QuestionState(new SurveyData.Step.Question.ShortTextQuestionModel(CreateTicketViewModelKt.EmailId, CollectionsKt.emptyList(), true, null, SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL, null, false, Integer.valueOf(R.string.intercom_placeholder_email_input), Integer.valueOf(R.string.intercom_get_notified_by_email), 8, null), SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)));
            String email2 = userIdentity.getEmail();
            Intrinsics.checkNotNullExpressionValue(email2, "getEmail(...)");
            questionState.setAnswer(new Answer.SingleAnswer(email2));
            arrayList.add(questionState);
        }
        for (FormField formField : ticketData.getFormFields()) {
            int placeholderText = getPlaceholderText(formField.getType());
            Iterator<T> it = questions.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((QuestionState) obj).getQuestionModel().getId(), formField.getId())) {
                    }
                } else {
                    obj = null;
                }
            }
            QuestionState questionState2 = (QuestionState) obj;
            if (questionState2 == null || Intrinsics.areEqual(formField.getType(), AttributeType.LIST)) {
                String type = formField.getType();
                switch (type.hashCode()) {
                    case -891985903:
                        break;
                    case 3322014:
                        if (type.equals(AttributeType.LIST)) {
                            ArrayList arrayList2 = arrayList;
                            String id = formField.getId();
                            List listOf = CollectionsKt.listOf(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(formField.getName()));
                            boolean required = formField.getRequired();
                            Options options2 = formField.getOptions();
                            if (options2 == null || (listOptions2 = options2.getListOptions()) == null) {
                                emptyList = CollectionsKt.emptyList();
                            } else {
                                List<ListOption> list = listOptions2;
                                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                Iterator<T> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(((ListOption) it2.next()).getLabel());
                                }
                                emptyList = arrayList3;
                            }
                            QuestionState questionState3 = new QuestionState(new SurveyData.Step.Question.DropDownQuestionModel(id, listOf, required, emptyList, null, Integer.valueOf(placeholderText), 16, null), SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)));
                            if (formField.getValue() != null && (options = formField.getOptions()) != null && (listOptions = options.getListOptions()) != null) {
                                Iterator<T> it3 = listOptions.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj2 = it3.next();
                                        if (Intrinsics.areEqual(((ListOption) obj2).getId(), formField.getValue())) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                ListOption listOption = (ListOption) obj2;
                                if (listOption != null) {
                                    questionState3.setAnswer(new Answer.SingleAnswer(listOption.getLabel()));
                                }
                            }
                            arrayList2.add(questionState3);
                        }
                        i = 3;
                        break;
                    case 64711720:
                        if (type.equals("boolean")) {
                            arrayList.add(new QuestionState(new SurveyData.Step.Question.SingleChoiceQuestionModel(formField.getId(), CollectionsKt.listOf(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(formField.getName())), formField.getRequired(), CollectionsKt.listOf((Object[]) new String[]{"True", "False"}), false), SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null))));
                        }
                        i = 3;
                        break;
                    case 97434231:
                        if (type.equals("files")) {
                            ArrayList arrayList4 = arrayList;
                            String id2 = formField.getId();
                            List listOf2 = CollectionsKt.listOf(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(formField.getName()));
                            if (Intrinsics.areEqual(formField.getIdentifier(), "single")) {
                                i2 = 1;
                                stringRes = new StringProvider.ActualString("");
                            } else {
                                i2 = 1;
                                stringRes = new StringProvider.StringRes(R.string.intercom_file_max_limit, CollectionsKt.listOf(TuplesKt.to("limit", "10")));
                            }
                            arrayList4.add(new QuestionState(new SurveyData.Step.Question.UploadFileQuestionModel(id2, listOf2, stringRes, formField.getRequired(), Intrinsics.areEqual(formField.getIdentifier(), "single") ? i2 : 10, config.getAttachmentSettings().getTrustedFileExtensions()), SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null))));
                            i = 3;
                            break;
                        }
                        break;
                    case 97526364:
                        break;
                    case 1793702779:
                        if (type.equals("datetime")) {
                            arrayList.add(new QuestionState(new SurveyData.Step.Question.DatePickerQuestionModel(formField.getId(), CollectionsKt.listOf(new Block.Builder().withType(BlockType.PARAGRAPH.getSerializedName()).withText(formField.getName())), formField.getRequired()), SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, i3, null))));
                            break;
                        }
                        break;
                    case 1958052158:
                        break;
                }
                i3 = i;
            } else {
                arrayList.add(questionState2);
            }
            i = i3;
            i3 = i;
        }
        return new CreateTicketViewModel.CreateTicketFormUiState.Content(ticketData.getName(), arrayList, false, false, 12, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final int getPlaceholderText(String str) {
        switch (str.hashCode()) {
            case 3322014:
                if (str.equals(AttributeType.LIST)) {
                    return R.string.intercom_please_select;
                }
                break;
            case 96619420:
                if (str.equals("email")) {
                    return R.string.intercom_placeholder_email_input;
                }
                break;
            case 97526364:
                if (str.equals("float")) {
                    return R.string.intercom_placeholder_numerical_inputs;
                }
                break;
            case 1958052158:
                if (str.equals("integer")) {
                    return R.string.intercom_placeholder_numerical_inputs;
                }
                break;
        }
        return R.string.intercom_placeholder_text_inputs;
    }

    private static final SurveyData.Step.Question.QuestionValidation.ValidationType getInputType(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 96619420) {
            if (hashCode != 97526364) {
                if (hashCode == 1958052158 && str.equals("integer")) {
                    return SurveyData.Step.Question.QuestionValidation.ValidationType.INTEGER;
                }
            } else if (str.equals("float")) {
                return SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT;
            }
        } else if (str.equals("email")) {
            return SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL;
        }
        return SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT;
    }
}
