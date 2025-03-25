$(document).ready(function() {
    // Quantity controls
    $('#increaseQty').click(function() {
        let qty = $('#quantity');
        let max = parseInt(qty.attr('max'));
        let val = parseInt(qty.val());
        if (val < max) qty.val(val + 1);
    });
    $('#decreaseQty').click(function() {
        let qty = $('#quantity');
        let val = parseInt(qty.val());
        if (val > 1) qty.val(val - 1);
    });

    // Tab switching
    $('.tab-btn').click(function() {
        $('.tab-btn').removeClass('active');
        $(this).addClass('active');
        $('.tab-pane').removeClass('active');
        $('#' + $(this).data('tab')).addClass('active');
    });
});