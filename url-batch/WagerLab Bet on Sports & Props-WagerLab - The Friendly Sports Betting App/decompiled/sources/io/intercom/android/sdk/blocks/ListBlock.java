package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.interfaces.OrderedListBlock;
import io.intercom.android.sdk.blocks.lib.interfaces.UnorderedListBlock;
import io.intercom.android.sdk.blocks.lib.models.BlockMetadata;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.spans.OrderedListSpan;
import io.intercom.android.sdk.spans.UnorderedListSpan;
import io.intercom.android.sdk.utilities.BlockUtils;
import io.intercom.android.sdk.utilities.TrackingLinkMovementMethod;
import io.intercom.android.sdk.utilities.commons.HtmlCompat;
import java.util.List;

/* loaded from: classes8.dex */
class ListBlock implements OrderedListBlock, UnorderedListBlock {
    private static final int LARGE_TEXT_SIZE_SP = 16;
    private static final int SMALL_TEXT_SIZE_SP = 14;
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;

    ListBlock(StyleType styleType, Provider<AppConfig> provider) {
        this.style = styleType;
        this.appConfigProvider = provider;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.OrderedListBlock
    public View addOrderedList(List<String> list, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        TextView listStyledTextView = getListStyledTextView(viewGroup.getContext(), blockMetadata);
        int dimension = (int) viewGroup.getResources().getDimension(R.dimen.intercom_list_indentation);
        int size = list.size();
        CharSequence charSequence = "";
        int i = 0;
        while (i < size) {
            String str = list.get(i);
            if (!str.isEmpty()) {
                Spanned fromHtml = HtmlCompat.fromHtml(str + (i < size + (-1) ? "<br />" : ""));
                SpannableString spannableString = new SpannableString(fromHtml);
                spannableString.setSpan(new OrderedListSpan(dimension, (i + 1) + "."), 0, fromHtml.length(), 0);
                charSequence = TextUtils.concat(charSequence, spannableString);
            }
            i++;
        }
        listStyledTextView.setText(charSequence);
        BlockUtils.setLayoutMarginsAndGravity(listStyledTextView, GravityCompat.START, blockMetadata.isLastObject());
        return listStyledTextView;
    }

    @Override // io.intercom.android.sdk.blocks.lib.interfaces.UnorderedListBlock
    public View addUnorderedList(List<String> list, BlockMetadata blockMetadata, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        TextView listStyledTextView = getListStyledTextView(context, blockMetadata);
        int dimension = (int) viewGroup.getResources().getDimension(R.dimen.intercom_list_indentation);
        int size = list.size();
        CharSequence charSequence = "";
        int i = 0;
        while (i < size) {
            String str = list.get(i);
            if (!str.isEmpty()) {
                Spanned fromHtml = HtmlCompat.fromHtml(str + (i < size + (-1) ? "<br />" : ""));
                SpannableString spannableString = new SpannableString(fromHtml);
                spannableString.setSpan(new UnorderedListSpan(dimension, context), 0, fromHtml.length(), 0);
                charSequence = TextUtils.concat(charSequence, spannableString);
            }
            i++;
        }
        listStyledTextView.setText(charSequence);
        BlockUtils.setLayoutMarginsAndGravity(listStyledTextView, GravityCompat.START, blockMetadata.isLastObject());
        return listStyledTextView;
    }

    private TextView getListStyledTextView(Context context, BlockMetadata blockMetadata) {
        TextView textView = new TextView(context);
        textView.setLinkTextColor(this.appConfigProvider.get().getPrimaryColor());
        textView.setMovementMethod(new TrackingLinkMovementMethod());
        BlockUtils.createLayoutParams(textView, -2, -2);
        BlockUtils.setMarginLeft(textView, 4);
        switch (AnonymousClass1.$SwitchMap$io$intercom$android$sdk$blocks$StyleType[this.style.ordinal()]) {
            case 1:
                styleAsChatList(textView, ContextCompat.getColor(context, R.color.intercom_grey_800));
                break;
            case 2:
            case 3:
            case 4:
                styleAsAnnouncementList(textView, ContextCompat.getColor(context, R.color.intercom_grey_700));
                break;
            case 5:
                styleAsAnnouncementList(textView, ContextCompat.getColor(context, R.color.intercom_white));
                break;
            case 6:
                styleAsChatList(textView, ContextCompat.getColor(context, R.color.intercom_grey_800));
                textView.setMovementMethod(null);
                break;
            case 7:
                textView.setTextSize(20.0f);
                String textColor = blockMetadata.getAppearance().getTextColor();
                if (!textColor.isEmpty()) {
                    int parseColor = Color.parseColor(textColor);
                    textView.setTextColor(parseColor);
                    textView.setLinkTextColor(parseColor);
                    break;
                }
                break;
            default:
                styleAsChatList(textView, ContextCompat.getColor(context, R.color.intercom_white));
                break;
        }
        return textView;
    }

    /* renamed from: io.intercom.android.sdk.blocks.ListBlock$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$blocks$StyleType;

        static {
            int[] iArr = new int[StyleType.values().length];
            $SwitchMap$io$intercom$android$sdk$blocks$StyleType = iArr;
            try {
                iArr[StyleType.ADMIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.ARTICLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.NOTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.CONTAINER_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.POST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.CHAT_FULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$intercom$android$sdk$blocks$StyleType[StyleType.CAROUSEL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void styleAsChatList(TextView textView, int i) {
        textView.setTextSize(14.0f);
        textView.setTextColor(i);
        BlockUtils.setDefaultMarginBottom(textView);
        BlockUtils.setSmallLineSpacing(textView);
    }

    private void styleAsAnnouncementList(TextView textView, int i) {
        textView.setTextSize(16.0f);
        textView.setTextColor(i);
        BlockUtils.setMarginBottom(textView, 16);
        BlockUtils.setLargeLineSpacing(textView);
    }
}
