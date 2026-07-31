package io.intercom.android.sdk.m5.home.reducers;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.HeaderBackdropType;
import io.intercom.android.sdk.models.HeaderBackgroundModel;
import io.intercom.android.sdk.models.HeaderConfig;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.ColorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: HomeHeaderStateReducer.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\"\u0010\u0004\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000\u001a'\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"computeErrorHeader", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Error$ErrorHeader;", "configModules", "Lio/intercom/android/sdk/models/ConfigModules;", "computeContentHeader", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader;", "teamPresence", "Lio/intercom/android/sdk/models/TeamPresence;", "isHeaderImageLoaded", "", "getHeaderBackdropStyle", "Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "headerBackgroundModel", "Lio/intercom/android/sdk/models/HeaderBackgroundModel;", "fallbackBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "isDark", "getHeaderBackdropStyle-bw27NRU", "(Lio/intercom/android/sdk/models/HeaderBackgroundModel;JZ)Lio/intercom/android/sdk/m5/home/states/HomeUiState$Content$ContentHeader$HeaderBackdropStyle;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HomeHeaderStateReducerKt {

    /* compiled from: HomeHeaderStateReducer.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeaderBackdropType.values().length];
            try {
                iArr[HeaderBackdropType.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HeaderBackdropType.COLORS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HeaderBackdropType.IMAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final HomeUiState.Error.ErrorHeader computeErrorHeader(ConfigModules configModules) {
        if (configModules != null) {
            return new HomeUiState.Error.ErrorHeader(configModules.getCustomization().getHeader().getBackgroundColor(), configModules.getCustomization().getHeader().getForegroundColor());
        }
        return new HomeUiState.Error.ErrorHeader("#000000", "#FFFFFF");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0457 A[LOOP:0: B:24:0x0451->B:26:0x0457, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final HomeUiState.Content.ContentHeader computeContentHeader(ConfigModules configModules, TeamPresence teamPresence, boolean z) {
        Pair pair;
        HomeUiState.Content.ContentHeader.CloseButtonColor closeButtonColor;
        HomeUiState.Content.ContentHeader.CloseButtonColor closeButtonColor2;
        String logoDarkUrl;
        Intrinsics.checkNotNullParameter(teamPresence, "teamPresence");
        if (configModules != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[configModules.getHome().getHeader().getBackground().getType().ordinal()];
            if (i == 1 || i == 2) {
                pair = new Pair(new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getIntro().getText(), configModules.getHome().getHeader().getContent().getIntro().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getIntro().getColorDark(), configModules.getHome().getHeader().getContent().getIntro().getColor()), new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getGreeting().getText(), configModules.getHome().getHeader().getContent().getGreeting().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getGreeting().getColorDark(), configModules.getHome().getHeader().getContent().getGreeting().getColor()));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z) {
                    pair = new Pair(new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getIntro().getText(), configModules.getHome().getHeader().getContent().getIntro().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getIntro().getColorDark(), configModules.getHome().getHeader().getContent().getIntro().getColor()), new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getGreeting().getText(), configModules.getHome().getHeader().getContent().getGreeting().getOpacity(), configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getGreeting().getColorDark(), configModules.getHome().getHeader().getContent().getGreeting().getColor()));
                } else {
                    pair = new Pair(new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getIntro().getText(), 1.0f, configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getIntro().getColorDark(), configModules.getHome().getHeader().getContent().getIntro().getColor()), new HomeUiState.Content.ContentHeader.ColoredText(configModules.getHome().getHeader().getContent().getGreeting().getText(), 1.0f, configModules.getHome().getHeader().getContent().getTextColorType(), configModules.getHome().getHeader().getContent().getTextColorTypeDark(), configModules.getHome().getHeader().getContent().getGreeting().getColorDark(), configModules.getHome().getHeader().getContent().getGreeting().getColor()));
                }
            }
            HomeUiState.Content.ContentHeader.ColoredText coloredText = (HomeUiState.Content.ContentHeader.ColoredText) pair.component1();
            HomeUiState.Content.ContentHeader.ColoredText coloredText2 = (HomeUiState.Content.ContentHeader.ColoredText) pair.component2();
            int i2 = WhenMappings.$EnumSwitchMapping$0[configModules.getHome().getHeader().getBackground().getType().ordinal()];
            if (i2 == 1 || i2 == 2) {
                closeButtonColor = new HomeUiState.Content.ContentHeader.CloseButtonColor(configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundColor(), configModules.getHome().getHeader().getContent().getCloseButton().getForegroundColor(), coloredText.getTextColorDark(), configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundOpacity());
            } else {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z) {
                    closeButtonColor = new HomeUiState.Content.ContentHeader.CloseButtonColor(configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundColor(), configModules.getHome().getHeader().getContent().getCloseButton().getForegroundColor(), coloredText.getTextColorDark(), configModules.getHome().getHeader().getContent().getCloseButton().getBackgroundOpacity());
                } else {
                    closeButtonColor2 = new HomeUiState.Content.ContentHeader.CloseButtonColor("#000000", configModules.getCustomization().getHeader().getForegroundColor(), coloredText.getTextColorDark(), 0.5f);
                    HeaderConfig header = configModules.getHome().getHeader();
                    boolean z2 = StringsKt.isBlank(header.getContent().getLogoUrl()) || !((logoDarkUrl = header.getContent().getLogoDarkUrl()) == null || StringsKt.isBlank(logoDarkUrl));
                    String logoUrl = header.getContent().getLogoUrl();
                    String logoDarkUrl2 = header.getContent().getLogoDarkUrl();
                    HomeUiState.Content.ContentHeader.HeaderBackdropStyle m11527getHeaderBackdropStylebw27NRU = m11527getHeaderBackdropStylebw27NRU(header.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), false);
                    HomeUiState.Content.ContentHeader.HeaderBackdropStyle m11527getHeaderBackdropStylebw27NRU2 = m11527getHeaderBackdropStylebw27NRU(header.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), true);
                    boolean showAvatars = header.getContent().getShowAvatars();
                    List<Participant> take = CollectionsKt.take(teamPresence.getBuiltActiveAdmins(), 3);
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
                    for (Participant participant : take) {
                        Avatar avatar = participant.getAvatar();
                        Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                        Boolean isBot = participant.isBot();
                        Intrinsics.checkNotNullExpressionValue(isBot, "isBot(...)");
                        arrayList.add(new AvatarWrapper(avatar, isBot.booleanValue()));
                    }
                    return new HomeUiState.Content.ContentHeader(z2, logoUrl, logoDarkUrl2, coloredText2, coloredText, m11527getHeaderBackdropStylebw27NRU, m11527getHeaderBackdropStylebw27NRU2, showAvatars, arrayList, closeButtonColor2);
                }
            }
            closeButtonColor2 = closeButtonColor;
            HeaderConfig header2 = configModules.getHome().getHeader();
            if (StringsKt.isBlank(header2.getContent().getLogoUrl())) {
            }
            String logoUrl2 = header2.getContent().getLogoUrl();
            String logoDarkUrl22 = header2.getContent().getLogoDarkUrl();
            HomeUiState.Content.ContentHeader.HeaderBackdropStyle m11527getHeaderBackdropStylebw27NRU3 = m11527getHeaderBackdropStylebw27NRU(header2.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), false);
            HomeUiState.Content.ContentHeader.HeaderBackdropStyle m11527getHeaderBackdropStylebw27NRU22 = m11527getHeaderBackdropStylebw27NRU(header2.getBackground(), ColorExtensionsKt.toComposeColor$default(configModules.getCustomization().getHeader().getBackgroundColor(), 0.0f, 1, null), true);
            boolean showAvatars2 = header2.getContent().getShowAvatars();
            List<Participant> take2 = CollectionsKt.take(teamPresence.getBuiltActiveAdmins(), 3);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(take2, 10));
            while (r0.hasNext()) {
            }
            return new HomeUiState.Content.ContentHeader(z2, logoUrl2, logoDarkUrl22, coloredText2, coloredText, m11527getHeaderBackdropStylebw27NRU3, m11527getHeaderBackdropStylebw27NRU22, showAvatars2, arrayList2, closeButtonColor2);
        }
        return new HomeUiState.Content.ContentHeader(false, null, null, new HomeUiState.Content.ContentHeader.ColoredText("", 1.0f, null, null, "#FFFFFF", "#FFFFFF", 12, null), new HomeUiState.Content.ContentHeader.ColoredText("", 1.0f, null, null, "#FFFFFF", "#FFFFFF", 12, null), new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(Color.INSTANCE.m5683getBlack0d7_KjU(), false, null), null, false, CollectionsKt.emptyList(), new HomeUiState.Content.ContentHeader.CloseButtonColor("#000000", "#FFFFFF", "#FFFFFF", 0.5f), 68, null);
    }

    /* renamed from: getHeaderBackdropStyle-bw27NRU, reason: not valid java name */
    public static final HomeUiState.Content.ContentHeader.HeaderBackdropStyle m11527getHeaderBackdropStylebw27NRU(HeaderBackgroundModel headerBackgroundModel, long j, boolean z) {
        HeaderBackdropType type;
        boolean fade;
        ArrayList listOf;
        String imageUrl;
        Intrinsics.checkNotNullParameter(headerBackgroundModel, "headerBackgroundModel");
        if (z) {
            type = headerBackgroundModel.getTypeDark();
            if (type == null) {
                type = headerBackgroundModel.getType();
            }
        } else {
            type = headerBackgroundModel.getType();
        }
        if (z) {
            Boolean fadeToDark = headerBackgroundModel.getFadeToDark();
            fade = fadeToDark != null ? fadeToDark.booleanValue() : headerBackgroundModel.getFade();
        } else {
            fade = headerBackgroundModel.getFade();
        }
        boolean z2 = fade;
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            if (z) {
                String colorDark = headerBackgroundModel.getColorDark();
                if (colorDark != null) {
                    j = ColorKt.Color(ColorUtils.parseColor(colorDark));
                } else {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[headerBackgroundModel.getType().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        j = ColorKt.Color(ColorUtils.parseColor(headerBackgroundModel.getColor()));
                    } else if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            } else {
                j = ColorKt.Color(ColorUtils.parseColor(headerBackgroundModel.getColor()));
            }
            return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Solid(j, z2, null);
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                imageUrl = headerBackgroundModel.getImageDarkUrl();
                if (imageUrl == null) {
                    imageUrl = headerBackgroundModel.getImageUrl();
                }
            } else {
                imageUrl = headerBackgroundModel.getImageUrl();
            }
            return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Image(j, imageUrl, z2, null);
        }
        if (z) {
            List<String> gradientDark = headerBackgroundModel.getGradientDark();
            if (gradientDark == null) {
                List<String> gradient = headerBackgroundModel.getGradient();
                if (gradient == null) {
                    listOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m5647boximpl(j), Color.m5647boximpl(j)});
                } else {
                    List<String> list = gradient;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Color.m5647boximpl(ColorKt.Color(ColorUtils.parseColor((String) it.next()))));
                    }
                    listOf = arrayList;
                }
            } else {
                List<String> list2 = gradientDark;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Color.m5647boximpl(ColorKt.Color(ColorUtils.parseColor((String) it2.next()))));
                }
                listOf = arrayList2;
            }
        } else {
            List<String> gradient2 = headerBackgroundModel.getGradient();
            if (gradient2 == null) {
                listOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m5647boximpl(j), Color.m5647boximpl(j)});
            } else {
                List<String> list3 = gradient2;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Color.m5647boximpl(ColorKt.Color(ColorUtils.parseColor((String) it3.next()))));
                }
                listOf = arrayList3;
            }
        }
        return new HomeUiState.Content.ContentHeader.HeaderBackdropStyle.Gradient(listOf, z2);
    }
}
