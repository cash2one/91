Ext.namespace("ast.ast1949.admin.credit.geti");

/*var ATTEST = new function(){
	this.ATTEST_GRID = "attestgrid";
}*/
ast.ast1949.admin.credit.geti.ATTESTFIELD=[
        {name:"id",mapping:"id"},
    	{name:"attestType",mapping:"attestType"},
    	{name:"companyName",mapping:"companyName"},
    	{name:"companyAddr",mapping:"companyAddr"},
    	{name:"industry",mapping:"industry"},
    	{name:"serviceType",mapping:"serviceType"},
    	{name:"applicant",mapping:"applicant"},
    	{name:"idNumber",mapping:"idNumber"},
    	{name:"showIdNumber",mapping:"showIdNumber"},
    	{name:"contact",mapping:"contact"},
    	{name:"sex",mapping:"sex"},
    	{name:"tel",mapping:"tel"},
    	{name:"mobile",mapping:"mobile"},
    	{name:"business",mapping:"business"},
    	{name:"checkStatus",mapping:"checkStatus"},
    	{name:"gmtCreated",mapping:"gmtCreated"},
    	{name:"gmtModified",mapping:"gmtModified"},
    	{name:"picAddress",mapping:"picAddress"}
];

ast.ast1949.admin.credit.geti.AttestForm=Ext.extend(Ext.form.FormPanel,{
	constructor:function(config){
		config=config||{};
		Ext.apply(this,config);
		
		var form=this;
		
		var c = {
				autoScroll:true,
				frame:true,
				labelAlign:"right",
				labelWidth:90,
				layout:"column",
				items:[{
					columnWidth:.5,
					layout : "form",
					defaults:{
						anchor:"100%",
						xtype:"textfield",
						labelSeparator:""
					},
					items:[{
						xtype : "hidden",
						name : "id",
						id : "id"
					},{
						xtype:"combo",
						mode:"local",
						readOnly:true,
						/*triggerAction:"all",*/
						hiddenName:"attestType",
						hiddenId:"attestType",
						fieldLabel:"认证类型",
						store:[["1","工商管理注册"],["0","个体"]]
					},{
						fieldLabel : "公司名称",
						name : "companyName",
						id:"companyName"
					},{
						fieldLabel : "公司地址",
						name : "companyAddr",
						id:"companyAddr"
					},{
						fieldLabel : "主营行业",
						name : "industry",
						id:"industry"
					},{
						fieldLabel : "服务类型",
						name : "serviceType",
						id:"serviceType"
					}]
				},{
					columnWidth:.5,
					layout : "form",
					defaults:{
						anchor:"100%",
						xtype:"textfield",
						labelSeparator:""
					},
					items:[{
						id:"applicant",
						name:"applicant",
						fieldLabel:"申请人",
					},{
						xtype:"panel",
						style:'margin-left:30px;margin-bottom:5px',
						 labelSeparator:"",
						items:[{
							layout:"column",
							items:[{
								columnWidth: .2,
								html: "身份证号码"
								},{
								columnWidth:.5,
								style:'margin-left:-10%;',
								anchor:"100%",
								xtype:"textfield",
								labelSeparator:"",
								id:"idNumber",
								name:"idNumber"
							},{
								columnWidth: .2,
								style:'margin-left:30px;',
								html: "是否显示"
								},{
								columnWidth:.2,
								anchor:"100%",
								style:'margin-right:-15%;',
								labelSeparator:"",
								xtype:"combo",
								name:"showIdNumber",
								hiddenName:"showIdNumber",
								mode:"local",
								triggerAction : "all",
								store:[[0,"否"],[1,"是"]]
							}]
						}]
				},{
					xtype:"panel",
					layout: 'form',
					style:'margin-left:30px;margin-bottom:5px',
					 labelSeparator:"",
					items:[{
						layout:"column",
						items:[{
							columnWidth: .2,
							style:'margin-left:25px;',
							html: "联系人"
							},{
							columnWidth:.5,
							style:'margin-left:-10%;',
							anchor:"100%",
							xtype:"textfield",
							labelSeparator:"",
							id:"contact",
							name:"contact"
						},{
							columnWidth:.2,
							anchor:"100%",
							style:'margin-right:-5px;margin-left:5px;',
							labelSeparator:"",
							xtype:"combo",
							name:"sex",
							hiddenName:"sex",
							mode:"local",
							triggerAction : "all",
							store:[[1,"女"],[0,"男"]]
						}]
					}]
			},{
					id:"tel",
					name:"tel",
					fieldLabel:"电话",
					},{
						id:"mobile",
						name:"mobile",
						fieldLabel:"手机",
						}]
				},{
					columnWidth:1,
					layout:"form",
					items:[{
						xtype:"textarea",
						fieldLabel : "经营范围",
						name : "business",
						labelSeparator:"",
						height:200,
						anchor : "99%"
					}]
				},{
					columnWidth:1,
					layout:"form",
					items:[{
						xtype:"htmleditor",
						name:"picAddress",
			            height : 400,
			            anchor : "99%",
			            id : 'picUrl',
			            fieldLabel :'证书图片',
					}]
				}],
				buttonAlign:"center",
				buttons:[/*{
						id : "check",
					  text:"审核",
                      iconCls:"item-info",
                      layout:"fit"
				},*/{
	                id : "onlysave",
	                text : "保存",
	                scope:this,
	                handler:this.saveForm
	            },{
	                id : "saveandcheck",
	                iconCls:"item-true",
	                text : "保存并审核",
	                scope:this,
	                handler:function(btn){
	                	 this.saveForm();
	                    ast.ast1949.admin.credit.geti.auditCheckStatus("1");
	                }
	            },{
	                id : "saveandrub",
	                iconCls:"item-false",
	                text : "审核不通过",
	                scope:this,
	                handler:function(btn){
	                	this.saveForm();
	                	ast.ast1949.admin.credit.geti.auditCheckStatus("2");
	                }
	            }]
		};
		ast.ast1949.admin.credit.geti.AttestForm.superclass.constructor.call(this,c);
	},
	
	fields:ast.ast1949.admin.credit.geti.ATTESTFIELD,
	loadGeTiAttest:function(id){
		var form=this;
		if(form.store!=null){
			form.store.reload();
			return ;
		}
		form.store = new Ext.data.JsonStore({
			fields : form.fields,
			url : Context.ROOT+Context.PATH+"/admin/credit/creditbaseinfo/init.htm?id=" +id, 
			autoLoad : true,
			listeners : {
				"datachanged" : function(s) {
					var record = s.getAt(0);
					if (record == null) {
						Ext.MessageBox.alert(Context.MSG_TITLE,"数据加载失败...");
					} else {
						form.getForm().loadRecord(record);
						if (record.get("picAddress")!=null && record.get("picAddress") !="") {
							form.findById("picUrl").setValue("<img src='http://img3.zz91.com/500x500/"+record.get('picAddress')+"'/>");
						}
						// 初始化审核状态
						var checktab=Ext.getCmp("AttestGeTiForm").getComponent(0);
						var checkstatus="0";
                       checkstatus=record.get("checkStatus");
                       if(checkstatus=="1"){
                           checktab.setIconClass("item-true");
                       }
                       if(checkstatus=="2"){
                           checktab.setIconClass("item-false");
                       }
					}
				}
			}
		});
	},
	saveUrl:Context.ROOT+Context.PATH+"/admin/credit/creditbaseinfo/updateAttest.htm",
    saveForm:function(){
        var _url = this.saveUrl;
        if (this.getForm().isValid()) {
            this.getForm().submit({
                url : _url,
                method : "post",
               /* params:{"inquiryId":this.inquiryData.id},*/
                waitMsg:Context.SAVEMASK.msg,
                success : function(_form,_action){
                    var res = _action.result;
                    if (res.success) {
                        Ext.MessageBox.show({
                            title : Context.MSG_TITLE,
                            msg : "信息已被保存,您可以关闭窗口了",
                            buttons : Ext.MessageBox.OK,
                            icon : Ext.MessageBox.INFO
                        });
                    } else {
                        Ext.MessageBox.show({
                            title : Context.MSG_TITLE,
                            msg : "发生错误,信息没有被保存",
                            buttons : Ext.MessageBox.OK,
                            icon : Ext.MessageBox.INFO
                        });
                    }
                },
                failure : function(_form,_action){
                    Ext.MessageBox.show({
                        title : Context.MSG_TITLE,
                        msg : "发生错误,信息没有被保存",
                        buttons : Ext.MessageBox.OK,
                        icon : Ext.MessageBox.ERROR
                    });
                }
            });
        }
    }
})
ast.ast1949.admin.credit.geti.auditCheckStatus = function(checkStatus){
    Ext.Ajax.request({
        url:Context.ROOT+Context.PATH+ "/admin/credit/creditbaseinfo/updateCheckStatus.htm?st="+ Math.random() +"&ids=" + Ext.getCmp("id").getValue()+"&checkStatus=" + checkStatus,
        success:function(response,opt){
            var obj = Ext.decode(response.responseText);
            if(obj.success){
            	var checktab=Ext.getCmp("AttestGeTiForm").getComponent(0);
                if(checkStatus=="1"){
                    checktab.setIconClass("item-true");
                }
                
                if(checkStatus=="2"){
                    checktab.setIconClass("item-false");
                }
                
                Ext.MessageBox.show({
                    title : Context.MSG_TITLE,
                    msg : "信息已审核",
                    buttons : Ext.MessageBox.OK,
                    icon : Ext.MessageBox.INFO
                });
            }else{
                Ext.MessageBox.show({
                    title : Context.MSG_TITLE,
                    msg : "发生错误,信息没有被审核",
                    buttons : Ext.MessageBox.OK,
                    icon : Ext.MessageBox.INFO
                });
            }
        },
        failure:function(response,opt){
            Ext.MessageBox.show({
                title : Context.MSG_TITLE,
                msg : "发生错误,信息没有被审核",
                buttons : Ext.MessageBox.OK,
                icon : Ext.MessageBox.INFO
            });
        }
    });
}

