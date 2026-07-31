package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.VastTime;
import com.mobilefuse.videoplayer.model.utils.XmlParsingExtensionsKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.LinkedHashSet;
import java.util.List;
import javax.xml.xpath.XPath;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Node;

/* compiled from: VastDataModelFromXml.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/mobilefuse/videoplayer/model/VastLinear;", "itLinearNode", "Lorg/w3c/dom/Node;", "invoke"}, k = 3, mv = {1, 4, 3})
/* loaded from: classes9.dex */
final class VastDataModelFromXmlKt$parseAdLinear$1 extends Lambda implements Function1 {
    final /* synthetic */ XPath $xpath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VastDataModelFromXmlKt$parseAdLinear$1(XPath xPath) {
        super(1);
        this.$xpath = xPath;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final VastLinear invoke(@NotNull Node itLinearNode) {
        List parseIcons;
        Intrinsics.checkNotNullParameter(itLinearNode, "itLinearNode");
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        XmlParsingExtensionsKt.evaluateNodeOrNull(this.$xpath, "VideoClicks", itLinearNode, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdLinear$1.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Integer.valueOf(invoke((Node) obj));
            }

            public final int invoke(@NotNull Node it) {
                int addVastEvents;
                Intrinsics.checkNotNullParameter(it, "it");
                VastDataModelFromXmlKt.addVastEvents(linkedHashSet, EventType.ClickTracking, VastDataModelFromXmlKt$parseAdLinear$1.this.$xpath, it);
                addVastEvents = VastDataModelFromXmlKt.addVastEvents(linkedHashSet, EventType.CustomClick, VastDataModelFromXmlKt$parseAdLinear$1.this.$xpath, it);
                return addVastEvents;
            }
        });
        XmlParsingExtensionsKt.evaluateNodeOrNull(this.$xpath, "TrackingEvents", itLinearNode, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdLinear$1.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return Integer.valueOf(invoke((Node) obj));
            }

            public final int invoke(@NotNull Node it) {
                int addVastEvents;
                Intrinsics.checkNotNullParameter(it, "it");
                addVastEvents = VastDataModelFromXmlKt.addVastEvents(linkedHashSet, EventType.Tracking, VastDataModelFromXmlKt$parseAdLinear$1.this.$xpath, it);
                return addVastEvents;
            }
        });
        List list = (List) XmlParsingExtensionsKt.evaluateNodeOrNull(this.$xpath, "MediaFiles", itLinearNode, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdLinear$1$mediaFiles$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final List<VastMediaFile> invoke(@NotNull Node it) {
                List<VastMediaFile> parseMediaFiles;
                Intrinsics.checkNotNullParameter(it, "it");
                parseMediaFiles = VastDataModelFromXmlKt.parseMediaFiles(VastDataModelFromXmlKt$parseAdLinear$1.this.$xpath, it);
                return parseMediaFiles;
            }
        });
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        List list2 = list;
        List<VastMediaFile> verifyMediaFiles = VastDataModelExtensionsKt.verifyMediaFiles(list2);
        XmlParsingExtensionsKt.evaluateNodeOrNull(this.$xpath, k.B, itLinearNode, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdLinear$1.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final List<VastIcon> invoke(@NotNull Node it) {
                List<VastIcon> parseIcons2;
                Intrinsics.checkNotNullParameter(it, "it");
                parseIcons2 = VastDataModelFromXmlKt.parseIcons(VastDataModelFromXmlKt$parseAdLinear$1.this.$xpath, it);
                return parseIcons2;
            }
        });
        VastClickThrough vastClickThrough = (VastClickThrough) XmlParsingExtensionsKt.evaluateNodeOrNull(this.$xpath, "VideoClicks/ClickThrough", itLinearNode, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdLinear$1$clickThrough$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final VastClickThrough invoke(@NotNull Node it) {
                VastClickThrough vastClickThroughOrNull;
                Intrinsics.checkNotNullParameter(it, "it");
                vastClickThroughOrNull = VastDataModelFromXmlKt.getVastClickThroughOrNull(it);
                return vastClickThroughOrNull;
            }
        });
        VastTime.Companion companion = VastTime.INSTANCE;
        VastTime create = companion.create(XmlParsingExtensionsKt.getStringNodeAttribute(VastAttributes.SKIP_OFFSET, itLinearNode));
        VastTime create2 = companion.create(XmlParsingExtensionsKt.getStringNodeValue("Duration", this.$xpath, itLinearNode));
        parseIcons = VastDataModelFromXmlKt.parseIcons(this.$xpath, itLinearNode);
        return new VastLinear(create, create2, vastClickThrough, linkedHashSet, list2, verifyMediaFiles, parseIcons);
    }
}
