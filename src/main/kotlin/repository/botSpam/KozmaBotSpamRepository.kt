package repository.botSpam

import kotlin.random.Random

class KozmaBotSpamRepository : IBotSpamRepository {
    override val botName = "Козьма Прутков"
    override val roomName = botName

    override fun getPhrase(): String {
        return quotes[Random.nextInt(0, quotes.size)]
    }

    private val quotes: List<String> by lazy {
        """«Зачем, - говорит эгоист, - стану я работать для потомства, когда оно ровно ничего для меня не сделало?» - Несправедлив ты, безумец! Потомство сделало для тебя уже то, что ты, сближая прошедшее с настоящим и будущим, можешь по произволу считать себя: младенцем, юношей и старцем.
Англичанин не любит мяса, которое не вполсыро.
Барометр в земледельческом хозяйстве может быть с большою выгодою заменён усердною прислугою, страдающею нарочитыми ревматизмами.
Бди!
Без надобности носимый набрюшник - вреден.
Бердыш в руках воина то же, что меткое слово в руках писателя.
Благополучие, песчастие, бедность, богатство, радость, печаль, убожество, довольство суть различные явпения одной гисторической драмы, в которой человека репетируют роли свои в назидание миру.
Благочестие и суеверие - две разницы!
Благочестие, ханжество, суеверие - три разницы.
Болтун подобен маятнику: того и другой надо остановить.
Бросая в воду камешки, смотри на круги, ими образуемые; иначе такое бросание будет пустою забавою.
Бывает, что усердие превозмогает и рассудок.
В глубине всякой груди есть своя змея.
В доме без жильцов - известных насекомых не обрящешь.
В здании человеческого счастья дружба возводит стены, а любовь образует купол.
В спертом воздухе при всем старании не отдышишься.
Вакса чернит с пользою, а злой человек - с удовольствием.
Век живи - век учись! и ты наконец достигнешь того, что, подобно мудрецу, будешь иметь право сказать, что ничего не знаешь.
Верующий не боится напастей, по при невзгоде судьбы не отчаивается.
Весьма остроумно замечает Фейербах, что взоры беспутного сапожника следят за штопором, а не за шилом, отчего и происходят мозоли.
Ветер есть дыхание природы.
Вещи бывают великими и малыми не токмо по воле судьбы и обстоятельств, но также по понятиям каждого.
Взирая на высоких людей и на высокие предметы, придерживай картуз свой за козырёк.
Взирая на солнце, прищурь глаза свои, и ты смело разглядишь в нём пятна.
Во всех частях земного шара имеются свои, даже иногда очень любопытные, другие части.
Военные люди защищают отечество.
Военные люди защищают отечество.
Воображение поэта, удрученного горем, подобно ноге, заключенной в новый сапог.
Вред или польза действия обусловливается совокупностью обстоятельств.
Время подобно искусному управителю, непрестанно производящему новые таланты взамен исчезнувших.
Все говорят, что здоровье дороже всего; но никто этого не соблюдает.
Всегда держись начеку!
Всякая вещь есть форма проявления беспредельного разнообразия.
Всякая человеческая голова подобна желудку: одна переваривает входящую в оную пищу, а другая от неё засоряется.
Всякий необходимо причиняет пользу, употреблённый на своём месте. Напротив того: упражнения лучшего танцмейстера в химии неуместны; советы опытного астронома в танцах глупы.
Вытапливай воск, но сохраняй мёд.
Где начало того конца, которым оканчивается начало?
Гений подобен холму, возвышающемуся на равнине.
Глупейший человек был тот, который изобрёл кисточки для украшения и золотые гвоздики на мебели.
Глупец гадает; напротив того, мудрец проходит жизнь как огород, наперёд зная, что кой-где выдернется ему репа, а кое-где и редька.
Глядя на мир, нельзя не удивляться!
Говоря с хитрецом, взвешивай ответ свой.
Говорят, что труд убивает время; но сие последнее, нисколько от этого не уменьшаяся, продолжает служить человечеству и всей вселенной постоянно в одинаковой полноте и непрерывности.
Гони любовь хоть в дверь, она влетит в окно.
Даже летом, отправляясь в вояж, бери с собой что-либо тёплое, ибо можешь ли ты знать, что случится в атмосфере?
Два человека одинаковой комплекции дрались бы недолго, если бы сила одного превозмогла силу другого.
Двое несчастных, находящихся в дружбе, подобны двум слабым деревцам, которые, одно на другое опершись, легче могут противиться бурям и всяким неистовым ветрам.
Девицы вообще подобны шашкам: не всякой удаётся, но всякой желается попасть в дамки.
Детям, у коих прорезываются зубы, смело присоветую фиалковый корень!
Добрая сигара подобна земному шару: она вертится для удовольствия человека.
Добродетель служит сама себе наградой; человек превосходит добродетель, когда служит и не получает награды.
Дознано, что земля, своим разнообразием и великостью нас поражающая, показалась бы в солнце находящемуся смотрителю только как гладкий и ничтожный шарик.
Достаток распутного равняется короткому одеялу: натянешь его к носу, обнажатся ноги.
Дружба согревает душу, платье - тело, а солнце и печка - воздух.
Друзья мои! идите твердыми шагами по стезе, ведущей в храм согласия, а встречаемые на пути препоны преодолевайте с мужественною кротостью льва.
Душа индейца, верящего вметемпсихозию, похожа на червячка в коконе.
Единожды солгавши, кто тебе поверит?
Если бы вся вселенная обратилась в одно государство, то как не установить повсюду одинаковых законов?
Если бы всё прошедшее было настоящим, а настоящее продолжало существовать наряду с будущим, кто был бы в силах разобрать: где причины и где последствия?
Если бы тени предметов зависели не от величины сих последних, а имели бы свой произвольный рост, то, может быть, вскоре не осталось бы на всём земном шаре ни одного светлого места.
Если бы хоть одна настоящая звезда упала на заслуженную грудь, то не осталось бы ни того человека, ни даже самых отдаленных его единомышленников!
Если на клетке слона прочтёшь надпись "буйвол", не верь глазам своим.
Если у тебя есть фонтан, заткни его; дай отдохнуть и фонтану.
Если у тебя спрошено будет: что полезнее, солнце или месяц? - ответствуй: месяц. Ибо солнце светит днём, когда и без того светло; а месяц - ночью. Но, с другой стороны: солнце лучше тем, что светит и греет; а месяц только светит, и то лишь в лунную ночь!
Если хочешь быть красивым, поступи в гусары.
Если хочешь быть покоен, не принимай горя и неприятностей на свой счет, но всегда относи их на казенный.
Если хочешь быть счастливым, будь им.
Есть ли на свете человек, который мог бы обнять необъятное?
Жизнь - альбом. Человек - карандаш. Дела - ландшафт. Время - гумиэластик: и отскакивает и стирает.
Жизнь нашу можно удобно сравнивать со своенравною рекою, на поверхности которой плавает чёлн, иногда укачиваемый тихоструйною волною, нередко же задержанный в своём движении мелью и разбиваемый о подводный камень. - Нужно ли упоминать, что сей утлый чёлн на рынке скоропреходящего времени есть не кто иной, как сам человек?
Земной шар, обращающийся в беспредельном пространстве, служит пьедесталом для всего, на нём обретающегося.
Знай, читатель, что мудрость уменьшает жалобы, а не страдания!
И в самых пустых головах любовь нередко преосгрые выдумки рождает.
И египтяне были в свое время справедливы и человеколюбивы!
И мудрый Вольтер сомневался в ядовитости кофе!
И при железных дорогах лучше сохранять двуколку.
И самый последний нищий, при других условиях, способен быть первым богачом.
И терпентин на что-нибудь полезен!
И устрица имеет врагов!
Из всех плодов наилучшие приносит хорошее воспитание.
Издание некоторых газет, журналов и даже книг может приносить выгоду.
Имея в виду какое-либо предприятие, помысли, точно ли оно тебе удастся.
Иногда достаточно обругать человека, чтобы не быть им обманутым!
Иногда слова, напечатанные курсивом, много несправедливее тех, которые напечатаны прямым шрифтом.
Иного прогуливающегося старца смело уподоблю песочным часам.
Иной певец подчас хрипнет.
Исполнение предприятия приятно щекочет самолюбие.
Камергер редко наслаждается природою.
Когда народы между собой дерутся, это называется войною.
Козыряй!
Коэффициент счастия в обратном содержании к достоинству.
Кто мешает тебе выдумать порох непромокаемый?
Купи прежде картину, а после рамку!
Легче держать вожжи, чем бразды правления.
Лжёт непростительно, кто уверяет, будто всё на свете справедливо! Так, изобретший употребление сандарака может быть вполне убеждён, что имя его останется неизвестно потомству!
Лучше скажи мало, но хорошо.
Лучшим каждому кажется то, к чему он имеет охоту.
Люби ближнего, но не давайся ему в обман!
Любовь, поддерживаясь, подобно огню, непрестанным движением, исчезает купно с надеждою и страхом.
Люди не перестали бы жить вместе, хотя бы разошлись в разные стороны.
Магнит показывает на север и на юг; от человека зависит избрать хороший или дурной путь жизни.
Многие вещи нам непонятны не потому, что наши понятия слабы; но потому, что сии вещи не входят в круг наших понятий.
Многие люди подобны колбасам: чем их начинят, то и носят в себе.
Моменты свидания и разлуки суть для многих самые великие моменты в жизни.
Мудрость, подобно черепаховому супу, не всякому доступна.
Муравьиные яйца более породившей их твари; так и слава даровитого человека далеко продолжительнее собственной его жизни.
На беспристрастном безмене истории кисть Рафаэля имеет одинаковый вес с мечом Александра Македонского.
На дне каждого сердца есть осадок.
Настоящее есть следствие прошедшего, а потому непрестанно обращай взор свой на зады, чем сбережешь себя от знатных ошибок.
Наука изощряет ум; ученье вострит память.
Начало ясного дня смело уподоблю рождению невинного младенца: быть может, первый не обойдется без дождя, а жизнь второго без слёз.
Начинай от низшего степени, чтобы дойти до высшего; другими словами: не чеши затылок, а чеши пятки.
Начиная свое поприще, не теряй, о юноша! драгоценного времени!
Не будь портных, - скажи: как различил бы ты служебные ведомства?
Не будь цветов, все ходили бы в одноцветных одеяниях!
Не в совокупности ищи единства, но более - в единообразии разделения.
Не во всякой игре тузы выигрывают!
Не всякая щекотка доставляет удовольствие!
Не всякий генерал от природы полный.
Не всякий капитан - исправник!
Не всякому офицеру мундир к лицу.
Не всякому человеку даже гусарский мундир к лицу.
Не всё стриги, что растёт.
Не завидуй богатству: французский мудрец однажды остроумно заметил, что сетующий господин в позлащённом портшезе нередко носим весёлыми носильщиками.
Не печалуйся в скорбях, - уныние само наводит скорби.
Не покупай каштанов, но бери их на пробу.
Не поступай в монахи, если не надеешься выполнить обязанности свои добросовестно.
Не прибегай к щекотке, желая развеселить знакомую, - иная назовет тебя за это невежей.
Не растравляй раны ближнего; страдающему предлагай бальзам... Копая другому яму, сам в нее попадешь.
Не робей перед врагом: лютейший враг человека - он сам.
Не уступай малодушно всеобщим желаниям, если они противны твоим собственным; но лучше, хваля оные притворно и нарочно оттягивая время, норови надуть своих противников.
Не шути с женщинами: эти шутки глупы и неприличны.
Небо, усеянное звёздами, всегда уподоблю груди заслуженного генерала.
Незрелый ананас, для человека справедливого, всегда хуже зрелой смородины.
Неискусного вождя, желающего уподобиться Атилле, смело назову нагайкой провидения.
Некоторые образцом непостоянства выставляют мужчину, другие женщину; но всякий умный и наблюдательный петербуржец никогда не согласится ни с теми, ни с другими; ибо всего переменчивее петербургская атмосфера!
Нет столь великой вещи, которую не превзошла бы величиною ещё большая. Нет вещи столь малой, в которую не вместилась бы ещё меньшая.
Никогда не теряй из виду, что гораздо легче многих не удовлетворить, чем удовольствовать.
Никто не обнимет необъятного!
Никто, по Сенекину сказанию, не может оказать добродетели в другом случае, как в несчастии.
Ничего не доводи до крайности: человек, желающий трапезовать слишком поздно, рискует трапезовать на другой день поутру.
Ничто существующее исчезнуть не может, - так учит философия; и потому несовместимо с Вечною Правдой доносить о пропавших без вести!
Новые сапоги всегда жмут.
Ногти и волосы даны человеку для того, чтобы доставить ему постоянное, но лёгкое занятие.
Огорошенный судьбою, ты все ж не отчаивайся!
Одна природа неизменна, но и та имеет свои: весну, лето, зиму и осень; как же хочешь ты придать неизменность формам тела человеческого?!
Одного яйца два раза не высидишь!
Опять скажу: никто не обнимет необъятного!
От малых причин бывают весьма важные последствия; так, отгрызение заусенца причинило моему знакомому рак.
Отнюдь не принимай почетных гостей в разорванном халате!
Отыщи всему начало, и ты многое поймешь.
Память человека есть лист белой бумаги: иногда напишется хорошо, а иногда дурно.
Первый шаг младенца есть первый шаг к его смерти.
Перо, пишущее для денег, смело уподоблю шарманке в руках скитающегося иностранца.
Перочинный ножичек в руках искусного хирурга далеко лучше иного преострого ланцета.
Питомец рангов нередко портится.
Пища столь же необходима для здоровья, сколь необходимо приличное обращение человеку образованному.
Плюнь тому в глаза, кто скажет, что можно обнять необъятное!
Под сладкими выражениями таятся мысли коварные: так, от курящего табак нередко пахнет духами.
Поздравляя радующегося о полученном ранге, разумный человек поздравляет его не столько с рангом, сколько с тем, что получивший ранг толико оному радуется.
Покорность охлаждает гнев и даёт размер взаимным чувствам.
Полезнее пройти путь жизни, чем всю вселенную.
Полиция в жизни каждого государства есть.
Поощрение столь же необходимо гениальному писателю, сколь необходима канифоль смычку виртуоза.
Пороки входят в состав добродетели, как ядовитые снадобья в состав целебных средств.
Почти всякий человек подобен сосуду с кранами, наполненному живительною влагою производящих сил.
Почти всякое морщинистое лицо смело уподоблю груше, вынутой из компота.
Пояснительные выражения объясняют тёмные мысли.
Правда не вышла бы из колодезя, если бы сырость не испортила ее зеркала.
Прежде чем познакомишься с человеком, узнай: приятно ли его знакомство другим?
Принимаясь за дело, соберись с духом.
Прихоти производят разнородные действия во нраве, как лекарства в теле.
Приятно поласкать дитя или собаку, но всего необходимее полоскать рот.
Пробка шампанского, с шумом взлетевшая и столь же мгновенно ниспадающая, - вот изрядная картина любви.
Продлжать смеяться легче, чем окончить смех.
Прусак есть один из наиболее назойливых насекомых.
Пруссия должна быть королевством.
Пустая бочка Диогена имеет также свой вес в истории человеческой.
Разум показывает человеку не токмо внешний вид, красоту и доброту каждого предмета, но и снабдевает его действительным оного употреблением.
Рассуждай токмо о том, о чём понятия твои тебе сие дозволяют. Так: не зная законов языка ирокезского, можешь ли ты делать такое суждение по сему предмету, которое не было бы неосновательно и глупо?
Рассчитано, что петербуржец, проживающий на солнцепёке, выигрывает двадцать процентов здоровья.
Самолюбие и славолюбие суть лучшие удостоверения бессмертия души человеческой.
Самопожертвование есть цель для пули каждого стрелка.
Самый отдалённый пункт земного шара к чему-нибудь да близок, а самый близкий от чего-нибудь да отдалён.
Светский человек бьет на остроумие и, забывая ум, умерщвляет чувства.
Скрывая истину от друзей, кому ты откроешься?
Смерть для того поставлена в конце жизни, чтобы удобнее к ней приготовиться.
Смерть и солнце не могут пристально взирать друг на друга.
Смотри в корень!
Смотри вдаль - увидишь даль; смотри в небо - увидишь небо; взглянув в маленькое зеркальце, увидишь только себя.
Снег считают саваном омертвевшей природы; но он же служит первопутьем для жизненных припасов. Так разгадайте же природу!
Собака, сидящая на сене, вредна. Курица, сидящая на яйцах, полезна. От сидячей жизни тучнеют: так, всякий меняло жирен.
Советую каждому: даже не в особенно сырую и ветреную погоду закладывать уши хлопчатою бумагою или морским канатом.
Сократ справедливо называет бегущего воина трусом.
Соразмеряй добро, ибо как тебе ведать, куда оно проникнет? Лучи весеннего солнца, предназначенные токмо для согревания земляной поверхности, нежданно проникают и к месту, где лежат сапфиры!
Спокойствие многих было бы надёжнее, если бы дозволено было относить все неприятности на казённый счёт.
Сребролюбцы! сколь ничтожны ваши стяжания, коли все ваши сокровища не стоят одного листка из лаврового венка поэта!
Степенность есть надёжная пружина в механизме общежития.
Степенность равно прилична юноше и убеленному сединами старцу.
Стоящие часы не всегда испорчены, а иногда они только остановлены; и добрый прохожий не преминет в стенных покачнуть маятник, а карманные завести.
Стрельба в цель упражняет руку и причиняет верность глазу.
Стремись уплатить свой долг, и ты достигнешь двоякой цели, ибо тем самым его исполнишь.
Счастье подобно шару, который подкатывается: сегодня под одного, завтра под другого, послезавтра под третьего, потом под четвёртого, пятого и т.д., соответственно числу и очереди счастливых людей.
Талантами измеряются успехи цивилизации, и они же представляют верстовые столбы истории, служа телеграммами от предков и современников к потомству.
Три дела, однажды начавши, трудно кончить: а) вкушать хорошую пищу; б) беседовать с возвратившимся из похода другом и в) чесать, где чешется.
Трудись как муравей, если хочешь быть уподоблен пчеле.
У всякого портного свой взгляд на искусство!
У многих катанье на коньках производит одышку и трясение.
У человека для того поставлена голова вверху, чтобы он не ходил вверх ногами.
Укрываться от дождя под дырявым зонтиком столь же безрассудно и глупо, как чистить зубы наждаком или сандараком.
Умные речи подобны строкам, напечатанным курсивом.
Усердие всё превозмогает!
Усердный в службе не должен бояться своего незнанья; ибо каждое новое дело он прочтёт.
Философ легко торжествует над будущею и минувшею скорбями, но он же легко побеждается настоящею.
Хорошего правителя справедливо уподобляют кучеру.
Ценность всего условна: зубочистка в бисерном чехле, подаренная тебе в сувенир, несравненно дороже двух рублей с полтиной.
Часами измеряется время, а временем жизнь человеческая; но чем, скажи, измеришь ты глубину Восточного океана?
Человек ведёт переписку со всем земным шаром, а через печать сносится даже с отдалённым потомством.
Человек довольствует вожделения свои на обоих краях земного круга!
Человек раздвоен снизу, а не сверху, - для того, что две опоры надёжнее одной.
Человек! возведи взор свой от земли к небу, - какой, удивления достойный, является там порядок!
Человеку даны две руки на тот конец, дабы он, принимая левою, раздавал правою.
Чем скорее проедешь, тем скорее приедешь.
Чиновник умирает, и ордена его остаются на лице земли,
Чрезмерный богач, не помогающий бедным, подобен здоровенной кормилице, сосущей с аппетитом собственную грудь у колыбели голодающего дитяти.
Что есть лучшего? - Сравнив прошедшее, свести его с настоящим.
Что есть хитрость? - Хитрость есть оружие слабого и ум слепого.
Что имеем - не храним; потерявши - плачем.
Что скажут о тебе другие, коли ты сам о себе ничего сказать не можешь?
Чувствительный человек подобен сосульке; пригрей его, он растает.
Чужой нос другим соблазн.
Щёлкни кобылу в нос - она махнет хвостом.
Эгоист подобен давно сидящему в колодце.""".split("\n")
    }
}