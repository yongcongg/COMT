package sg.edu.tp.streamnow;

public class SongCollection {

    //default constructor
    Song[] songs = new Song[16];

    public SongCollection() {
        //create several Song object
        Song badHabits = new Song("S1001",
                "Bad Habits",
                "Ed Sheeran",
                "https://p.scdn.co/mp3-preview/0e537207ad0fff8c9e9011735c665d99b9b58d5e?cid=2afe87a64b0042dabf51f37318616965",
                "3:85", "latest release", R.drawable.edsheeran, "orJSJGHjBLI", "One, two, three, four\n" +
                "Ooh, ooh\n" +
                "\n" +
                "Every time you come around, you know I can't say no\n" +
                "Every time the sun goes down, I let you take control\n" +
                "I can feel the paradise before my world implodes\n" +
                "And tonight had something wonderful\n" +
                "\n" +
                "My bad habits lead to late nights, endin' alone\n" +
                "Conversations with a stranger I barely know\n" +
                "Swearin' this will be the last, but it probably won't\n" +
                "I got nothin' left to lose, or use, or do\n" +
                "\n" +
                "My bad habits lead to wide eyes starin' at space\n" +
                "And I know I'll lose control of the things that I say\n" +
                "Yeah, I was lookin' for a way out, now I can't escape\n" +
                "Nothin' happens after two, it's truе, it's true\n" +
                "My bad habits lead to you\n" +
                "\n" +
                "Ooh-ooh, ooh-ooh\n" +
                "My bad habits lead to you\n" +
                "Ooh-ooh, ooh-ooh\n" +
                "My bad habits lеad to you\n" +
                "\n" +
                "Every pure intention ends when the good times start\n" +
                "Fallin' over everything to reach the first-time spark\n" +
                "Started under neon lights and then it all got dark\n" +
                "I only know how to go too far\n" +
                "\n" +
                "My bad habits lead to late nights, endin' alone\n" +
                "Conversations with a stranger I barely know\n" +
                "Swearin' this will be the last, but it probably won't\n" +
                "I got nothin' left to lose, or use, or do\n" +
                "\n" +
                "My bad habits lead to wide eyes starin' at space\n" +
                "And I know I'll lose control of the things that I say\n" +
                "Yeah, I was lookin' for a way out, now I can't escape\n" +
                "Nothin' happens after two, it's truе, it's true\n" +
                "My bad habits lead to you\n" +
                "\n" +
                "Ooh-ooh, ooh-ooh\n" +
                "My bad habits lead to you\n" +
                "Ooh-ooh, ooh-ooh\n" +
                "\n" +
                "We took the long way 'round\n" +
                "And burned 'til the fun ran out, now\n" +
                "\n" +
                "My bad habits lead to late nights, endin' alone\n" +
                "Conversations with a stranger I barely know\n" +
                "Swearin' this will be the last, but it probably won't\n" +
                "I got nothin' left to lose, or use, or do\n" +
                "My bad habits lead to wide eyes starin' at space\n" +
                "And I know I'll lose control of the things that I say\n" +
                "Yeah, I was lookin' for a way out, now I can't escape\n" +
                "Nothin' happens after two, it's truе, it's true\n" +
                "My bad habits lead to you\n" +
                "\n" +
                "Ooh-ooh, ooh-ooh\n" +
                "My bad habits lead to you\n" +
                "Ooh-ooh, ooh-ooh\n" +
                "My bad habits lead to you");

        //create the second song, called billieJean
        Song gone = new Song(
                "S1002",
                "Gone",
                "ROSÉ",
                "https://p.scdn.co/mp3-preview/fa0669783e655baa57d009a7060618a96d8639f1?cid=2afe87a64b0042dabf51f37318616965",
                "3:45",
                "Trending", R.drawable.rose, "K9_VFxzCuQ0",
                "I thought that you'd remember, but it seems that you forgot\n" +
                "It's hard for me to blame you when you were already lost\n" +
                "Oh, yeah, I'm tired of always waiting, oh, yeah, yeah\n" +
                "I see you changed your number, that's why you don't get my calls\n" +
                "I gave you all of me, now you don't wanna be involved\n" +
                "Oh, yeah, yeah, I really gotta face it, oh, yeah, yeah\n" +
                        "\n" +
                "I just wanna be the one\n" +
                "But to you, we're already done\n" +
                "Tell me, why'd you have to hit-and-run me?\n" +
                "Now I'm all alone crying ugly\n" +
                "You broke my heart just for fun\n" +
                "Took my love and just left me numb\n" +
                "Now it's eight in the morning\n" +
                "Hate in the morning (all because of you)\n" +
                        "\n" +
                "Another story that's sad and true\n" +
                "I can feel the pain, can you?\n" +
                "You had to be the one to let me down\n" +
                "To color me blue\n" +
                "Hate to see you with someone new\n" +
                "I'll put a curse on her and you\n" +
                "Ain't no looking back, now you're dead and gone\n" +
                "My love is gone too\n" +
                "\n" +
                "All my love is go-o-o-o-o-o-o-o-one\n" +
                "All my love is go-o-o-o-o-o-o-o-one\n" +
                "All my love is go-o-o-o-o-o-o-o-one\n" +
                "All my love is gone\n" +
                "Now you're dead and gone\n" +
                        "\n" +
                "All my love is gone and the hate has grown\n" +
                "I'm standing all alone and I'm searching for something\n" +
                "But I can't feel nothing\n" +
                "I pack my bags and go, this don't feel like home\n" +
                "Too much darkness for a rainbow, I feel so used\n" +
                "How am I supposed to live without you? I refuse, yeah\n" +
                        "\n" +
                "I just wanna be the one\n" +
                "But to you, we're already done\n" +
                "Tell me, why'd you have to hit-and-run me?\n" +
                "Now I'm all alone crying ugly\n" +
                "You broke my heart just for fun\n" +
                "Took my love and just left me numb\n" +
                "Now it's eight in the morning\n" +
                "Hate in the morning (all because of you)\n" +
                        "\n" +
                "Another story that's sad and true\n" +
                "I can feel the pain, can you?\n" +
                "You had to be the one to let me down\n" +
                "To color me blue\n" +
                "Hate to see you with someone new\n" +
                "I'll put a curse on her and you\n" +
                "Ain't no looking back, now you're dead and gone\n" +
                "My love is gone, too\n" +
                        "\n" +
                "All my love is go-o-o-o-o-o-o-o-one\n" +
                "All my love is go-o-o-o-o-o-o-o-one\n" +
                "All my love is go-o-o-o-o-o-o-o-one\n" +
                "All my love is gone\n" +
                "Now you're dead and gone");

        Song iLoveYouMoreThanAnyone = new Song("S1003",
                "I love you more than anyone", "TWICE",
                "https://p.scdn.co/mp3-preview/2364121400c91fb4fb68ef83b85e92a3b56f5a5e?cid=2afe87a64b0042dabf51f37318616965", "3:40",
                "latest release", R.drawable.hospital_playlist, "DG6aqGQea2s", "이 세상 누구보다 널 사랑해\n" +
                "너의 작은 세상을\n" +
                "바이올렛 향기 같은\n" +
                "너의 미소를 언제까지 영원히\n" +
                "누구보다 너를 사랑해\n" +
                "파란하늘 꿈처럼\n" +
                "변함 없는 친구 같은 너의 마음을\n" +
                "언제까지 영원히\n" +
                "\n" +
                "아침 햇살이 창가에 비칠 때면\n" +
                "너의 해맑은 미소가 행복하게 해\n" +
                "\n" +
                "I do want you love for me\n" +
                "I do want you love for me\n" +
                "I do want you love for me\n" +
                "I do want you love for me\n" +
                "I do want you love for me\n" +
                "I do want you love for me\n" +
                "Woo\n" +
                "\n" +
                "가끔 길을 걸어가다 뒤를 돌아보면 (I do want your love for me)\n" +
                "너와 함께 했던 지난 날이 너무나 그리워 (I do want your love for me)\n" +
                "아주아주 오랜시간이 지나 (I do want your love for me)\n" +
                "그땐 또 오늘을 그리워하겠지(I do want your love for me)\n" +
                "언제나 넌 내곁에 있어주었지\n" +
                "힘들때도 기쁠때도\n" +
                "너는 나의 사랑스러운 친구인거야\n" +
                "이제는 너를 위해 내가 모든걸 해주고 싶어\n" +
                "\n" +
                "두 눈을 감고 파란 하늘을 봐\n" +
                "우리 함께 그린 예쁜 세상을\n" +
                "\n" +
                "I do want you love for me\n" +
                "I do want you love for me\n" +
                "I do want you love for me\n" +
                "I do want you love for me\n" +
                "I do want you love for me\n" +
                "I do want you love for me\n" +
                "Woo\n" +
                "\n" +
                "너와 함께 하며 지내온 날들\n" +
                "그 속에 간직한 우리의 사랑을\n" +
                "언제까지나 (언제까지나)\n" +
                "너를 사랑해 (난 너를 사랑해)\n" +
                "너의 모든것을 언제까지나\n" +
                "\n" +
                "아침 햇살 맑은 창가에 기대어 (언제까지나)\n" +
                "바람에 실려온 너의 향기를 맡으면\n" +
                "우리 작은 두 손에 담긴 아름다운 세상 (너를 사랑해)\n" +
                "언제까지 우리를 비추어 줄거야\n" +
                "지난 여름 바닷가에 담긴 (너의 모든갓을)\n" +
                "너와의 작은 약속과 행복한 꿈들이\n" +
                "언제까지 너와 나의 마음속에서 (언제까지나)\n" +
                "영원히 우리를 비출거야");

        Song shuoHaoBuKu = new Song("S1004",
                "說好不哭", "Jay Chou, Ashin Chen",
                "https://p.scdn.co/mp3-preview/e72b922310c07063528396d411b912721eadfa67?cid=2afe87a64b0042dabf51f37318616965", "3:52",
                "Trending",
                R.drawable.jaychou, "HK7SPnGSxLM", "沒有了聯絡\n" +
                "後來的生活\n" +
                "我都是聽別人說\n" +
                "說妳怎麼了\n" +
                "說妳怎麼過\n" +
                "放不下的人是我\n" +
                "人多的時候 就待在角落\n" +
                "就怕別人問起我\n" +
                "你們怎麼了 妳低著頭\n" +
                "護著我 連抱怨都沒有\n" +
                "電話開始躲\n" +
                "從不對我說\n" +
                "不習慣一個人生活\n" +
                "離開我以後 要我好好過\n" +
                "怕打擾想自由的我\n" +
                "都這個時候 妳還在意著\n" +
                "別人是怎麼怎麼看我的\n" +
                "拼命解釋著 不是我的錯\n" +
                "是妳要走\n" +
                "\n" +
                "眼看著妳難過\n" +
                "挽留的話卻沒有說\n" +
                "妳會微笑放手\n" +
                "說好不哭讓我走\n" +
                "\n" +
                "\n" +
                "電話開始躲 從不對我說\n" +
                "不習慣一個人生活\n" +
                "離開我以後 要我好好過\n" +
                "怕打擾想自由的我\n" +
                "都這個時候 你還在意著\n" +
                "別人是怎麼怎麼看我的\n" +
                "拼命解釋著 不是我的錯\n" +
                "是妳要走\n" +
                "\n" +
                "眼看著妳難過\n" +
                "挽留的話卻沒有說\n" +
                "妳會微笑放手\n" +
                "說好不哭讓我走\n" +
                "你什麼都沒有\n" +
                "卻還為我的夢加油\n" +
                "心疼過了多久\n" +
                "心疼過了多久\n" +
                "還在找理由等我");

        Song lilac = new Song("IU", "LILAC", "IU",
                "https://p.scdn.co/mp3-preview/c319bedc9815f9b0defe289b07e581602e577781?cid=2afe87a64b0042dabf51f37318616965", "4:40",
                "latest release", R.drawable.iu, "v7bnOxV4jAc", "나리는 꽃가루에 눈이 따끔해 (아야)\n" +
                "눈물이 고여도 꾹 참을래\n" +
                "내 마음 한켠 비밀스런 오르골에 넣어두고서\n" +
                "영원히 되감을 순간이니까\n" +
                "\n" +
                "우리 둘의 마지막 페이지를 잘 부탁해\n" +
                "어느 작별이 이보다 완벽할까\n" +
                "Love me only till this spring\n" +
                "\n" +
                "오 라일락 꽃이 지는 날 goodbye\n" +
                "이런 결말이 어울려\n" +
                "안녕 꽃잎 같은 안녕\n" +
                "하이얀 우리 봄날의 climax\n" +
                "아 얼마나 기쁜 일이야\n" +
                "\n" +
                "Ooh ooh\n" +
                "Love me only till this spring\n" +
                "봄바람처럼\n" +
                "Ooh ooh\n" +
                "Love me only till this spring\n" +
                "봄바람처럼\n" +
                "\n" +
                "기분이 달아 콧노래 부르네 (랄라)\n" +
                "입꼬리는 살짝 올린 채\n" +
                "어쩜 이렇게 하늘은 더 바람은 또 완벽한 건지\n" +
                "오늘따라 내 모습 맘에 들어\n" +
                "\n" +
                "처음 만난 그날처럼 예쁘다고 말해줄래\n" +
                "어느 이별이 이토록 달콤할까\n" +
                "Love resembles misty dream\n" +
                "\n" +
                "오 라일락 꽃이 지는 날 goodbye\n" +
                "이런 결말이 어울려\n" +
                "안녕 꽃잎 같은 안녕\n" +
                "하이얀 우리 봄날의 climax\n" +
                "아 얼마나 기쁜 일이야\n" +
                "Ooh ooh\n" +
                "Love resembles misty dream\n" +
                "뜬구름처럼\n" +
                "\n" +
                "Ooh ooh\n" +
                "Love resembles misty dream\n" +
                "뜬구름처럼\n" +
                "\n" +
                "너도 언젠가 날 잊게 될까\n" +
                "지금 표정과 오늘의 향기도\n" +
                "단잠 사이에 스쳐간\n" +
                "봄날의 꿈처럼\n" +
                "\n" +
                "오 라일락 꽃이 지는 날 goodbye\n" +
                "너의 대답이 날 울려\n" +
                "안녕 약속 같은 안녕\n" +
                "하이얀 우리 봄날에 climax\n" +
                "아 얼마나 기쁜 일이야\n" +
                "Ooh ooh\n" +
                "Love me only until this spring\n" +
                "봄바람처럼\n" +
                "\n" +
                "Ooh ooh (oh)\n" +
                "Love me only until this spring\n" +
                "봄바람처럼\n" +
                "\n" +
                "Ooh ooh\n" +
                "Love resembles misty dream\n" +
                "뜬구름처럼\n" +
                "Ooh ooh\n" +
                "Love resembles misty dream\n" +
                "뜬구름처럼");

        Song bedroom = new Song("jjlin", "Bedroom", "JJ Lin, Anne Marie",
                "https://p.scdn.co/mp3-preview/abd086b955666026cf5647694d7160e6b69302b2?cid=2afe87a64b0042dabf51f37318616965",
                "3:40", "Recommended", R.drawable.jjlin, "LPSFjYh7TTw", "Ooh, why you look so sad?\n" +
                "I've never seen you look so bad\n" +
                "You used to be the strongest of us two\n" +
                "Now look at you sitting there\n" +
                "Ooh, no one's picking up the phone\n" +
                "The party's over and you're all alone\n" +
                "I used to give a fuck 'bout me and you\n" +
                "Now I look at you and I don't care\n" +
                "\n" +
                "You're cryin' in your bedroom\n" +
                "'Cause I've gone and left you\n" +
                "Wish I never met you\n" +
                "Don't know what you've got until it's gone\n" +
                "You're cryin' in your bedroom\n" +
                "Easy to forget you\n" +
                "Done this to yourself and now I'm gone\n" +
                "\n" +
                "Now I'm celebrating\n" +
                "My God, I bet you hate it\n" +
                "I can't believe I'vе waited for you for so long\n" +
                "You're cryin' in your bedroom\n" +
                "'Cause I'vе gone and left you\n" +
                "Don't know what you've got until it's gone, gone\n" +
                "\n" +
                "Ooh, why you look so sad, girl?\n" +
                "I've never seen you look so bad\n" +
                "You used to be the strongest of us two\n" +
                "Now look at you sitting there\n" +
                "Ooh, no one's picking up the phone\n" +
                "Ooh, the party's over and you're all alone\n" +
                "I used to give a fuck 'bout me and you\n" +
                "Now I look at you and I don't care\n" +
                "\n" +
                "You're cryin' in your bedroom\n" +
                "'Cause I've gone and left you\n" +
                "Wish I never met you\n" +
                "Don't know what you've got until it's gone\n" +
                "You're cryin' in your bedroom\n" +
                "Easy to forget you\n" +
                "Done this to yourself and now I'm gone\n" +
                "\n" +
                "Now I'm celebrating\n" +
                "My God, I bet you hate it\n" +
                "I can't believe I've waited for you for so long\n" +
                "You're cryin' in your bedroom\n" +
                "'Cause I've gone and left you\n" +
                "Don't know what you've got until it's gone, gone");

        Song shuoLeZaiJian = new Song("shuoLeZaiJian", "說了再見", "Jay Chou",
                "https://p.scdn.co/mp3-preview/6c5d3d5c940e4d161220c6a21ce5d1ea2243ebed?cid=2afe87a64b0042dabf51f37318616965",
                "4:71", "Recommended", R.drawable.jaychou2, "KKsioz-zaZY", "天涼了 雨下了 妳走了\n" +
                "清楚了 我愛的 遺失了\n" +
                "落葉飄在湖面上睡著了\n" +
                "\n" +
                "想要放 放不掉 淚在飄\n" +
                "妳看看 妳看看不到\n" +
                "我假裝過去不重要 卻發現自己辦不到\n" +
                "\n" +
                "說了再見 才發現再也見不到\n" +
                "我不能就這樣失去妳的微笑\n" +
                "口紅待在桌角 而妳我找不到\n" +
                "若角色對調妳說好不好\n" +
                "說了再見 才發現再也見不到\n" +
                "能不能就這樣忍著痛淚不掉\n" +
                "說好陪我到老 永恆往哪裡找\n" +
                "再次擁抱一分一秒都好\n" +
                "\n" +
                "天涼了 雨下了 妳走了\n" +
                "清楚了 我愛的 遺失了\n" +
                "落葉飄在湖面上睡著了\n" +
                "\n" +
                "想要放 放不掉 淚在飄\n" +
                "妳看看 妳看看不到\n" +
                "我假裝過去不重要 卻發現自己辦不到\n" +
                "\n" +
                "說了再見 才發現再也見不到\n" +
                "我不能就這樣失去妳的微笑\n" +
                "口紅待在桌角 而妳我找不到\n" +
                "若角色對調你說好不好\n" +
                "\n" +
                "妳的笑 妳的好\n" +
                "腦海裡 一直在繞\n" +
                "我的手 忘不了 妳手的溫度\n" +
                "心碎了一地 撿不回\n" +
                "從前的心跳 身陷過去我無力逃跑\n" +
                "\n" +
                "說再見 才發現再也見不到\n" +
                "能不能就這樣忍著痛淚不掉\n" +
                "說好陪我到老 永恆往哪裡找\n" +
                "再次擁抱一分一秒都好");

        Song neverGonnaGiveYouUp = new Song("rick", "Never Gonna Give You Up", "Rick Astley",
                "https://p.scdn.co/mp3-preview/0b6da17f858f104337fac626c4bac972d3947564?cid=2afe87a64b0042dabf51f37318616965",
                "3:56", "Trending", R.drawable.rick, "dQw4w9WgXcQ", "We're no strangers to love\n" +
                "You know the rules and so do I\n" +
                "A full commitment's what I'm thinking of\n" +
                "You wouldn't get this from any other guy\n" +
                "\n" +
                "I just wanna tell you how I'm feeling\n" +
                "Gotta make you understand\n" +
                "\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "\n" +
                "We've known each other for so long\n" +
                "Your heart's been aching but you're too shy to say it\n" +
                "Inside we both know what's been going on\n" +
                "We know the game and we're gonna play it\n" +
                "And if you ask me how I'm feeling\n" +
                "Don't tell me you're too blind to see\n" +
                "\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "\n" +
                "Never gonna give, never gonna give\n" +
                "(Give you up)\n" +
                "\n" +
                "We've known each other for so long\n" +
                "Your heart's been aching but you're too shy to say it\n" +
                "Inside we both know what's been going on\n" +
                "We know the game and we're gonna play it\n" +
                "\n" +
                "I just wanna tell you how I'm feeling\n" +
                "Gotta make you understand\n" +
                "\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n" +
                "\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye");

        Song perfect = new Song("perfect", "Perfect", "Ed Sheeran",
                "https://p.scdn.co/mp3-preview/9779493d90a47f29e4257aa45bc6146d1ee9cb26?cid=2afe87a64b0042dabf51f37318616965",
                "4:39", "Recommended", R.drawable.perfect, "2Vv-BfVoq4g", "I found a love for me\n" +
                "Oh darling, just dive right in and follow my lead\n" +
                "Well, I found a girl, beautiful and sweet\n" +
                "Oh, I never knew you were the someone waiting for me\n" +
                "\n" +
                "'Cause we were just kids when we fell in love\n" +
                "Not knowing what it was\n" +
                "I will not give you up this time\n" +
                "But darling, just kiss me slow, your heart is all I own\n" +
                "And in your eyes, you're holding mine\n" +
                "\n" +
                "Baby, I'm dancing in the dark with you between my arms\n" +
                "\n" +
                "Barefoot on the grass, listening to our favourite song\n" +
                "When you said you looked a mess, I whispered underneath my breath\n" +
                "But you heard it, darling, you look perfect tonight\n" +
                "\n" +
                "Well I found a woman, stronger than anyone I know\n" +
                "She shares my dreams, I hope that someday I'll share her home\n" +
                "I found a love, to carry more than just my secrets\n" +
                "To carry love, to carry children of our own\n" +
                "\n" +
                "We are still kids, but we're so in love\n" +
                "Fighting against all odds\n" +
                "I know we'll be alright this time\n" +
                "Darling, just hold my hand\n" +
                "Be my girl, I'll be your man\n" +
                "I see my future in your eyes\n" +
                "\n" +
                "Baby, I'm dancing in the dark, with you between my arms\n" +
                "Barefoot on the grass, listening to our favorite song\n" +
                "When I saw you in that dress, looking so beautiful\n" +
                "I don't deserve this, darling, you look perfect tonight\n" +
                "\n" +
                "Baby, I'm dancing in the dark, with you between my arms\n" +
                "Barefoot on the grass, listening to our favorite song\n" +
                "I have faith in what I see\n" +
                "Now I know I have met an angel in person\n" +
                "And she looks perfect\n" +
                "I don't deserve this\n" +
                "You look perfect tonight");

        Song dontStopBelieving = new Song("Journey", "Don't Stop Believin'", "Journey", "https://p.scdn.co/mp3-preview/22fc6f236d03377ef665ff9bb83aca1c654f8032?cid=2afe87a64b0042dabf51f37318616965",
                "4:16", "Recommended", R.drawable.dont_stop_believing, "VcjzHMhBtf0", "Just a small town girl\n" +
                "Livin' in a lonely world\n" +
                "She took the midnight train goin' anywhere\n" +
                "Just a city boy\n" +
                "Born and raised in South Detroit\n" +
                "He took the midnight train goin' anywhere\n" +
                "\n" +
                "A singer in a smokey room\n" +
                "The smell of wine and cheap perfume\n" +
                "For a smile they can share the night\n" +
                "It goes on and on, and on, and on\n" +
                "\n" +
                "Strangers, waitin'\n" +
                "Up and down the boulevard\n" +
                "Their shadows\n" +
                "Searchin' in the night\n" +
                "Streetlights, people\n" +
                "Livin' just to find emotion\n" +
                "Hidin' somewhere in the night\n" +
                "\n" +
                "Workin' hard to get my fill\n" +
                "Everybody wants a thrill\n" +
                "Payin' anything to roll the dice\n" +
                "Just one more time\n" +
                "Some will win\n" +
                "Some will lose\n" +
                "Some were born to sing the blues\n" +
                "Oh, the movie never ends\n" +
                "It goes on and on, and on, and on\n" +
                "\n" +
                "Strangers waitin'\n" +
                "Up and down the boulevard\n" +
                "Their shadows\n" +
                "Searchin' in the night\n" +
                "Streetlights, people\n" +
                "Livin' just to find emotion\n" +
                "Hidin' somewhere in the night\n" +
                "\n" +
                "Don't stop believin'\n" +
                "Hold on to that feelin'\n" +
                "Streetlight, people\n" +
                "\n" +
                "Don't stop, believin'\n" +
                "Hold on\n" +
                "Streetlights, people\n" +
                "Don't stop believin'\n" +
                "Hold on to that feelin'\n" +
                "Streetlight, people");

        Song forYou = new Song("forYou", "For You", "CHEN, BAEKHYUN, XIUMIN", "https://p.scdn.co/mp3-preview/6fa2656782fcb8d419ce70fccc12ad3b64229829?cid=2afe87a64b0042dabf51f37318616965",
                "3:28", "Recommended", R.drawable.for_you, "JvjWy4saR08",
                "다른 공간의 다른 시간이지만\n" +
                        "내 사랑이 맞을거야\n" +
                        "바람에 스치는 너의 향기로도\n" +
                        "난 너인걸 알수 있어\n" +
                        "\n" +
                        "But i don't know\n" +
                        "내 맘속에 언제부터 니가 산건지\n" +
                        "I don't know\n" +
                        "너를 보면 설레는 이유\n" +
                        "\n" +
                        "나를 스쳐 지나가도 돼\n" +
                        "니가 날 다 잊었으니까\n" +
                        "니가 기억할 때까지\n" +
                        "나는 너를 기다릴테니까\n" +
                        "그대여 나를 바라봐줘요\n" +
                        "\n" +
                        "여전히 그대도 나를 사랑하나요\n" +
                        "그대여 내눈을 보고 얘기해줘요\n" +
                        "사랑하는 맘은 숨겨지지 않아요\n" +
                        "\n" +
                        "너에겐 내가 곁에\n" +
                        "있었단 사실을\n" +
                        "절대로 잊지는 마\n" +
                        "널 위해 모든걸\n" +
                        "바칠 수 있었던\n" +
                        "내 마음을 지우지마\n" +
                        "\n" +
                        "But i don't know\n" +
                        "내맘속에 언제부터 니가 산건지\n" +
                        "I don't know\n" +
                        "너를 보면 설레는 이유\n" +
                        "\n" +
                        "나를 스쳐 지나가도 돼\n" +
                        "니가 날 다 잊었으니까\n" +
                        "니가 기억할 때까지\n" +
                        "나는 너를 기다릴테니까\n" +
                        "\n" +
                        "같은 공간 같은 시간\n" +
                        "함께 있잖아\n" +
                        "언제라도 내 곁에 와\n" +
                        "너의 자리로\n" +
                        "\n" +
                        "라라라라라라라\n" +
                        "With you 너를 위해서\n" +
                        "그대여 나를 바라봐줘요\n" +
                        "여전히 그대도 나를 사랑하나요");

        Song ourSong = new Song("ourSong", "Our Song", "Anne-Marie, Niall Horan", "https://p.scdn.co/mp3-preview/7661e0d7ac4c18e070a6c015d56d62fc3992fc46?cid=2afe87a64b0042dabf51f37318616965",
                "3:23", "Trending", R.drawable.our_song, "2Z8L4Qed8F8",
                "I'll be honest\n" +
                        "I'm all right with me\n" +
                        "Sunday mornings\n" +
                        "In my own bedsheets\n" +
                        "\n" +
                        "I've been waking up alone\n" +
                        "I haven't thought of her for days\n" +
                        "I'll be honest\n" +
                        "It's better off this way\n" +
                        "\n" +
                        "But every time I think that I can get you out my head\n" +
                        "You never, ever let me forget\n" +
                        "'Cause\n" +
                        "\n" +
                        "Just when I think you're gone\n" +
                        "Hear our song on the radio\n" +
                        "Just like that, takes me back\n" +
                        "To the places we used to go\n" +
                        "And I've been trying but I just can't fight it\n" +
                        "When I hear it, I just can't stop smiling\n" +
                        "I remember you're gone\n" +
                        "Baby, it's just a song on the radio\n" +
                        "That we used to know\n" +
                        "\n" +
                        "I'll be honest\n" +
                        "I'm all right with me\n" +
                        "Sunday mornings\n" +
                        "In my own white tee\n" +
                        "\n" +
                        "I've been waking up alone\n" +
                        "I haven't thought of him for days\n" +
                        "I'll be honest\n" +
                        "It's better off this way\n" +
                        "\n" +
                        "Every time I think that I can get you out my head\n" +
                        "You never, ever let me forget\n" +
                        "'Cause\n" +
                        "\n" +
                        "Just when I think you're gone\n" +
                        "Hear our song on the radio\n" +
                        "Just like that, takes me back\n" +
                        "To the places we used to go\n" +
                        "And I've been trying but I just can't fight it\n" +
                        "When I hear it, I just can't stop smiling\n" +
                        "I remember you're gone\n" +
                        "Baby, it's just a song on the radio\n" +
                        "That we used to know\n" +
                        "\n" +
                        "Just when I think you're gone\n" +
                        "Hear our song on the radio\n" +
                        "Just like that, takes me back\n" +
                        "To the places we used to go\n" +
                        "\n" +
                        "And I've been trying but I just can't fight it\n" +
                        "When I hear it, I just can't stop smiling\n" +
                        "I remember you're gone\n" +
                        "Baby, it's just a song on the radio\n" +
                        "And I've been trying but I just can't fight it\n" +
                        "When I hear it, I just can't stop smiling\n" +
                        "I remember you're gone\n" +
                        "Baby, it's just a song on the radio\n" +
                        "That we used to know");

        Song lovesickGirls = new Song("lovesickGirls", "Lovesick Girls", "BLACKPINK", "https://p.scdn.co/mp3-preview/b65a34d10898c6f07baa7b1edd979f97283f1bfd?cid=2afe87a64b0042dabf51f37318616965",
                "3:21", "Trending", R.drawable.lovesick_girls, "dyRsYk0LyA8",
                "Lovesick girls\n" +
                        "Lovesick girls\n" +
                        "\n" +
                        "영원한 밤\n" +
                        "창문 없는 방에 우릴 가둔 love (love)\n" +
                        "What can we say?\n" +
                        "매번 아파도 외치는 love (love)\n" +
                        "\n" +
                        "다치고 망가져도 나 뭘 믿고 버티는 거야\n" +
                        "어차피 떠나면 상처투성인 채로 미워하게 될걸\n" +
                        "끝장을 보기 전 끝낼 순 없어\n" +
                        "이 아픔을 기다린 것처럼\n" +
                        "\n" +
                        "아마 다 잠깐 일지도 몰라\n" +
                        "우린 무얼 찾아서 헤매는 걸까?\n" +
                        "But I don't care, I'll do it over and over\n" +
                        "내 세상 속엔 너만 있으면 돼\n" +
                        "\n" +
                        "We are the lovesick girls\n" +
                        "네 멋대로 내 사랑을 끝낼 순 없어\n" +
                        "We are the lovesick girls\n" +
                        "이 아픔 없인 난 아무 의미가 없어\n" +
                        "\n" +
                        "But we were born to be alone\n" +
                        "Yeah, we were born to be alone\n" +
                        "Yeah, we were born to be alone\n" +
                        "But why we still looking for love?\n" +
                        "\n" +
                        "No love letters, no X and O's\n" +
                        "No love, never, my exes know\n" +
                        "No diamond rings, that set in stone\n" +
                        "To the left, better left alone\n" +
                        "Didn't wanna be a princess, I'm priceless\n" +
                        "A prince not even on my list\n" +
                        "Love is a drug that I quit\n" +
                        "No doctor could help when I'm lovesick\n" +
                        "\n" +
                        "아마 다 잠깐일지도 몰라\n" +
                        "우린 무얼 찾아서 헤매는 걸까?\n" +
                        "불안한 내 눈빛 속에 널 담아\n" +
                        "아프더라도 너만 있으면 돼\n" +
                        "\n" +
                        "We are the lovesick girls\n" +
                        "네 멋대로 내 사랑을 끝낼 순 없어\n" +
                        "We are the lovesick girls\n" +
                        "이 아픔 없인 난 아무 의미가 없어\n" +
                        "\n" +
                        "But we were born to be alone\n" +
                        "Yeah, we were born to be alone\n" +
                        "Yeah, we were born to be alone\n" +
                        "But why we still looking for love?\n" +
                        "\n" +
                        "사랑은 slippin' and fallin', 사랑은 killin' your darlin'\n" +
                        "아프다 아물면 또 찾아오는 이 겁 없는 떨림\n" +
                        "들리지 않아 what you say, 이 아픔이 난 행복해\n" +
                        "나를 불쌍해하는 네가 내 눈엔 더 불쌍해\n" +
                        "\n" +
                        "We are the lovesick girls\n" +
                        "네 멋대로 내 사랑을 끝낼 순 없어\n" +
                        "We are the lovesick girls\n" +
                        "이 아픔 없인 난 아무 의미가 없어\n" +
                        "\n" +
                        "모두 결국 떠나가고\n" +
                        "(Lovesick girls) 내 눈물이 무뎌져도\n" +
                        "(Lovesick girls) 아프고 또 아파도\n" +
                        "(Lovesick girls) But we're still looking for love");

        Song feng = new Song("feng", "楓", "Jay Chou", "https://p.scdn.co/mp3-preview/f5007606f85922f7245aa1efdce39e8b92b85e1d?cid=2afe87a64b0042dabf51f37318616965",
                "4:45", "Try out", R.drawable.feng, "qzwsQTY-99o",
                "烏雲在我們心裡擱下一塊陰影\n" +
                        "我聆聽沉寂已久的心情\n" +
                        "清晰透明 就像美麗的風景\n" +
                        "總在回憶裡才看的清\n" +
                        "\n" +
                        "被傷透的心能不能夠繼續愛我\n" +
                        "我用力牽起沒溫度的雙手\n" +
                        "過往溫柔已經被時間上鎖\n" +
                        "只剩揮散不去的難過\n" +
                        "\n" +
                        "緩緩飄落的楓葉像思念\n" +
                        "我點燃燭火溫暖歲末的秋天\n" +
                        "極光掠奪天邊 北風掠過想你的容顏\n" +
                        "我把愛燒成了落葉\n" +
                        "卻換不回熟悉的那張臉\n" +
                        "\n" +
                        "緩緩飄落的楓葉像思念\n" +
                        "為何挽回要趕在冬天來之前\n" +
                        "愛你穿越時間 兩行來自秋末的眼淚\n" +
                        "讓愛滲透了地面\n" +
                        "我要的只是你在我身邊\n" +
                        "\n" +
                        "被傷透的心能不能夠繼續愛我\n" +
                        "我用力牽起沒溫度的雙手\n" +
                        "過往溫柔已經被時間上鎖\n" +
                        "只剩揮散不去的難過\n" +
                        "\n" +
                        "在山腰間飄逸的紅雨\n" +
                        "隨著北風凋零 我輕輕搖曳風鈴\n" +
                        "想 喚醒被遺棄的愛情\n" +
                        "雪花已鋪滿了地 深怕窗外楓葉已結成冰\n" +
                        "\n" +
                        "緩緩飄落的楓葉像思念\n" +
                        "我點燃燭火溫暖歲末的秋天\n" +
                        "極光掠奪天邊 北風掠過想你的容顏\n" +
                        "我把愛燒成了落葉\n" +
                        "卻換不回熟悉的那張臉\n" +
                        "\n" +
                        "緩緩飄落的楓葉像思念\n" +
                        "為何挽回要趕在冬天來之前\n" +
                        "愛你穿越時間 兩行來自秋末的眼淚\n" +
                        "讓愛滲透了地面\n" +
                        "我要的只是你在我身邊");

        Song cryForMe = new Song("cryForMe", "CRY FOR ME", "TWICE", "https://p.scdn.co/mp3-preview/d5ed2589a2c933530c722fe2c940558299351b3f?cid=2afe87a64b0042dabf51f37318616965",
                "3:40", "Try out", R.drawable.cry_for_me, "FO0iwx3PUHo",
                "I know 고쳐 쓸 가치도 없단 걸\n" +
                        "하지만 그녀와 달리\n" +
                        "난 널 쉽게 놔줄 맘이 없거든 (never let go)\n" +
                        "\n" +
                        "You don't know me, L-O-V-E or hatred\n" +
                        "이별 대신 난 순진한 미소만\n" +
                        "오늘도 네 품에 안길래\n" +
                        "\n" +
                        "Oh, 아무것도 모르는 척\n" +
                        "Baby, no more real love\n" +
                        "너의 곁에 있어 줄게\n" +
                        "마지막엔 break your heart\n" +
                        "Bad boy, bad boy\n" +
                        "Yeah, you really make me a mad girl, mad girl, whoa, oh, oh\n" +
                        "\n" +
                        "I want you to cry, cry for me\n" +
                        "내가 울었던 것처럼, cry for me\n" +
                        "Make your rain fall, cry for me\n" +
                        "But again\n" +
                        "\n" +
                        "조금씩, 조금씩 또 빠져가\n" +
                        "사랑에 내 결심이 또 무너져가\n" +
                        "용서할 핑계를 만들어가\n" +
                        "I want you to, I want you to, I want you to cry for me\n" +
                        "\n" +
                        "Hmm (yah)\n" +
                        "I don't know, 너란 놈 미워질 줄 모르고\n" +
                        "친구들한텐 또 너를 감싸주는 중 (yah-yah, yah-yah)\n" +
                        "바보가 돼 버렸군 (yah-yah, yah-yah, yeah)\n" +
                        "\n" +
                        "Ooh, 너 왜 자꾸 나를 보며 웃는데?\n" +
                        "딱 한 번의 눈물이면 되는데 (ooh)\n" +
                        "Cry for me, let me please forgive you (yeah, yeah)\n" +
                        "Oh, 아무것도 모르는 척\n" +
                        "Baby, just like real love\n" +
                        "마지막 기회야 어서\n" +
                        "보여줘 봐 your true love\n" +
                        "Bad boy, bad boy\n" +
                        "Yeah, you really make me a sad girl, sad girl, whoa, oh, oh\n" +
                        "\n" +
                        "I want you to cry, cry for me\n" +
                        "내가 울었던 것처럼, cry for me (oh)\n" +
                        "Make your rain fall, cry for me\n" +
                        "But again (me, yeah)\n" +
                        "\n" +
                        "조금씩, 조금씩 또 빠져가 (ooh)\n" +
                        "사랑에 내 결심이 또 무너져가 (ah-ah-ah-ah)\n" +
                        "용서할 핑계를 만들어가 (ah-ah)\n" +
                        "I want you to, I want you to, I want you to cry for me\n" +
                        "\n" +
                        "사랑이란 게 너무 혹독해\n" +
                        "미운 마음도 다 녹아버리게 해\n" +
                        "또다시 원해 널 내 곁에, yeah, yeah, yeah (oh)\n" +
                        "\n" +
                        "I want you to cry, cry for me\n" +
                        "너 연기라도 해 빨리, cry for me\n" +
                        "Make your rain fall, fall and fall now, yeah\n" +
                        "\n" +
                        "I want you to cry, cry for me\n" +
                        "내가 울었던 것처럼, cry for me\n" +
                        "Make your rain fall, cry for me\n" +
                        "But again (me)\n" +
                        "\n" +
                        "조금씩, 조금씩 또 빠져가\n" +
                        "사랑에 내 결심이 또 무너져가\n" +
                        "용서할 핑계를 만들어가 (만들어가)\n" +
                        "I want you to, I want you to, I want you to die for me (for me)");

        Song thunderclouds = new Song("thunderclouds", "Thunderclouds (feat. Sia, Diplo, and Labrinth)", "Sia", "https://p.scdn.co/mp3-preview/7d9835777327c7f8a9ea694e12d8b5cf741618db?cid=2afe87a64b0042dabf51f37318616965",
                "3:12", "Try out", R.drawable.thunderclouds, "kg1BljLu9YY",
                        "All I need is one\n" +
                        "One old man is enough\n" +
                        "Babe, you got it wrong\n" +
                        "Please turn your fears into trust, to trust\n" +
                        " \n" +
                        "Where’d the love go\n" +
                        "When all is said and done\n" +
                        " \n" +
                        "Hey now I got your hands in the air\n" +
                        "I’mma go through your stuff\n" +
                        " \n" +
                        "Where’d the love go\n" +
                        "You put the running into run\n" +
                        " \n" +
                        "You asking me to stay \n" +
                        "But I never met a girl I could trust\n" +
                        " \n" +
                        "You’re sayin’ those words\n" +
                        "Like you hate me now\n" +
                        "Our house is burning\n" +
                        "When you’re raised in hell\n" +
                        " \n" +
                        "Here in the ashes your soul cries out\n" +
                        "But don’t be afraid of these thunderclouds\n" +
                        " \n" +
                        "These thunderclouds oh no\n" +
                        "These thunderclouds oh no no\n" +
                        " \n" +
                        "All I need is love\n" +
                        "All I need is a word\n" +
                        "All I need is us\n" +
                        "You turned nouns into verbs, to verbs\n" +
                        " \n" +
                        "Where’d the love go\n" +
                        "When all is said and…\n" +
                        " \n" +
                        "Hey now put your hands in the air \n" +
                        "I’mma go through your stuff\n" +
                        " \n" +
                        "Where’d the love go\n" +
                        "You put the running into run\n" +
                        "You’re asking me to stay\n" +
                        "But I never met a man I could trust\n" +
                        " \n" +
                        "You’re sayin’ those words\n" +
                        "Like you hate me now\n" +
                        "Our house is burning\n" +
                        "When you’re raising hell\n" +
                        " \n" +
                        "Here in the ashes your soul cries out\n" +
                        "But don’t be afraid of these thunderclouds\n" +
                        " \n" +
                        "These thunderclouds,\n" +
                        "Oh noo, these thunderclouds\n" +
                        "Ohhh, these thunderclouds\n" +
                        " \n" +
                        "Ohh no, these thunderclouds,\n" +
                        "Ohh no, these thunderclouds\n" +
                        " \n" +
                        "These thunderclouds\n" +
                        " \n" +
                        "You’re sayin’ those words\n" +
                        "Like you hate me now\n" +
                        "Our house is burning\n" +
                        "When you’re raising hell\n" +
                        " \n" +
                        "Here in the ashes your soul cries out\n" +
                        "But don’t be afraid of these thunderclouds\n" +
                        " \n" +
                        "These thunderclouds,\n" +
                        "Oh noo, these thunderclouds\n" +
                        "Ohhh, these thunderclouds\n" +
                        " \n" +
                        "Ohh no, these thunderclouds,\n" +
                        "Ohh no no, these thunderclouds");


        //store the above song objects into the array songs
        songs[0] = iLoveYouMoreThanAnyone;
        songs[1] = badHabits;
        songs[2] = lilac;
        songs[3] = shuoHaoBuKu;
        songs[4] = gone;
        songs[5] = neverGonnaGiveYouUp;
        songs[6] = bedroom;
        songs[7] = shuoLeZaiJian;
        songs[8] = perfect;
        songs[9] = dontStopBelieving;
        songs[10] = forYou;
        songs[11] = ourSong;
        songs[12] = lovesickGirls;
        songs[13] = feng;
        songs[14] = cryForMe;
        songs[15] = thunderclouds;
    }//end of constructor


    //the method to return the position of the song, which has the same id in the parameter
    public Object searchSongById(String id) {
        //for loop to iterate/traverse/visit one by one all Song objects in the array song
        for (int index = 0; index < songs.length; index++) {
            Song tempSong = songs[index];//store the current song object into a temporary variable
            //compare the song object's id with the parameter id. If they are the same
            if (tempSong.getId().equals(id)) {
                return index;//return its position -- the index value
            }
        }//end of method
        return -1;
    }
    public Song getCurrentSong(int currentSongId){
        return songs[currentSongId];
    }

    public int getPrevSong(int currentSongIndex){
        if (currentSongIndex <= 0){
            return currentSongIndex;
        }
        else{
            return currentSongIndex-1;
        }
    }//end of getPrevSong

    public int getNextSong(int currentSongIndex){
        if (currentSongIndex >= songs.length-1){
            return currentSongIndex;
        }
        else{
            return currentSongIndex +1;
        }
    }//end of getNextSong

}//end of class
