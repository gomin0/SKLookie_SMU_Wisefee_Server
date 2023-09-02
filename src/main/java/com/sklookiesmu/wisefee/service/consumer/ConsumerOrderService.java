package com.sklookiesmu.wisefee.service.consumer;

import com.sklookiesmu.wisefee.dto.consumer.OrderDto;
import com.sklookiesmu.wisefee.dto.consumer.OrderOptionDto;
import com.sklookiesmu.wisefee.dto.consumer.ProductDto;

public interface ConsumerOrderService {
    /**
     * [주문 옵션 정보 조회]
     * 특정 매장의 주문 옵션 정보를 조회한다.
     * @param cafeId
     * @return [주문 옵션 정보 DTO 반환]
     */
    OrderOptionDto.OrderOptionListResponseDto getOrderOptionInfo(Long cafeId);


    /**
     * [주문하기]
     * 특정 매장에서 주문한다.
     * @param cafeId
     * @param orderRequestDto
     * @return [주문 PK 반환]
     */
    Long createOrder(Long cafeId, OrderDto.OrderRequestDto orderRequestDto);


    /**
     * [주문 내역 조회]
     * 특정 매장에서 주문한 내역을 조회한다.
     * @param cafeId
     * @param orderId
     * @return [주문 내역 정보 DTO 반환]
     */
    OrderDto.OrderResponseDto getOrderHistory(Long cafeId, Long orderId);


    /**
     * TODO [주문 현황 확인] -> (카페 측 음료 준비 현황)
     */


}
