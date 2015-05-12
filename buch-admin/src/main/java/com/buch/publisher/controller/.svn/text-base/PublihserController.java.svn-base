package com.buch.publisher.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.buch.common.JsonObjectVO;
import com.buch.publisher.model.PublisherVo;
import com.buch.publisher.service.PublisherService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


@Controller(value="publisherController")
@RequestMapping(value="/publisher")
public class PublihserController {
	
	private static final Logger logger =LoggerFactory.getLogger(PublihserController.class);
	@Autowired
	private PublisherService publisherservice;
	
/*	@RequestMapping(value="/pub/main" )
	public  String publisherList(Model model, HttpServletRequest request,PublisherVo m ,HttpSession session) throws Exception {
		System.out.println("/pub/main");    
		return "pub/pubmain.buch";
	}
	
	@RequestMapping(value="/pub/pubreg" )
	public  String pubreg(Model model, HttpServletRequest request,PublisherVo m ,HttpSession session) throws Exception {
		System.out.println("/pub/pubreg");
		
		return "pub/pubreg.buch";
		
	}
	
	@RequestMapping(value="/pub/pubedit" )
	public String pubedit(Model model, HttpServletRequest request,PublisherVo m ,HttpSession session) throws Exception {
		System.out.println("/pub/pubedit");
		
		return "pub/pubedit.buch";
		
	}
	*/
	@RequestMapping(value="/insert.buch" , method =RequestMethod.GET)
	public String addRegForm(Model model){
		PublisherVo publisherVo = new PublisherVo();
		model.addAttribute("publisherVo", publisherVo);
		return "pub/pubreg.buch";

	}
	
	@RequestMapping(value="/insert.buch", method = RequestMethod.POST)
	public String setupRegForm(@ModelAttribute("publisherVo") @Valid PublisherVo publisherVo,
			BindingResult result, Model model){
		//System.out.println("publisherVo"+ publisherVo);
		if(result.hasErrors()){
			model.addAllAttributes(result.getModel());
			return "pub/pubreg.buch";
		} else{
			publisherservice.insert(publisherVo);
		}
		
		return "pub/pubmain.buch";

	}
	@RequestMapping("/publisherListData.buch")
	public @ResponseBody void publisherListData(
			@RequestParam(value = "_search")Boolean _search, 
			@RequestParam(value = "page", required=false) Integer page,
		    @RequestParam(value = "rows", required=false) Integer rows,
		    @RequestParam(value = "sidx", required=false) String sidx,
		    @RequestParam(value = "sord", required=false) String sord,
			@RequestParam(value = "searchField", required = false)String searchField,
			@RequestParam(value = "searchString", required = false)String searchString,
			@RequestParam(value = "searchOper", required = false)String searchOper,
		    Model model, HttpServletRequest request,PublisherVo m ,HttpSession session, HttpServletResponse response) throws IOException {
			
		
		System.out.println("publisherListData : " + page + " " + rows + " " + sidx + " " + sord + " ");
		int records1  = publisherservice.count(_search, searchField, searchString, searchOper);
		int records  = publisherservice.count();
		System.out.println(records +" , " +records1);
		
		int total = 0;
		if(records > 0) {
			total = (int)Math.ceil(records / (double)rows.intValue());
		} 
		// ǥ�� �� �������� ������ �������� �ʰ��ϸ�, ������ �������� ǥ���Ѵ�.
		if(page.intValue() > total) page = total;
		
		List<PublisherVo> list = publisherservice.listPublisher(_search, page, rows, 
				sidx, sord, searchField, searchString, searchOper);

		JsonObjectVO vo = new JsonObjectVO();
		vo.setTotal(total);
		vo.setPage(page);
		vo.setRecords(records);
		vo.setRows(list);
	
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter writer = response.getWriter();
		Gson gson = new GsonBuilder().setDateFormat("yyyy/MM/dd").create();
		String json = gson.toJson(vo);
		System.out.println("json = "+ json); 
		writer.write(json);
		writer.flush();
		writer.close();
		
	}
	@RequestMapping(value = "/edit.buch", method = RequestMethod.POST)
	public void edit(/*@RequestParam(/value = "oper",required = false)String oper,*/
			@RequestParam(value = "pubCd", required = false)String pubCd,
			@RequestParam(value = "pubNm", required = false)String pubNm,
			@RequestParam(value = "page", required=false) Integer page,
		    @RequestParam(value = "rows", required=false) Integer rows,
			@RequestParam(value = "busiPresident", required = false)String busiPresident,
/*			@RequestParam(value = "busiTel", required = false)String busiTel,
			@RequestParam(value = "busiFax", required = false)String busiFax,
			@RequestParam(value = "busiZip", required = false)String busiZip,
			@RequestParam(value = "busiAddr1", required = false)String busiAddr1,*/
			HttpServletResponse response,HttpServletRequest req) throws IOException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		int ca;
		Map<String , Object> map = new HashMap<String, Object>();
			System.out.println(page+","+rows);
			if(pubCd !=null&&pubNm!=null){
				map.put("pubCd",pubCd);
				map.put("pubNm",pubNm);
				
				ca = 4;
			}else{
				ca = 5;
			}
			if(pubCd != null){
					map.put("pubCd",pubCd);
					ca = 1;
			}else if(pubNm != null){
					ca = 2;
			}else if(busiPresident != null){
					ca = 3;
			}
			List<PublisherVo> list = publisherservice.searchList(map, ca);
		
	
			
			JsonObjectVO vo = new JsonObjectVO();
			//vo.setTotal(total);
			vo.setPage(page);
			//vo.setRecords(records);
			vo.setRows(list);
		
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			
			PrintWriter writer = response.getWriter();
			Gson gson = new GsonBuilder().setDateFormat("yyyy/MM/dd").create();
			String json = gson.toJson(vo);
			System.out.println("json 1= "+ json); 
			writer.write(json);
			writer.flush();
			writer.close();
/*		if(oper.equals("add")) {
		
			
				System.out.println("add");
	
		} else if(oper.equals("edit")) {
			System.out.println(pubCd+","+pubNm+","+busiPresident+","+busiTel+","+busiFax+","+busiZip+","+busiAddr1);
				publisherservice.update(new PublisherVo(pubCd,pubNm,busiPresident,busiTel,busiFax,busiZip,busiAddr1));
				System.out.println("edit");
		
		} else if(oper.equals("del")) {
			System.out.println("del");
		}*/
	}
}
