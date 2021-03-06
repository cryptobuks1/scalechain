package io.scalechain.blockchain.proto.codec.messages

import io.kotlintest.KTestJUnitRunner
import io.netty.buffer.Unpooled
import io.scalechain.blockchain.proto.*
import io.scalechain.blockchain.proto.codec.*
import io.scalechain.util.Bytes
import io.scalechain.util.HexUtil.bytes
import org.junit.runner.RunWith

/**
<Bitcoin Core Packets Captured>
  <NET> recv; header:
  <Header> Magic:ù¾´Ù, Command:getheaders, Size:997, Checksum:533007982
  dumping data len : 24
  00000000  f9 be b4 d9 67 65 74 68  65 61 64 65 72 73 00 00  ù¾´Ùgetheaders..
  00000010  e5 03 00 00 6e 0e c5 1f                           å...n.Å.
  <NET> recv; data:
  dumping data len : 997
  00000000  72 11 01 00 1e 63 54 17  3f cc 4b 38 c2 d4 59 48  r....cT.?ÌK8ÂÔYH
  00000010  b1 9d 2a 52 7c 4f 10 ad  a6 83 47 00 06 00 00 00  ±<9d>*R|O.­¦<83>G.....
  00000020  00 00 00 00 00 97 61 0b  8f 08 de aa 50 4f f7 ed  .....<97>a.<8f>.ÞªPO÷í
  00000030  c9 82 9c d9 93 f3 0d 9b  07 56 ca e1 07 00 00 00  É<82><9c>Ù<93>ó.<9b>.VÊá....
  00000040  00 00 00 00 00 35 be 22  07 79 af 13 93 12 89 63  .....5¾".y¯.<93>.<89>c
  00000050  a3 a1 1d 8a 03 3f e6 bc  d7 c3 9b 66 00 00 00 00  £¡.<8a>.?æ¼×Ã<9b>f....
  00000060  00 00 00 00 00 33 52 85  50 87 a8 a9 03 78 96 a9  .....3R<85>P<87>¨©.x<96>©
  00000070  22 aa c6 ff ab c9 73 15  a5 88 a7 b2 03 00 00 00  "ªÆÿ«És.¥<88>§²....
  00000080  00 00 00 00 00 18 72 23  33 a8 e6 5c 7d 44 ed de  ......r#3¨æ\}DíÞ
  00000090  9d 21 0e 56 b5 f1 56 ae  c8 95 0a 9e 04 00 00 00  <9d>!.VµñV®È<95>.<9e>....
  000000a0  00 00 00 00 00 28 7f bb  c7 74 83 bf 01 9a df 70  .....(^?»Çt<83>¿.<9a>ßp
  000000b0  7c f0 f3 80 38 10 4d d7  69 d4 32 c3 03 00 00 00  |ðó<80>8.M×iÔ2Ã....
  000000c0  00 00 00 00 00 d3 e1 8d  46 5a 47 e4 04 1a 21 e2  .....Óá<8d>FZGä..!â
  000000d0  9e 41 cf 8c 06 ff 98 5f  53 d3 2b d9 01 00 00 00  <9e>AÏ<8c>.ÿ<98>_SÓ+Ù....
  000000e0  00 00 00 00 00 45 b5 fd  7c ba ff 58 7f 65 71 19  .....Eµý|ºÿX^?eq.
  000000f0  0d b0 50 81 9e 2d 86 19  25 95 6c aa 04 00 00 00  .°P<81><9e>-<86>.%<95>lª....
  00000100  00 00 00 00 00 31 2e 57  85 b1 0c a3 e0 6c 13 3f  .....1.W<85>±.£àl.?
  00000110  01 d2 ba 01 1a c8 d8 71  af 66 b1 88 08 00 00 00  .Òº..ÈØq¯f±<88>....
  00000120  00 00 00 00 00 8a e1 b6  3c 48 29 cb 1e 96 50 90  .....<8a>á¶<H)Ë.<96>P<90>
  00000130  da 7e f9 39 1b 2f 70 75  4d 34 97 ec 03 00 00 00  Ú~ù9./puM4<97>ì....
  00000140  00 00 00 00 00 8c e4 4b  9b 58 8b 8c 28 ca c4 f5  .....<8c>äK<9b>X<8b><8c>(ÊÄõ
  00000150  28 64 03 8d f1 df 31 d0  d7 f7 f9 99 07 00 00 00  (d.<8d>ñß1Ð×÷ù<99>....
  00000160  00 00 00 00 00 42 31 36  2f f5 66 c0 8d c6 22 9d  .....B16/õfÀ<8d>Æ"<9d>
  00000170  ec 2d 6a 52 1b 3c ea ec  43 f7 a8 36 08 00 00 00  ì-jR.<êìC÷¨6....
  00000180  00 00 00 00 00 20 59 1c  19 57 04 99 48 4f b0 58  ..... Y..W.<99>HO°X
  00000190  f9 81 22 a4 b8 00 7e 1e  2d e1 ce c4 06 00 00 00  ù<81>"¤¸.~.-áÎÄ....
  000001a0  00 00 00 00 00 03 b4 af  4d a1 4e 72 54 ec a4 d8  ......´¯M¡NrTì¤Ø
  000001b0  7e 7f 69 c0 24 91 e2 a0  06 c4 a3 ae 03 00 00 00  ~^?iÀ$<91>â .Ä£®....
  000001c0  00 00 00 00 00 1d f4 3f  b4 70 79 d8 67 3c c9 cd  ......ô?´pyØg<ÉÍ
  000001d0  a6 97 12 a7 b7 5a 24 38  7b 05 8b d7 05 00 00 00  ¦<97>.§·Z$8{.<8b>×....
  000001e0  00 00 00 00 00 d4 17 1b  73 9b 28 34 5d 2f aa 57  .....Ô..s<9b>(4>/ªW
  000001f0  0a 0e a6 88 9e c7 4b 3f  4d ae e4 c0 05 00 00 00  ..¦<88><9e>ÇK?M®äÀ....
  00000200  00 00 00 00 00 03 7c ad  dc 86 d8 ae 7e 9f cc 62  ......|­Ü<86>Ø®~<9f>Ìb
  00000210  18 28 f2 c7 cc 33 ab 51  6c e9 25 b2 03 00 00 00  .(òÇÌ3«Qlé%²....
  00000220  00 00 00 00 00 23 ca 94  ff 6b e5 87 aa 0a a6 57  .....#Ê<94>ÿkå<87>ª.¦W
  00000230  01 6c 28 4f c9 a6 67 2c  0d 13 a5 a2 00 00 00 00  .l(OÉ¦g,..¥¢....
  00000240  00 00 00 00 00 1c 0c e2  cf ea 34 f4 c4 a6 2f 50  .......âÏê4ôÄ¦/P
  00000250  21 26 07 31 16 83 36 cc  50 cc 13 e1 01 00 00 00  !&.1.<83>6ÌPÌ.á....
  00000260  00 00 00 00 00 d5 fc 90  f9 73 f6 9f 1a 74 f4 29  .....Õü<90>ùsö<9f>.tô)
  00000270  2a 46 42 39 42 c3 0f 63  ca c3 3b 44 07 00 00 00  *FB9BÃ.cÊÃ;D....
  00000280  00 00 00 00 00 66 64 af  1a cc 7f 5d a4 e1 f2 21  .....fd¯.Ì^?>¤áò!
  00000290  6d bb 2b 52 db b0 bc a3  2b 40 3c b4 05 00 00 00  m»+RÛ°¼£+@<´....
  000002a0  00 00 00 00 00 00 4d e1  fe 23 c6 95 2c fb 86 a8  ......Máþ#Æ<95>,û<86>¨
  000002b0  00 0f b6 44 6f fe 32 50  db c1 30 5c 01 00 00 00  ..¶Doþ2PÛÁ0\....
  000002c0  00 00 00 00 00 61 aa 1f  c9 14 88 08 98 8d 45 13  .....aª.É.<88>.<98><8d>E.
  000002d0  02 50 b6 7d 80 55 b9 2e  e6 9d fd 80 00 00 00 00  .P¶}<80>U¹.æ<9d>ý<80>....
  000002e0  00 00 00 00 00 dc 69 32  6b f4 2e ea 84 27 8f db  .....Üi2kô.ê<84>'<8f>Û
  000002f0  0e 2e 4e 93 c9 eb fe 13  a5 f0 b4 f4 0c 00 00 00  ..N<93>Éëþ.¥ð´ô....
  00000300  00 00 00 00 00 81 52 43  a5 d3 8e d1 53 ae 55 8f  .....<81>RC¥Ó<8e>ÑS®U<8f>
  00000310  48 83 30 70 87 30 4a e7  14 f5 9e 6a 09 00 00 00  H<83>0p<87>0Jç.õ<9e>j....
  00000320  00 00 00 00 00 14 8b fe  4c 61 c1 79 d0 ad a8 3b  ......<8b>þLaÁyÐ­¨;
  00000330  88 f6 0e f0 b3 9a 15 84  27 27 15 53 10 00 00 00  <88>ö.ð³<9a>.<84>''.S....
  00000340  00 00 00 00 00 f6 b8 1a  e0 a9 38 7f 8a 2f 88 e8  .....ö¸.à©8^?<8a>/<88>è
  00000350  a0 ba 20 a0 9c 02 b3 ec  a7 da 1e 5a 12 00 00 00   º  <9c>.³ì§Ú.Z....
  00000360  00 00 00 00 00 45 e3 0f  81 8d b9 43 21 4a 6c a4  .....Eã.<81><8d>¹C!Jl¤
  00000370  7a d6 57 54 c4 9f d1 8a  ac f5 05 a9 56 09 00 00  zÖWTÄ<9f>Ñ<8a>¬õ.©V...
  00000380  00 00 00 00 00 1d 3f 06  ce db 21 ae c8 5b f3 d7  ......?.ÎÛ!®È<ó×
  00000390  b1 f7 61 e1 d6 81 5b 5a  79 85 cd b3 1e 1c 0b 00  ±÷aáÖ<81><Zy<85>Í³....
  000003a0  00 00 00 00 00 6f e2 8c  0a b6 f1 b3 72 c1 a6 a2  .....oâ<8c>.¶ñ³rÁ¦¢
  000003b0  46 ae 63 f7 4f 93 1e 83  65 e1 5a 08 9c 68 d6 19  F®c÷O<93>.<83>eáZ.<9c>hÖ.
  000003c0  00 00 00 00 00 00 00 00  00 00 00 00 00 00 00 00  ................
  000003d0  00 00 00 00 00 00 00 00  00 00 00 00 00 00 00 00  ................
  000003e0  00 00 00 00 00                                    .....
  */

@RunWith(KTestJUnitRunner::class)
class GetHeadersSpec : EnvelopeTestSuite<GetHeaders>()  {

  override val codec = GetHeadersCodec

  override val envelopeHeader = bytes(
    """
      f9 be b4 d9 67 65 74 68  65 61 64 65 72 73 00 00
      e5 03 00 00 6e 0e c5 1f
    """)

  override val payload = bytes(
    """
      72 11 01 00 1e 63 54 17  3f cc 4b 38 c2 d4 59 48
      b1 9d 2a 52 7c 4f 10 ad  a6 83 47 00 06 00 00 00
      00 00 00 00 00 97 61 0b  8f 08 de aa 50 4f f7 ed
      c9 82 9c d9 93 f3 0d 9b  07 56 ca e1 07 00 00 00
      00 00 00 00 00 35 be 22  07 79 af 13 93 12 89 63
      a3 a1 1d 8a 03 3f e6 bc  d7 c3 9b 66 00 00 00 00
      00 00 00 00 00 33 52 85  50 87 a8 a9 03 78 96 a9
      22 aa c6 ff ab c9 73 15  a5 88 a7 b2 03 00 00 00
      00 00 00 00 00 18 72 23  33 a8 e6 5c 7d 44 ed de
      9d 21 0e 56 b5 f1 56 ae  c8 95 0a 9e 04 00 00 00
      00 00 00 00 00 28 7f bb  c7 74 83 bf 01 9a df 70
      7c f0 f3 80 38 10 4d d7  69 d4 32 c3 03 00 00 00
      00 00 00 00 00 d3 e1 8d  46 5a 47 e4 04 1a 21 e2
      9e 41 cf 8c 06 ff 98 5f  53 d3 2b d9 01 00 00 00
      00 00 00 00 00 45 b5 fd  7c ba ff 58 7f 65 71 19
      0d b0 50 81 9e 2d 86 19  25 95 6c aa 04 00 00 00
      00 00 00 00 00 31 2e 57  85 b1 0c a3 e0 6c 13 3f
      01 d2 ba 01 1a c8 d8 71  af 66 b1 88 08 00 00 00
      00 00 00 00 00 8a e1 b6  3c 48 29 cb 1e 96 50 90
      da 7e f9 39 1b 2f 70 75  4d 34 97 ec 03 00 00 00
      00 00 00 00 00 8c e4 4b  9b 58 8b 8c 28 ca c4 f5
      28 64 03 8d f1 df 31 d0  d7 f7 f9 99 07 00 00 00
      00 00 00 00 00 42 31 36  2f f5 66 c0 8d c6 22 9d
      ec 2d 6a 52 1b 3c ea ec  43 f7 a8 36 08 00 00 00
      00 00 00 00 00 20 59 1c  19 57 04 99 48 4f b0 58
      f9 81 22 a4 b8 00 7e 1e  2d e1 ce c4 06 00 00 00
      00 00 00 00 00 03 b4 af  4d a1 4e 72 54 ec a4 d8
      7e 7f 69 c0 24 91 e2 a0  06 c4 a3 ae 03 00 00 00
      00 00 00 00 00 1d f4 3f  b4 70 79 d8 67 3c c9 cd
      a6 97 12 a7 b7 5a 24 38  7b 05 8b d7 05 00 00 00
      00 00 00 00 00 d4 17 1b  73 9b 28 34 5d 2f aa 57
      0a 0e a6 88 9e c7 4b 3f  4d ae e4 c0 05 00 00 00
      00 00 00 00 00 03 7c ad  dc 86 d8 ae 7e 9f cc 62
      18 28 f2 c7 cc 33 ab 51  6c e9 25 b2 03 00 00 00
      00 00 00 00 00 23 ca 94  ff 6b e5 87 aa 0a a6 57
      01 6c 28 4f c9 a6 67 2c  0d 13 a5 a2 00 00 00 00
      00 00 00 00 00 1c 0c e2  cf ea 34 f4 c4 a6 2f 50
      21 26 07 31 16 83 36 cc  50 cc 13 e1 01 00 00 00
      00 00 00 00 00 d5 fc 90  f9 73 f6 9f 1a 74 f4 29
      2a 46 42 39 42 c3 0f 63  ca c3 3b 44 07 00 00 00
      00 00 00 00 00 66 64 af  1a cc 7f 5d a4 e1 f2 21
      6d bb 2b 52 db b0 bc a3  2b 40 3c b4 05 00 00 00
      00 00 00 00 00 00 4d e1  fe 23 c6 95 2c fb 86 a8
      00 0f b6 44 6f fe 32 50  db c1 30 5c 01 00 00 00
      00 00 00 00 00 61 aa 1f  c9 14 88 08 98 8d 45 13
      02 50 b6 7d 80 55 b9 2e  e6 9d fd 80 00 00 00 00
      00 00 00 00 00 dc 69 32  6b f4 2e ea 84 27 8f db
      0e 2e 4e 93 c9 eb fe 13  a5 f0 b4 f4 0c 00 00 00
      00 00 00 00 00 81 52 43  a5 d3 8e d1 53 ae 55 8f
      48 83 30 70 87 30 4a e7  14 f5 9e 6a 09 00 00 00
      00 00 00 00 00 14 8b fe  4c 61 c1 79 d0 ad a8 3b
      88 f6 0e f0 b3 9a 15 84  27 27 15 53 10 00 00 00
      00 00 00 00 00 f6 b8 1a  e0 a9 38 7f 8a 2f 88 e8
      a0 ba 20 a0 9c 02 b3 ec  a7 da 1e 5a 12 00 00 00
      00 00 00 00 00 45 e3 0f  81 8d b9 43 21 4a 6c a4
      7a d6 57 54 c4 9f d1 8a  ac f5 05 a9 56 09 00 00
      00 00 00 00 00 1d 3f 06  ce db 21 ae c8 5b f3 d7
      b1 f7 61 e1 d6 81 5b 5a  79 85 cd b3 1e 1c 0b 00
      00 00 00 00 00 6f e2 8c  0a b6 f1 b3 72 c1 a6 a2
      46 ae 63 f7 4f 93 1e 83  65 e1 5a 08 9c 68 d6 19
      00 00 00 00 00 00 00 00  00 00 00 00 00 00 00 00
      00 00 00 00 00 00 00 00  00 00 00 00 00 00 00 00
      00 00 00 00 00

    """
  )

  override val envelope = BitcoinMessageEnvelope(
    Magic.MAIN,
    "getheaders",
    payload.size,
    Checksum.fromHex("6e 0e c5 1f"),
    Unpooled.wrappedBuffer(payload)
  )

  override val message = GetHeaders(70002L, listOf(Hash(Bytes.from("000000000000000006004783a6ad104f7c522a9db14859d4c2384bcc3f175463")),Hash(Bytes.from("000000000000000007e1ca56079b0df393d99c82c9edf74f50aade088f0b6197")),Hash(Bytes.from("000000000000000000669bc3d7bce63f038a1da1a36389129313af790722be35")),Hash(Bytes.from("000000000000000003b2a788a51573c9abffc6aa22a9967803a9a88750855233")),Hash(Bytes.from("0000000000000000049e0a95c8ae56f1b5560e219ddeed447d5ce6a833237218")),Hash(Bytes.from("000000000000000003c332d469d74d103880f3f07c70df9a01bf8374c7bb7f28")),Hash(Bytes.from("000000000000000001d92bd3535f98ff068ccf419ee2211a04e4475a468de1d3")),Hash(Bytes.from("000000000000000004aa6c952519862d9e8150b00d1971657f58ffba7cfdb545")),Hash(Bytes.from("00000000000000000888b166af71d8c81a01bad2013f136ce0a30cb185572e31")),Hash(Bytes.from("000000000000000003ec97344d75702f1b39f97eda9050961ecb29483cb6e18a")),Hash(Bytes.from("00000000000000000799f9f7d7d031dff18d036428f5c4ca288c8b589b4be48c")),Hash(Bytes.from("00000000000000000836a8f743ecea3c1b526a2dec9d22c68dc066f52f363142")),Hash(Bytes.from("000000000000000006c4cee12d1e7e00b8a42281f958b04f48990457191c5920")),Hash(Bytes.from("000000000000000003aea3c406a0e29124c0697f7ed8a4ec54724ea14dafb403")),Hash(Bytes.from("000000000000000005d78b057b38245ab7a71297a6cdc93c67d87970b43ff41d")),Hash(Bytes.from("000000000000000005c0e4ae4d3f4bc79e88a60e0a57aa2f5d34289b731b17d4")),Hash(Bytes.from("000000000000000003b225e96c51ab33ccc7f2281862cc9f7eaed886dcad7c03")),Hash(Bytes.from("000000000000000000a2a5130d2c67a6c94f286c0157a60aaa87e56bff94ca23")),Hash(Bytes.from("000000000000000001e113cc50cc36831631072621502fa6c4f434eacfe20c1c")),Hash(Bytes.from("000000000000000007443bc3ca630fc3423942462a29f4741a9ff673f990fcd5")),Hash(Bytes.from("000000000000000005b43c402ba3bcb0db522bbb6d21f2e1a45d7fcc1aaf6466")),Hash(Bytes.from("0000000000000000015c30c1db5032fe6f44b60f00a886fb2c95c623fee14d00")),Hash(Bytes.from("00000000000000000080fd9de62eb955807db6500213458d98088814c91faa61")),Hash(Bytes.from("00000000000000000cf4b4f0a513feebc9934e2e0edb8f2784ea2ef46b3269dc")),Hash(Bytes.from("0000000000000000096a9ef514e74a3087703083488f55ae53d18ed3a5435281")),Hash(Bytes.from("0000000000000000105315272784159ab3f00ef6883ba8add079c1614cfe8b14")),Hash(Bytes.from("0000000000000000125a1edaa7ecb3029ca020baa0e8882f8a7f38a9e01ab8f6")),Hash(Bytes.from("000000000000000956a905f5ac8ad19fc45457d67aa46c4a2143b98d810fe345")),Hash(Bytes.from("0000000000000b1c1eb3cd85795a5b81d6e161f7b1d7f35bc8ae21dbce063f1d")),Hash(Bytes.from("000000000019d6689c085ae165831e934ff763ae46a2a6c172b3f1b60a8ce26f"))), Hash(Bytes.from("0000000000000000000000000000000000000000000000000000000000000000")))
}
