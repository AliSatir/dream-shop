package com.dailycodework.dreamshops.controller;

import com.dailycodework.dreamshops.dto.OrderDto;
import com.dailycodework.dreamshops.exceptions.ResourceNotFoundException;
import com.dailycodework.dreamshops.model.Order;
import com.dailycodework.dreamshops.respnse.ApiResponse;
import com.dailycodework.dreamshops.service.order.IOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@RestController
@RequiredArgsConstructor
@RequestMapping("${api.prefix}/orders")
public class OrderController {
    private final IOrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<ApiResponse> createOrder(@RequestParam Long userId){
        try {
            Order order = orderService.pleaceOrder(userId);
            OrderDto orderDto = orderService.convertToDto(order);
            return ResponseEntity.ok(new ApiResponse("Item Order Successfully", orderDto));
        } catch (Exception e) {
            return ResponseEntity.status(INTERNAL_SERVER_ERROR).body(new ApiResponse("Error ",e.getMessage()));
        }
    }

    @GetMapping("/{orderId}/order")
    public ResponseEntity<ApiResponse> getOrderById(@PathVariable Long orderId){
        try {
            OrderDto order = orderService.getOrder(orderId);
            return ResponseEntity.ok(new ApiResponse("Item order Successfully",order));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(NOT_FOUND).body(new ApiResponse("Oops!",e.getMessage()));
        }
    }

    @GetMapping("/{userId}/order")
    public ResponseEntity<ApiResponse> getUserOrders(@PathVariable Long userId){
        try {
            List<OrderDto> order = orderService.getUserOrders(userId);
            return ResponseEntity.ok(new ApiResponse("Item order Successfully",order));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(NOT_FOUND).body(new ApiResponse("Oops!",e.getMessage()));
        }
    }







}
