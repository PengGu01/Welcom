/**
 * Student Name: Peng Gu
 * StudentId:301240546
 * Submit Day:09 July,2023
 * */

package com.peng.mvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class reservationColtroller {
	@PostMapping("/postReservation")
    public ModelAndView add(@RequestParam Map<String, Object> params)
    {
		//get the data from the map 
        String firstName = (String) params.get("firstName");
        String lastName = (String) params.get("lastName");
        String areaCode = (String) params.get("areaCode");
        String phoneNumber = (String) params.get("phoneNumber");
        String email = (String) params.get("email");
        String streetAddress = (String) params.get("streetAddress");
        String streetAddressLine2 = (String) params.get("streetAddressLine2");
        String city = (String) params.get("city");
        String state = (String) params.get("state");
        String postal = (String) params.get("postal");
        String country = (String) params.get("country");
        String arrivalDate = (String) params.get("arrivalDate");
        String departureDate = (String) params.get("departureDate");
        int roomType = Integer.parseInt((String) params.get("roomType"));
        String roomTypeText = (String)params.get("roomTypeText");
        if(roomType==100) {//save data to display
        	roomTypeText = "Mountain View";
        }else if(roomType==120) {
        	roomTypeText = "Ocean View";
        }else {
        	roomTypeText = "City Views";
        }
        int numberOfRoomNight =Integer.parseInt((String) params.get("numberOfRoomNight"));
        int adultNum = Integer.parseInt((String) params.get("adultNum"));
        int kidsNum = Integer.parseInt((String) params.get("kidsNum"));
        String paymentMethod = (String) params.get("paymentMethod");
        //create the reservation instance and insert data into it
        Reservation reservation = new Reservation(
            firstName,
            lastName,
            areaCode,
            phoneNumber,
            email,
            streetAddress,
            streetAddressLine2,
            city,
            state,
            postal,country,
            arrivalDate,
            departureDate,
            roomType,roomTypeText,
            numberOfRoomNight,
            adultNum,
            kidsNum,
            paymentMethod
        );
        System.out.println(reservation.toString());

        // create ModelAndView object
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("show-details"); // setting the target view

        //put reservation into the model
        modelAndView.addObject("reservation", reservation);

        // return ModelAndView
        return modelAndView;
    }
}