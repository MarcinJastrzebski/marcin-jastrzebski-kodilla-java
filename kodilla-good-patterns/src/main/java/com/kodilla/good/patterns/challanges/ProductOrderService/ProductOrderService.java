package com.kodilla.good.patterns.challanges.ProductOrderService;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private Stock stock;

    public ProductOrderService(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository, final Stock stock) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.stock = stock;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getDate(),
                orderRequest.getProduct(), orderRequest.getQuantity(), stock);

        if(isOrdered) {
            informationService.inform(orderRequest);
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getDate(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}