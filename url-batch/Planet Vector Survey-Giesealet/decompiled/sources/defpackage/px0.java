package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.window.BackEvent;
import androidx.compose.ui.draw.a;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.vectorharbor.planetvectorsurvey.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-7f2bb5c576a00032ab10937e7c10d659d6443ab0eba1d735433dfe70872cb632 */
/* loaded from: classes.dex */
public abstract class px0 {
    public static final op a;
    public static final op e;
    public static ax h = null;
    public static boolean i = false;
    public static Method j;
    public static final us b = new us(7);
    public static final float[] c = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] d = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final sd f = new sd(2);
    public static final Object g = new Object();

    static {
        int i2 = 1;
        a = new op("RESUME_TOKEN", i2);
        e = new op("NO_OWNER", i2);
    }

    public static final int A(ih ihVar) {
        long j2 = ((qh) ihVar).R;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int B(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final gt0 C(gs0 gs0Var) {
        gt0 gt0Var = gs0Var.d;
        gt0Var.getClass();
        return (gt0) ur0.u(gt0Var, gs0Var);
    }

    public static final int D(gs0 gs0Var) {
        gt0 gt0Var = gs0Var.d;
        gt0Var.getClass();
        return ((gt0) ur0.i(gt0Var)).e;
    }

    public static final void E(rj rjVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = wj.a.iterator();
        while (it.hasNext()) {
            try {
                ((vj) it.next()).m(rjVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    mz.r(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            mz.r(th, new dm(rjVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static boolean F(int i2, Object obj) {
        if (obj instanceof yu) {
            if ((obj instanceof zu ? ((zu) obj).getArity() : obj instanceof bu ? 0 : obj instanceof mu ? 1 : obj instanceof qu ? 2 : obj instanceof ru ? 3 : obj instanceof su ? 4 : obj instanceof tu ? 5 : obj instanceof uu ? 6 : obj instanceof vu ? 7 : obj instanceof wu ? 8 : obj instanceof xu ? 9 : obj instanceof cu ? 10 : obj instanceof du ? 11 : obj instanceof fu ? 13 : obj instanceof gu ? 14 : obj instanceof hu ? 15 : obj instanceof iu ? 16 : obj instanceof ju ? 17 : obj instanceof ku ? 18 : obj instanceof lu ? 19 : obj instanceof nu ? 20 : obj instanceof ou ? 21 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static final boolean G(p10 p10Var) {
        if (p10Var.j == null) {
            return false;
        }
        p10 n = p10Var.n();
        if ((n != null ? n.j : null) == null) {
            return true;
        }
        p10Var.G.getClass();
        return false;
    }

    public static List H(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List I(Object... objArr) {
        if (objArr.length <= 0) {
            return wp.d;
        }
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return asList;
    }

    public static final int[] J(List list, int i2) {
        int i3;
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i4 < size) {
                iArr[i4] = d31.I(((ge) list.get(i4)).a);
                i4++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i2];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i5 = 0;
        while (i4 < size3) {
            long j2 = ((ge) list.get(i4)).a;
            if (ge.d(j2) == 0.0f) {
                if (i4 == 0) {
                    i3 = i5 + 1;
                    iArr2[i5] = d31.I(ge.b(((ge) list.get(1)).a, 0.0f));
                } else if (i4 == size2) {
                    i3 = i5 + 1;
                    iArr2[i5] = d31.I(ge.b(((ge) list.get(i4 - 1)).a, 0.0f));
                } else {
                    int i6 = i5 + 1;
                    iArr2[i5] = d31.I(ge.b(((ge) list.get(i4 - 1)).a, 0.0f));
                    i5 += 2;
                    iArr2[i6] = d31.I(ge.b(((ge) list.get(i4 + 1)).a, 0.0f));
                }
                i5 = i3;
            } else {
                iArr2[i5] = d31.I(j2);
                i5++;
            }
            i4++;
        }
        return iArr2;
    }

    public static final float[] K(List list, int i2) {
        if (i2 == 0) {
            return null;
        }
        float[] fArr = new float[list.size() + i2];
        fArr[0] = 0.0f;
        int size = list.size() - 1;
        int i3 = 1;
        for (int i4 = 1; i4 < size; i4++) {
            long j2 = ((ge) list.get(i4)).a;
            float size2 = i4 / (list.size() - 1);
            int i5 = i3 + 1;
            fArr[i3] = size2;
            if (ge.d(j2) == 0.0f) {
                i3 += 2;
                fArr[i5] = size2;
            } else {
                i3 = i5;
            }
        }
        fArr[i3] = 1.0f;
        return fArr;
    }

    public static final boolean L(gs0 gs0Var, mu muVar) {
        int i2;
        w wVar;
        Object c2;
        or0 k;
        boolean j2;
        do {
            synchronized (g) {
                gt0 gt0Var = gs0Var.d;
                gt0Var.getClass();
                gt0 gt0Var2 = (gt0) ur0.i(gt0Var);
                i2 = gt0Var2.d;
                wVar = gt0Var2.c;
            }
            wVar.getClass();
            tf0 e2 = wVar.e();
            c2 = muVar.c(e2);
            w c3 = e2.c();
            if (nz.l(c3, wVar)) {
                break;
            }
            gt0 gt0Var3 = gs0Var.d;
            gt0Var3.getClass();
            synchronized (ur0.c) {
                k = ur0.k();
                j2 = j((gt0) ur0.x(gt0Var3, gs0Var, k), i2, c3, true);
            }
            ur0.o(k, gs0Var);
        } while (!j2);
        return ((Boolean) c2).booleanValue();
    }

    public static List Q(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final void R(hc hcVar, kj kjVar, boolean z) {
        Object obj = hc.j.get(hcVar);
        Throwable e2 = hcVar.e(obj);
        Object uk0Var = e2 != null ? new uk0(e2) : hcVar.f(obj);
        if (!z) {
            kjVar.resumeWith(uk0Var);
            return;
        }
        kjVar.getClass();
        rm rmVar = (rm) kjVar;
        lj ljVar = rmVar.h;
        Object obj2 = rmVar.j;
        rj context = ljVar.getContext();
        Object Y = mz.Y(context, obj2);
        iy0 P = Y != mz.p ? a50.P(ljVar, context, Y) : null;
        try {
            ljVar.resumeWith(uk0Var);
            if (P == null || P.e0()) {
                mz.S(context, Y);
            }
        } catch (Throwable th) {
            if (P == null || P.e0()) {
                mz.S(context, Y);
            }
            throw th;
        }
    }

    public static final void S(rc0 rc0Var, int i2, Object obj) {
        rc0Var.l[(rc0Var.m - rc0Var.h[rc0Var.i - 1].b) + i2] = obj;
    }

    public static final void T(rc0 rc0Var, int i2, Object obj, int i3, Object obj2) {
        int i4 = rc0Var.m - rc0Var.h[rc0Var.i - 1].b;
        Object[] objArr = rc0Var.l;
        objArr[i2 + i4] = obj;
        objArr[i4 + i3] = obj2;
    }

    public static void U(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        nz.d0(classCastException, px0.class.getName());
        throw classCastException;
    }

    public static void V() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final long W(long j2) {
        return (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
    }

    public static final void X(List list) {
        if (list.size() >= 2) {
            return;
        }
        g8.r("colors must have length of at least 2 if colorStops is omitted.");
    }

    public static final void a(u50 u50Var, rq0 rq0Var, pc pcVar, qc qcVar, z9 z9Var, eg egVar, ih ihVar, int i2) {
        int i3;
        qh qhVar;
        qh qhVar2 = (qh) ihVar;
        qhVar2.W(1179621553);
        if ((i2 & 6) == 0) {
            i3 = (qhVar2.f(u50Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qhVar2.f(rq0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qhVar2.f(pcVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qhVar2.f(qcVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= qhVar2.f(z9Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= qhVar2.h(egVar) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && qhVar2.z()) {
            qhVar2.Q();
            qhVar = qhVar2;
        } else {
            qhVar2.S();
            if ((i2 & 1) != 0 && !qhVar2.x()) {
                qhVar2.Q();
            }
            qhVar2.r();
            long j2 = pcVar.a;
            long j3 = pcVar.b;
            qcVar.getClass();
            qhVar2.V(-1763481333);
            qhVar2.V(-734838460);
            Object K = qhVar2.K();
            if (K == hh.a) {
                K = ud0.o(new jn(0.0f));
                qhVar2.e0(K);
            }
            qhVar2.q(false);
            qhVar2.q(false);
            qhVar = qhVar2;
            au0.a(u50Var, rq0Var, j2, j3, ((jn) ((f70) K).getValue()).d, z9Var, a50.E(664103990, new j(3, egVar), qhVar2), qhVar, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new g6(u50Var, rq0Var, pcVar, qcVar, z9Var, egVar, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(md0 md0Var, String str, u50 u50Var, o9 o9Var, y7 y7Var, float f2, ih ihVar, int i2, int i3) {
        y7 y7Var2;
        int i4;
        float f3;
        int i5;
        u50 u50Var2;
        u50 u50Var3;
        int A;
        y7 y7Var3;
        float f4;
        o9 o9Var2;
        ri0 s;
        qh qhVar = (qh) ihVar;
        qhVar.W(1142754848);
        int i6 = (qhVar.h(md0Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i6 |= qhVar.f(str) ? 32 : 16;
        }
        int i7 = i6 | 3072;
        int i8 = i3 & 16;
        if (i8 != 0) {
            i7 = i6 | 27648;
        } else if ((i2 & 24576) == 0) {
            y7Var2 = y7Var;
            i7 |= qhVar.f(y7Var2) ? 16384 : 8192;
            i4 = i3 & 32;
            if (i4 == 0) {
                i7 |= 196608;
            } else if ((196608 & i2) == 0) {
                f3 = f2;
                i7 |= qhVar.c(f3) ? 131072 : 65536;
                i5 = i7 | 1572864;
                if ((599187 & i5) == 599186 || !qhVar.z()) {
                    o9 o9Var3 = b2.i;
                    if (i8 != 0) {
                        y7Var2 = ej.b;
                    }
                    y7 y7Var4 = y7Var2;
                    float f5 = i4 != 0 ? 1.0f : f3;
                    int i9 = 0;
                    if (str != null) {
                        qhVar.V(1040258775);
                        boolean z = (i5 & 112) == 32;
                        Object K = qhVar.K();
                        if (z || K == hh.a) {
                            K = new xw(str, i9);
                            qhVar.e0(K);
                        }
                        AtomicInteger atomicInteger = op0.a;
                        u50Var2 = new AppendedSemanticsElement((mu) K);
                        qhVar.q(false);
                    } else {
                        qhVar.V(1040398089);
                        qhVar.q(false);
                        u50Var2 = r50.a;
                    }
                    u50Var3 = u50Var;
                    u50 b2 = a.b(nz.r(u50Var3.c(u50Var2)), md0Var, y7Var4, f5, null, 2);
                    k4 k4Var = k4.e;
                    A = A(qhVar);
                    u50 D = nk.D(qhVar, b2);
                    gf0 l = qhVar.l();
                    eh.b.getClass();
                    gi giVar = dh.b;
                    qhVar.X();
                    if (qhVar.Q) {
                        qhVar.k(giVar);
                    } else {
                        qhVar.h0();
                    }
                    ld0.r(qhVar, dh.e, k4Var);
                    ld0.r(qhVar, dh.d, l);
                    ld0.r(qhVar, dh.c, D);
                    h6 h6Var = dh.f;
                    if (!qhVar.Q || !nz.l(qhVar.K(), Integer.valueOf(A))) {
                        y6.y(A, qhVar, A, h6Var);
                    }
                    qhVar.q(true);
                    y7Var3 = y7Var4;
                    f4 = f5;
                    o9Var2 = o9Var3;
                } else {
                    qhVar.Q();
                    o9Var2 = o9Var;
                    y7Var3 = y7Var2;
                    f4 = f3;
                    u50Var3 = u50Var;
                }
                s = qhVar.s();
                if (s != null) {
                    s.d = new ww(md0Var, str, u50Var3, o9Var2, y7Var3, f4, i2, i3);
                    return;
                }
                return;
            }
            f3 = f2;
            i5 = i7 | 1572864;
            if ((599187 & i5) == 599186) {
            }
            o9 o9Var32 = b2.i;
            if (i8 != 0) {
            }
            y7 y7Var42 = y7Var2;
            if (i4 != 0) {
            }
            int i92 = 0;
            if (str != null) {
            }
            u50Var3 = u50Var;
            u50 b22 = a.b(nz.r(u50Var3.c(u50Var2)), md0Var, y7Var42, f5, null, 2);
            k4 k4Var2 = k4.e;
            A = A(qhVar);
            u50 D2 = nk.D(qhVar, b22);
            gf0 l2 = qhVar.l();
            eh.b.getClass();
            gi giVar2 = dh.b;
            qhVar.X();
            if (qhVar.Q) {
            }
            ld0.r(qhVar, dh.e, k4Var2);
            ld0.r(qhVar, dh.d, l2);
            ld0.r(qhVar, dh.c, D2);
            h6 h6Var2 = dh.f;
            if (!qhVar.Q) {
            }
            y6.y(A, qhVar, A, h6Var2);
            qhVar.q(true);
            y7Var3 = y7Var42;
            f4 = f5;
            o9Var2 = o9Var32;
            s = qhVar.s();
            if (s != null) {
            }
        }
        y7Var2 = y7Var;
        i4 = i3 & 32;
        if (i4 == 0) {
        }
        f3 = f2;
        i5 = i7 | 1572864;
        if ((599187 & i5) == 599186) {
        }
        o9 o9Var322 = b2.i;
        if (i8 != 0) {
        }
        y7 y7Var422 = y7Var2;
        if (i4 != 0) {
        }
        int i922 = 0;
        if (str != null) {
        }
        u50Var3 = u50Var;
        u50 b222 = a.b(nz.r(u50Var3.c(u50Var2)), md0Var, y7Var422, f5, null, 2);
        k4 k4Var22 = k4.e;
        A = A(qhVar);
        u50 D22 = nk.D(qhVar, b222);
        gf0 l22 = qhVar.l();
        eh.b.getClass();
        gi giVar22 = dh.b;
        qhVar.X();
        if (qhVar.Q) {
        }
        ld0.r(qhVar, dh.e, k4Var22);
        ld0.r(qhVar, dh.d, l22);
        ld0.r(qhVar, dh.c, D22);
        h6 h6Var22 = dh.f;
        if (!qhVar.Q) {
        }
        y6.y(A, qhVar, A, h6Var22);
        qhVar.q(true);
        y7Var3 = y7Var422;
        f4 = f5;
        o9Var2 = o9Var322;
        s = qhVar.s();
        if (s != null) {
        }
    }

    public static final long c(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final e90 d(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new e90(progress, touchX, touchY, swipeEdge, Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final void e(u50 u50Var, rq0 rq0Var, pc pcVar, qc qcVar, z9 z9Var, eg egVar, ih ihVar, int i2) {
        u50 u50Var2;
        rq0 rq0Var2;
        pc pcVar2;
        z9 z9Var2;
        eg egVar2;
        qc qcVar2;
        qh qhVar = (qh) ihVar;
        qhVar.W(740336179);
        int i3 = (qhVar.f(u50Var) ? 4 : 2) | i2 | (qhVar.f(rq0Var) ? 32 : 16) | (qhVar.f(pcVar) ? 256 : 128) | 1024 | (qhVar.f(z9Var) ? 16384 : 8192);
        if ((74899 & i3) == 74898 && qhVar.z()) {
            qhVar.Q();
            egVar2 = egVar;
            z9Var2 = z9Var;
            qcVar2 = qcVar;
            pcVar2 = pcVar;
            rq0Var2 = rq0Var;
            u50Var2 = u50Var;
        } else {
            qhVar.S();
            if ((i2 & 1) == 0 || qhVar.x()) {
                qcVar = new qc(0.0f);
            } else {
                qhVar.Q();
            }
            int i4 = i3 & (-7169);
            qc qcVar3 = qcVar;
            qhVar.r();
            a(u50Var, rq0Var, pcVar, qcVar3, z9Var, egVar, qhVar, i4 & 524286);
            u50Var2 = u50Var;
            rq0Var2 = rq0Var;
            pcVar2 = pcVar;
            z9Var2 = z9Var;
            egVar2 = egVar;
            qcVar2 = qcVar3;
        }
        ri0 s = qhVar.s();
        if (s != null) {
            s.d = new f6(u50Var2, rq0Var2, pcVar2, qcVar2, z9Var2, egVar2, i2);
        }
    }

    public static final void f(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }

    public static ArrayList h(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new b8(objArr, true));
    }

    public static Map i(Object obj) {
        if ((obj instanceof j00) && !(obj instanceof l00)) {
            U(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            nz.d0(e2, px0.class.getName());
            throw e2;
        }
    }

    public static final boolean j(gt0 gt0Var, int i2, w wVar, boolean z) {
        boolean z2;
        synchronized (g) {
            try {
                int i3 = gt0Var.d;
                if (i3 == i2) {
                    gt0Var.c = wVar;
                    z2 = true;
                    if (z) {
                        gt0Var.e++;
                    }
                    gt0Var.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static void k(int i2, Object obj) {
        if (obj == null || F(i2, obj)) {
            return;
        }
        U(obj, "kotlin.jvm.functions.Function" + i2);
        throw null;
    }

    public static j30 l(j30 j30Var) {
        j30Var.f();
        j30Var.f = true;
        return j30Var.e > 0 ? j30Var : j30.g;
    }

    public static final void p(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            g8.m(y6.v("index: ", i2, ", size: ", i3));
        }
    }

    public static final void q(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            g8.m(y6.v("index: ", i2, ", size: ", i3));
        }
    }

    public static final void r(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            g8.r(y6.v("fromIndex: ", i2, " > toIndex: ", i3));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    public static void s(q80 q80Var, String str, eg egVar) {
        q90 q90Var = q80Var.f;
        q90Var.getClass();
        q80Var.h.add(new sg((rg) q90Var.b(d31.x(rg.class)), str, egVar).a());
    }

    public static final int t(List list) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int size = list.size() - 1;
        for (int i3 = 1; i3 < size; i3++) {
            if (ge.d(((ge) list.get(i3)).a) == 0.0f) {
                i2++;
            }
        }
        return i2;
    }

    public static boolean u(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        int i2 = c01.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = b01.d;
            b01 b01Var = (b01) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (b01Var == null) {
                b01Var = new b01();
                b01Var.a = null;
                b01Var.b = null;
                b01Var.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, b01Var);
            }
            WeakReference weakReference2 = b01Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                b01Var.c = new WeakReference(keyEvent);
                if (b01Var.b == null) {
                    b01Var.b = new SparseArray();
                }
                SparseArray sparseArray = b01Var.b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    g8.q();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        r5 = r5.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        r5 = r5.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void v(e4 e4Var, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        tp0 tp0Var;
        rp0 rp0Var;
        mu muVar;
        int size = longSparseArray.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long keyAt = longSparseArray.keyAt(i3);
            ViewTranslationResponse l = s2.l(longSparseArray.get(keyAt));
            if (l != null && value != null && text != null && (tp0Var = (tp0) e4Var.j().b((int) keyAt)) != null && (rp0Var = tp0Var.a) != null) {
                Object g2 = rp0Var.d.d.g(mp0.j);
                if (g2 == null) {
                    g2 = null;
                }
                h0 h0Var = (h0) g2;
                if (h0Var != null && (muVar = (mu) h0Var.b) != null) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r1.e(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0054, B:20:0x0069, B:22:0x0071, B:32:0x0045, B:35:0x0050), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0083 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w(pr prVar, tc tcVar, boolean z, kj kjVar) {
        qr qrVar;
        int i2;
        db it;
        db dbVar;
        pr prVar2;
        Object b2;
        try {
            if (kjVar instanceof qr) {
                qrVar = (qr) kjVar;
                int i3 = qrVar.i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    qrVar.i = i3 - Integer.MIN_VALUE;
                    Object obj = qrVar.h;
                    i2 = qrVar.i;
                    CancellationException cancellationException = null;
                    ck ckVar = ck.d;
                    if (i2 != 0) {
                        rg0.u(obj);
                        if (prVar instanceof nw0) {
                            throw ((nw0) prVar).d;
                        }
                        it = tcVar.iterator();
                        qrVar.d = prVar;
                        qrVar.e = tcVar;
                        qrVar.f = it;
                        qrVar.g = z;
                        qrVar.i = 1;
                        b2 = it.b(qrVar);
                        if (b2 != ckVar) {
                        }
                    } else if (i2 == 1) {
                        z = qrVar.g;
                        dbVar = qrVar.f;
                        tcVar = qrVar.e;
                        prVar2 = qrVar.d;
                        rg0.u(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            g8.s("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = qrVar.g;
                        dbVar = qrVar.f;
                        tcVar = qrVar.e;
                        prVar2 = qrVar.d;
                        rg0.u(obj);
                        it = dbVar;
                        prVar = prVar2;
                        qrVar.d = prVar;
                        qrVar.e = tcVar;
                        qrVar.f = it;
                        qrVar.g = z;
                        qrVar.i = 1;
                        b2 = it.b(qrVar);
                        if (b2 != ckVar) {
                            return ckVar;
                        }
                        prVar2 = prVar;
                        dbVar = it;
                        obj = b2;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                tcVar.a(null);
                            }
                            return ky0.a;
                        }
                        Object c2 = dbVar.c();
                        qrVar.d = prVar2;
                        qrVar.e = tcVar;
                        qrVar.f = dbVar;
                        qrVar.g = z;
                        qrVar.i = 2;
                    }
                }
            }
            if (i2 != 0) {
            }
        } finally {
        }
        qrVar = new qr(kjVar);
        Object obj2 = qrVar.h;
        i2 = qrVar.i;
        CancellationException cancellationException2 = null;
        ck ckVar2 = ck.d;
    }

    public static long x(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i4, 262142);
        int min2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    vi.j(i7);
                    throw new kf();
                }
                i6 = 8190;
            }
        }
        return vi.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, min, min2);
    }

    public static long y(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i2, 262142);
        int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    vi.j(i7);
                    throw new kf();
                }
                i6 = 8190;
            }
        }
        return vi.a(min, min2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static o50 z(o50 o50Var, c10 c10Var, dw0 dw0Var, sl slVar, ct ctVar) {
        if (o50Var != null && c10Var == o50Var.a && nz.l(dw0Var, o50Var.b) && slVar.a() == o50Var.c.a() && ctVar == o50Var.d) {
            return o50Var;
        }
        o50 o50Var2 = o50.h;
        if (o50Var2 != null && c10Var == o50Var2.a && nz.l(dw0Var, o50Var2.b) && slVar.a() == o50Var2.c.a() && ctVar == o50Var2.d) {
            return o50Var2;
        }
        o50 o50Var3 = new o50(c10Var, ud0.q(dw0Var, c10Var), slVar, ctVar);
        o50.h = o50Var3;
        return o50Var3;
    }

    public abstract void M(Throwable th);

    public abstract void N(k2 k2Var);

    public abstract void O(c0 c0Var, c0 c0Var2);

    public abstract void P(c0 c0Var, Thread thread);

    public abstract void g(float f2, long j2, y4 y4Var);

    public abstract boolean m(d0 d0Var, z zVar);

    public abstract boolean n(d0 d0Var, Object obj, Object obj2);

    public abstract boolean o(d0 d0Var, c0 c0Var, c0 c0Var2);
}
