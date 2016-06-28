-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `auth_right` VALUES ('1', '0', 'zz91后台管理', '^/zz91/admin/mymenu.*$|^/zz91/admin/welcome.*$|^/zz91/admin/category/.*$|^/zz91/admin/changePassword.*$', '1', '80', 'zz91后台管理', '#', '', '2010-03-16 15:30:08');
INSERT INTO `auth_right` VALUES ('2', '1', '系统配置', '', '2', '13', '系统配置', '#', '', '2010-03-16 15:39:10');
INSERT INTO `auth_right` VALUES ('3', '2', '系统角色管理', '^/zz91/auth/role/.*$', '3', '4', '系统角色管理', '/auth/role/view.htm', '', '2010-03-16 15:42:50');
INSERT INTO `auth_right` VALUES ('4', '2', '系统权限管理', '^/zz91/auth/right/.*$', '5', '6', '系统权限管理', '/auth/right/view.htm', '', '2010-03-16 15:43:28');
INSERT INTO `auth_right` VALUES ('5', '2', '参数配置管理', '^/zz91/admin/param/.*$', '7', '8', '参数配置管理', '/admin/param/view.htm', '', '2010-03-16 16:04:05');
INSERT INTO `auth_right` VALUES ('6', '2', '系统类别库管理', '^/zz91/admin/category/.*$', '9', '10', '系统类别库管理', '/admin/category/view.htm', '', '2010-03-16 16:05:22');
INSERT INTO `auth_right` VALUES ('7', '1', '站点信息管理', '', '14', '19', '站点信息管理', '#', '', '2010-03-16 16:06:07');
INSERT INTO `auth_right` VALUES ('8', '7', '友情链接管理', '^/zz91/admin/friendlink/.*$', '15', '16', '友情链接管理', '/admin/friendlink/list.htm', '', '2010-03-16 16:07:07');
INSERT INTO `auth_right` VALUES ('9', '7', '留言信息管理[网站用户]', '^/zz91/admin/customermessage/.*$', '17', '18', '留言信息管理[网站用户]', '/admin/customermessage/list.htm', '', '2010-03-16 16:07:49');
INSERT INTO `auth_right` VALUES ('10', '1', '网站客户管理', '', '20', '25', '网站客户管理', '#', '', '2010-03-16 16:23:01');
INSERT INTO `auth_right` VALUES ('11', '10', '收集客户信息[展会]', '^/zz91/admin/admincompany/.*$', '21', '22', '收集客户信息[展会]', '/admin/admincompany/collectList.htm', '', '2010-03-16 16:24:23');
INSERT INTO `auth_right` VALUES ('12', '10', '网站客户信息管理', '^/zz91/admin/admincompany/.*$', '23', '24', '网站客户信息管理', '/admin/admincompany/list.htm', '', '2010-03-16 16:25:21');
INSERT INTO `auth_right` VALUES ('13', '1', '交易中心管理', '', '26', '53', '交易中心管理', '#', '', '2010-03-16 16:25:38');
INSERT INTO `auth_right` VALUES ('14', '13', '供求信息管理', '', '27', '40', '供求信息管理', '#', '', '2010-03-16 16:26:20');
INSERT INTO `auth_right` VALUES ('16', '14', '全部供求信息', '^/zz91/admin/products/.*$', '28', '29', '全部供求信息', '/admin/products/list.htm', '', '2010-03-16 16:29:24');
INSERT INTO `auth_right` VALUES ('17', '14', '图片相册管理', '^/zz91/admin/productsalbums/.*$', '30', '31', '图片相册管理', '/admin/productsalbums/view.htm', '', '2010-03-16 16:30:36');
INSERT INTO `auth_right` VALUES ('18', '14', '供求图片管理', '^/admin/productspic/.*$', '32', '33', '供求图片管理', '/admin/productspic/list.htm', '', '2010-03-16 16:31:03');
INSERT INTO `auth_right` VALUES ('19', '14', '描述模板管理', '^/zz91/admin/descriptiontemplate/.*$', '34', '35', '描述模板管理', '/admin/descriptiontemplate/list.htm', '', '2010-03-16 16:31:30');
INSERT INTO `auth_right` VALUES ('20', '14', '关键字排名管理', '^/zz91/admin/keywordsrank/.*$', '36', '37', '关键字排名管理', '/admin/keywordsrank/list.htm', '', '2010-03-16 16:32:06');
INSERT INTO `auth_right` VALUES ('21', '14', '稀缺信息[客服提交]', '^/zz91/admin/productsrare/.*$', '38', '39', '稀缺信息[客服提交]', '/admin/productsrare/list.htm', '', '2010-03-16 16:32:39');
INSERT INTO `auth_right` VALUES ('22', '13', '供求类别管理', '', '41', '46', '供求类别管理', '#', '', '2010-03-16 16:33:00');
INSERT INTO `auth_right` VALUES ('23', '22', '主类别管理', '^/zz91/admin/categoryproducts/.*$', '42', '43', '主类别管理', '/admin/categoryproducts/view.htm', '', '2010-03-16 16:33:45');
INSERT INTO `auth_right` VALUES ('24', '22', '附加类别管理', '^/zz91/admin/categoryproductsappend/.*$', '44', '45', '附加类别管理', '/admin/categoryproductsappend/view.htm', '', '2010-03-16 16:34:24');
INSERT INTO `auth_right` VALUES ('25', '13', '询盘信息管理', '', '47', '52', '询盘信息管理', '#', '', '2010-03-16 16:34:51');
INSERT INTO `auth_right` VALUES ('26', '25', '全部询盘信息', '^/zz91/admin/inquiry/.*$', '48', '49', '全部询盘信息', '/admin/inquiry/list.htm', '', '2010-03-16 16:35:21');
INSERT INTO `auth_right` VALUES ('27', '25', '询盘敏感字符', '^/zz91/admin/inquirysensitive/.*$', '50', '51', '询盘敏感字符', '/admin/inquirysensitive/view.htm', '', '2010-03-16 16:36:14');
INSERT INTO `auth_right` VALUES ('28', '1', '广告中心', '', '54', '65', '广告中心', '#', '', '2010-03-16 16:38:23');
INSERT INTO `auth_right` VALUES ('29', '28', '全部广告', '^/zz91/admin/ads/.*$', '55', '56', '全部广告', '/admin/ads/list.htm', '', '2010-03-16 16:39:31');
INSERT INTO `auth_right` VALUES ('30', '28', '广告位管理', '^/zz91/admin/adsplaces/.*$', '57', '58', '广告位管理', '/admin/adsplaces/view.htm', '', '2010-03-16 16:39:58');
INSERT INTO `auth_right` VALUES ('31', '28', '广告组管理', '^/zz91/admin/adsgroups/.*$', '59', '60', '广告组管理', '/admin/adsgroups/view.htm', '', '2010-03-16 16:40:15');
INSERT INTO `auth_right` VALUES ('32', '28', '广告需求管理[客服]', '^/zz91/admin/servicerads/.*$', '61', '62', '广告需求管理[客服]', '/admin/servicerads/listsubmit.htm', '', '2010-03-16 16:40:48');
INSERT INTO `auth_right` VALUES ('33', '28', '提交广告需求[客服]', '^/zz91/admin/servicerads/.*$', '63', '64', '提交广告需求[客服]', '/admin/servicerads/submitads.htm', '', '2010-03-16 16:41:39');
INSERT INTO `auth_right` VALUES ('34', '1', '新闻中心', '', '66', '71', '新闻中心', '#', '', '2010-03-16 16:42:31');
INSERT INTO `auth_right` VALUES ('35', '34', '资讯信息管理', '^/zz91/admin/news/.*$', '67', '68', '资讯信息管理', '/admin/news/list.htm', '', '2010-03-16 16:43:07');
INSERT INTO `auth_right` VALUES ('36', '34', '资讯类别管理', '^/zz91/admin/newscategory/.*$', '69', '70', '资讯类别管理', '/admin/newscategory/view.htm', '', '2010-03-16 16:43:30');
INSERT INTO `auth_right` VALUES ('37', '1', '邮件系统管理', '', '72', '79', '邮件系统管理', '#', '', '2010-03-16 16:44:03');
INSERT INTO `auth_right` VALUES ('38', '37', '批量发送邮件', '^/zz91/admin/mail/.*$', '73', '74', '批量发送邮件', '/admin/mail/mailsend.htm', '', '2010-03-16 16:44:41');
INSERT INTO `auth_right` VALUES ('39', '37', '邮件模板管理', '^/zz91/admin/mail/.*$', '75', '76', '邮件模板管理', '/admin/mail/mailtemplate.htm', '', '2010-03-16 16:45:15');
INSERT INTO `auth_right` VALUES ('40', '37', '邮件发送日志', '^/zz91/admin/mail/.*$', '77', '78', '邮件发送日志', '/admin/mail/maillog.htm', '', '2010-03-16 16:45:32');
INSERT INTO `auth_right` VALUES ('41', '0', '生意管家', '', '81', '82', '生意管家', '#', '', '2010-03-17 10:16:59');
INSERT INTO `auth_right` VALUES ('42', '2', '网站管理员', '^/zz91/admin/adminuser/.*$', '11', '12', '网站管理员', '/admin/adminuser/list.htm', '', '2010-03-17 14:01:52');
INSERT INTO `auth_role` VALUES ('1', '开发者', '系统开发人员');
INSERT INTO `auth_role_right` VALUES ('40', '1');
INSERT INTO `auth_role_right` VALUES ('39', '1');
INSERT INTO `auth_role_right` VALUES ('38', '1');
INSERT INTO `auth_role_right` VALUES ('37', '1');
INSERT INTO `auth_role_right` VALUES ('36', '1');
INSERT INTO `auth_role_right` VALUES ('35', '1');
INSERT INTO `auth_role_right` VALUES ('34', '1');
INSERT INTO `auth_role_right` VALUES ('33', '1');
INSERT INTO `auth_role_right` VALUES ('32', '1');
INSERT INTO `auth_role_right` VALUES ('31', '1');
INSERT INTO `auth_role_right` VALUES ('30', '1');
INSERT INTO `auth_role_right` VALUES ('29', '1');
INSERT INTO `auth_role_right` VALUES ('28', '1');
INSERT INTO `auth_role_right` VALUES ('27', '1');
INSERT INTO `auth_role_right` VALUES ('26', '1');
INSERT INTO `auth_role_right` VALUES ('25', '1');
INSERT INTO `auth_role_right` VALUES ('24', '1');
INSERT INTO `auth_role_right` VALUES ('23', '1');
INSERT INTO `auth_role_right` VALUES ('22', '1');
INSERT INTO `auth_role_right` VALUES ('21', '1');
INSERT INTO `auth_role_right` VALUES ('20', '1');
INSERT INTO `auth_role_right` VALUES ('19', '1');
INSERT INTO `auth_role_right` VALUES ('18', '1');
INSERT INTO `auth_role_right` VALUES ('17', '1');
INSERT INTO `auth_role_right` VALUES ('16', '1');
INSERT INTO `auth_role_right` VALUES ('14', '1');
INSERT INTO `auth_role_right` VALUES ('13', '1');
INSERT INTO `auth_role_right` VALUES ('12', '1');
INSERT INTO `auth_role_right` VALUES ('11', '1');
INSERT INTO `auth_role_right` VALUES ('10', '1');
INSERT INTO `auth_role_right` VALUES ('1', '1');
INSERT INTO `auth_role_right` VALUES ('2', '1');
INSERT INTO `auth_role_right` VALUES ('3', '1');
INSERT INTO `auth_role_right` VALUES ('4', '1');
INSERT INTO `auth_role_right` VALUES ('5', '1');
INSERT INTO `auth_role_right` VALUES ('6', '1');
INSERT INTO `auth_role_right` VALUES ('7', '1');
INSERT INTO `auth_role_right` VALUES ('9', '1');
INSERT INTO `auth_role_right` VALUES ('8', '1');
INSERT INTO `auth_role_right` VALUES ('42', '1');
INSERT INTO `auth_user` VALUES ('1', null, 'admin', '21232f297a57a5a743894a0e4a801fc3', null, null, null, '0');
INSERT INTO `auth_user_role` VALUES ('1', '1');