package com.mobilefuse.videoplayer.model;

import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.mobilefuse.sdk.network.client.HttpClientKt;
import com.mobilefuse.sdk.network.client.HttpError;
import com.mobilefuse.sdk.network.client.HttpGetRequest;
import com.mobilefuse.sdk.network.client.HttpResponse;
import com.mobilefuse.videoplayer.model.VastTime;
import com.mobilefuse.videoplayer.model.utils.XmlParsingExtensionsKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.pubmatic.sdk.openwrap.core.POBConstants;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* compiled from: VastDataModelFromXml.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¤\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0007\u001a\u00020\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a:\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013j\u0002`\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u001c\u001a\u001c\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001e0\u00132\u0006\u0010\u001f\u001a\u00020\u001aH\u0002\u001a\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001a0\u00132\u0006\u0010!\u001a\u00020\u001aH\u0002\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u001a\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a&\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020-0#2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020/0#2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u001e\u00100\u001a\b\u0012\u0004\u0012\u0002010#2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u001e\u00102\u001a\b\u0012\u0004\u0012\u0002030#2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a\u001a\u00104\u001a\u0004\u0018\u0001052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002\u001a@\u00106\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013j\u0002`\u0016*\u0002072\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0\u001cH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006*\"\u00108\"\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00132\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¨\u00069"}, d2 = {"VAST_MAX_REDIRECTS_COUNT", "", "vastClickThroughOrNull", "Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "Lorg/w3c/dom/Node;", "getVastClickThroughOrNull", "(Lorg/w3c/dom/Node;)Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "addVastEvents", "events", "", "Lcom/mobilefuse/videoplayer/model/VastEvent;", "eventType", "Lcom/mobilefuse/videoplayer/model/EventType;", "xpath", "Ljavax/xml/xpath/XPath;", "rootNode", "createVastAdFromXml", "Lcom/mobilefuse/videoplayer/model/VastAd;", "createVastModelFromXml", "Lcom/mobilefuse/sdk/exception/Either;", "Lcom/mobilefuse/videoplayer/model/VastError;", "Lcom/mobilefuse/videoplayer/model/VastModel;", "Lcom/mobilefuse/videoplayer/model/VastLoadResult;", "context", "Landroid/content/Context;", "adm", "", "macroProcessorFn", "Lkotlin/Function1;", "createVastTagFromXml", "Lcom/mobilefuse/videoplayer/model/VastTag;", "xml", "loadWrapperVast", "url", "parseAdCompanions", "", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "parseAdLinear", "Lcom/mobilefuse/videoplayer/model/VastLinear;", "parseAdVerifications", "", "list", "", "Lcom/mobilefuse/videoplayer/model/VastVerification;", "parseCreatives", "Lcom/mobilefuse/videoplayer/model/VastCreative;", "parseIcons", "Lcom/mobilefuse/videoplayer/model/VastIcon;", "parseMediaFiles", "Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "parseUniversalAdIdList", "Lcom/mobilefuse/videoplayer/model/VastUniversalAdId;", "parseVastResource", "Lcom/mobilefuse/videoplayer/model/VastBaseResource;", "parseVastXml", "Lcom/mobilefuse/videoplayer/model/VastXmlParser;", "VastLoadResult", "mobilefuse-video-player_release"}, k = 2, mv = {1, 4, 3})
/* loaded from: classes9.dex */
public final class VastDataModelFromXmlKt {
    public static final int VAST_MAX_REDIRECTS_COUNT = 10;

    @NotNull
    public static final Either<VastError, VastModel> createVastModelFromXml(@NotNull Context context, @NotNull String adm, @NotNull Function1 macroProcessorFn) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(macroProcessorFn, "macroProcessorFn");
        return parseVastXml(new VastXmlParser(), context, adm, macroProcessorFn);
    }

    private static final Either<VastError, VastModel> parseVastXml(VastXmlParser vastXmlParser, Context context, String str, Function1 function1) {
        Either createVastTagFromXml = createVastTagFromXml(str);
        if (createVastTagFromXml instanceof ErrorResult) {
            return createVastTagFromXml;
        }
        if (createVastTagFromXml != null) {
            VastTag vastTag = (VastTag) ((SuccessResult) createVastTagFromXml).getValue();
            vastXmlParser.getVastTagChain().add(vastTag);
            VastAd firstAd = VastDataModelExtensionsKt.getFirstAd(vastTag);
            VastAdContent content = firstAd != null ? firstAd.getContent() : null;
            if (content instanceof VastWrapper) {
                String vastAdTagUri = ((VastWrapper) content).getVastAdTagUri();
                if (vastAdTagUri != null && vastXmlParser.getVastTagChain().size() < 10) {
                    String str2 = (String) function1.invoke(vastAdTagUri);
                    HttpRequestTracker.logHttpRequest(str2);
                    Either<VastError, String> loadWrapperVast = loadWrapperVast(str2);
                    if (loadWrapperVast instanceof ErrorResult) {
                        return new ErrorResult(VastError.URI_UNAVAILABLE_OR_TIMEOUT);
                    }
                    if (loadWrapperVast instanceof SuccessResult) {
                        return parseVastXml(vastXmlParser, context, (String) ((SuccessResult) loadWrapperVast).getValue(), function1);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return new ErrorResult(VastError.WRAPPER_LIMIT_REACHED);
            }
            VastModel vastModel = new VastModel(CollectionsKt.reversed(vastXmlParser.getVastTagChain()));
            if (VastDataModelExtensionsKt.getHasAdContentToPlay(vastModel)) {
                return new SuccessResult(vastModel);
            }
            return new ErrorResult(VastError.NO_VAST_RESPONSE);
        }
        throw new NullPointerException("null cannot be cast to non-null type com.mobilefuse.sdk.exception.SuccessResult<com.mobilefuse.videoplayer.model.VastTag>");
    }

    private static final Either<VastError, VastTag> createVastTagFromXml(String str) {
        try {
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(str)));
            Intrinsics.checkNotNullExpressionValue(parse, "factory.newDocumentBuild…ource(StringReader(xml)))");
            final XPath xpath = XPathFactory.newInstance().newXPath();
            try {
                final LinkedHashSet linkedHashSet = new LinkedHashSet();
                Intrinsics.checkNotNullExpressionValue(xpath, "xpath");
                Node node = (Node) XmlParsingExtensionsKt.evaluateNodeOrNull(xpath, "/VAST", parse, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$createVastTagFromXml$rootNode$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final Node invoke(@NotNull Node it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Set set = linkedHashSet;
                        EventType eventType = EventType.Error;
                        XPath xpath2 = xpath;
                        Intrinsics.checkNotNullExpressionValue(xpath2, "xpath");
                        VastDataModelFromXmlKt.addVastEvents(set, eventType, xpath2, it);
                        return it;
                    }
                });
                if (node == null) {
                    return new ErrorResult(VastError.XML_PARSING_FAILED);
                }
                String stringNodeAttribute = XmlParsingExtensionsKt.getStringNodeAttribute("version", node);
                final ArrayList arrayList = new ArrayList();
                if (((Unit) XmlParsingExtensionsKt.evaluateNodesOrNull(xpath, "/VAST/Ad", parse, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$createVastTagFromXml$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((NodeList) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull NodeList itNodes) {
                        VastAd createVastAdFromXml;
                        Intrinsics.checkNotNullParameter(itNodes, "itNodes");
                        int length = itNodes.getLength();
                        for (int i = 0; i < length; i++) {
                            Node item = itNodes.item(i);
                            if (item != null) {
                                XPath xpath2 = xpath;
                                Intrinsics.checkNotNullExpressionValue(xpath2, "xpath");
                                createVastAdFromXml = VastDataModelFromXmlKt.createVastAdFromXml(xpath2, item);
                                if (createVastAdFromXml != null) {
                                    arrayList.add(createVastAdFromXml);
                                }
                            }
                        }
                    }
                })) == null) {
                    return new ErrorResult(VastError.XML_PARSING_FAILED);
                }
                return new SuccessResult(new VastTag(stringNodeAttribute, linkedHashSet, arrayList));
            } catch (Throwable th) {
                StabilityHelper.logException("createVastTagFromXml", th);
                return new ErrorResult(VastError.XML_PARSING_FAILED);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ErrorResult(VastError.XML_PARSING_FAILED);
        }
    }

    private static final Either<VastError, String> loadWrapperVast(String str) {
        Either<HttpError, HttpResponse> sync = HttpClientKt.getDefaultHttpClient().getSync(new HttpGetRequest(str, MapsKt.emptyMap(), false, false, 10000L, 8, null));
        if (sync instanceof SuccessResult) {
            return new SuccessResult(((HttpResponse) ((SuccessResult) sync).getValue()).getBody());
        }
        if (sync instanceof ErrorResult) {
            return new ErrorResult(VastError.URI_UNAVAILABLE_OR_TIMEOUT);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VastAd createVastAdFromXml(final XPath xPath, Node node) {
        Node node2 = (Node) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, "Wrapper", node, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$createVastAdFromXml$wrapperNode$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Node invoke(@NotNull Node it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        });
        Node node3 = (Node) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, "InLine", node, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$createVastAdFromXml$inlineNode$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final Node invoke(@NotNull Node it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it;
            }
        });
        if (node2 != null) {
            node3 = node2;
        }
        if (node3 == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addVastEvents(linkedHashSet, EventType.Impression, xPath, node3);
        addVastEvents(linkedHashSet, EventType.Error, xPath, node3);
        List list = (List) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, "Creatives", node3, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$createVastAdFromXml$creativesList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final List<VastCreative> invoke(@NotNull Node it) {
                List<VastCreative> parseCreatives;
                Intrinsics.checkNotNullParameter(it, "it");
                parseCreatives = VastDataModelFromXmlKt.parseCreatives(xPath, it);
                return parseCreatives;
            }
        });
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        final ArrayList arrayList = new ArrayList();
        XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, "AdVerifications|Extensions/Extension[@type='AdVerifications']/AdVerifications", node3, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$createVastAdFromXml$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((NodeList) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull NodeList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                int length = it.getLength();
                for (int i = 0; i < length; i++) {
                    List list2 = arrayList;
                    XPath xPath2 = xPath;
                    Node item = it.item(i);
                    Intrinsics.checkNotNullExpressionValue(item, "it.item(i)");
                    VastDataModelFromXmlKt.parseAdVerifications(list2, xPath2, item);
                }
            }
        });
        VastAdContent vastInline = new VastInline(XmlParsingExtensionsKt.getStringNodeValue("AdSystem", xPath, node3), XmlParsingExtensionsKt.getStringNodeValue(k.i, xPath, node3), XmlParsingExtensionsKt.getStringNodeValue("AdServingId", xPath, node3), XmlParsingExtensionsKt.getStringNodeValue(k.j, xPath, node3), XmlParsingExtensionsKt.getStringNodeValue(k.k, xPath, node3), linkedHashSet, list, arrayList);
        if (node2 != null) {
            vastInline = new VastWrapper(vastInline, XmlParsingExtensionsKt.getBoolNodeAttribute(VastAttributes.FOLLOW_ADDITIONAL_WRAPPERS, node3), XmlParsingExtensionsKt.getBoolNodeAttribute(VastAttributes.ALLOW_MULTIPLE_ADS, node3), XmlParsingExtensionsKt.getBoolNodeAttribute(VastAttributes.FALLBACK_ON_NO_AD, node3), (String) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, "VASTAdTagURI", node3, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$createVastAdFromXml$vastWrapper$1
                @Override // kotlin.jvm.functions.Function1
                @Nullable
                public final String invoke(@NotNull Node it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return XmlParsingExtensionsKt.getElementValue(it);
                }
            }));
        }
        String stringNodeAttribute = XmlParsingExtensionsKt.getStringNodeAttribute("id", node);
        Integer intNodeAttribute = XmlParsingExtensionsKt.getIntNodeAttribute("sequence", node);
        String stringNodeAttribute2 = XmlParsingExtensionsKt.getStringNodeAttribute("adType", node);
        if (stringNodeAttribute2 == null) {
            stringNodeAttribute2 = "video";
        }
        return new VastAd(stringNodeAttribute, intNodeAttribute, stringNodeAttribute2, vastInline);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<VastCreative> parseCreatives(final XPath xPath, Node node) {
        final ArrayList arrayList = new ArrayList();
        XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, "Creative", node, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseCreatives$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((NodeList) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull NodeList itNodes) {
                List parseUniversalAdIdList;
                VastLinear parseAdLinear;
                List parseAdCompanions;
                Intrinsics.checkNotNullParameter(itNodes, "itNodes");
                int length = itNodes.getLength();
                for (int i = 0; i < length; i++) {
                    Node node2 = itNodes.item(i);
                    XPath xPath2 = xPath;
                    Intrinsics.checkNotNullExpressionValue(node2, "node");
                    String str = (String) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath2, "CompanionAds", node2, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseCreatives$1$companionAdsRequiredMode$1
                        @Override // kotlin.jvm.functions.Function1
                        @Nullable
                        public final String invoke(@NotNull Node itRequired) {
                            Intrinsics.checkNotNullParameter(itRequired, "itRequired");
                            return XmlParsingExtensionsKt.getStringNodeAttribute("required", itRequired);
                        }
                    });
                    String stringNodeAttribute = XmlParsingExtensionsKt.getStringNodeAttribute("id", node2);
                    String stringNodeAttribute2 = XmlParsingExtensionsKt.getStringNodeAttribute("adId", node2);
                    Integer intNodeAttribute = XmlParsingExtensionsKt.getIntNodeAttribute("sequence", node2);
                    String stringNodeAttribute3 = XmlParsingExtensionsKt.getStringNodeAttribute(VastAttributes.API_FRAMEWORK, node2);
                    parseUniversalAdIdList = VastDataModelFromXmlKt.parseUniversalAdIdList(xPath, node2);
                    parseAdLinear = VastDataModelFromXmlKt.parseAdLinear(xPath, node2);
                    parseAdCompanions = VastDataModelFromXmlKt.parseAdCompanions(xPath, node2);
                    arrayList.add(new VastCreative(stringNodeAttribute, stringNodeAttribute2, intNodeAttribute, stringNodeAttribute3, parseUniversalAdIdList, parseAdLinear, parseAdCompanions, str));
                }
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<VastUniversalAdId> parseUniversalAdIdList(XPath xPath, Node node) {
        List<VastUniversalAdId> list = (List) XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, "UniversalAdId", node, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseUniversalAdIdList$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final List<VastUniversalAdId> invoke(@NotNull NodeList it) {
                Intrinsics.checkNotNullParameter(it, "it");
                ArrayList arrayList = new ArrayList();
                int length = it.getLength();
                for (int i = 0; i < length; i++) {
                    Node item = it.item(i);
                    Intrinsics.checkNotNullExpressionValue(item, "it.item(i)");
                    String elementValue = XmlParsingExtensionsKt.getElementValue(item);
                    Node item2 = it.item(i);
                    Intrinsics.checkNotNullExpressionValue(item2, "it.item(i)");
                    arrayList.add(new VastUniversalAdId(elementValue, XmlParsingExtensionsKt.getStringNodeAttribute("idRegistry", item2)));
                }
                return arrayList;
            }
        });
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VastLinear parseAdLinear(XPath xPath, Node node) {
        return (VastLinear) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, "Linear", node, new VastDataModelFromXmlKt$parseAdLinear$1(xPath));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<VastCompanion> parseAdCompanions(final XPath xPath, Node node) {
        List<VastCompanion> list = (List) XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, "CompanionAds/Companion", node, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdCompanions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final List<VastCompanion> invoke(@NotNull NodeList nodeList) {
                VastBaseResource parseVastResource;
                NodeList itNodes = nodeList;
                Intrinsics.checkNotNullParameter(itNodes, "itNodes");
                ArrayList arrayList = new ArrayList();
                int length = nodeList.getLength();
                int i = 0;
                while (i < length) {
                    Node node2 = itNodes.item(i);
                    final LinkedHashSet linkedHashSet = new LinkedHashSet();
                    EventType eventType = EventType.CompanionClickTracking;
                    XPath xPath2 = xPath;
                    Intrinsics.checkNotNullExpressionValue(node2, "node");
                    VastDataModelFromXmlKt.addVastEvents(linkedHashSet, eventType, xPath2, node2);
                    XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, "TrackingEvents", node2, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdCompanions$1.1
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
                            addVastEvents = VastDataModelFromXmlKt.addVastEvents(linkedHashSet, EventType.Tracking, xPath, it);
                            return addVastEvents;
                        }
                    });
                    VastClickThrough vastClickThrough = (VastClickThrough) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, "CompanionClickThrough", node2, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdCompanions$1$clickThrough$1
                        @Override // kotlin.jvm.functions.Function1
                        @Nullable
                        public final VastClickThrough invoke(@NotNull Node it) {
                            VastClickThrough vastClickThroughOrNull;
                            Intrinsics.checkNotNullParameter(it, "it");
                            vastClickThroughOrNull = VastDataModelFromXmlKt.getVastClickThroughOrNull(it);
                            return vastClickThroughOrNull;
                        }
                    });
                    String stringNodeAttribute = XmlParsingExtensionsKt.getStringNodeAttribute("id", node2);
                    Integer intNodeAttribute = XmlParsingExtensionsKt.getIntNodeAttribute("width", node2);
                    Integer intNodeAttribute2 = XmlParsingExtensionsKt.getIntNodeAttribute("height", node2);
                    Integer intNodeAttribute3 = XmlParsingExtensionsKt.getIntNodeAttribute(VastAttributes.ASSET_WIDTH, node2);
                    Integer intNodeAttribute4 = XmlParsingExtensionsKt.getIntNodeAttribute(VastAttributes.ASSET_HEIGHT, node2);
                    Integer intNodeAttribute5 = XmlParsingExtensionsKt.getIntNodeAttribute(VastAttributes.EXPANDED_WIDTH, node2);
                    Integer intNodeAttribute6 = XmlParsingExtensionsKt.getIntNodeAttribute(VastAttributes.EXPANDED_HEIGHT, node2);
                    String stringNodeAttribute2 = XmlParsingExtensionsKt.getStringNodeAttribute(VastAttributes.API_FRAMEWORK, node2);
                    String stringNodeAttribute3 = XmlParsingExtensionsKt.getStringNodeAttribute("adSlotId", node2);
                    Integer intNodeAttribute7 = XmlParsingExtensionsKt.getIntNodeAttribute(POBConstants.KEY_PXRATIO, node2);
                    String stringNodeAttribute4 = XmlParsingExtensionsKt.getStringNodeAttribute("renderingMode", node2);
                    String stringNodeValue = XmlParsingExtensionsKt.getStringNodeValue(k.K, xPath, node2);
                    parseVastResource = VastDataModelFromXmlKt.parseVastResource(xPath, node2);
                    VastCompanion vastCompanion = new VastCompanion(stringNodeAttribute, intNodeAttribute, intNodeAttribute2, intNodeAttribute3, intNodeAttribute4, intNodeAttribute5, intNodeAttribute6, stringNodeAttribute2, stringNodeAttribute3, intNodeAttribute7, stringNodeAttribute4, stringNodeValue, vastClickThrough, linkedHashSet, parseVastResource);
                    if (VastDataModelExtensionsKt.isValid(vastCompanion)) {
                        arrayList.add(vastCompanion);
                    }
                    i++;
                    itNodes = nodeList;
                }
                return arrayList;
            }
        });
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<VastMediaFile> parseMediaFiles(XPath xPath, Node node) {
        List<VastMediaFile> list = (List) XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, "MediaFile", node, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseMediaFiles$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final List<VastMediaFile> invoke(@NotNull NodeList nodeList) {
                NodeList itNodes = nodeList;
                Intrinsics.checkNotNullParameter(itNodes, "itNodes");
                ArrayList arrayList = new ArrayList();
                int length = nodeList.getLength();
                int i = 0;
                while (i < length) {
                    Node node2 = itNodes.item(i);
                    Intrinsics.checkNotNullExpressionValue(node2, "node");
                    String elementValue = XmlParsingExtensionsKt.getElementValue(node2);
                    Integer intNodeAttribute = XmlParsingExtensionsKt.getIntNodeAttribute("width", node2);
                    Integer intNodeAttribute2 = XmlParsingExtensionsKt.getIntNodeAttribute("height", node2);
                    arrayList.add(new VastMediaFile(XmlParsingExtensionsKt.getStringNodeAttribute("id", node2), elementValue, XmlParsingExtensionsKt.getStringNodeAttribute("delivery", node2), XmlParsingExtensionsKt.getStringNodeAttribute("type", node2), intNodeAttribute, intNodeAttribute2, XmlParsingExtensionsKt.getStringNodeAttribute(VastAttributes.CODEC, node2), XmlParsingExtensionsKt.getIntNodeAttribute(VastAttributes.BITRATE, node2), XmlParsingExtensionsKt.getIntNodeAttribute(VastAttributes.MIN_BITRATE, node2), XmlParsingExtensionsKt.getIntNodeAttribute(VastAttributes.MAX_BITRATE, node2), XmlParsingExtensionsKt.getBoolNodeAttribute(VastAttributes.SCALABLE, node2), XmlParsingExtensionsKt.getBoolNodeAttribute(VastAttributes.MAINTAIN_ASPECT_RATION, node2), XmlParsingExtensionsKt.getStringNodeAttribute(VastAttributes.API_FRAMEWORK, node2), XmlParsingExtensionsKt.getIntNodeAttribute("fileSize", node2), XmlParsingExtensionsKt.getStringNodeAttribute("mediaType", node2), (intNodeAttribute == null || intNodeAttribute2 == null) ? 0.0f : intNodeAttribute.intValue() / intNodeAttribute2.intValue(), Integer.valueOf((intNodeAttribute == null || intNodeAttribute2 == null) ? 0 : intNodeAttribute.intValue() * intNodeAttribute2.intValue())));
                    i++;
                    itNodes = nodeList;
                }
                return arrayList;
            }
        });
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<VastIcon> parseIcons(final XPath xPath, Node node) {
        List<VastIcon> list = (List) XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, "Icons/Icon", node, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseIcons$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final List<VastIcon> invoke(@NotNull NodeList itNodes) {
                VastBaseResource parseVastResource;
                Intrinsics.checkNotNullParameter(itNodes, "itNodes");
                ArrayList arrayList = new ArrayList();
                int length = itNodes.getLength();
                for (int i = 0; i < length; i++) {
                    Node node2 = itNodes.item(i);
                    final LinkedHashSet linkedHashSet = new LinkedHashSet();
                    EventType eventType = EventType.IconViewTracking;
                    XPath xPath2 = xPath;
                    Intrinsics.checkNotNullExpressionValue(node2, "node");
                    VastDataModelFromXmlKt.addVastEvents(linkedHashSet, eventType, xPath2, node2);
                    XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, k.G, node2, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseIcons$1.1
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
                            addVastEvents = VastDataModelFromXmlKt.addVastEvents(linkedHashSet, EventType.IconClickTracking, xPath, it);
                            return addVastEvents;
                        }
                    });
                    VastClickThrough vastClickThrough = (VastClickThrough) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, "IconClicks/IconClickThrough", node2, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseIcons$1$clickThrough$1
                        @Override // kotlin.jvm.functions.Function1
                        @Nullable
                        public final VastClickThrough invoke(@NotNull Node it) {
                            VastClickThrough vastClickThroughOrNull;
                            Intrinsics.checkNotNullParameter(it, "it");
                            vastClickThroughOrNull = VastDataModelFromXmlKt.getVastClickThroughOrNull(it);
                            return vastClickThroughOrNull;
                        }
                    });
                    String stringNodeAttribute = XmlParsingExtensionsKt.getStringNodeAttribute("program", node2);
                    Integer intNodeAttribute = XmlParsingExtensionsKt.getIntNodeAttribute("width", node2);
                    Integer intNodeAttribute2 = XmlParsingExtensionsKt.getIntNodeAttribute("height", node2);
                    VastTime.Companion companion = VastTime.INSTANCE;
                    VastTime create = companion.create(XmlParsingExtensionsKt.getStringNodeAttribute("offset", node2));
                    VastTime create2 = companion.create(XmlParsingExtensionsKt.getStringNodeAttribute(IronSourceConstants.EVENTS_DURATION, node2));
                    parseVastResource = VastDataModelFromXmlKt.parseVastResource(xPath, node2);
                    arrayList.add(new VastIcon(stringNodeAttribute, vastClickThrough, linkedHashSet, parseVastResource, intNodeAttribute, intNodeAttribute2, create, create2));
                }
                return arrayList;
            }
        });
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VastBaseResource parseVastResource(XPath xPath, Node node) {
        return (VastBaseResource) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, "IFrameResource|StaticResource|HTMLResource", node, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseVastResource$1
            @Override // kotlin.jvm.functions.Function1
            @Nullable
            public final VastBaseResource invoke(@NotNull Node it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String nodeName = it.getNodeName();
                if (nodeName != null) {
                    int hashCode = nodeName.hashCode();
                    if (hashCode != -375340334) {
                        if (hashCode == 676623548) {
                            if (nodeName.equals("StaticResource")) {
                                return new VastStaticResource(XmlParsingExtensionsKt.getStringNodeAttribute("creativeType", it), XmlParsingExtensionsKt.getElementValue(it));
                            }
                        } else if (hashCode == 1928285401 && nodeName.equals("HTMLResource")) {
                            return new VastHtmlResource(XmlParsingExtensionsKt.getElementValue(it));
                        }
                    } else if (nodeName.equals("IFrameResource")) {
                        return new VastIFrameResource(XmlParsingExtensionsKt.getElementValue(it));
                    }
                }
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void parseAdVerifications(final List<VastVerification> list, final XPath xPath, Node node) {
        XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, VastTagName.VERIFICATION, node, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdVerifications$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((NodeList) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull NodeList itNodes) {
                String uri;
                String uri2;
                Intrinsics.checkNotNullParameter(itNodes, "itNodes");
                int length = itNodes.getLength();
                for (int i = 0; i < length; i++) {
                    Node node2 = itNodes.item(i);
                    final LinkedHashSet linkedHashSet = new LinkedHashSet();
                    XPath xPath2 = xPath;
                    Intrinsics.checkNotNullExpressionValue(node2, "node");
                    XmlParsingExtensionsKt.evaluateNodeOrNull(xPath2, "TrackingEvents", node2, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdVerifications$1.1
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
                            addVastEvents = VastDataModelFromXmlKt.addVastEvents(linkedHashSet, EventType.Tracking, xPath, it);
                            return addVastEvents;
                        }
                    });
                    VastJavaScriptResource vastJavaScriptResource = (VastJavaScriptResource) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, VastTagName.JAVA_SCRIPT_RESOURCE, node2, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdVerifications$1$resource$1
                        @Override // kotlin.jvm.functions.Function1
                        @NotNull
                        public final VastJavaScriptResource invoke(@NotNull Node it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            String elementValue = XmlParsingExtensionsKt.getElementValue(it);
                            String stringNodeAttribute = XmlParsingExtensionsKt.getStringNodeAttribute(VastAttributes.API_FRAMEWORK, it);
                            VerificationApiFramework verificationApiFramework = null;
                            if (stringNodeAttribute != null) {
                                VerificationApiFramework[] values = VerificationApiFramework.values();
                                int length2 = values.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= length2) {
                                        break;
                                    }
                                    VerificationApiFramework verificationApiFramework2 = values[i2];
                                    if (Intrinsics.areEqual(verificationApiFramework2.getStringValue(), stringNodeAttribute)) {
                                        verificationApiFramework = verificationApiFramework2;
                                        break;
                                    }
                                    i2++;
                                }
                            }
                            Boolean boolNodeAttribute = XmlParsingExtensionsKt.getBoolNodeAttribute("browserOptional", it);
                            return new VastJavaScriptResource(elementValue, verificationApiFramework, boolNodeAttribute != null ? boolNodeAttribute.booleanValue() : false);
                        }
                    });
                    if (vastJavaScriptResource != null && (((uri = vastJavaScriptResource.getUri()) == null || !StringsKt.isBlank(uri)) && ((uri2 = vastJavaScriptResource.getUri()) == null || uri2.length() != 0))) {
                        list.add(new VastVerification(XmlParsingExtensionsKt.getStringNodeAttribute(VastAttributes.VENDOR, node2), linkedHashSet, vastJavaScriptResource, (String) XmlParsingExtensionsKt.evaluateNodeOrNull(xPath, VastTagName.VERIFICATION_PARAMETERS, node2, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$parseAdVerifications$1$verificationParameters$1
                            @Override // kotlin.jvm.functions.Function1
                            @Nullable
                            public final String invoke(@NotNull Node it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return XmlParsingExtensionsKt.getElementValue(it);
                            }
                        })));
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int addVastEvents(final Set<VastEvent> set, final EventType eventType, XPath xPath, Node node) {
        try {
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = 0;
            XmlParsingExtensionsKt.evaluateNodesOrNull(xPath, eventType.toString(), node, new Function1() { // from class: com.mobilefuse.videoplayer.model.VastDataModelFromXmlKt$addVastEvents$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((NodeList) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull NodeList itNodes) {
                    Intrinsics.checkNotNullParameter(itNodes, "itNodes");
                    int length = itNodes.getLength();
                    for (int i = 0; i < length; i++) {
                        Node node2 = itNodes.item(i);
                        EventType eventType2 = EventType.this;
                        Intrinsics.checkNotNullExpressionValue(node2, "node");
                        set.add(new VastEvent(eventType2, XmlParsingExtensionsKt.getStringNodeAttribute("event", node2), XmlParsingExtensionsKt.getStringNodeAttribute("id", node2), VastTime.INSTANCE.create(XmlParsingExtensionsKt.getStringNodeAttribute("offset", node2)), XmlParsingExtensionsKt.getElementValue(node2)));
                        ref$IntRef.element++;
                    }
                }
            });
            return ref$IntRef.element;
        } catch (Throwable th) {
            StabilityHelper.logException("addVastEvents", th);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VastClickThrough getVastClickThroughOrNull(Node node) {
        String elementValue = XmlParsingExtensionsKt.getElementValue(node);
        if (elementValue == null) {
            return null;
        }
        return new VastClickThrough(XmlParsingExtensionsKt.getStringNodeAttribute("id", node), elementValue);
    }
}
