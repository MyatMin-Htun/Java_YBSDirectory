-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.45-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema ybsdirectory
--

CREATE DATABASE IF NOT EXISTS ybsdirectory;
USE ybsdirectory;

--
-- Definition of table `busdetail`
--

DROP TABLE IF EXISTS `busdetail`;
CREATE TABLE `busdetail` (
  `BusDetailID` varchar(10) NOT NULL,
  `BusStopID` varchar(6) NOT NULL,
  `BusLineNo` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`BusDetailID`),
  KEY `FK_BusDetail_1` (`BusStopID`),
  KEY `FK_BusDetail_2` (`BusLineNo`),
  CONSTRAINT `FK_BusDetail_1` FOREIGN KEY (`BusStopID`) REFERENCES `busstop` (`BusStopID`),
  CONSTRAINT `FK_BusDetail_2` FOREIGN KEY (`BusLineNo`) REFERENCES `busline` (`BusLineNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `busdetail`
--

/*!40000 ALTER TABLE `busdetail` DISABLE KEYS */;
INSERT INTO `busdetail` (`BusDetailID`,`BusStopID`,`BusLineNo`) VALUES 
 ('B000000001','BS0001',1),
 ('B000000002','BS0002',1),
 ('B000000003','BS0003',1),
 ('B000000004','BS0004',1),
 ('B000000005','BS0005',1),
 ('B000000006','BS0006',1),
 ('B000000007','BS0007',1),
 ('B000000008','BS0008',1),
 ('B000000009','BS0009',1),
 ('B000000010','BS0010',1),
 ('B000000011','BS0011',1),
 ('B000000012','BS0012',1),
 ('B000000013','BS0013',1),
 ('B000000014','BS0014',1),
 ('B000000015','BS0015',1),
 ('B000000016','BS0016',1),
 ('B000000017','BS0017',1),
 ('B000000018','BS0018',1),
 ('B000000019','BS0019',1),
 ('B000000020','BS0020',1),
 ('B000000021','BS0021',1),
 ('B000000022','BS0022',1),
 ('B000000023','BS0023',1),
 ('B000000024','BS0024',1),
 ('B000000025','BS0025',1),
 ('B000000026','BS0026',1),
 ('B000000027','BS0027',1),
 ('B000000028','BS0028',1),
 ('B000000029','BS0029',1),
 ('B000000030','BS0030',1),
 ('B000000031','BS0031',1),
 ('B000000032','BS0032',1),
 ('B000000033','BS0033',1),
 ('B000000034','BS0034',1),
 ('B000000035','BS0035',1);
INSERT INTO `busdetail` (`BusDetailID`,`BusStopID`,`BusLineNo`) VALUES 
 ('B000000036','BS0036',1),
 ('B000000037','BS0037',1),
 ('B000000038','BS0038',1),
 ('B000000039','BS0039',2),
 ('B000000041','BS0041',2),
 ('B000000042','BS0042',2),
 ('B000000043','BS0088',2),
 ('B000000044','BS0084',2),
 ('B000000045','BS0089',2),
 ('B000000046','BS0043',2),
 ('B000000047','BS0044',2),
 ('B000000048','BS0045',2),
 ('B000000049','BS0046',2),
 ('B000000050','BS0047',2),
 ('B000000051','BS0048',2),
 ('B000000052','BS0049',2),
 ('B000000053','BS0050',2),
 ('B000000054','BS0051',2),
 ('B000000055','BS0052',2),
 ('B000000056','BS0029',2),
 ('B000000057','BS0053',2),
 ('B000000058','BS0050',2),
 ('B000000059','BS0054',2),
 ('B000000060','BS0055',2),
 ('B000000061','BS0056',2),
 ('B000000062','BS0057',2),
 ('B000000063','BS0058',2),
 ('B000000064','BS0059',2),
 ('B000000065','BS0060',2),
 ('B000000066','BS0067',2),
 ('B000000067','BS0068',2),
 ('B000000068','BS0069',2),
 ('B000000069','BS0070',2),
 ('B000000070','BS0071',2),
 ('B000000071','BS0072',2);
INSERT INTO `busdetail` (`BusDetailID`,`BusStopID`,`BusLineNo`) VALUES 
 ('B000000072','BS0073',2),
 ('B000000073','BS0074',2),
 ('B000000074','BS0075',2),
 ('B000000075','BS0076',2),
 ('B000000076','BS0077',2),
 ('B000000077','BS0078',2),
 ('B000000078','BS0079',2),
 ('B000000079','BS0080',2),
 ('B000000080','BS0081',2),
 ('B000000081','BS0082',2),
 ('B000000082','BS0083',2),
 ('B000000083','BS0084',2),
 ('B000000084','BS0085',2),
 ('B000000085','BS0086',2),
 ('B000000086','BS0087',2),
 ('B000000087','BS0039',3),
 ('B000000088','BS0090',3),
 ('B000000089','BS0091',3),
 ('B000000090','BS0114',3),
 ('B000000091','BS0093',3),
 ('B000000092','BS0094',3),
 ('B000000093','BS0095',3),
 ('B000000094','BS0096',3),
 ('B000000095','BS0097',3),
 ('B000000096','BS0049',3),
 ('B000000097','BS0050',3),
 ('B000000098','BS0099',3),
 ('B000000099','BS0068',3),
 ('B000000100','BS0017',3),
 ('B000000101','BS0073',3),
 ('B000000102','BS0058',3),
 ('B000000103','BS0100',3),
 ('B000000104','BS0101',3),
 ('B000000105','BS0102',3),
 ('B000000106','BS0103',3);
INSERT INTO `busdetail` (`BusDetailID`,`BusStopID`,`BusLineNo`) VALUES 
 ('B000000107','BS0029',3),
 ('B000000108','BS0030',3),
 ('B000000109','BS0031',3),
 ('B000000110','BS0104',3),
 ('B000000111','BS0033',3),
 ('B000000112','BS0034',3),
 ('B000000113','BS0035',3),
 ('B000000114','BS0036',3),
 ('B000000115','BS0037',3),
 ('B000000116','BS0038',3),
 ('B000000117','BS0105',3),
 ('B000000118','BS0106',3),
 ('B000000119','BS0103',3),
 ('B000000120','BS0107',3),
 ('B000000121','BS0017',3),
 ('B000000122','BS0108',3),
 ('B000000123','BS0109',3),
 ('B000000124','BS0110',3),
 ('B000000125','BS0111',3),
 ('B000000126','BS0112',3),
 ('B000000127','BS0122',3),
 ('B000000128','BS0114',3),
 ('B000000129','BS0121',3),
 ('B000000130','BS0115',3),
 ('B000000131','BS0116',3),
 ('B000000132','BS0117',3),
 ('B000000133','BS0118',3),
 ('B000000134','BS0119',3),
 ('B000000135','BS0120',3),
 ('B000000136','BS0116',3),
 ('B000000137','BS0115',3),
 ('B000000138','BS0121',3),
 ('B000000139','BS0114',3),
 ('B000000140','BS0122',3),
 ('B000000141','BS0112',3);
INSERT INTO `busdetail` (`BusDetailID`,`BusStopID`,`BusLineNo`) VALUES 
 ('B000000142','BS0111',3),
 ('B000000143','BS0110',3),
 ('B000000144','BS0109',3),
 ('B000000145','BS0108',3),
 ('B000000146','BS0017',3),
 ('B000000147','BS0107',3),
 ('B000000148','BS0103',3),
 ('B000000149','BS0106',3),
 ('B000000150','BS0105',3),
 ('B000000151','BS0038',3),
 ('B000000152','BS0037',3),
 ('B000000153','BS0036',3),
 ('B000000154','BS0035',3),
 ('B000000155','BS0034',3),
 ('B000000156','BS0033',3),
 ('B000000157','BS0104',3),
 ('B000000158','BS0031',3),
 ('B000000159','BS0030',3),
 ('B000000160','BS0029',3),
 ('B000000161','BS0103',3),
 ('B000000162','BS0102',3),
 ('B000000163','BS0101',3),
 ('B000000164','BS0100',3),
 ('B000000165','BS0058',3),
 ('B000000166','BS0073',3),
 ('B000000167','BS0017',3),
 ('B000000168','BS0068',3),
 ('B000000169','BS0099',3),
 ('B000000170','BS0050',3),
 ('B000000171','BS0049',3),
 ('B000000172','BS0097',3),
 ('B000000173','BS0096',3),
 ('B000000174','BS0095',3),
 ('B000000175','BS0094',3),
 ('B000000176','BS0093',3);
INSERT INTO `busdetail` (`BusDetailID`,`BusStopID`,`BusLineNo`) VALUES 
 ('B000000177','BS0092',3),
 ('B000000178','BS0091',3),
 ('B000000179','BS0123',3),
 ('B000000180','BS0011',4),
 ('B000000181','BS0017',4),
 ('B000000182','BS0050',4),
 ('B000000183','BS0037',4),
 ('B000000184','BS0063',4),
 ('B000000185','BS0029',4),
 ('B000000186','BS0112',4),
 ('B000000187','BS0018',5),
 ('B000000188','BS0036',5),
 ('B000000189','BS0010',5),
 ('B000000190','BS0072',5),
 ('B000000191','BS0094',5),
 ('B000000192','BS0119',5),
 ('B000000193','BS0003',5),
 ('B000000194','BS0072',5),
 ('B000000195','BS0085',5),
 ('B000000196','BS0020',5),
 ('B000000197','BS0055',5),
 ('B000000198','BS0106',5),
 ('B000000199','BS0123',5),
 ('B000000200','BS0124',5),
 ('B000000201','BS0106',5),
 ('B000000202','BS0073',5),
 ('B000000203','BS0020',5),
 ('B000000204','BS0003',5),
 ('B000000205','BS0056',5),
 ('B000000206','BS0028',5),
 ('B000000207','BS0003',5),
 ('B000000208','BS0010',5),
 ('B000000209','BS0094',5),
 ('B000000210','BS0056',5),
 ('B000000211','BS0072',5);
INSERT INTO `busdetail` (`BusDetailID`,`BusStopID`,`BusLineNo`) VALUES 
 ('B000000212','BS0094',5),
 ('B000000213','BS0007',5),
 ('B000000214','BS0021',5),
 ('B000000215','BS0036',5),
 ('B000000216','BS0085',5),
 ('B000000217','BS0050',5),
 ('B000000218','BS0010',5),
 ('B000000219','BS0020',5),
 ('B000000220','BS0072',6),
 ('B000000221','BS0054',6),
 ('B000000222','BS0035',6),
 ('B000000223','BS0010',6),
 ('B000000224','BS0056',6),
 ('B000000225','BS0083',6),
 ('B000000226','BS0056',6),
 ('B000000227','BS0010',6),
 ('B000000228','BS0076',6),
 ('B000000229','BS0123',6),
 ('B000000230','BS0049',6),
 ('B000000231','BS0112',6),
 ('B000000232','BS0087',6),
 ('B000000233','BS0018',6),
 ('B000000234','BS0055',6),
 ('B000000235','BS0126',6),
 ('B000000236','BS0036',6);
/*!40000 ALTER TABLE `busdetail` ENABLE KEYS */;


--
-- Definition of table `busdriver`
--

DROP TABLE IF EXISTS `busdriver`;
CREATE TABLE `busdriver` (
  `BusDriverID` varchar(6) NOT NULL,
  `BusDriverName` varchar(50) NOT NULL,
  `BusDriverPhNo` varchar(11) NOT NULL,
  `Age` int(10) unsigned NOT NULL,
  `Gender` varchar(6) NOT NULL,
  PRIMARY KEY  (`BusDriverID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `busdriver`
--

/*!40000 ALTER TABLE `busdriver` DISABLE KEYS */;
INSERT INTO `busdriver` (`BusDriverID`,`BusDriverName`,`BusDriverPhNo`,`Age`,`Gender`) VALUES 
 ('BD0001','U Hla','09799635486',19,'Male'),
 ('BD0002','null','null',0,'null'),
 ('BD0003','Ko Kyaw Gyi','09262380997',38,'Male'),
 ('BD0004','Daw Mya','09799639481',19,'Female'),
 ('BD0005','U Ba','09782585233',55,'Male');
/*!40000 ALTER TABLE `busdriver` ENABLE KEYS */;


--
-- Definition of table `busdriverdetail`
--

DROP TABLE IF EXISTS `busdriverdetail`;
CREATE TABLE `busdriverdetail` (
  `BusDriverDetailID` varchar(15) NOT NULL,
  `BusLineNo` int(10) unsigned NOT NULL,
  `BusDriverID` varchar(6) NOT NULL,
  `Plate` varchar(8) NOT NULL,
  `Date` datetime NOT NULL,
  PRIMARY KEY  (`BusDriverDetailID`),
  KEY `FK_BusDriverDetail_1` (`BusLineNo`),
  KEY `FK_BusDriverDetail_2` (`BusDriverID`),
  CONSTRAINT `FK_BusDriverDetail_1` FOREIGN KEY (`BusLineNo`) REFERENCES `busline` (`BusLineNo`),
  CONSTRAINT `FK_BusDriverDetail_2` FOREIGN KEY (`BusDriverID`) REFERENCES `busdriver` (`BusDriverID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `busdriverdetail`
--

/*!40000 ALTER TABLE `busdriverdetail` DISABLE KEYS */;
INSERT INTO `busdriverdetail` (`BusDriverDetailID`,`BusLineNo`,`BusDriverID`,`Plate`,`Date`) VALUES 
 ('BDD0001',1,'BD0003','12A/1234','2019-04-08 00:00:00'),
 ('BDD0002',2,'BD0004','2A/3456','2019-04-08 00:00:00'),
 ('BDD0003',2,'BD0002','3A/1131','2019-04-08 00:00:00'),
 ('BDD0004',2,'BD0004','aa/2345','2019-04-08 00:00:00'),
 ('BDD0005',5,'BD0005','11A/3452','2019-04-09 00:00:00'),
 ('BDD0006',4,'BD0004','12B/1221','2019-04-10 00:00:00');
/*!40000 ALTER TABLE `busdriverdetail` ENABLE KEYS */;


--
-- Definition of table `busline`
--

DROP TABLE IF EXISTS `busline`;
CREATE TABLE `busline` (
  `BusLineNo` int(10) unsigned NOT NULL,
  `BusPrice` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`BusLineNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `busline`
--

/*!40000 ALTER TABLE `busline` DISABLE KEYS */;
INSERT INTO `busline` (`BusLineNo`,`BusPrice`) VALUES 
 (1,500),
 (2,200),
 (3,200),
 (4,200),
 (5,200),
 (6,200);
/*!40000 ALTER TABLE `busline` ENABLE KEYS */;


--
-- Definition of table `busstop`
--

DROP TABLE IF EXISTS `busstop`;
CREATE TABLE `busstop` (
  `BusStopID` varchar(6) NOT NULL,
  `BusStopName` varchar(55) NOT NULL,
  PRIMARY KEY  (`BusStopID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `busstop`
--

/*!40000 ALTER TABLE `busstop` DISABLE KEYS */;
INSERT INTO `busstop` (`BusStopID`,`BusStopName`) VALUES 
 ('BS0001','Hlegu Zay'),
 ('BS0002','Tin Zar Oo'),
 ('BS0003','Hlegu Tar Sone'),
 ('BS0004','Lay Daung Kan(Site Mway Tit)'),
 ('BS0005','Yeik Thar'),
 ('BS0006','Thama'),
 ('BS0007','U Khway Pu'),
 ('BS0008','Moke Cho'),
 ('BS0009','Tha Pyay Chan'),
 ('BS0010','December Alal Pauk'),
 ('BS0011','A Aye Khan'),
 ('BS0012','Unit Three'),
 ('BS0013','See Pwar Yay Takke Tho'),
 ('BS0014','Kyo So Yay'),
 ('BS0015','Sal Myaung'),
 ('BS0016','Tayar Lay Sae'),
 ('BS0017','Kyaung Shae'),
 ('BS0018','Ah Kyaw Tae'),
 ('BS0019','Nyaung Pin'),
 ('BS0020','A Kauk Khun'),
 ('BS0021','Lai Sin Yone Alal Pauk'),
 ('BS0022','U Tun Myat'),
 ('BS0023','Say Yon Shae'),
 ('BS0024','Kyauk Lan'),
 ('BS0025','Tat Yin Thone'),
 ('BS0026','Lay Kyaung'),
 ('BS0027','Thin Tan Kyaung'),
 ('BS0028','Nat Sin'),
 ('BS0029','Taung Myauk Lan Sone'),
 ('BS0030','Tadar Phyu'),
 ('BS0031','Kar Gyi Gate'),
 ('BS0032','Sanpya Zay'),
 ('BS0033','Myittar Shwe Yi'),
 ('BS0034','Bawa Myint'),
 ('BS0035','Kalar Su');
INSERT INTO `busstop` (`BusStopID`,`BusStopName`) VALUES 
 ('BS0036','B.O.C'),
 ('BS0037','Paya Lan'),
 ('BS0038','Zawana'),
 ('BS0039','Sae Tit Lan'),
 ('BS0040','Thone Sae Hnit Gate'),
 ('BS0041','Sauk Lote Yae'),
 ('BS0042','Sittaung Lan Htate'),
 ('BS0043','Set Hmu Zone Zay'),
 ('BS0044','Kyar Kan'),
 ('BS0045','Thitsar'),
 ('BS0046','Kone Taik'),
 ('BS0047','Hnit Sae Zay'),
 ('BS0048','Kar Lay Gate'),
 ('BS0049','Phone Gyi Kyaung Kwae'),
 ('BS0050','Tadar Htate'),
 ('BS0051','Kun Yar Saing'),
 ('BS0052','Myo Oo Kyaung'),
 ('BS0053','Myo Oo Zedi'),
 ('BS0054','Ka Pa Ya'),
 ('BS0055','Arr Kasar Kwin'),
 ('BS0056','Ma Wa Ta'),
 ('BS0057','Swan In'),
 ('BS0058','Kone Padaythar'),
 ('BS0059','Yone Shae'),
 ('BS0060','Khun/ Shit Lan Sone'),
 ('BS0061','Lay sae nga Hmat Taing'),
 ('BS0062','Lay sae chauk Lan Sone'),
 ('BS0063','Kyar Hmat Taing'),
 ('BS0064','Ba Htoo Zay'),
 ('BS0065','Banyardala'),
 ('BS0066','Kyaung Lay Shae'),
 ('BS0067','Lay Sae Lay Lan Sone'),
 ('BS0068','Kyan Mar Yae'),
 ('BS0069','Kyaung Kwae');
INSERT INTO `busstop` (`BusStopID`,`BusStopName`) VALUES 
 ('BS0070','Phyo Sabei'),
 ('BS0071','Khay Mar'),
 ('BS0072','Gandar Yon'),
 ('BS0073','Gate Haung'),
 ('BS0074','Yone Thit'),
 ('BS0075','Mya Dar Wi'),
 ('BS0076','Oakkar'),
 ('BS0077','Yone'),
 ('BS0078','Mya Yadanar'),
 ('BS0079','Nwe Thar Gi'),
 ('BS0080','Yoke Shin Yon'),
 ('BS0081','Za m'),
 ('BS0082','yin zwe Zay'),
 ('BS0083','Kan Tharyar'),
 ('BS0084','Ayar'),
 ('BS0085','Chauk Kwae'),
 ('BS0086','Dhamar Yon'),
 ('BS0087','Aung Mingalar A Way Pyay'),
 ('BS0088','Shwe Taung Kyar Lan'),
 ('BS0089','Ayeyarwaddy Lan Htate'),
 ('BS0090','Padauk Kwae'),
 ('BS0091','Moke Oo(Yuzana Garden)'),
 ('BS0092','Ma Wa Ta Yone Shae'),
 ('BS0093','Mya Nandar'),
 ('BS0094','Yadanar Lan'),
 ('BS0095','Thein Kyaung'),
 ('BS0096','Ayar Wun'),
 ('BS0097','Awaiyar'),
 ('BS0098','Phone Kyi Kyaung Kwae'),
 ('BS0099','Sae shit Kwae'),
 ('BS0100','Thit Saing Kwae'),
 ('BS0101','Yauk Kaw'),
 ('BS0102','Pan Chan'),
 ('BS0103','Than Lan'),
 ('BS0104','Sanpya Zay/ Nga Moe Yeik'),
 ('BS0105','Khap Chee Yar');
INSERT INTO `busstop` (`BusStopID`,`BusStopName`) VALUES 
 ('BS0106','Athin Taik'),
 ('BS0107','Lan Sone'),
 ('BS0108','Tamwe Zay Haung/ Akhun Lut Zay'),
 ('BS0109','Tamwe Zay/ Tamwe Bali'),
 ('BS0110','Kyauk Myaung Zay'),
 ('BS0111','Thida'),
 ('BS0112','Aung Mingalar'),
 ('BS0113','Yuzana Plaza/ Lan Kyal'),
 ('BS0114','Mingalar Zay'),
 ('BS0115','Thein Phyu Zay'),
 ('BS0116','Sein Paul'),
 ('BS0117','Kyel Ngar'),
 ('BS0118','Pwint'),
 ('BS0119','Botahtaung Paya'),
 ('BS0120','Lan Ngar Sae'),
 ('BS0121','Thein Phyu Sar Taik'),
 ('BS0122','Yuzana Palaza/ Lan Kyal'),
 ('BS0123','Padau'),
 ('BS0124','Pan Soe Dan'),
 ('BS0125','Thunadar'),
 ('BS0126','Wa Zi Yar');
/*!40000 ALTER TABLE `busstop` ENABLE KEYS */;


--
-- Definition of table `busstop_old`
--

DROP TABLE IF EXISTS `busstop_old`;
CREATE TABLE `busstop_old` (
  `BusStopID` varchar(6) NOT NULL,
  `BusStopName` varchar(55) NOT NULL,
  `Road` varchar(75) NOT NULL,
  `Township` varchar(75) NOT NULL,
  PRIMARY KEY  (`BusStopID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `busstop_old`
--

/*!40000 ALTER TABLE `busstop_old` DISABLE KEYS */;
INSERT INTO `busstop_old` (`BusStopID`,`BusStopName`,`Road`,`Township`) VALUES 
 ('BS0001','Nat Sin','No.2 Main Road','South Dagon'),
 ('BS0002','Gate Haung','Bo Hmu Ba Htoo Road','North Dagon'),
 ('BS0003','Sal Mile','Dagon University','North Dagon'),
 ('BS0004','Sae-Hnat-Lone-Tan','Yankin Road ','Yankin'),
 ('BS0005','(Sae-Lay/Sae-Ngar)Lan Sone','Yadanar Road','Thingangyun'),
 ('BS0006','(Sae-Lay/Sae-Ngar)Lan Sone','Thu Mingalar Road','South Okkalapa'),
 ('BS0007','Padathar','Thu Mingalar Road','South Okkalapa'),
 ('BS0008','Nandawun Zay','Thu Mingalar Road','South Okkalapa'),
 ('BS0009','Sae-Hnit Thama','Shwe Pyi Thar Bridge Road','Hlaing Tharyar'),
 ('BS0010','Kyaung Shae','Shwe Pyi Thar Bridge Road','Hlaing Tharyar'),
 ('BS0011','Sae-Ngar Zay Lay','KyanSitthar Road','Hlaing Tharyar'),
 ('BS0012','Nee Pyinyar Takke Tho','University Of Technology','Hlaing Tharyar'),
 ('BS0013','Dagon Ayer A Way Pyay','No.5 Main Road','Hlaing Tharyar'),
 ('BS0014','Tit Htate','Nyaung Done Road','Hlaing Tharyar'),
 ('BS0015','Nawaday','No.5 Main Road','Hlaing Tharyar');
INSERT INTO `busstop_old` (`BusStopID`,`BusStopName`,`Road`,`Township`) VALUES 
 ('BS0016','Dhamar Yon','Bayint Naung Road','Mayangone'),
 ('BS0017','Tayar-Chauk','Kabar Aye Pagoda Road','Mayangone'),
 ('BS0018','Lan Wa/Nawaday','Thudhamar Road','North Okkalapa'),
 ('BS0019','Sae-Mile Kone','Pyay Road','Insein'),
 ('BS0020','Tit Gate','Lower Mingalardon Road','Insein'),
 ('BS0021','Japan Lan','Lower Mingalardon Road','Insein'),
 ('BS0022','Htan Pin Kone','No.1 Main Road','Mingalardon'),
 ('BS0023','Tayar-Chauk','Khayae Pin Road','Mingalardon'),
 ('BS0024','Naing Ngan Yay','No.1 Main Road','Mingalardon'),
 ('BS0025','Sae-Hnit Lan','No.3 Main Road','Mingalardon'),
 ('BS0026','Nilar','No.3 Main Road','Mingalardon'),
 ('BS0027','Tit Numpad','No.1 Main Road','Mingalardon'),
 ('BS0028','Daewoo','No.1 Main Road','Mingalardon'),
 ('BS0029','Nwe Khwe','No.1 Main Road','Mingalardon'),
 ('BS0030','Tit Yat Kwat','No.3 Sat Thwe Road','Mingalardon'),
 ('BS0031','Nwar Chan','No.4 Main Road','Shwe Pyi Thar'),
 ('BS0032','Danyin Gone Lan Sone','Khayae Pin Road','Insein');
INSERT INTO `busstop_old` (`BusStopID`,`BusStopName`,`Road`,`Township`) VALUES 
 ('BS0033','Sae-Lay Lan Sone','Palae Road','Shwe Pyi Thar'),
 ('BS0034','Sae-Lay Lan Sone','Shwe Pyi Thar Bridge Road','Insein'),
 ('BS0035','Htan Chauk Pin','Bogyoke Aung San Road','Shwe Pyi Thar'),
 ('BS0036','Nawarat','Bayint Naung Road','Shwe Pyi Thar'),
 ('BS0037','Kwin Kyaung','Kyee Myint Daing Kannar Road','Ahlone'),
 ('BS0038','Sin Min Zay','Kyee Myint Daing Kannar Road','Ahlone'),
 ('BS0039','Thiri Mingalar Zay','Kyee Myint Daing Kannar Road','Ahlone'),
 ('BS0040','Chan Mar Phee','Lower Kyee Myint Daing Road','Ahlone'),
 ('BS0041','Sin Min Zay','Lower Kyee Myint Daing Road','Ahlone'),
 ('BS0042','White Taw','Lower Kyee Myint Daing Road','Ahlone'),
 ('BS0043','Ahlone Sar Taik','Lower Kyee Myint Daing Road','Ahlone'),
 ('BS0044','Htaw Li Kwae','Kyee Myint Daing Kannar Road','Ahlone'),
 ('BS0045','Thit Taw','Lower Kyee Myint Daing Road','Ahlone'),
 ('BS0046','Bogyoke kwae','Bogyoke Aung San Road','Ahlone'),
 ('BS0047','Jama Khar Nar','Lower Kyee Myint Daing Road','Ahlone');
INSERT INTO `busstop_old` (`BusStopID`,`BusStopName`,`Road`,`Township`) VALUES 
 ('BS0048','Kyone Gyi Gate','Kyee Myint Daing Kannar Road','Ahlone'),
 ('BS0049','Thakin Mya Pan Chan','Lower Kyee Myint Daing Road','Ahlone'),
 ('BS0050','Sein Gyun','Pyay Road','Dagon'),
 ('BS0051','Kili','Strand Road','Lanmadaw'),
 ('BS0052','Maw Tin','Mahabandoola Road','Lanmadaw'),
 ('BS0053','Kili','Anawrahta Road','Lanmadaw'),
 ('BS0054','Sanpya','Phone Gyi Road','Lanmadaw'),
 ('BS0055','Sanpya','Anawrahta Road','Lanmadaw'),
 ('BS0056','Latha','Strand Road','Latha'),
 ('BS0057','Maung Khaing','Mahabandoola Road','Latha'),
 ('BS0058','Nyaung Pin Lay  Zay ','Strand Road','Latha'),
 ('BS0059','Sae-Ngar Lan/Nyaung Pin Lay  Zay ','Anawrahta Road','Latha'),
 ('BS0060','Sae-Ngar Lan','Mahabandoola Road','Latha'),
 ('BS0061','Chauk Htat Yone','Strand Road','Pabedan'),
 ('BS0062','Kone Zay Tan','Anawrahta Road','Pabedan'),
 ('BS0063','Lan Thone Sae','Anawrahta Road','Pabedan'),
 ('BS0064','Lan Thone Sae','Strand Road','Pabedan'),
 ('BS0065','Sule Myodaw Khan Ma','Sule Pagoda Road','Kyauktada');
INSERT INTO `busstop_old` (`BusStopID`,`BusStopName`,`Road`,`Township`) VALUES 
 ('BS0066','Theingyi Zay/Sule Myodaw Khan Ma','Mahabandoola Road','Pabedan'),
 ('BS0067','Yoke Shin Yone','Sule Pagoda Road','Pabedan'),
 ('BS0068','Bar Lan','Anawrahta Road','Kyauktada'),
 ('BS0069','Bokalay Zay','Mahabandoola Road','Kyauktada'),
 ('BS0070','Bokalay Zay','Strand Road','Kyauktada');
/*!40000 ALTER TABLE `busstop_old` ENABLE KEYS */;


--
-- Definition of table `updatedetail`
--

DROP TABLE IF EXISTS `updatedetail`;
CREATE TABLE `updatedetail` (
  `UpdateID` varchar(10) NOT NULL,
  `UserName` varchar(35) NOT NULL,
  `Date` datetime NOT NULL,
  `Description` varchar(100) NOT NULL,
  PRIMARY KEY  (`UpdateID`),
  KEY `FK_UpdateDetail_1` (`UserName`),
  CONSTRAINT `FK_UpdateDetail_1` FOREIGN KEY (`UserName`) REFERENCES `user` (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `updatedetail`
--

/*!40000 ALTER TABLE `updatedetail` DISABLE KEYS */;
INSERT INTO `updatedetail` (`UpdateID`,`UserName`,`Date`,`Description`) VALUES 
 ('U000000001','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0001'),
 ('U000000002','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0002'),
 ('U000000003','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0003'),
 ('U000000004','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0004'),
 ('U000000005','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0005'),
 ('U000000006','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0006'),
 ('U000000007','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0007'),
 ('U000000008','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0008'),
 ('U000000009','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0009'),
 ('U000000010','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0010'),
 ('U000000011','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0011'),
 ('U000000012','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0012'),
 ('U000000013','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0013'),
 ('U000000014','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0014');
INSERT INTO `updatedetail` (`UpdateID`,`UserName`,`Date`,`Description`) VALUES 
 ('U000000015','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0015'),
 ('U000000016','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0016'),
 ('U000000017','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0017'),
 ('U000000018','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0018'),
 ('U000000019','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0019'),
 ('U000000020','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0020'),
 ('U000000021','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0021'),
 ('U000000022','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0022'),
 ('U000000023','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0023'),
 ('U000000024','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0024'),
 ('U000000025','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0025'),
 ('U000000026','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0026'),
 ('U000000027','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0027'),
 ('U000000028','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0028');
INSERT INTO `updatedetail` (`UpdateID`,`UserName`,`Date`,`Description`) VALUES 
 ('U000000029','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0029'),
 ('U000000030','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0030'),
 ('U000000031','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0031'),
 ('U000000032','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0032'),
 ('U000000033','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0033'),
 ('U000000034','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0034'),
 ('U000000035','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0035'),
 ('U000000036','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0036'),
 ('U000000037','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0037'),
 ('U000000038','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0038'),
 ('U000000039','mmh1997','2019-04-08 00:00:00','added Bus Route For ------SELECT------'),
 ('U000000040','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0039'),
 ('U000000041','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0040'),
 ('U000000042','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0041');
INSERT INTO `updatedetail` (`UpdateID`,`UserName`,`Date`,`Description`) VALUES 
 ('U000000043','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0042'),
 ('U000000044','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0043'),
 ('U000000045','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0044'),
 ('U000000046','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0045'),
 ('U000000047','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0046'),
 ('U000000048','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0047'),
 ('U000000049','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0048'),
 ('U000000050','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0049'),
 ('U000000051','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0050'),
 ('U000000052','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0051'),
 ('U000000053','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0052'),
 ('U000000054','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0053'),
 ('U000000055','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0054'),
 ('U000000056','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0055');
INSERT INTO `updatedetail` (`UpdateID`,`UserName`,`Date`,`Description`) VALUES 
 ('U000000057','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0056'),
 ('U000000058','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0057'),
 ('U000000059','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0058'),
 ('U000000060','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0059'),
 ('U000000061','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0060'),
 ('U000000062','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0061'),
 ('U000000063','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0062'),
 ('U000000064','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0063'),
 ('U000000065','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0064'),
 ('U000000066','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0065'),
 ('U000000067','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0066'),
 ('U000000068','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0067'),
 ('U000000069','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0068'),
 ('U000000070','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0069');
INSERT INTO `updatedetail` (`UpdateID`,`UserName`,`Date`,`Description`) VALUES 
 ('U000000071','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0070'),
 ('U000000072','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0071'),
 ('U000000073','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0072'),
 ('U000000074','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0073'),
 ('U000000075','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0074'),
 ('U000000076','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0075'),
 ('U000000077','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0076'),
 ('U000000078','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0077'),
 ('U000000079','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0078'),
 ('U000000080','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0079'),
 ('U000000081','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0080'),
 ('U000000082','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0081'),
 ('U000000083','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0082'),
 ('U000000084','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0083');
INSERT INTO `updatedetail` (`UpdateID`,`UserName`,`Date`,`Description`) VALUES 
 ('U000000085','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0084'),
 ('U000000086','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0085'),
 ('U000000087','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0086'),
 ('U000000088','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0087'),
 ('U000000089','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0088'),
 ('U000000090','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0089'),
 ('U000000091','mmh1997','2019-04-08 00:00:00','added Bus Route For ------SELECT------'),
 ('U000000092','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0090'),
 ('U000000093','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0091'),
 ('U000000094','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0092'),
 ('U000000095','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0093'),
 ('U000000096','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0094'),
 ('U000000097','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0095'),
 ('U000000098','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0096');
INSERT INTO `updatedetail` (`UpdateID`,`UserName`,`Date`,`Description`) VALUES 
 ('U000000099','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0097'),
 ('U000000100','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0098'),
 ('U000000101','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0099'),
 ('U000000102','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0100'),
 ('U000000103','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0101'),
 ('U000000104','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0102'),
 ('U000000105','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0103'),
 ('U000000106','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0104'),
 ('U000000107','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0105'),
 ('U000000108','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0106'),
 ('U000000109','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0107'),
 ('U000000110','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0108'),
 ('U000000111','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0109'),
 ('U000000112','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0110');
INSERT INTO `updatedetail` (`UpdateID`,`UserName`,`Date`,`Description`) VALUES 
 ('U000000113','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0111'),
 ('U000000114','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0112'),
 ('U000000115','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0113'),
 ('U000000116','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0114'),
 ('U000000117','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0115'),
 ('U000000118','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0116'),
 ('U000000119','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0117'),
 ('U000000120','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0118'),
 ('U000000121','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0119'),
 ('U000000122','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0120'),
 ('U000000123','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0121'),
 ('U000000124','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0122'),
 ('U000000125','mmh1997','2019-04-08 00:00:00','updated Bus Route For ------SELECT------'),
 ('U000000126','mmh1997','2019-04-08 00:00:00','added Bus Route For ------SELECT------');
INSERT INTO `updatedetail` (`UpdateID`,`UserName`,`Date`,`Description`) VALUES 
 ('U000000127','mmh1997','2019-04-08 00:00:00','added Bus Stop: BS0123'),
 ('U000000128','mmh1997','2019-04-08 00:00:00','added Bus Route For ------SELECT------'),
 ('U000000129','mmh1997','2019-04-08 00:00:00','added bus driver : U Hla'),
 ('U000000130','emmn1997','2019-04-08 00:00:00','added bus driver : Thin Zar Hlaing'),
 ('U000000131','emmn1997','2019-04-08 00:00:00','added bus driver : Ko Kyaw Gyi'),
 ('U000000132','emmn1997','2019-04-08 00:00:00','added bus driver : Daw Mya'),
 ('U000000133','emmn1997','2019-04-08 00:00:00','Update Driver Info : Ko Kyaw Gyi'),
 ('U000000134','emmn1997','2019-04-08 00:00:00','Update Driver Info : Ko Kyaw Gyi'),
 ('U000000135','emmn1997','2019-04-08 00:00:00','Update Driver Info : Ko Kyaw Gyi'),
 ('U000000136','emmn1997','2019-04-08 00:00:00','added bus info for license plate : '),
 ('U000000137','emmn1997','2019-04-08 00:00:00','added bus info for license plate : '),
 ('U000000138','emmn1997','2019-04-08 00:00:00','added bus info for license plate : ');
INSERT INTO `updatedetail` (`UpdateID`,`UserName`,`Date`,`Description`) VALUES 
 ('U000000139','emmn1997','2019-04-08 00:00:00','added bus info for license plate : '),
 ('U000000140','emmn1997','2019-04-08 00:00:00','added bus info for license plate : '),
 ('U000000141','emmn1997','2019-04-08 00:00:00','added bus info for license plate : '),
 ('U000000142','emmn1997','2019-04-08 00:00:00','added Bus Route For ------SELECT------'),
 ('U000000143','emmn1997','2019-04-08 00:00:00','added Bus Route For ------SELECT------'),
 ('U000000144','emmn1997','2019-04-08 00:00:00','added Bus Route For 5'),
 ('U000000145','mmh1997','2019-04-09 00:00:00','added Bus Stop: BS0124'),
 ('U000000146','mmh1997','2019-04-09 00:00:00','added Bus Route For 5'),
 ('U000000147','mmh1997','2019-04-09 00:00:00','added Bus Route For 5'),
 ('U000000148','mmh1997','2019-04-09 00:00:00','updated Bus Route For ------SELECT------'),
 ('U000000149','mmh1997','2019-04-09 00:00:00','added Bus Stop: BS0125'),
 ('U000000150','mmh1997','2019-04-09 00:00:00','added Bus Line: 6'),
 ('U000000151','mmh1997','2019-04-09 00:00:00','added Bus Stop: BS0126');
INSERT INTO `updatedetail` (`UpdateID`,`UserName`,`Date`,`Description`) VALUES 
 ('U000000152','mmh1997','2019-04-09 00:00:00','added Bus Route For 6'),
 ('U000000153','mmh1997','2019-04-09 00:00:00','updated Bus Route For ------SELECT------'),
 ('U000000154','emmn1997','2019-04-09 00:00:00','added bus driver : U Ba'),
 ('U000000155','emmn1997','2019-04-09 00:00:00','Update Driver Info : Ko Kyaw Gyi'),
 ('U000000156','emmn1997','2019-04-09 00:00:00','Delete Driver Info : Thin Zar Hlaing'),
 ('U000000157','emmn1997','2019-04-09 00:00:00','updated Bus Driver Info'),
 ('U000000158','emmn1997','2019-04-09 00:00:00','added bus info for license plate : '),
 ('U000000159','emmn1997','2019-04-09 00:00:00','added bus info for license plate : ');
/*!40000 ALTER TABLE `updatedetail` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `UserName` varchar(35) NOT NULL,
  `Password` varchar(15) default NULL,
  `Type` varchar(5) default NULL,
  PRIMARY KEY  (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`UserName`,`Password`,`Type`) VALUES 
 ('a b c','abc','user'),
 ('aa','aaa','user'),
 ('abc','abc','user'),
 ('ccc','ccc','user'),
 ('emmn1997','emmn1997','admin'),
 ('mmh1997','mmh1997','admin'),
 ('myat min','myatmin','user');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
