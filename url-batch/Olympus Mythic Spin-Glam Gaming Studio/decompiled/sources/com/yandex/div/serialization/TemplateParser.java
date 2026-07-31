package com.yandex.div.serialization;

import com.yandex.div.core.annotations.ExperimentalApi;
import com.yandex.div.data.EntityTemplate;
import kotlin.Metadata;

/* compiled from: TemplateParser.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u0001*\f\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/serialization/TemplateParser;", "D", "T", "Lcom/yandex/div/data/EntityTemplate;", "Lcom/yandex/div/serialization/Serializer;", "Lcom/yandex/div/serialization/TemplateDeserializer;", "div-data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@ExperimentalApi
/* loaded from: classes13.dex */
public interface TemplateParser<D, T extends EntityTemplate<?>> extends Serializer<D, T>, TemplateDeserializer<D, T> {
}
