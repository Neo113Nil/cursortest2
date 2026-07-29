package expo.modules;

import expo.modules.adapters.react.ReactAdapterPackage;
import expo.modules.asset.AssetModule;
import expo.modules.blur.BlurModule;
import expo.modules.constants.ConstantsModule;
import expo.modules.constants.ConstantsPackage;
import expo.modules.core.BasePackage;
import expo.modules.core.interfaces.Package;
import expo.modules.easclient.EASClientModule;
import expo.modules.fetch.ExpoFetchModule;
import expo.modules.filesystem.FileSystemModule;
import expo.modules.filesystem.legacy.FileSystemLegacyModule;
import expo.modules.filesystem.legacy.FileSystemPackage;
import expo.modules.font.FontLoaderModule;
import expo.modules.font.FontUtilsModule;
import expo.modules.haptics.HapticsModule;
import expo.modules.keepawake.KeepAwakeModule;
import expo.modules.keepawake.KeepAwakePackage;
import expo.modules.kotlin.ModulesProvider;
import expo.modules.kotlin.edgeToEdge.EdgeToEdgePackage;
import expo.modules.kotlin.modules.Module;
import expo.modules.lineargradient.LinearGradientModule;
import expo.modules.linking.ExpoLinkingModule;
import expo.modules.linking.ExpoLinkingPackage;
import expo.modules.splashscreen.SplashScreenModule;
import expo.modules.systemui.SystemUIModule;
import expo.modules.systemui.SystemUIPackage;
import expo.modules.updates.UpdatesModule;
import expo.modules.updates.UpdatesPackage;
import expo.modules.webbrowser.WebBrowserModule;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class ExpoModulesPackageList implements ModulesProvider {

    private static class LazyHolder {
        static final List<Package> packagesList = Arrays.asList(new ReactAdapterPackage(), new ConstantsPackage(), new BasePackage(), new FileSystemPackage(), new KeepAwakePackage(), new EdgeToEdgePackage(), new ExpoLinkingPackage(), new SystemUIPackage(), new UpdatesPackage());
        static final List<Class<? extends Module>> modulesList = Arrays.asList(ExpoFetchModule.class, AssetModule.class, BlurModule.class, ConstantsModule.class, EASClientModule.class, FileSystemModule.class, FileSystemLegacyModule.class, FontLoaderModule.class, FontUtilsModule.class, HapticsModule.class, KeepAwakeModule.class, LinearGradientModule.class, ExpoLinkingModule.class, SplashScreenModule.class, SystemUIModule.class, UpdatesModule.class, WebBrowserModule.class);

        private LazyHolder() {
        }
    }

    public static List<Package> getPackageList() {
        return LazyHolder.packagesList;
    }

    @Override // expo.modules.kotlin.ModulesProvider
    public List<Class<? extends Module>> getModulesList() {
        return LazyHolder.modulesList;
    }
}
